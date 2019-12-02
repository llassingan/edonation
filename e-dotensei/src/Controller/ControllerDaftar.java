/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Register;
import Model.Database;
import Model.User;
import Model.Account;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Angga
 */
public class ControllerDaftar implements ActionListener {
    private Register view;
    private Database db;
    public ControllerDaftar(){
        view = new Register();
        view.addActionListener(this);
        view.setVisible(true);
        db = new Database();
    }
  
    @Override
    public void actionPerformed(ActionEvent ae) {
            Object s = ae.getSource();
        if(s.equals(view.getBtback())){
            new ControllerStart();
            view.setVisible(false);
        }else if(s.equals(view.getBtdaftar())){
            String nama = view.getDaftarnama();
            String mail = view.getDaftarmail();
            String hp = view.getNohp();
            String pass = view.getDaftarpass();
            User b = new User(nama,hp,mail,pass);
            db.addUser(b);
            //JOptionPane.showMessageDialog(null, "Login Sukses", "InfoBox: " + "Berhasil", JOptionPane.INFORMATION_MESSAGE);
            new ControllerLogin();
            view.setVisible(false);
        }  
    }
}
