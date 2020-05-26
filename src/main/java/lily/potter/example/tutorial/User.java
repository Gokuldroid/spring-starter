package lily.potter.example.tutorial;

import lily.potter.example.pojo.ActiveRecord;

public class User extends ActiveRecord {
    int id;
    String name;


    public static User findById(int id) {
        return new User();
    }

    @Override
    public String getTableName() {
        return "users";
    }
}
