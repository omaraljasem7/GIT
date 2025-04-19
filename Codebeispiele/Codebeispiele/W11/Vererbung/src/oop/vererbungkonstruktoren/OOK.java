package oop.vererbungkonstruktoren;

class OOK {

   int fieldI;

   OOK() {
      this(0);
      System.out.println("OOK->Konstruktor()");
   }
   OOK(int i1) {
      super();
      System.out.println("OOK->Konstruktor(int): " + i1);
      fieldI = i1;
   }

   void o() {
      System.out.println("OOK.o()");
   }


}
