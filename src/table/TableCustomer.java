/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Customer;

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
public class TableCustomer extends AbstractTableModel{
    private List<Customer> list;

    public TableCustomer (List<Customer> list) {
        this.list = list;
    }
    
    public int getRowCount() {
        return list.size();
    }
    
    public int getColumnCount(){
        return 4;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getNama();
            case 1:
                return list.get(rowIndex).getNoTelepon();
            case 2:
                return list.get(rowIndex).getAlamat();
            case 3:
                return list.get(rowIndex).getJenisKelamin();
            case 4:
                return list.get(rowIndex).getIdCustomer();
            default:
                return null;      
        }   
    }

    public String getColumnName(int column){
        switch(column) {
            case 0:
                return "Nama Customer";
            case 1:
                return "Nomor Telepon";
            case 2:
                return "Alamat";
            case 3:
                return "Jenis Kelamin";    
            default:
                return null;
                    
        }
    }
}
