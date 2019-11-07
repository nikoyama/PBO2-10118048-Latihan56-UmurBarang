/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan56.umurbarang;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menampilkan umur barang antik
 */
public class PBO210118048Latihan56UmurBarang {

    public static void main(String[] args) {
        
        Radio radio = new Radio(234);
        
        radio.setName("Radio AM");
        System.out.println("Nama barang Antik : " + radio.getName());
        radio.tampilUmur();
    }

}
