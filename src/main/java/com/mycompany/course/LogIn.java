/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.course;


//We use the 'SWING' method to make a GUI as it is basic

import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author marsh
 */


public class LogIn extends JFrame implements ActionListener
{
    
    //Setting a user label
    private static JLabel userLabel = new JLabel("User Name:");

    //Creating textfield for user to enter their username
    private static JTextField userTxtFld = new JTextField(10);
    
    //Setting a password Label
    private static JLabel pswrdLabel = new JLabel("Password: ");
   
    //Creating textfield for password
    private static JPasswordField pswrdTxtFld = new JPasswordField(6);

    //Adding a password show/hide button
    private static JButton pswrdBtn = new JButton("Show");
    
    //Adding a login button
    private static JButton btn = new JButton("LogIn");
    
    private static String user;
        
    private static String password;
    
    //<-----VARIABLE FOR SECOND FRAMEWORK---->
    
    //Variable to store the JFrame variable 'frm1' for second gui
    private static JFrame Frame1;
    
    //Variable to store the JPanel variable 'pnl1' for second gui
    private static JPanel Panel1;
    
    //Variable for teacher button
    private static JButton tBtn;
    
    //Variable for 'OR' text
    private static JLabel lTxt;
    
    //Variable for student button
    private static JButton sBtn;
    
    static int student;
    
    //<----VARIABLE FOR COURSE SELECTION FRAMEWORK---->
    
    //Variable to store the JFrame variable 'crsFrm' for third gui
    private static JFrame Frame2;
    
    //Variable to store the JPanel 'crsPnl' for third gui
    private static JPanel Panel2;
    
    //Variable to store the label 'seLbl' 
    private static JLabel lbl;
    
    //Variables for course buttons
    private static JButton dmst;
    
    private static JButton dmsl;
    
    private static JButton oopt;
    
    private static JButton oopl;
    
    private static JButton osl;
    
    private static JButton ost;
    
    private static JButton sda;
    
    //<-----VARIABLE FOR MAKE QUIZ FRAMEWORK----->
    
    static JButton Btn3;
    
    private static JButton Btn4;
    
    static int dataManagementTheory_t;
    
    static int dataManagementLab_t;
    
    static int objectOrientedTheory_t;
    
    static int objectOrientedLab_t;
    
    static int operatingSystemLab_t;
    
    static int operatingSystemTheory_t;
    
    static int systemDevelopment_t;
    
    static int dataManagementTheory_s;
    
    static int dataManagementLab_s;
    
    static int objectOrientedTheory_s;
    
    static int objectOrientedLab_s;
    
    static int operatingSystemLab_s;
    
    static int operatingSystemTheory_s;
    
    static int systemDevelopment_s;
    
    
    
    //<-----------VARIABLES FOR FILING------------->
    static int numberOfTextFields;
    
    //String[] qLines = new String[numberOfTextFields];
    
    //String[] aLines = new String[numberOfTextFields];
    
    //String[] mLines = new String[numberOfTextFields];
   
    
   
    public static void main(String[] args) throws FileNotFoundException
    {
    
        //Making a frame
        JFrame frm = new JFrame();
        
        //Making a panel layout
        JPanel pnl = new JPanel();
        
        //Configuring the frame window
        
        //Setting the length and width of the frame
        frm.setSize(360, 360);
        
        //To make it close properly
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Adding the panel to the frame
        frm.add(pnl);
        
        //Configuring the panel
        pnl.setLayout(null);
                
        //Setting dimensions of the placement of the label on the layout
        userLabel.setBounds(30, 25, 100, 25);
        
        //Adding font on label
        //userLabel.setFont(new Font("Helvetica", Font.PLAIN, 24));
        
        //Adding user label to panel    
        pnl.add(userLabel);
        
        //Configuring the text field
        userTxtFld.setBounds(150,29 , 150, 20);
        
        //Adding this text field to the panel
        pnl.add(userTxtFld);
                
        //Setting dimensions of the password label
        pswrdLabel.setBounds(30, 55, 100, 25);
        
        //Adding password label to the panel
        pnl.add(pswrdLabel);
        
        //Configuring the text field
        pswrdTxtFld.setBounds(150,60,150,20);
        
        //Making password dots to hashes '#'
        pswrdTxtFld.setEchoChar('#');
        
        //Adding this text field to the panel
        pnl.add(pswrdTxtFld);
        
        //Configuring dimensions of the show/hide button
        pswrdBtn.setBounds(200,100,100,25);
        
        pnl.add(pswrdBtn);
        
        //Adding actionlistener function in lambda form for each button to show or hide the password 
        pswrdBtn.addActionListener((ActionEvent evnt) -> { 
            
                if ( pswrdTxtFld.getEchoChar() != '\u0000' )
                {
                
                    pswrdTxtFld.setEchoChar('\u0000');
                
                    pswrdBtn.setText("Hide");
                
                }
            
                else
                {
                
                    pswrdTxtFld.setEchoChar((Character) UIManager.get("PasswordField.echoChar"));
                
                    pswrdBtn.setText("Show");
                
                    pswrdTxtFld.setEchoChar('#');
                
                }
            }
        
        );
        
        //Configuring dimensions of button
        btn.setBounds(30,100,80,50);
        
        //Adding button to the panel
        pnl.add(btn); 
        
        //Adding Action listner for showing success message on button clicking
        btn.addActionListener(new LogIn());
        
        //Allowing the elements in the frame to be visible       
        frm.setVisible(true);
 
        //<--------STARTING SECOND FRAMEWORK-------->
        
        //Instantiating the second framework class
        Question que = new Question();
        
        //Assigning the second framework
        Frame1 = que.frm1;
        
        //Configuring the size of the second frame work
        Frame1.setSize(360,360);
        
        //Assigning the second panel
        Panel1 = que.pnl1;
        
        //Configuring the second panel
        Panel1.setLayout(null);
        
        //Adding panel to the framework
        Frame1.add(Panel1);
        
        //Assigning the teacher Button
        tBtn = Question.teachBtn;
        
        //Configuring the bounds of this button on the panel
        tBtn.setBounds(50,120,100,25);
        
        tBtn.addActionListener((ActionEvent evt) ->     //-----------|
        {
            
            student = 0;
            
            Panel2.remove(Btn3);
            
            Panel2.remove(Btn4);
            
            Frame2.setVisible(true);
            
        }
        );
        
        //Adding button to the panel                                 |
        Panel1.add(tBtn);
        
        //Assigning the 'OR' text                                    |
        lTxt = Question.txt;
        
        //Configuring the text                                       |
        lTxt.setBounds(160,110,70,50);
        
        //Adding text to the panel                                   |
        Panel1.add(lTxt);
        
        // Assigning the student Button              ---SECOND GUI---|
        sBtn = Question.studBtn;
        
        //Configuring the student button             ----------------|
        sBtn.setBounds(200,120,100,25);
        
        //Adding Action Listener to the button       ----------------|
        sBtn.addActionListener((ActionEvent et) ->
        {
            
            student++;
            
            Panel2.remove(Btn3);
            
            Panel2.remove(Btn4);
            
            Frame2.setVisible(true);
                
        }
        );
        
        //Adding this button to the panel
        Panel1.add(sBtn);
        
        //|----------------------END OF FRAMEWORK 2----------------|
        
        //<------------------STARTING THIRD FRAMEWORK--------------|
        
        
        //Assigning the third framework                                                
        Frame2 = Courses.crsFrm;
        
        //Configuring the frame size                                                   
        Frame2.setSize(1000,500);
        
        //Assigning the third Panel                                                    
        Panel2 = Courses.crsPnl;
        
        //Configuring the third panel                                                  
        Panel2.setLayout(null);
        
        //Adding the third panel to the third panel                                    
        Frame2.add(Panel2);
        
        //Assigning the label                                                          
        lbl = Courses.selLbl;
        
        //Configuring the text                                                         
        lbl.setBounds(50,50,150,25);
        
        //Adding the text to the panel                                                 
        Panel2.add(lbl);
        
        //Assigning the course buttons to select                                       
        dmst = Courses.dataManagementTheory;
        
        dmsl = Courses.dataManagementLab;                                            
        
        oopt = Courses.objOrntProgTheory;                                   
        
        oopl = Courses.objOrntProgLab;                                           
        
        osl = Courses.opSysLab;                                             
                
        ost = Courses.opSysTheory;                                       
        
        sda = Courses.softDesArch;                                     
        
        //Configuring buttons                                                          
        
        dmst.setBounds(70,100,300,45);                       
        
        dmsl.setBounds(70,150,300,45);                          
        
        oopt.setBounds(70,200,300,45);                          
        
        oopl.setBounds(70,250,300,45);                         
        
        osl.setBounds(70,300,300,45);                              
        
        ost.setBounds(70,350,300,45);                       
        
        sda.setBounds(70,400,300,45);                         
        
        //Adding action listener to all course buttons to display the framework 3                               |
        
        dmst.addActionListener((ActionEvent edt) ->                       
        { 
            
            if(student == 0){
                
                Btn3.setBounds(380,100,200,45);
            
                Panel2.remove(Btn4);
            
                Panel2.add(Btn3);
            
                dataManagementTheory_s++;
                
            }
            else{
                
                Btn4.setBounds(380,100,200,45);
                
                Panel2.remove(Btn3);
            
                Panel2.add(Btn4);    
            
                dataManagementTheory_t++;
                
            }
            
        }
        );                                                                 
        
        dmsl.addActionListener((ActionEvent edl) ->                            
        {   
            
            if(student == 0){
                
                Btn3.setBounds(380,150,200,45);
            
                Panel2.remove(Btn4);
            
                Panel2.add(Btn3);     
            
                dataManagementLab_t++;
            
            }
            else{
            
                Btn4.setBounds(380,150,200,45);
            
                Panel2.remove(Btn3);
            
                Panel2.add(Btn4);      
            
                dataManagementLab_s++;
                
            }
            
        }
        );                                                                      
        
        oopt.addActionListener((ActionEvent eot) ->                         
        {   
            
            if(student == 0){
                
                Btn3.setBounds(380,200,200,45);
            
                Panel2.remove(Btn4);
            
                Panel2.add(Btn3);   
            
                objectOrientedTheory_t++;
            
            }
            else{
            
                Btn4.setBounds(380,200,200,45);
            
                Panel2.remove(Btn3);
            
                Panel2.add(Btn4);    
            
                objectOrientedTheory_s++; 
                
            }
            
        }
        );                                                                 
        
        oopl.addActionListener((ActionEvent eol) ->                              
        {   
            
            if(student == 0){
                
                Btn3.setBounds(380,250,200,45);
            
                Panel2.remove(Btn4);
            
                Panel2.add(Btn3);   
            
                objectOrientedLab_t++;
            
            }
            else
            {
                
                Btn4.setBounds(380,250,200,45);
            
                Panel2.remove(Btn3);
            
                Panel2.add(Btn4);    
            
                objectOrientedLab_s++;
                
            }
            
        }
        );                                                                        
        
        osl.addActionListener((ActionEvent esl) ->                              
        {   
            if(student == 0){
                
                Btn3.setBounds(380,300,200,45);
           
                Panel2.remove(Btn4);
            
                Panel2.add(Btn3);   
            
                operatingSystemLab_t++;
                
            }
            else{
                
                Btn4.setBounds(380,300,200,45);
           
                Panel2.remove(Btn3);
            
                Panel2.add(Btn4);   
            
                operatingSystemLab_s++;
                
            }
        }
        );                                                                     
        
        ost.addActionListener((ActionEvent est) ->                          
        {  
            if(student == 0){
                
                Btn3.setBounds(380,350,200,45);
            
                Panel2.remove(Btn4);
            
                Panel2.add(Btn3);
            
                operatingSystemTheory_t++;
            
            }
            else{
                
                Btn4.setBounds(380,350,200,45);
                
                Panel2.remove(Btn3);
            
                Panel2.add(Btn4); 
                
                operatingSystemTheory_s++;
                
            }
            
        }
        );                                                                  
        
        sda.addActionListener((ActionEvent ed) ->                           
        {    
            
            if(student == 0){
                
                Btn3.setBounds(380,400,200,45);
                
                Panel2.remove(Btn4);
            
                Panel2.add(Btn3);  
            
                systemDevelopment_t++;
            
            }
            else
            {
                
                Btn4.setBounds(380,400,200,45);
            
                Panel2.remove(Btn3);
            
                Panel2.add(Btn4);  
            
                systemDevelopment_s++;
                
            }
            
        }
        );                                                                    
        
        //Adding buttons to the panel                                                
        //Panel2.add(dmst);                                               
        
        Panel2.add(dmsl);                                                  
        
        Panel2.add(oopt);                                            
        
        Panel2.add(oopl);                                        
        
        Panel2.add(osl);                                             
        
        Panel2.add(ost);                                            
        
        Panel2.add(sda);
        
        Panel2.add(dmst); 
        
        //--------------------------END OF FRAMEWORK 3----------------------|
        
        //--------------------Starting 'MakeQuiz' Framework-----------------|         |
        
        //Instantiating this framework                        
        MakeQuiz mk = new MakeQuiz();      
        
      //  int NumberOfFields = Integer.parseInt(JOptionPane.showInputDialog("ENTER NUMBER OF QUESTIONS:"));
        
        //numberOfTextFields = CreateQuiz.NumberOfFields;
        
        Btn3 = mk.quizBtn;     
        
        Btn4 = mk.attemptBtn;
        
        //Adding action listener to button 3 to display the number of textfields for storing their answers and questions dynamically       
        
        Btn3.addActionListener((ActionEvent c) ->                      
        {
            CreateQuiz cq = new CreateQuiz();    
             
            cq.CreateQuiz();
        });
        
        //storing value from file into an arraylist
        
        
        Btn4.addActionListener((ActionEvent v) -> 
        {
            
            try {
                AttemptQuiz aq = new AttemptQuiz();
                
                aq.AttemptQuiz();
            } 
            catch (FileNotFoundException ex) 
            {
                Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } ); 
        
        //---------------------------END OF FRAMEWORK 4---------------------|

 
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
      
        user = userTxtFld.getText();
        
        //password = pswrdTxtFld.getText();//
        
        if(user.length() < 6)
        {
        
            JOptionPane.showMessageDialog(pswrdTxtFld, "Incorrect LogIn. Try Again. Username must be atleast 06 characters", "INCORRECT", JOptionPane.ERROR_MESSAGE);
        
        }
        
        else
        {
        
            Frame1.setVisible(true);
            
        }
        
       pswrdTxtFld.setText("");
        
       userTxtFld.setText("");
        
    }

} 