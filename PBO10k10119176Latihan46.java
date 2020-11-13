import java.util.Date;
import java.util.Scanner;

/**
 * Latihan45
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Cetak Nama
 */
public class PBO10k10119176Latihan46 {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        Age age = new Age(2020);
        System.out.print("Masukkan Tahun Lahir : ");
        age.setYearBirth(baca.nextInt());
        System.out.println("");
        System.out.println("===Hasil Perhitungan Umur===");
        System.out.println("Tahun Lahir Anda : " + age.getYearBirth());
        System.out.println("Hari ini Tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah : " + age.hitungUmur() + " Tahun");
        age.tandanyaKamu(age.hitungUmur());
    }
}
