class RekeningBank{
    String nomorRekening, namaPemilik;
    double saldo;

    void tampilkanInfo(){
        System.out.printf("Nomor Rekening: %s\n", nomorRekening);
        System.out.printf("Nama Pemilik: %s\n", namaPemilik);
        System.out.printf("Saldo: Rp%.1f\n\n", saldo);
    }

    void setorUang(double jumlah){
        saldo += jumlah;
        System.out.printf("%s menyetor Rp%.1f. Saldo sekarang: Rp%.1f\n", namaPemilik, jumlah, saldo);
    }

    void tarikUang(double jumlah){
        if(saldo < jumlah){
            System.out.printf("%s menarik %.1f. (Gagal, saldo tidak mencukupi) Saldo saat ini: %.1f\n", namaPemilik, jumlah, saldo);
        }else{
            saldo -= jumlah;
            System.out.printf("%s menarik %.1f. (Berhasil) Saldo saat ini: %.1f\n", namaPemilik, jumlah, saldo);
        }
    }

}

public class Main {
    public static void main(String[] args) {
        RekeningBank rekening1 = new RekeningBank();
        RekeningBank rekening2 = new RekeningBank();

        rekening1.nomorRekening = "202410370110256";
        rekening1.namaPemilik = "Muhammad Budi Kusuma";
        rekening1.saldo = 30000;
        rekening1.tampilkanInfo();

        rekening2.nomorRekening = "202410370110258";
        rekening2.namaPemilik = "M Juan Yafi Zain Wibisono";
        rekening2.saldo = 75000;
        rekening2.tampilkanInfo();

        rekening1.setorUang(20000);
        rekening2.setorUang(100000);
        System.out.printf("\n");
        rekening1.tarikUang(40000);
        rekening2.tarikUang(200000);
        System.out.printf("\n");
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

    }
}