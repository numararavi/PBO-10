/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author HP
 */
public class Main {
    public static void main (String[]args) {
        //objek penjumlahan 
        Operasihitung penjumlahan= new Penjumlahan();
        System.out.print("penjumlahan =" + penjumlahan.hitung(10,5));
        
        //objek pengurangan 
        Operasihitung pengurangan = new Pengurangan();
       System.out.println("   Pengurangan = "+ pengurangan.hitung(8,8));
    }
    
}
