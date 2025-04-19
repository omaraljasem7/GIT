package specific;

import java.util.NoSuchElementException;
import java.util.Objects;

public class LinkedList {

	private ListElement head, tail;

	LinkedList() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	/**
	 * Fügt einen neuen Punkt in die Liste ein.
	 *
	 * @param p der neue Punkt
	 * @return ob der Punkt erfolgreich eingefügt wurde.
	 */
	public boolean add(Point2D p) {
		//if (p == null) return false;              // Solche Punkte nicht!
		Objects.requireNonNull(p);
		if (head == null)                  // Liste ist leer
			head = tail = new ListElement(p);
		else {                          // Liste ist nicht leer
			tail.next = new ListElement(p);      // Einfügen am Ende
			tail = tail.next;
		}
		return true;
	}

	public boolean remove(Point2D p) {
		ListElement prev = null;
		for (ListElement cur = head; cur != null; cur = cur.next) {
			if (p.equals(cur.data)) {             // Überprüfe auf Gleichheit
				if (prev == null && head == tail) {
					// Vorgänger existiert nicht
					// Liste hat (max.) ein Element
					head = tail = null;
				} else if(prev == null &&  head != tail)  {
					// Vorgänger existiert nicht
					// Liste hat mehr als ein Element
					// Löschen des 1. Elements
						head = head.next;
				} else {
					prev.next = cur.next;      // Freigeben des Speichers
				}
				return true;                 // Löschen erfolgreich
			}
			prev = cur;                     // Element p nicht gefunden
		}                             // Anpassen von prev
		return false;                         // Kein Element gelöscht
	}

	public boolean contains(Point2D p) {
		for (ListElement cur = head; cur != null; cur = cur.next) {
			if (p.equals(cur.data)) {             // Überprüfe auf Gleichheit
				return true;                 // Löschen erfolgreich
			}
		}
		return false;                         // Kein Element gelöscht
	}

	public Point2D get(int index) {
		int curIndex = 0;
		for (ListElement cur = head; cur != null; cur = cur.next, curIndex++) {
			if (curIndex == index)
				return cur.data;
		}
		throw new IndexOutOfBoundsException("Die Liste hat die Länge " + curIndex + " deshalb existiert kein Element mit dem Index " + index);
	}
}