/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import dao.CustomerDAO;
import java.util.List;
import model.Customer;
import table.TableCustomer;

/**
 * Kelas    : PBO C
 * Kelompok : 3
 * Anggota :
 * 1. Calvin Donisia Rahardjo       (210711299)
 * 2. Patrik Restu Kustranggono     (210711333)
 * 3. I Made Wisnu Dharmapranaya    (210711352)
 * 4. Martinus Bagas Billy          (210711354)
 * 5. Kevin Edgard Halim            (210711376)
 */
public class CustomerControl {
    private CustomerDAO cDao = new CustomerDAO();
    
    public void insertDataCustomer(Customer c) {
        cDao.insertCustomer(c);
    }
    
    public TableCustomer showDataCustomer(String query){
        List<Customer> dataCustomer = cDao.showCustomer(query);
        TableCustomer tableCustomer = new TableCustomer(dataCustomer);
        
        return tableCustomer;
    }
    
    
    public void updateDataCustomer(Customer c) {
        cDao.updateCustomer(c);
    }
    
    public void deleteDataCustomer(int id_customer){
       cDao.deleteCustomer(id_customer);
    }
}
