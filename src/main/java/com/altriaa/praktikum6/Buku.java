/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altriaa.praktikum6;

/**
 *
 * @author User
 */
public class Buku{
    public Buku(String judul, int hal){
        judulBuku = judul;
        jumlahHalaman = hal;
    }
    
    private String judulBuku;
    private int jumlahHalaman;
    
    public String getJudul(){
        return judulBuku;
    }

    public void setJudul(String newJudul){
        this.judulBuku = newJudul;
    }

    public int getHalaman(){
        return jumlahHalaman;
    }

    public void setHalaman(int newHalaman){
        this.jumlahHalaman = newHalaman;
    }
}
