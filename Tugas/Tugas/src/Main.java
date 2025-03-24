import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();
        loginSystem.tampilkanMenu();
    }
}

class LoginSystem{
    Admin admin = new Admin("", "");
    Mahasiswa mahasiswa = new Mahasiswa("", "");
    User userInput;

    void tampilkanMenu(){
        Scanner input = new Scanner(System.in);
        int pilihan;
        System.out.printf("" +
                "Pilih login:\n" +
                "1. Admin\n" +
                "2. Mahasiswa\n" +
                "Masukkan pilihan: ");
        pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan){
            case 1:
                System.out.printf("Masukkan username: "); String username = input.nextLine();
                System.out.printf("Masukkan password: "); String password = input.nextLine();

                userInput = new User(username, password);
                admin.login(userInput);

                if(admin.getAdminValid() == true){
                    System.out.printf("Login Admin berhasil!");
                }else{
                    System.out.printf("Login gagal! Username atau Password salah.\n");
                } break;

            case 2:
                String nama, nim;
                System.out.printf("Masukkan nama: "); nama = input.nextLine();
                System.out.printf("Masukkan NIM: "); nim = input.nextLine();

                userInput = new User(nama, nim);
                mahasiswa.login(userInput);

                if(mahasiswa.getAdminValid() == true){
                    System.out.printf("\nLogin Mahasiswa berhasil!\n");
                    mahasiswa.DisplayInfo();
                }else{
                    System.out.printf("\nLogin gagal! Nama atau NIM salah.\n");
                } break;
            default:
                System.out.printf("Pilihan tidak valid.");
        }
    }
}

class User{
    private String nama, nim;
    boolean isValid = false;

    User(String nama, String nim){ this.nama = nama; this.nim = nim; }

    void login(User user){
        if(user.getNama().equals(this.nama) && user.getNim().equals(this.nim)){
            isValid = true;
        }
    }

    //setter
    public void setNama(String nama){ this.nama = nama; }
    public void setNim(String nim){ this.nim = nim; }

    //getter
    public boolean getAdminValid(){ return isValid; }
    public String getNama(){ return nama; }
    public String getNim(){ return nim; }
}

class Admin extends User{
    Admin(String nama, String nim){
        super(nama, nim);
    }

    @Override
    void login(User user){
        if(user.getNama().equals("Admin256") && user.getNim().equals("Password256")){
            isValid = true;
        }
    }
}

class Mahasiswa extends User{
    Mahasiswa(String nama, String nim){
        super(nama, nim);
    }

    @Override
    void login(User user){
        if(user.getNama().equals("Muhammad Budi Kusuma") && user.getNim().equals("202410370110256")){
            isValid = true;
        }
    }

    void DisplayInfo(){
        System.out.printf("" +
                "\n===============================\n" +
                "Nama: Muhammad Budi Kusuma\n" +
                "NIM: Muhammad Budi Kusuma" +
                "\n===============================\n");
    }
}