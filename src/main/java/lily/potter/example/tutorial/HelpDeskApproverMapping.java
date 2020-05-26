package lily.potter.example.tutorial;

import lily.potter.example.pojo.ActiveRecord;

public class HelpDeskApproverMapping extends ActiveRecord {
    int id;
    int userId;
    int approvalId;


    public User getUser() {
        return User.findById(this.userId);
    }

    public HelpDeskApproval getApproval() {
        return HelpDeskApproval.findById(this.approvalId);
    }

    @Override
    public String getTableName() {
        return "approver-mapping";
    }
}
