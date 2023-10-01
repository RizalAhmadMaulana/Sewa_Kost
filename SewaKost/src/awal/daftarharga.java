/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awal;

/**
 *
 * @author Rizal
 */
interface daftar {
    public  void daftar();
}

public class daftarharga implements daftar {
    @Override
    public void daftar() {
        System.out.println("-------- Daftar harga kamar dan hargany -----------");
        System.out.println("1. AC + Kamar mandi Dalam \t Rp. 500.000,-\t perbulan");
        System.out.println("2. AC + Kamar mandi Luar \t Rp. 400.000,-\t perbulan");
        System.out.println("3. Kipas + Kamar mandi Dalam \t Rp. 300.000,-\t perbulan");
        System.out.println("4. Kipas + Kamar mandi Luar \t Rp. 250.000,-\t perbulan");
    }
}
