package model;

abstract class Account {
    final private String email;
    final private String password;
    
    public Account(String email, String password){
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
}
