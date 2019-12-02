/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Lenovo
 */
public abstract class Account {
    private String user_id;
    private String user_name;
    private String user_number;
    private String user_email;
    private String user_pass;

    public String getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_number() {
        return user_number;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getUser_pass() {
        return user_pass;
    }

    public Account(String user_name, String user_number, String user_email, String user_pass) {
        this.user_name = user_name;
        this.user_number = user_number;
        this.user_email = user_email;
        this.user_pass = user_pass;
    }
    
    
    
}
