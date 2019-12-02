/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Admin extends Account{
    private User[] users;
    private Campaign[] campaigns;

    public Admin(String user_name, String user_number, String user_email, String user_pass) {
        super(user_name, user_number, user_email, user_pass);
    }

    public User[] getUsers() {
        return users;
    }

    public Campaign[] getCampaigns() {
        return campaigns;
    }
    
    public void deleteUser(ArrayList<User> users,User u){
        
    }
}
