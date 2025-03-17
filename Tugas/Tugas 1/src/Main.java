import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LoginSystem loginSystem = new LoginSystem();
        loginSystem.tampilkanMenu();
    }
}

class LoginSystem{
    Admin admin = new Admin();
    Mahasiswa mahasiswa = new Mahasiswa();

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
               String username, password;
               System.out.printf("Masukkan username: "); username = input.nextLine();
               System.out.printf("Masukkan password: "); password = input.nextLine();
               admin.login(username, password);
               if(admin.getAdminValid() == true){
                   System.out.printf("Login Admin berhasil!");
               }else{
                   System.out.printf("Login gagal! Username atau Password salah.");
               } break;

           case 2:
               String nama, nim;
               System.out.printf("Masukkan nama: "); nama = input.nextLine();
               System.out.printf("Masukkan NIM: "); nim = input.nextLine();
               mahasiswa.login(nama, nim);
               if(mahasiswa.getAdminValid() == true){
                   System.out.printf("Login Mahasiswa berhasil!\n");
                   mahasiswa.displayInfo();
               }else{
                   System.out.printf("Login gagal! Nama atau NIM salah.");
               } break;
           default:
               System.out.printf("Pilihan tidak valid.");
       }
   }
}

class Admin{
    String username = "Admin256";
    String password = "Password256";
    boolean isValid = false;

    void login(String nameuser, String wordpass){
        if(nameuser.equals(username) && wordpass.equals(password)){
            isValid = true;
        }
    }

    public boolean getAdminValid(){ return isValid; }
}

class Mahasiswa{
    String nama = "Muhammad Budi Kusuma";
    String nim = "202410370110256";
    boolean isValid = false;

    void login(String mana, String min){
        if(mana.equals(nama) && min.equals(nim)){
            isValid = true;
        }
    }

    public boolean getAdminValid(){ return isValid; }

    void displayInfo(){
        System.out.printf("Nama: %s\nNIM: %s\n", nama, nim);
    }
}