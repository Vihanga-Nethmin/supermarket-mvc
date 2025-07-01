package lk.ijse.supermarketfx.dao.impl;

import lk.ijse.supermarketfx.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public interface CrudDAO <T>{
    List<T> getAll();
    String getNextId();
    boolean save(T t);
    boolean update(T t);
    boolean delete(String id);

    ArrayList<String> getAllIDs();

    T findById(String id);
}
