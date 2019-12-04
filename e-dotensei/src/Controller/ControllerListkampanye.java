/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.listkampanye;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angga
 */
public class ControllerListkampanye implements ActionListener {
    private listkampanye view;
    
    public ControllerListkampanye(){
        view = new listkampanye();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object s = ae.getSource();
        if(s.equals(view.getBtnkeluar())){
            new ControllerHome();
            view.setVisible(false);
        }  else if(s.equals(view.getDonasi())){
            new ControllerDonasi();
            view.setVisible(false);
        } 
}
}
