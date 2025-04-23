package com.user;

public class User {
    private String nama, nim;
    boolean isValid = false;

    public User(String nama, String nim){ this.nama = nama; this.nim = nim; }

    public void login(User user){
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
