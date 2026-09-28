/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak4;

/**
 *
 * @author Ritma
 */
public class AsetIT {
    String idAset;
    String namaPerangkat;
    String lokasi;
    String statusKondisi;
    
    //Constructor dengan parameter
    public AsetIT(String idAset, String namaPerangkat, String lokasi,String statusKondisi){
        this.idAset = idAset;
        this.namaPerangkat = namaPerangkat;
        this.lokasi = lokasi = statusKondisi;
    }
    //Getter untuk idAset
    public String getIdAset(){
    return idAset;
    }
    
    //method tampilkanInfoAset
    public void tampilkanInfoAset(){
        System.out.println("ID Aset        : " + idAset);
        System.out.println("Nama Perangkat : " + namaPerangkat);
        System.out.println("Lokasi         : " + lokasi);
        System.out.println("Status Kondisi : " + statusKondisi);
        System.out.println("-----------------------------------");
    }
      
}
