/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.altriaa.praktikum6;

/**
 *
 * @author User
 */
public class Tester {
    
    public static void main(String[] args) {
        Buku buku1 = new Buku("bobo",5);
        Buku buku2 = buku1;
        
        buku2.setJudul("donal bebek");
        System.out.println(buku1.getJudul());
        System.out.println(buku2.getJudul());
    }
}
