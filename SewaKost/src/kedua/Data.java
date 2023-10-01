/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kedua;

import java.util.Scanner;

/**
 *
 * @author RPL
 */
public class Data extends awaldata {
    private String nama;
    private String alamat;
    private int nohp;
    private int pil;
    private int harga;
    private int tgl;
    
    Scanner input = new Scanner (System.in);
    
    @Override
    public void data() {
        System.out.println("---------------- Masukan Data Anda -----------------");
        System.out.println(" Masukan nama anda     : ");
        nama = input.nextLine();
        System.out.println(" Masukan alamat anda    : ");
        alamat = input.nextLine();
        System.out.println(" Masukan No hp anda    : ");
        nohp = input.nextInt();
        System.out.println(" Masukan Tanggal  masuk    : ");
        tgl = input.nextInt();
        System.out.println(" Masukan Pilihan Kamar : ");
        pil = input.nextInt();
       
    } 

    @Override
    public void harga() {
         switch (pil) {
             case 1 :
                 harga = 500000;
                 System.out.println("Fasilitas Kamar    : AC + Kamar mandi Dalam ");
                 System.out.println("Harga kamar        : " + harga);
                 System.out.println("pembayaran Setiap Tanggal     :" +tgl);
                 break;
             case 2 :
                 harga = 400000;
                 System.out.println("Fasilitas Kamar    : AC + Kamar mandi Luar ");
                 System.out.println("Harga kamar        : " + harga); 
                 System.out.println("pembayaran Setiap Tanggal     :" +tgl);
                 break;
                  case 3 :
                 harga = 300000;
                 System.out.println("Fasilitas Kamar    : Kipas + Kamar mandi Dalam ");
                 System.out.println("Harga kamar        : " + harga);
                 System.out.println("pembayaran Setiap Tanggal     :" +tgl);
                 break;
             case 4 :
                 harga = 250000;
                 System.out.println("Fasilitas Kamar    : Kipas + Kamar mandi Luar ");
                 System.out.println("Harga kamar        : " + harga);
                 System.out.println("pembayaran Setiap Tanggal     :" +tgl);
                 break;
             default:
                 System.out.println("Pilihan Tidak ada Di Dalam ");

         }
    }

    @Override
    public void output() {
       System.out.println("-------------- Bukti sewa kamar Kost -------------- ");
       System.out.println("Nama Penyewa : "+ nama);
       System.out.println("Alamat Penyewa : "+ alamat);
       System.out.println("No hp Penyewa : "+ nohp);
       harga();
    }
    
}
