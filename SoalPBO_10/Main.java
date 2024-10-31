/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SoalPBO_10;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[]args){
        Elektronik elektronik = new Elektronik();
        Makanan makanan = new Makanan();
        
        double hargaMakanan = 10000;
        double hargaElektronik = 50000;
        
        
        double pajakMakanan = makanan.hitungPajak(hargaMakanan);
        double pajakElektronik = elektronik.hitungPajak(hargaElektronik);
        
        System.out.println("pajak makanan = " + pajakMakanan);
        System.out.println("pajak elektronik = "+ pajakElektronik);
    }
}
