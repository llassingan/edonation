/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Home;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angga
 */
public class ControllerHome implements ActionListener {
    private Home view;
    
    public ControllerHome(){
        view = new Home();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object s = ae.getSource();
        if(s.equals(view.getBtnprofil())){
            new ControllerUserenv();
            view.setVisible(false);
        }else if(s.equals(view.getBtnkeluar())){
            new ControllerLogin();
            view.setVisible(false);
        }else if(s.equals(view.getLihat()) || s.equals(view.getLihat1()) || s.equals(view.getLihat2()) ||s.equals(view.getLihatsemua())){
            new ControllerListkampanye();
            view.setVisible(false);
        }else if(s.equals(view.getBtngalang())){
            new ControllerGalangdana();
            view.setVisible(false);
        }
    
}
}
