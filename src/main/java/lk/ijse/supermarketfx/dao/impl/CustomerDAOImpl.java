package lk.ijse.supermarketfx.dao.impl;

import lk.ijse.supermarketfx.dao.CustomerDAO;
import lk.ijse.supermarketfx.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public List<Customer> getAll() {
        return List.of();
    }

    @Override
    public String getNextId() {
        return "";
    }

    @Override
    public boolean save(Customer customer) {
        return false;
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public ArrayList<String> getAllIDs() {
        return null;
    }

    @Override
    public Customer findById(String id) {
        return null;
    }
}
