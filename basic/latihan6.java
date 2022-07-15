// mengimpor Scanner ke program
import java.util.Scanner;

public class latihan6 {
    
    public static void main(String[] args) {
        // deklarasi variabel
        String nama, alamat;
        
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        // Tampilkan output ke user
        System.out.println("### Pendataan Karyawan PT. Mau Apa ###");
        System.out.print("Nama karyawan: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.next();
        // Tampilkan outpu lagi
        System.out.print("Alamat: ");
        // menggunakan scanner lagi
        alamat = keyboard.next();
        
        
        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
    }
    
}