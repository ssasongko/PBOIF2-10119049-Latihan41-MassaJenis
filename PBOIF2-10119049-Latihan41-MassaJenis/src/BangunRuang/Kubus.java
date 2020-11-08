package BangunRuang;
/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program untuk mencari massa jenis didalam bangun ruang kubus
 */
public class Kubus {
    private int sisi;
    private int massa;
    
    public int getSisi(){
        return sisi;
    }
    
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    public int getMassa(){
        return massa;
    }
    
    public void setMassa(int massa){
        this.massa = massa;
    }
    
    public int hitungVolume(int parSisi){
        // volume kubus = sisi * sisi * sisi
        return (int)Math.pow(parSisi,3);
    }
    
    public int hitungMassaJenis(int parMassa, int volume){
        // Massa Jenis Kubus = massa/volume
        return parMassa/volume;
    }
}
