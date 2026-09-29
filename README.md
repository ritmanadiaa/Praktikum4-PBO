# Praktikum4-PBO
### Array, List dan Iterator
Berikut adalah penjelasan code dari masing-masing class.
1. **`Class AsetIT`**  
 Class ini berfungsi sebagai data model (Entity) yang merepresentasikan objek aset IT menggunakan atribut-atribut dasar beserta method untuk menampilkan informasi.
- Membuat class **`AsetIT`** didalam package **`tugasprak4`**
```java
package tugasprak4;

public class AsetIT {
```
- Attributes untuk menyimpan kode unik aset, nama perangkat IT, lokasi aset, dan status kelayakan aset.  
```java
    String idAset;
    String namaPerangkat;
    String lokasi;
    String statusKondisi;
}
```
- Constructor **`AsetIT(...)`** :
Digunakan untuk menginisialisasi nilai atribut saat objek baru dibuat menggunakan kata kunci **`new`**. Kata kunci **`this`** digunakan untuk membedakan antara variabel parameter dan variabel instance milik class
```java
public AsetIT(String idAset, String namaPerangkat, String lokasi,String statusKondisi){
        this.idAset = idAset;
        this.namaPerangkat = namaPerangkat;
        this.lokasi = lokasi;
        this.statusKondisi = statusKondisi;
```
- Getter **`getIdAset()`** :
Untuk mengambil atau membaca nilai dari variabel package **`idAset`** dari luar kelas.
```java
public String getIdAset(){
    return idAset;
    }
```
- Method **`tampilkanInfoAset()`** :
Untuk mencetak seluruh informasi detail dari aset tersebut ke konsol dalam format yang rapih.
```java
public void tampilkanInfoAset(){
        System.out.println("ID Aset        : " + idAset);
        System.out.println("Nama Perangkat : " + namaPerangkat);
        System.out.println("Lokasi         : " + lokasi);
        System.out.println("Status Kondisi : " + statusKondisi);
        System.out.println("-----------------------------------");
```
2. **`Class ManajemenAset`**  
class ini berfungsi sebagai **`Business Logic/Service`** yang mengelola sekumpulan objek **`AsetIT`** menggunakan struktur data (**`ArrayList`**).  
- Package & Import :
kelas ini berada di package tugasprak4 dan memanggil library dari Java untuk menggunakan **`List`** (interface daftar), **`ArrayList`** (implementasi daftar dinamis), dan **`Iterator`** (alat untuk menelusuri isi daftar).
 ```java
package tugasprak4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;  
```

- Atribut & Constructor **`daftarAset`**(**`List<AsetIT>`**) :
Menggunakan interface **`List`** dengan implementasi **`ArrayList`** untuk menyimpan banyak objek **`AsetIT`** secara dinamis (ukurannya bisa bertambah/berkurang). Constructor yang akan dipanggil saat objek dibuat. Di dalamnya, **`daftarAset`** diinisialisasi sebagai **`ArrayList`** kosong yang siap diisi data.
```java
public class ManajemenAset {
    private List<AsetIT> daftarAset;
    
    public ManajemenAset(){
        this.daftarAset = new ArrayList<>();
    }
```
- Method **`tambahAset()`** digunakan untuk menambahkan data aset baru ke dalam daftar
```java
public void tambahAset(AsetIT asetbaru) {
        daftarAset.add(asetbaru);
        System.out.println("Aset " + asetbaru.getIdAset() + " berhasil ditambahkan.");
    }
```
- Method **`tampilkanSemuaAset()`** digunakan untuk menampilkan seluruh aset yang tersimpan dengan *for-each looping*
```java
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
```
- Method **`hapusAset()`** digunakan untuk menghapus data aset berdasarkan id tertentu
```java
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
```
3. **`class MainAset`**  
- **`Package & Header Kelas`** : menunjukan bahwa kelas ini berada di package **`tugasprak4`** dan kelas utama bernama **`MainAset`**
```java
package tugasprak4;

public class MainAset {
    public static void main(String[] args) {
```
- Objek **`ManajemenAset`** : membuat objek baru bernama **`manajemen`** dari kelas **`ManajemenAset`** yg berfungsi untuk mengelola daftar aset (menambah, menampilkan, dan menghapus`**
```java
// a. Instansiasi objek ManajemenAset
ManajemenAset manajemen = new ManajemenAset();
```
- Menambah Data Aset
```java
// i. Tambahkan minimal 4 data aset IT;
manajemen.tambahAset(new AsetIT("AST-001", "Server Main Frame", "Data Center", "Baik"));
manajemen.tambahAset(new AsetIT("AST-002", "Router Cisco 2901", "Ruang Network", "Baik"));
manajemen.tambahAset(new AsetIT("AST-003", "Switch Catalyst", "Lantai 2", "Rusak"));
manajemen.tambahAset(new AsetIT("AST-004", "PC Workstation", "Lab Komputer", "Baik"));
```
- Menampilakn semua aset  
```java
// ii. Tampilkan semua aset
System.out.println("=== 1. DAFTAR ASET IT ===");
manajemen.tampilkanSemuaAset();
```  
- Menghapus Aset berdasarkan ID  
```java
// iii. Hapus salah satu aset menggunakan ID yang valid
System.out.println("=== 2. MENGHAPUS ASET (AST-003) ===");
manajemen.hapusAset("AST-003");
```
- Menampilkan aset setelah dihapus
```java
// iv. Tampilkan kembali semua aset untuk membuktikan penghapusan berhasil
System.out.println("\n=== 3. DAFTAR ASET SETELAH PENGHAPUSAN ===");
manajemen.tampilkanSemuaAset();
```
### Output Program


   
