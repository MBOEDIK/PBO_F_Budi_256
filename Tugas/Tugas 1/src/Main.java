import java.util.Scanner;

class PreLogin{
    int pilihan = 0;
    boolean adminStatus = false;

    void inputPilihan(){
        boolean isValid = false;
        while(!isValid){
            System.out.printf("" +
                    "Pilih login:\n" +
                    "1. Admin\n" +
                    "2. Mahasiswa\n" +
                    "Masukkan pilihan: ");
            try{
                Scanner input = new Scanner(System.in);
                pilihan = input.nextInt();
                switch (pilihan){
                    case 1: adminStatus = true; isValid = true; break;
                    case 2: isValid = true; break;
                    default: System.out.println("Pilihan tidak valid");
                }
            }catch(java.util.InputMismatchException e){
                System.out.println("Input tidak valid");
            }
        }
    }

    boolean isAdmin(){
        return adminStatus;
    }
}

class Login{
    String adminName = "Admin256",
            adminPass = "Password256";
    String studentName = "Muhammad Budi Kusuma",
            studentPass = "202410370110256";
    String nameFormat, passFormat;
    boolean status, isValid = false;

    void format (String username, String password, Boolean isAdmin){
        nameFormat = username;
        passFormat = password;
        status = isAdmin;
    }

    void input(Scanner input){
        System.out.printf("Masukkan %s: ", nameFormat); String inUsername = input.nextLine();
        System.out.printf("Masukkan %s: ", passFormat); String inPassword = input.nextLine();

        if(status){
            if(inUsername.equals(adminName) && inPassword.equals(adminPass)){
                isValid = true;
            }
        }else{
            if(inUsername.equals(studentName) && inPassword.equals(studentPass)){
                isValid = true;
            }
        }
    }

    void status(){
        if(isValid){
            System.out.printf("Login %s berhasil!", nameFormat);
        }else{
            System.out.printf("Login gagal! %s atau %s salah.", nameFormat, passFormat);
        }
    }
}

class LoginAdmin{
    String username = "Admin256";
    String password = "Password256";
    boolean isValid = false;

    void input(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukkan username: "); String inUsername = input.nextLine();
        System.out.printf("Masukkan password: "); String inPassword = input.nextLine();

        if(inUsername.equals(username) && inPassword.equals(password)){
            isValid = true;
        }
    }

    void status(){
        if(isValid){
            System.out.printf("Login Admin berhasil!");
        }else{
            System.out.printf("Login gagal! Username atau Passowrd salah.");
        }
    }
}

class LoginMahasiswa{
    String nama = "Muhammad Budi Kusuma";
    String nim = "202410370110256";
    boolean isValid = false;

    void input(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukkan Nama: "); String inNama = input.nextLine();
        System.out.printf("Masukkan NIM: "); String inNIM = input.nextLine();

        if(inNama.equals(nama) && inNIM.equals(nim)){
            isValid = true;
        }

    }

    void status(){
        if(isValid){
            System.out.printf("Login Mahasiswa berhasil!");
        }else{
            System.out.printf("Login gagal! Nama atau NIM salah.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        PreLogin prelogin = new PreLogin();
        prelogin.inputPilihan();

        if(prelogin.isAdmin() == true){
//            LoginAdmin loginAdmin = new LoginAdmin();
//            loginAdmin.input(); loginAdmin.status();

            Login login = new Login();
            login.format("username", "password", prelogin.isAdmin());
            login.input(new Scanner(System.in));
            login.status();
        }else{
//            LoginMahasiswa loginMahasiswa = new LoginMahasiswa();
//            loginMahasiswa.input(); loginMahasiswa.status();

            Login login = new Login();
            login.format("Nama", "NIM", prelogin.isAdmin());
            login.input(new Scanner(System.in));
            login.status();
        }
    }
}

//Update!