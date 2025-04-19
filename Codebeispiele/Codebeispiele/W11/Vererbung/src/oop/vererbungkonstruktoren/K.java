package oop.vererbungkonstruktoren;

class K extends OK {

    public K() {
//        super(-1);
        System.out.println("K -> Konstruktor()");
    }

    public K(int i) {
        super(i);
        System.out.println("K -> Konstruktor(int): " + i);


    }

    void m() {
        System.out.println("K.m()");
        super.m();
        super.o();
    }

    void o() {
        System.out.println("K.o()");
    }

}
