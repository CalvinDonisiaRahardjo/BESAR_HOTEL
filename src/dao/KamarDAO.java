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
import model.Kamar;
import table.TableKamar;

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
public class KamarDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertKamar(Kamar k){
        con = dbCon.makeConnection();
        String sql = "INSERT INTO xxxx";
        
        System.out.println("Adding Kamar...");
        
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+result+" Kamar");
            statement.close();
        } catch (Exception e){
            System.out.println("Error adding Kamar...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public void updateKamar(Kamar k) {
        con = dbCon.makeConnection();
        
        String sql = "UPDATE kamar SET xxxx";
        System.out.println("Editing Kamar...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+result+" Kamar "+k.getIdKamar());
            statement.close();
        } catch (Exception e){
            System.out.println("Error editing Kamar...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Kamar> showKamar(String query){
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM kamar";
        System.out.println("Mengambil data Kamar...");
        
        List<Kamar> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null){
                while(rs.next()) {
//                    Kamar k = new Kamar(
////                            Integer.parseInt(rs.getString("xx")),
////                            rs.getString("xxxx"),
////                            
//                    
//                    list.add(k);
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
    
    public void deleteKamar(int id_kamar){
        con = dbCon.makeConnection();
        
        String sql = "DELETE FROM kamar WHERE id_kamar = " + id_kamar + "";
        System.out.println("Deleteing Kamar...");
        
         try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Kamar "+id_kamar);
            statement.close();
        } catch (Exception e){
            System.out.println("Error deleting Kamar...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
}
