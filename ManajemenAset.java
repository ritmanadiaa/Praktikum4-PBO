/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak4;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManajemenAset {
    private List<AsetIT> daftarAset;
    
    public ManajemenAset(){
        this.daftarAset = new ArrayList<>();
    }
    
    // object
    public void tambahAset(AsetIT asetbaru) {
        daftarAset.add(asetbaru);
        System.out.println("Aset " + asetbaru.getIdAset() + " berhasil ditambahkan.");
    }

    // Method tampilkanSemuaAset menggunakan For-Each
    public void tampilkanSemuaAset() {
        if (daftarAset.isEmpty()) {
            System.out.println("Daftar aset kosong.");
            return;
        }

        System.out.println("\n=== DAFTAR ASET IT ===");
        for (AsetIT aset : daftarAset) {
            aset.tampilkanInfoAset();
        }
    }

    // hapusAset berdasarkan ID menggunakan Iterator
    public void hapusAset(String idAset) {
        Iterator<AsetIT> iterator = daftarAset.iterator();
        boolean ditemukan = false;

        while (iterator.hasNext()) {
            AsetIT aset = iterator.next();
            if (aset.getIdAset().equalsIgnoreCase(idAset)) {
                iterator.remove();
                ditemukan = true;
                System.out.println("Aset dengan ID " + idAset + " berhasil dihapus.");
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Peringatan: Aset dengan ID \"" + idAset + "\" tidak ditemukan!");
        }
    }
}
