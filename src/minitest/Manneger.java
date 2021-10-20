package minitest;

public interface Manneger<T> {
    void add(T t);

    void print();

    int find(int id);

    void edit(int id, T t);

    void sort();

    void delete(int id);
}
