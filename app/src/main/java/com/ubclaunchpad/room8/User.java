package com.ubclaunchpad.room8;

import java.util.HashMap;
import java.util.List;

public class User {
    String Uid;
    String FirstName;
    String LastName;
    String Email;
    HashMap<String, String> PendingInvites;

    public User(){}

    public User(String uid, String firstName, String lastName, String email, HashMap<String, String> pendingInvites) {
        this.Uid = uid;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Email = email;
        this.PendingInvites = pendingInvites;
    }
}