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
    
    public void deleteUser(User[] users,User u){
        
    }
    
    public void addUsers(User[] users){
        User u = new User("Hadi","089567893414","hadi2@email.com","hadixxx");
        int i = 0;
        while (i<10) {
            users[i] = u;
            i++;
        }
    }
    
}
