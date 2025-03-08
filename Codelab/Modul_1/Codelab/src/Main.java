import java.util.Scanner;
import java.time.LocalDate;

class dataPengguna {
    String nama, inputJenisKelamin;
    char jenisKelamin;
    int tahunLahir, umur;

    void inputData(Scanner input) {
        System.out.printf("Masukkan nama: ");
        nama = input.nextLine();

        while (true) {
            System.out.print("Jenis kelamin (P/L): ");
            inputJenisKelamin = input.nextLine();
            if (inputJenisKelamin.length() != 0) {
                jenisKelamin = inputJenisKelamin.charAt(0);
                switch (jenisKelamin) {
                    case 'L', 'l':
                        inputJenisKelamin = "Laki-laki";
                        break;
                    case 'P', 'p':
                        inputJenisKelamin = "Perempuan";
                        break;
                    default:
                        System.out.printf("Jenis kelamin tidak valid!\n");
                        continue;
                }
                break;
            } else {
                System.out.printf("Jangan biarkan jenis kelamin kosong!\n");
                continue;
            }
        }

        boolean inputValid = false;
        while (!inputValid) {
            System.out.printf("Tahun lahir: ");
            try {
                tahunLahir = input.nextInt();
                inputValid = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: Harus masukkan angka!");
                input.nextLine(); // Bersihin buffer
            }
        }
        umur = LocalDate.now().getYear() - tahunLahir;
    }

    void tampilkanData() {
        System.out.printf("\nData Diri:\n");
        System.out.printf("Nama         : %s\n", nama);
        System.out.printf("Jenis Kelamin: %s\n", inputJenisKelamin);
        System.out.printf("Umur         : %d tahun\n", umur);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        dataPengguna pengguna = new dataPengguna();
        pengguna.inputData(input);
        pengguna.tampilkanData();
        input.close();
    }
}