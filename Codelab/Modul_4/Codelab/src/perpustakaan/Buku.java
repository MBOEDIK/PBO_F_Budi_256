package perpustakaan;

public abstract class Buku implements DisplayInfo{
    String judul, penulis, genre;

    public Buku(String judul, String penulis, String genre){
        this.judul = judul;
        this.penulis = penulis;
        this.genre = genre;

    }

    @Override
    public abstract void displayInfo();

    public String getJudul(){return judul;}
    public String getPenulis(){return penulis;}
    public String getGenre(){return genre;}
}
