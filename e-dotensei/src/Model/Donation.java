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
public class Donation {
    private String donation_id;
    private String donation_time;
    private User donor;
    private Campaign campaign;
    private int donation_number;
    private String donation_type;

    public Donation(String donation_time, User donor, Campaign campaign, int donation_number, String donation_type) {
        this.donation_time = donation_time;
        this.donor = donor;
        this.campaign = campaign;
        this.donation_number = donation_number;
        this.donation_type = donation_type;
    }
    
}
