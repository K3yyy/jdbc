package model.dao;

import model.entity.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {
    List<Customer> queryAllCustomers();
    int  deleteCustomerById(Integer id) throws SQLException;
    int updateCustomerById(Integer id);
    int addNewCustomer(Customer customer);

}
