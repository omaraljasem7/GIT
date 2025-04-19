package generics;

public interface MyList<T> {

    public boolean add(T v);

    public boolean remove(T v);

    public boolean contains(T p);

    public T get(int index);
}
