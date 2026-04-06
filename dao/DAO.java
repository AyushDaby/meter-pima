// Reusable class for CRUD operations
package dao;

import java.util.List;

public interface DAO<T> { // T refers to order, item, ...
    // Create a type
    void create(T entity);
    // Return a specific type by its ID
    T getById(int id);
    // Return all types
    List<T> getAll();
    // Update a type's entity
    void update(T entity);
    // Remove a specific type by its ID
    void delete(int id);
}
