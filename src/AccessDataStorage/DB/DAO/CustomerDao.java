/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccessDataStorage.DB.DAO;

import BusinessComponent.Entity.Customer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author gruppo 22
 */

public interface CustomerDao {
    
    public int deleteCustomer(Customer customer) throws SQLException;
    public Set<Customer> searchCustomerKeysWords(ArrayList<String> words) throws SQLException;
    public int updateCustomer(String new_value,String attribute_to_change,String id) throws SQLException;
    public int deleteCustomer(String idcustomer) throws SQLException;
    public int updateCustomer(Customer customer) throws SQLException;
    public Set<Customer> searchByName(String name) throws SQLException;
    public Set<Customer> searchBySurname(String surname) throws SQLException;
    public Set<Customer> searchByBirth(Date from,Date to) throws SQLException;
    public Customer searchByTaxCode(String tax_code) throws SQLException;

}