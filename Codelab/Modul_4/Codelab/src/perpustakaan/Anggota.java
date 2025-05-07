package perpustakaan;

public class Anggota implements Peminjaman, DisplayInfo{
    String nama, idAnggota;

    public Anggota(String nama, String idAnggota){
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    @Override
    public void displayInfo(){
        System.out.println("Anggota: "+nama+" (ID: "+idAnggota+")");
    }

    @Override
    public void pinjamBuku(String judul){
        System.out.println(nama+" meminjam buku berjudul: "+judul);
    }

    @Override
    public void pinjamBuku(String judul, int durasiPeminjaman){
        System.out.println(nama+" meminjam buku \""+judul+"\" selama "+durasiPeminjaman+" hari");
    }


    @Override
    public void kembalikanBuku(String judul){
        System.out.println(nama+" mengembalikan buku berjudul: "+judul);
    }
}
