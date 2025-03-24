import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KarakterGame karakterGame = new KarakterGame("Karakter Umum", 100);
        Pahlawan pahlawan = new Pahlawan("Brimstone", 150);
        Musuh musuh = new Musuh("Viper", 200);

        System.out.printf("" +
                "\nStatus Awal:\n" +
                "%s memiliki kesehatan: %d\n" +
                "%s memiliki kesehatan: %d\n\n",
                pahlawan.getNama(), pahlawan.getKesehatan(),
                musuh.getNama(), musuh.getKesehatan());

        pahlawan.Serang(musuh);
        musuh.Serang(pahlawan);
    }
}

class KarakterGame{
    private String nama;
    private  int kesehatan;

    KarakterGame(String nama, int kesehatan){
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    //method
    public void Serang(KarakterGame target){
        System.out.printf("%s menyerang %s menggunakan senjata!", this.getNama(), target.getNama());

    }

    //getter
    public String getNama(){  return nama;  }
    public int getKesehatan(){  return kesehatan;  }

    //setter
    public void setNama(String nama){  this.nama = nama; }
    public void setKesehatan(int kesehatan){  this.kesehatan = kesehatan; }
}

class Pahlawan extends KarakterGame{
    Pahlawan(String nama, int kesehatan){
        super(nama, kesehatan);
    }

    @Override
    public void Serang(KarakterGame target){
        System.out.printf("%s menyerang %s menggunakan Pedang!\n", this.getNama(), target.getNama());
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.printf("%s sekarang memiliki kesehatan: %d\n", target.getNama(),target.getKesehatan());
    }
}

class Musuh extends KarakterGame{
    Musuh(String nama, int kesehatan){
        super(nama, kesehatan);
    }

    @Override
    public void Serang(KarakterGame target){
        System.out.printf("%s menyerang %s menggunakan Snake Bite!\n", this.getNama(), target.getNama());
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.printf("%s sekarang memiliki kesehatan: %d\n", target.getNama(),target.getKesehatan());
    }
}