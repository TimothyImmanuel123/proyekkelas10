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
public class datakaryawan extends IdentitasPegawai {
    
    public datakaryawan(String nama, String gender, long nomor, long gaji) {
        super(nama, gender, nomor, gaji);
    }
    public void cetak (){
        super.datakaryawan();
    }
    
    public static void main(String[] args) {
        datakaryawan uji;
        uji = new datakaryawan ("Toyama Kasumi", "wanita", 673412, 15000000);
        uji.cetak();
    }

}
    
