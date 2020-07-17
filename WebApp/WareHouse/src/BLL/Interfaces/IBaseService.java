package BLL.Interfaces;

public interface IBaseService<T> {
    void addItem(T item);
    boolean deleteItem(T item);
}
