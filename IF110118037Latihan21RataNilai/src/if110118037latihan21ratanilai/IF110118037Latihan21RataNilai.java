/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110118037latihan21ratanilai;
import java.util.Scanner;
/**
 * @author Muhammad Ihsan
 * NAMA                           : Muhammad Ihsan
 * KELAS                         : IF-1
 * NIM                              : 10118037
 * Deskripsi Program   : Program ini berisi program rata-rata nilai dari banyaknya mahasiswa
 *                                         
 */
public class IF110118037Latihan21RataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlahMhs;
        int[]  nilaiMhs = new int[10];
        double rataNilai = 0 ;
        
        //input
        System.out.print("Masukkan banyaknya mahasiswa : ");
        Scanner tempMhs = new Scanner(System.in);
        jumlahMhs = tempMhs.nextInt();
        
        //perhitungan dan output
        for(int i= 1 ; i<=jumlahMhs ; i++){
            System.out.print("Masukkan nilai mahasiswa ke- " + i + " : ");
            Scanner tempNilai = new Scanner(System.in);
            nilaiMhs[i] = tempNilai.nextInt();
            rataNilai += nilaiMhs[i];
            
        }
        System.out.println("Rata-rata Nilai dari Mahasiswa adalah : " + (rataNilai / jumlahMhs));
        System.out.println("(Develovep by Muhammad Ihsan)");
        
        
    }
    
}
