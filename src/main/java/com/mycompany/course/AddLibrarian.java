/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.course;

import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author marsh
 */
public class AddLibrarian extends JFrame{
    
    public void AddLibrarian(){
    
    JFrame frame_e = new JFrame();
    
    frame_e.setSize(800,800);
    
    JPanel panel_e = new JPanel();
    
    panel_e.setLayout(null);
    
    frame_e.add(panel_e);
    
    JLabel label_e = new JLabel("Add Librarian");
    
    label_e.setBounds(300,100,350,100);
    
    panel_e.add(label_e);
    
    JLabel name_Label_e = new JLabel("Name:");
    
    name_Label_e.setBounds(100,250,200,45);
    
    panel_e.add(name_Label_e);
    
    JTextField name_txtFld_e = new JTextField();
    
    name_txtFld_e.setBounds(350,250,200,45);
    
    panel_e.add(name_txtFld_e);
    
    JLabel password_label_e = new JLabel("Password:");
    
    password_label_e.setBounds(100,360,200,45);
    
    panel_e.add(password_label_e);
    
    JTextField password_txtFld_e = new JTextField();
    
    password_txtFld_e.setBounds(350,455,200,45);
    
    panel_e.add(password_txtFld_e);
    
    JLabel email_label_e = new JLabel("Email:");
    
    email_label_e.setBounds(100,550,200,45);
    
    panel_e.add(email_label_e);
    
    JTextField email_txtFld_e = new JTextField();
    
    email_txtFld_e.setBounds(350,550,200,45);
    
    panel_e.add(email_txtFld_e);
    
    JLabel add_label_e = new JLabel("Address:");
    
    add_label_e.setBounds(100,645,200,45);
    
    panel_e.add(add_label_e);
    
    JTextField add_txtFld_e = new JTextField();
    
    add_txtFld_e.setBounds(350,645,200,45);
    
    panel_e.add(add_txtFld_e);
    
    JLabel city_label_e = new JLabel("City:");
    
    city_label_e.setBounds(100,695,200,45);
    
    panel_e.add(city_label_e);
    
    JTextField city_txtFld_e = new JTextField();
    
    city_txtFld_e.setBounds(350,695,200,45);
    
    panel_e.add(city_txtFld_e);
    
    JLabel cont_label_e = new JLabel("Contact No.:");
    
    cont_label_e.setBounds(100,750,200,45);
    
    panel_e.add(cont_label_e);
    
    JTextField cont_txtFld_e = new JTextField();
    
    cont_label_e.setBounds(350,750,200,45);
    
    panel_e.add(cont_label_e);
    
    JButton addLib_Btn_e = new JButton("Add Librarian");
    
    addLib_Btn_e.setBounds(100,800,200,45);
    
    addLib_Btn_e.addActionListener((ActionEvent ab) -> 
    {
    
        JOptionPane.showConfirmDialog(addLib_Btn_e, "Librarian added successfully");
        
    });
    
    panel_e.add(addLib_Btn_e);
    
    JButton backBtn_e = new JButton("Back");
    
    backBtn_e.setBounds(350,800,200,45);
    
    backBtn_e.addActionListener((ActionEvent b) -> 
    {
    
        frame_e.setVisible(false);
        
    });
    
    panel_e.add(backBtn_e);
    
    }  
    
}
