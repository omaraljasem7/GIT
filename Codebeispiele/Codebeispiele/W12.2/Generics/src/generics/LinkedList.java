package generics;

import java.util.NoSuchElementException;

public class LinkedList<E> implements MyList<E> {

	private ListElement head, tail;

	LinkedList() {
		head = tail = null;
	}

	/**
	 * Fügt einen neuen Punkt in die Liste ein.
	 *
	 * @param p der neue Punkt
	 * @return ob der Punkt erfolgreich eingefügt wurde.
	 */
	public boolean add(E p) {
		if (p == null) return false;              // Solche Punkte nicht!
		if (head == null)                  // Liste ist leer
			head = tail = new ListElement<E>(p);
		else {                          // Liste ist nicht leer
			tail.next = new ListElement<E>(p);      // Einfügen am Ende
			tail = tail.next;
		}
		return true;
	}

	public boolean remove(E p) {
		ListElement<E> prev = null;
		for (ListElement<E> cur = head; cur != null; cur = cur.next) {
			if (p.equals(cur.data)) {             // Überprüfe auf Gleichheit
				if (prev == null)             // Vorgänger existiert nicht
					if (head == tail)         // Liste hat ein Element
						head = tail = null;
					else                       // Löschen des 1. Elements
						head = head.next;
				else
					prev.next = cur.next;      // Freigeben des Speichers
				return true;                 // Löschen erfolgreich
			}
			prev = cur;                     // Element p nicht gefunden
		}                             // Anpassen von prev
		return false;                         // Kein Element gelöscht
	}

	public boolean contains(E p) {
		for (ListElement<E> cur = head; cur != null; cur = cur.next) {
			if (p.equals(cur.data)) {             // Überprüfe auf Gleichheit
				return true;                 // Löschen erfolgreich
			}
		}
		return false;                         // Kein Element gelöscht
	}

	public E get(int index) {
		int curIndex = 0;
		for (ListElement<E> cur = head; cur != null; cur = cur.next, curIndex++) {
			if (curIndex == index)
				return cur.data;
		}
		throw new NoSuchElementException("Die Liste hat die Länge " + curIndex + " deshalb existiert kein Element mit dem Index " + index);
	}
}