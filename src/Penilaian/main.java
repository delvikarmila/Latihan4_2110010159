
package Penilaian;


public class main {
    public static void main(String[] args) {
        NilaiAkhir delvi= new NilaiAkhir("delvi", "2110010159", 90, 85, 90); 
        System.out.println("Nama: "+delvi.getNama());
        System.out.println("Npm: "+delvi.getNpm());
        System.out.println("NilaiAkhir: "+delvi.hitungNilaiAkhir());
            
    }
    
}
