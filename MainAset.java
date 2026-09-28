/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasprak4;

/**
 *
 * @author Ritma
 */
public class MainAset {
    public static void main(String[] args) {
        // a. Instansiasi objek ManajemenAset
        ManajemenAset manajemen = new ManajemenAset();

        // b. Skenario pengujian secara berurutan:
        
        // i. Tambahkan minimal 4 data aset IT;
        manajemen.tambahAset(new AsetIT("AST-001", "Server Main Frame", "Data Center", "Baik"));
        manajemen.tambahAset(new AsetIT("AST-002", "Router Cisco 2901", "Ruang Network", "Baik"));
        manajemen.tambahAset(new AsetIT("AST-003", "Switch Catalyst", "Lantai 2", "Rusak"));
        manajemen.tambahAset(new AsetIT("AST-004", "PC Workstation", "Lab Komputer", "Baik"));

        // ii. Tampilkan semua aset
        System.out.println("DAFTAR ASET IT");
        manajemen.tampilkanSemuaAset();

        // iii. Hapus salah satu aset menggunakan ID yang valid
        System.out.println("=== 2. MENGHAPUS ASET (AST-003) ===");
        manajemen.hapusAset("AST-003");

        // iv. Tampilkan kembali semua aset untuk membuktikan penghapusan berhasil
        System.out.println("\n=== 3. DAFTAR ASET SETELAH PENGHAPUSAN ===");
        manajemen.tampilkanSemuaAset();
    }
}
