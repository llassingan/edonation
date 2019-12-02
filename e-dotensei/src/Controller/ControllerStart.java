/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.StartScreen;
import Splash.splashscreen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angga
 */
public class ControllerStart implements ActionListener {
    private StartScreen view;
    
    public ControllerStart(){
        view = new StartScreen();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object s = ae.getSource();
        if(s.equals(view.getBtnBtnstartlogin())){
            new ControllerLogin();
            view.setVisible(false);
        }else if(s.equals(view.getBtnBtnstartdaftar())){
            new ControllerDaftar();
            view.setVisible(false);
        }else if(s.equals(view.getBtnfaq())){
            new Controllerfaq();
            view.setVisible(false);
        }else if(s.equals(view.getBtntentang())){
            new ControllerTentang();
            view.setVisible(false);
        }
    }
}
