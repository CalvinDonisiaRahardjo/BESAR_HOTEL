/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;


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
public class Customer {
    private int id_customer;
    private String nama;
    private String no_telepon;
    private String alamat;
    private String jenis_kelamin;

    public Customer(int id_customer, String nama, String no_telepon, String alamat, String jenis_kelamin) {
        this.id_customer = id_customer;
        this.nama = nama;
        this.no_telepon = no_telepon;
        this.alamat = alamat;
        this.jenis_kelamin = jenis_kelamin;
    }

    public int getIdCustomer() {
        return id_customer;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelepon() {
        return no_telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJenisKelamin() {
        return jenis_kelamin;
    }

    
}
