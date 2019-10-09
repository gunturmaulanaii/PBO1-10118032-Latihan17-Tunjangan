/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118032.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author Guntur Maulana I
 * NAMA			: Guntur Maulana Ibrahim
 * KELAS		: IF-1
 * NIM			: 10118032
 * Deskripsi Program	: Menghitung gaji total berdasarkan gaji pokok dan status kawin
 */
public class PBO110118032Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*************PROGRAM TUNJANGAN*************");
        System.out.print("Berapa gaji pokok anda perbulan ?\t: Rp. ");
        Scanner scanner = new Scanner(System.in);
        double gajipokok = scanner.nextInt();
        double tunjangan = 0;
        System.out.print("Status anda ? (Menikah/Belum)\t\t: ");
        String status = scanner.next();
        if (status.equals("Menikah")){
            tunjangan = 0.35 * gajipokok;
            System.out.println(status);
        }
        
        double totalgaji = gajipokok + tunjangan;
        System.out.println("*********HASIL PERHITUNGAN GAJI ANDA*********");
        System.out.println("Gaji Pokok \t\t: Rp. "+gajipokok);
        System.out.println("Tunjangan \t\t: Rp. "+tunjangan);
        System.out.println("Total Gaji \t\t: Rp. "+totalgaji);
        System.out.println("(Developed By : Guntur Maulana Ibrahim)");
                
    }
    
}
