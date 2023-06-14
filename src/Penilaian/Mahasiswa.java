
package Penilaian;

public class Mahasiswa {
    String nama, npm ;
 public Mahasiswa(String nama, String npm){
    this.nama=nama;
    this.npm=npm;
 }
// nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
//npm
    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    
}
