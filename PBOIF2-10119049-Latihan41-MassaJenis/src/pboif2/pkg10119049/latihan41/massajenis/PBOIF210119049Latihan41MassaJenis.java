package pboif2.pkg10119049.latihan41.massajenis;
/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program untuk mencari massa jenis didalam bangun ruang kubus
 */

import BangunRuang.Kubus; // import class
public class PBOIF210119049Latihan41MassaJenis {
    public static void main(String[] args) {
        Kubus kubus = new Kubus(); // instance object
        
        kubus.setSisi(5);
        kubus.setMassa(250);
        
        System.out.println("====Massa Jenis Kubus====");
        System.out.printf("Sisi : %d\n",kubus.getSisi());
        System.out.printf("Massa : %d\n\n",kubus.getMassa());
        
        System.out.println("====Hasil Perhitungan====");
        System.out.printf("Volume : %d\n", kubus.hitungVolume(kubus.getSisi()));
        System.out.printf("Massa Jenis : %d\n", kubus.hitungMassaJenis(kubus.getMassa(),kubus.hitungVolume(kubus.getSisi())));
    }
    
}
