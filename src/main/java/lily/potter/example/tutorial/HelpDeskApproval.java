package lily.potter.example.tutorial;

import lily.potter.example.pojo.ActiveRecord;
import org.springframework.lang.Nullable;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelpDeskApproval extends ActiveRecord {

    static final String APPROVED = "APPROVED";
    static final String IN_REVIEW = "IN_REVIEW";

    public static final Map<String, Integer> APPROVAL_STATUES_MAP = Map.of(APPROVED, 1, IN_REVIEW, 2);

    int approvalStatus;

    Timestamp updatedAt;


    List<HelpDeskApproverMapping> approvalMapping = new ArrayList<>();
    Map<String, Object> modelChanges = new HashMap<>();

    @Override
    public String getTableName() {
        return "helpdesk-approval";
    }

    @Override
    public String getPKColumn() {
        return "some-other-id";
    }

    public boolean isInReview() {
        return approvalStatus == APPROVAL_STATUES_MAP.get(IN_REVIEW);
    }

    public boolean isApproved() {
        return approvalStatus == APPROVAL_STATUES_MAP.get(APPROVED);
    }

    public boolean isApprover(int userId) {
        for (HelpDeskApproverMapping helpDeskApproverMapping : approvalMapping) {
            if (helpDeskApproverMapping.userId == userId) {
                return true;
            }
        }
        return false;
    }



    @BeforeUpdate
    public void setApprovalChangesOnUpdate() {
        modelChanges.put("approvedBy", new Object[]{null, getApprovedAt()});
        modelChanges.put("approvedAt", new Object[]{null, getApprovedBy()});
    }


    @Destroy
    public void clearApprovalChanges() {
        modelChanges.put("approvalStatus", new Object[]{approvalStatus, null});
    }



    @AfterSave
    public void publishToCentral() {
        if (!modelChanges.isEmpty()) {
            System.out.println("publish to central");
        }
    }


    public User getApprovedBy() {
        return User.findById(approvalMapping.get(0).userId);
    }


    @Nullable
    public Timestamp getApprovedAt() {
        return isApproved() ? updatedAt : null;
    }

    public static HelpDeskApproval findById(int id) {
        return new HelpDeskApproval();
    }
}
