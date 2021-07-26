/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identitas.pegawai;

/**
 *
 * @author MOKLET-2
 */
public class IdentitasPegawai {
    private String nama;
    private String gender;
    private long nomor;
    private long gaji;
    
    public IdentitasPegawai(String nama, String gender, long nomor, long gaji){
        this.nama= nama;
        this.gender=gender;
        this.nomor= nomor;
        this.gaji= gaji;
    }
    public void datakaryawan(){
        System.out.println("Berikut identitas pegawai = ");
        System.out.println("Nama = " + nama);
        System.out.println("Jenis kelamin = " + gender);
        System.out.println("Nomor pegawai = " + nomor);
        System.out.println("Bekerja dibagian admin");
        System.out.println("Gaji utama yang didapat " + gaji);
        System.out.println("Gaji utama yang didapat jika bekerja secara baik menjadi = " + gaji*2);
    }
            
}
