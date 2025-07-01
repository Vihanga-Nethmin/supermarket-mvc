package lk.ijse.supermarketfx.dao.impl;

import lk.ijse.supermarketfx.entity.Customer;

import java.util.ArrayList;

public interface CurdDAO {
    ArrayList<Customer> getAll();
    boolean save(Customer customer);
    boolean update(Customer customer);
    boolean delete(String id);

    ArrayList<String> getAllIDs();

    Customer findbyID(String id);
}
