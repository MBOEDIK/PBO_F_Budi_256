package app;

import perpustakaan.Anggota;
import perpustakaan.Buku;
import perpustakaan.Fiksi;
import perpustakaan.NonFiksi;

public class Main {
    public static void main(String[] args) {
        Buku bukufiksi1 = new Fiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Buku bukuNonFiksi1 = new NonFiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");

        Anggota anggota1 = new Anggota("Muhammad Budi Kusuma", "F256");
        Anggota anggota2 = new Anggota("Shofa Khafidin", "F276");

        bukufiksi1.displayInfo();
        bukuNonFiksi1.displayInfo(); System.out.printf("\n");

        anggota1.displayInfo();
        anggota2.displayInfo(); System.out.printf("\n");

        anggota1.pinjamBuku(bukufiksi1.getJudul());
        anggota2.pinjamBuku(bukuNonFiksi1.getJudul(), 7); System.out.printf("\n");

        anggota1.kembalikanBuku(bukufiksi1.getJudul());
        anggota2.kembalikanBuku(bukuNonFiksi1.getJudul()); System.out.printf("\n");
    }
}
