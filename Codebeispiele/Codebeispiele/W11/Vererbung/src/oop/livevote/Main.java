package oop.livevote;

class Main {
    public static void main(String[] args) {
        EdgeSet es1 = new EdgeSet();
        Trajectory t = new Trajectory();
        EdgeSet es2 = t;
        System.out.println("Feldzugriff:");
        System.out.println(es1.name);
        System.out.println(t.name);
        System.out.println(es2.name);
        System.out.println("\nMethodenaufruf:");
        System.out.println(es1.getName());
        System.out.println(t.getName());
        System.out.println(es2.getName());
    }
}