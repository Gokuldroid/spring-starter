package lily.potter.example.tutorial;

public class ADBoxedType {
    public static void main(String[] args) {
        int intPrimitive = new Integer(1000);
        Integer intBoxed = 1000;
        Integer intBoxedTwo = Integer.valueOf(1000);

        Boolean booleanBoxed = Boolean.TRUE;
        boolean primitive = true;
        primitive = booleanBoxed;

        //long - Long
        //char - Character
    }
}
