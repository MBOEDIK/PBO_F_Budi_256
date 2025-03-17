import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();

        hewan1.Nama = "Kucing";
        hewan1.Jenis = "Mamalia";
        hewan1.Suara = "Nyann~~";

        hewan2.Nama = "Anjing";
        hewan2.Jenis = "Mamalia";
        hewan2.Suara = "Woof-woof!!";

        hewan1.TampilkanInfo();
        hewan2.TampilkanInfo();



    }
}

class Hewan{
    String Nama;
    String Jenis;
    String Suara;

    void TampilkanInfo(){
        System.out.printf("Nama: %s\n", Nama);
        System.out.printf("Jenis: %s\n", Jenis);
        System.out.printf("Suara: %s\n", Suara);
        System.out.printf("\n\n");
    }

}