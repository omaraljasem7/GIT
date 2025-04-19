package general;

public class ListElement{
    protected Object data;
    protected ListElement next; // rekursive Klasse

	/**
	 * Konstruktor der Klasse mit einem Parameter vom Typ specific.Point2D
	 * @param in der Klasse specific.Point2D, auf das Datenfeld data referenziert.
	 */
    ListElement(Object in){
        this(in, null);
    }
	
	/**
	 * Konstruktor der Klasse
	 * @param in Objekt der Klasse Punkt, das in dem specific.ListElement referenziert
     *           werden soll.
	 * @param ref Ein gültiger Verweis auf ein specific.ListElement.
	 */
    ListElement(Object in, ListElement ref){
        next = ref; 
        data = in;
    }
}
