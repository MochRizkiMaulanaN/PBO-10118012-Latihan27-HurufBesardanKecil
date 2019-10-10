/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurufbesardankecil;

import java.util.Scanner;

/**
 * Nama : Moch Rizki Maulana N
 * Kelas : IF-1/S1/III
 * NIM : 10118012
 * Deskripsi Program: Mengubah Huruf MEnjadi Huruf Besar dan Kecil
 * @author LENOVO
 */
public class HurufBesardanKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =new Scanner(System.in);
        
        String kalimat;
        System.out.println("Masukkan Kalimat : ");
        kalimat =input.nextLine();
        System.out.println("");
        System.out.println("=== Hasil Formatting ===");
        System.out.println("Huruf Besar = "+kalimat.toUpperCase());
        System.out.println("Huruf Kecil = "+kalimat.toLowerCase());
    }
    
}
