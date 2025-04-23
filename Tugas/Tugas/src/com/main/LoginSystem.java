package com.main;

import java.util.Scanner;
import  com.user.*;

public class LoginSystem {
    Admin admin = new Admin("", "");
    Mahasiswa mahasiswa = new Mahasiswa("", "");
    User userInput;

    public void tampilkanMenu(){
        Scanner input = new Scanner(System.in);
        int pilihan;
        System.out.printf("""
                \
                Pilih login:
                1. Admin
                2. Mahasiswa
                Masukkan pilihan:\s""");
        pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan){
            case 1:
                String username, password;
                System.out.printf("Masukkan username: "); username = input.nextLine();
                System.out.printf("Masukkan password: "); password = input.nextLine();

                userInput = new User(username, password);
                admin.login(userInput);

                if(admin.getAdminValid()){
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
