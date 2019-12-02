/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import View.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Angga
 */
public class ControllerLogin implements ActionListener {
    private Login view;
    private Database db;

    public ControllerLogin(){
        view = new Login();
        view.addActionListener(this);
        view.setVisible(true);
        db = new Database();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
            Object s = ae.getSource();
        if(s.equals(view.getBtnbacklogin())){
            new ControllerStart();
            view.setVisible(false);
        }else if(s.equals(view.getBtmasuk())){
            if(view.getLoginmail().equals("admin@mail.com") && view.getLoginpass().equals("12345")){
                new ControllerAdminenv();
            }
               
                    
                    String mail = view.getLoginmail();
            String pass =  view.getLoginpass();
            db.loginuser(mail, pass);
            new ControllerHome();
            view.setVisible(false);
        }  
    }
}
