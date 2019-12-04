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
public class Campaign {
    private String campaign_id;
    private String campaign_name;
    private String campaign_type;
    private int campaign_goal;
    private int campaign_money;
    private User creator;
    private String Campaign_date;
    private ArrayList<Donation> donations;
    private ArrayList campaign_histories;
    private String campaign_story;

    public String getCampaign_name() {
        return campaign_name;
    }

    public String getCampaign_type() {
        return campaign_type;
    }

    public int getCampaign_goal() {
        return campaign_goal;
    }

    public int getCampaign_money() {
        return campaign_money;
    }

    public User getCreator() {
        return creator;
    }

    public String getCampaign_date() {
        return Campaign_date;
    }

    public ArrayList<Donation> getDonations() {
        return donations;
    }

    public ArrayList getCampaign_histories() {
        return campaign_histories;
    }

    public String getCampaign_story() {
        return campaign_story;
    }

    public Campaign(String campaign_id, String campaign_name, String campaign_type, int campaign_goal, int campaign_money, User creator, String Campaign_date, String campaign_story) {
        this.campaign_id = campaign_id;
        this.campaign_name = campaign_name;
        this.campaign_type = campaign_type;
        this.campaign_goal = campaign_goal;
        this.campaign_money = campaign_money;
        this.creator = creator;
        this.Campaign_date = Campaign_date;
        this.campaign_story = campaign_story;
    }
    
}
