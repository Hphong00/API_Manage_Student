package repository;

import java.util.List;

public interface Dao<T> {
    List<T> getAll() ;

    T getEntityById(int id);

    boolean add(T t);

    boolean update(T t);

    boolean delete(int id);
}
