package dataAccess.abstracts;

import java.util.List;

public interface BaseRepository<T> {
    void add(T t);
    void update(T t);
    void delete(T t);
    List<T> getAll();
}
