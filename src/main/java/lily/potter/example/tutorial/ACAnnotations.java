package lily.potter.example.tutorial;

import org.springframework.lang.NonNull;

public class ACAnnotations {
    public static void main(String[] args) {
        System.out.println(getFirstName(null));
        System.out.println(getFirstName("gokul"));
    }

    public static String getFirstName(@NonNull String name) {
        return name.split("\\.")[0];
    }
}
