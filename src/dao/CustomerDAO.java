/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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
public class CustomerDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertCustomer(Customer c){
        con = dbCon.makeConnection();
        String sql = "INSERT INTO xxxx";
        
        System.out.println("Adding Customer...");
        
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Customer");
            statement.close();
        } catch (Exception e){
            System.out.println("Error adding Customer...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void updateCustomer(Customer c) {
        con = dbCon.makeConnection();
        
        String sql = "UPDATE customer SET xxxx";
        System.out.println("Editing Customer...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+" Customer "+c.getIdCustomer());
            statement.close();
        } catch (Exception e){
            System.out.println("Error editing Customer...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Customer> showCustomer(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM customer";
        System.out.println("Mengambil data Customer...");
        
        List<Customer> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()) {
//                    Customer c = new Customer(
//                            Integer.parseInt(rs.getString("xx")),
//                            rs.getString("xxxx"),
//                            
                    
//                    list.add(c);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return list;
    }
    
    public void deleteCustomer(int id_customer){
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM customer WHERE id_customer = " + id_customer + "";
        System.out.println("Deleteing Customer...");
        
         try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Customer "+id_customer);
            statement.close();
        } catch (Exception e){
            System.out.println("Error deleting Customer...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }

}
