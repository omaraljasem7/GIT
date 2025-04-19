public class FinallyDemo {

    public static void main(String[] args) {
        try {
            System.out.println("try start");
//            throw new NullPointerException();
//            System.out.println("try start");
        }
        catch (NullPointerException e) {
            System.out.println("catch NPE");
        }
        finally {
            System.out.println("finally");
        }
//        System.out.println("Programmende");
    }
}
