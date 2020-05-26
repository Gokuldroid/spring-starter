package lily.potter.example.pojo;

import org.springframework.lang.NonNull;

public abstract class ActiveRecord {

    public boolean save() {
        //no-op
        return true;
    }

    public boolean delete() {
        //no-op
        return true;
    }


    public static int count() {
        //no-op
        return 10;
    }


    abstract @NonNull public String getTableName();

    @NonNull
    public String getPKColumn() {
        return "id";
    }
}
