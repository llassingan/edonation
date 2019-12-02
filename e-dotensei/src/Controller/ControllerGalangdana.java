/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.galangdana;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angga
 */
public class ControllerGalangdana implements ActionListener {
    private galangdana view;
    
    public ControllerGalangdana(){
        view = new galangdana();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object s = ae.getSource();
        if(s.equals(view.getGalang())){
            new ControllerListkampanye();
            view.setVisible(false);
        }else if(s.equals(view.getBtnkembali())){
            new ControllerHome();
            view.setVisible(false);
        }
}
}
