/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117048.latihan4.kambing;

/**
 *
 * @author 
 * Nama  : Rizal Arif Nugraha
 * Kelas : PBO2 
 * NIM   : 10117048
 * Deskripsi Program : Program ini berisi program untuk menampilkan data tambah
 * kambing.

 */
public class PBO210117048Latihan4Kambing {
    public void tambahkambing() {
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PBO210117048Latihan4Kambing kambingJantan = 
                 new PBO210117048Latihan4Kambing();
        kambingJantan.tambahkambing();
    }
    
}
