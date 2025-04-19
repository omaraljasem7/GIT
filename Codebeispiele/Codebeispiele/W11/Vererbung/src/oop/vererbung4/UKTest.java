package oop.vererbung4;

public class UKTest {
    public static void main(String[] args) {
        UK k = new UK();
        System.out.println(k.a); // 27
        System.out.println(((OK) k).a); // 14.0

        System.out.println(k.getString());
    }
}
