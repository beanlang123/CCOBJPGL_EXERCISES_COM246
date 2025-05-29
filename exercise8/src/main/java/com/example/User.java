package com.example;

import javafx.beans.property.SimpleStringProperty;

public class User {
    private final SimpleStringProperty Username;
    private final SimpleStringProperty Password;
    private final SimpleStringProperty Accountcreated;
    private final SimpleStringProperty Accountstatus;

    public User(String uname, String pword, String dcreated, String astatus) {

        this.Username = new SimpleStringProperty(uname);
        this.Password = new SimpleStringProperty(pword);
        this.Accountcreated = new SimpleStringProperty(dcreated);
        this.Accountstatus = new SimpleStringProperty(astatus);
    }

    public String getUsername() {
        return Username.get();
    }

    public String getPassword() {
        return Password.get();
    }

    public String getAccountcreated() {
        return Accountcreated.get();
    }

    public String getAccountstatus() {
        return Accountstatus.get();
    }
}
