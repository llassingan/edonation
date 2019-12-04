/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.listkampanye2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angga
 */
public class ControllerListkampanye2 implements ActionListener {
    private listkampanye2 view;
    
    public ControllerListkampanye2(){
        view = new listkampanye2();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object s = ae.getSource();
        if(s.equals(view.getBtnkeluar())){
            new ControllerHome1();
            view.setVisible(false);
        }  else if(s.equals(view.getDonasi())){
            new ControllerDonasi();
            view.setVisible(false);
        } 
}
}
