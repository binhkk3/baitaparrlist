package minitest;

public interface Manager<T> {
    void add(T t);

    void print();


    void edit(int id, T t);


    void delete(int id);
}
