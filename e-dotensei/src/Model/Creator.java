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
public interface Creator {
    void createCampaign(Campaign c);
    void deleteCampaign(ArrayList<Campaign> campaigns, Campaign c);
}
