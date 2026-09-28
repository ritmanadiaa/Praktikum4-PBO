# Praktikum4-PBO
### Array, List dan Iterator
Berikut adalah penjelasan code dari masing-masing class.
1. **`Class AsetIT`**  
 Class ini berfungsi sebagai data model (Entity) yang merepresentasikan objek     aset IT menggunakan atribut-atribut dasar beserta method untuk menampilkan       informasi.
- Membuat class **`AsetIT`** didalam package **`Praktikum4.Tugas`**
```java
package Praktikum4.Tugas;

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
