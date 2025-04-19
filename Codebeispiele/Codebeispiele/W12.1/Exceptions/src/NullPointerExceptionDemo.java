import java.util.Random;

public class NullPointerExceptionDemo {

    private static Object m1() {
        return "Hallo ";
    }

    private static Object m2() {
        return null;
    }










    public static void main(String[] args) {
        System.out.println(m1().toString() + m2().toString());
    }

}
