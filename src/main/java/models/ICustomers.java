package models;

import props.Customer;

import javax.swing.table.DefaultTableModel;
import java.util.List;

public interface ICustomers {


    int customerInsert(Customer customer);
    int customerDelete(int cid);
    int customerUpdate(Customer customer);
    List<Customer> customerList();
    DefaultTableModel tablemodelCreate();



}
