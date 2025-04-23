package com.user;

public class Admin extends User {
    public Admin(String nama, String nim){
        super(nama, nim);
    }


    @Override
    public void login(User user){
        if(user.getNama().equals("Admin256") && user.getNim().equals("Password256")){
            isValid = true;
        }
    }
}
