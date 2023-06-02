/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import dao.KamarDAO;
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
public class KamarControl {
    private KamarDAO kDao = new KamarDAO();
    
    public void insertDataKamar(Kamar k) {
        kDao.insertKamar(k);
    }
    
    public TableKamar showDataKamar(String query){
        List<Kamar> dataKamar = kDao.showKamar(query);
        TableKamar tableKamar = new TableKamar(dataKamar);
        
        return tableKamar;
    }
    
    public void updateDataKamar(Kamar k) {
        kDao.updateKamar(k);
    }
    
    public void deleteDataKamar(int id_kamar){
       kDao.deleteKamar(id_kamar);
    }
}
