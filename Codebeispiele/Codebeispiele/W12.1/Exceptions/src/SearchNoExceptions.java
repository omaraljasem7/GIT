import java.util.Arrays;

public class SearchNoExceptions {

    /** Die Methode durchsucht ein Array nach einem Element.
     * @param arr Array mit ganzen Zahlen
     * @param was Das zu suchende Element in dem Array
     * @return Index im Array, an dem das gesuchte Element liegt.
     * @Nachbedingung arr[search(arr, was)) = was
     */
    public static int search(int[] arr, int was){
        if (arr == null)
            return -1;
        int n = arr.length;
        for (int i = 0; i < n; i++)
            if (arr[i] == was) return i;
        return -2;
    }

    public static int swap(int[] arr, int was, int womit) {
        int wasIndex = search(arr, was);
        if (wasIndex < 0) { // "was" konnte nicht gefunden werden
            return wasIndex;
        }
        int womitIndex = search(arr, womit);
        if (womitIndex < 0) { // "womit" konnte nicht gefunden werden
            return womitIndex - 10;
        }
        int temp = arr[wasIndex];
        arr[wasIndex] = arr[womitIndex];
        arr[womitIndex] = temp;
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};

        int was = Integer.parseInt(args[0]);
        int womit = Integer.parseInt(args[1]);

        System.out.println(Arrays.toString(arr));
        int error = swap(arr, was, womit);
        if (error < 0) {
            System.out.println("Operation konnte nicht ausgeführt werden (" + error + ")");
        } else {
            System.out.println(Arrays.toString(arr));
        }
    }

}
