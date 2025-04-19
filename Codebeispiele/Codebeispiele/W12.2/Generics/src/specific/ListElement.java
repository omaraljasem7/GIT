package specific;

public class ListElement {
    protected Point2D data;
    protected ListElement next; // rekursive Klasse

	/**
	 * Konstruktor der Klasse mit einem Parameter vom Typ specific.Point2D
	 * @param in der Klasse specific.Point2D, auf das Datenfeld data referenziert.
	 */
    ListElement(Point2D in){ 
        this(in, null);
    }
	
	/**
	 * Konstruktor der Klasse
	 * @param in Objekt der Klasse Punkt, das in dem specific.ListElement referenziert
     *           werden soll.
	 * @param ref Ein gültiger Verweis auf ein specific.ListElement.
	 */
    ListElement(Point2D in, ListElement ref){
        next = ref; 
        data = in;
    }
}
