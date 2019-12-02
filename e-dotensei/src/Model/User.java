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
public class User extends Account implements Creator{
    private ArrayList<Campaign> myCampaigns;
    private ArrayList histories;

    public User(String user_name, String user_number, String user_email, String user_pass) {
        super(user_name, user_number, user_email, user_pass);
    }

    public ArrayList<Campaign> getMyCampaigns() {
        return myCampaigns;
    }

    public ArrayList getHistories() {
        return histories;
    }
    
    public void viewCampaigns(ArrayList list){
        
    }
    
    public void donate(Donation d){
        
    }
    
    public void editProfile(User p){
        
    }

    @Override
    public void createCampaign(Campaign c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteCampaign(ArrayList<Campaign> campaigns, Campaign c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
