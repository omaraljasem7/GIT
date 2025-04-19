package generics;

public class ListElement<E> {
    protected E data;
    protected ListElement next; // rekursive Klasse

	/**
	 * Konstruktor der Klasse mit einem Parameter vom Typ specific.Point2D
	 * @param in der Klasse specific.Point2D, auf das Datenfeld data referenziert.
	 */
    ListElement(E in){
        this(in, null);
    }
	
	/**
	 * Konstruktor der Klasse
	 * @param in Objekt der Klasse Punkt, das in dem specific.ListElement referenziert
     *           werden soll.
	 * @param ref Ein gültiger Verweis auf ein specific.ListElement.
	 */
    ListElement(E in, ListElement ref){
        next = ref; 
        data = in;
    }
}
