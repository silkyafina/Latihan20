/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166017.latihan20.targetsaldotabungan;

/**
 *
 * @author User
 * Nama : Silky Afina Saly
 * NIM  : 22166017
 * Prodi: Sistem Informasi
 * Deskripsi Program: Program untuk menampilkan perhitungan lama tabungan hingga
 * mencapai saldo target
 */
public class SI_RegPagi22166017Latihan20TargetSaldoTabungan {
    public static void main(String[] args) {
        
    // deklarasi variabel
        double saldo_awal = 3500000; // saldo awal Rp.3.500.000
        double bunga_perbulan = 0.08; // bunga sebesar 8% setiap bulannya
        double saldo_target = 6000000; // saldo target

    // pengulangan
    for (int bulan=1; bulan <=8; bulan++){
  
     // deklarasi dan penghitungan saldo tabungan perbulan
    double saldo = saldo_awal*(1+bunga_perbulan);
    System.out.printf("Saldo di bulan ke-%d= %.2f%n", bulan, saldo);
    saldo_awal= saldo;
        }
    System.out.println("(Developed by: Silky Afina Saly)");
    }
    
} 
    

    
