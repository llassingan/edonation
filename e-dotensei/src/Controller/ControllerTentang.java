/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.tentang;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angga
 */
public class ControllerTentang implements ActionListener {
    private tentang view;

    public ControllerTentang(){
        view = new tentang();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
            Object s = ae.getSource();
        if(s.equals(view.getBakc())){
            new ControllerStart();
            view.setVisible(false);
        }
    }
}
