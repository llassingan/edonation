/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Bayar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angga
 */
public class ControllerBayar implements ActionListener {
    private Bayar view;

    public ControllerBayar(){
        view = new Bayar();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
            Object s = ae.getSource();
        if(s.equals(view.getBayar())){
            new ControllerListkampanye1();
            view.setVisible(false);
        }
    }
}
