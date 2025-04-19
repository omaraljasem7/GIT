package oop.vererbungkonstruktoren;

class OK extends OOK{

    public OK() {

    }

    public OK(int i) {
        super(i);
        System.out.println("OK -> Konstruktor(int): " + i);
    }


    void m() {
        System.out.println("OK.m()");
    }

    void o() {
        System.out.println("OK.o()");
    }
}
