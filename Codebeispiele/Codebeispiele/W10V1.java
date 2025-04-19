public class W10V1 {
    private static String[] names = {"Jeff", "Elon", "Bernard", "Bill", "Mark", "Christoph-Matthias"};
    private static int[] ages = {57, 49, 111, 65, -39, 42};
    private static double[] worths = {188.44, 263, 197.519, 135.844, 117.5, 0.1};

    public static void main(String[] args) {
        System.out.println("== String Vergleiche mit compareTo");

        String name1 = "Christoph"; // oder "Matthias"
        String name2 = "Matthias"; // oder "Christoph" ... probieren Sie verschiedene Kombinationen aus

        if (name1.compareTo(name2) < 0) {
            System.out.println(name1 + " kommt vor " + name2);
        }
        if (name1.compareTo(name2) == 0) {
            System.out.println(name1 + " ist gleich " + name2);
        }
        if (name1.compareTo(name2) > 0) {
            System.out.println(name1 + " kommt nach " + name2);
        }
        if (name1.compareTo(name2) >= 0) {
            System.out.println(name1 + " kommt nach oder ist gleich " + name2);
        }
        if (name1.compareTo(name2) <= 0) {
            System.out.println(name1 + " kommt vor oder ist gleich " + name2);
        }

        System.out.println("== Palindrom-Überprüfung mittels StringBuilder.reverse()");

        String wort = "lagerregal"; // probieren Sie andere Worte aus, die z.B. kein Palindrom sind.

        StringBuilder sb = new StringBuilder(wort);
        sb.reverse();
        String umgedrehtesWort = new String(sb);

        System.out.println(wort + " ist ein Palindrom: " + wort.equals(umgedrehtesWort));

        // Beispiel für String Konkatenation bei der mehrere temporäre String-Objekte erzeugt werden.
        String s1 = "Hallo";
        s1 += " Welt"; // neues String-Objekt
        s1 += "!"; // neues String-Objekt

        // Das gleiche noch einmal aber ohne temporäre String-Objekte.
        // Es wird hier nur *ein* (temporärer) StringBuilder erzeugt.
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hallo");
        sb2.append(" Welt");
        sb2.append("!");

        System.out.println("Beispiele für Formatierung mittels Formatstrings.");
        System.out.printf("*%-10s*", "Hallo");

        System.out.printf("|%-10s|%-10s|%-10s|%n", "Name", "Alter", "Vermögen");
        System.out.print("+" + "-".repeat(32) + "+\n");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("|%10s|%+10d|%10.2f|%n", names[i], ages[i], worths[i]);
        }

    }

}
