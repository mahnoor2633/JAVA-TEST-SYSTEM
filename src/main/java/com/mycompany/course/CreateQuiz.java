/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.course;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
public class CreateQuiz {

    static int NumberOfFields;
    
    
    
    public void CreateQuiz(){
                
        int count;
    
        
        JPanel panel = new JPanel();
    
        JFrame frame = new JFrame();
    
        frame.add(panel);
    
        frame.setSize(1000,500);
                
        panel.setBorder (new EmptyBorder (50,50,50,50));
        
        NumberOfFields = Integer.parseInt(JOptionPane.showInputDialog("ENTER NUMBER OF QUESTIONS:"));
    
        panel.setLayout(new GridLayout(NumberOfFields, 6,10,20));
                
        File Questions = new File("C:\\Project\\Questions.txt");
                
        try(PrintWriter qpw = new PrintWriter(Questions))
        {
             System.out.println("teacher question File refreshed!");
        }
         catch(FileNotFoundException e)
         {
            e.printStackTrace();
        }
                
        File Answers = new File("C:\\Project\\Answers.txt");
                
        try(PrintWriter apw = new PrintWriter(Answers))
        {
            System.out.println("File refreshed!");
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
                
        File Marks = new File("C:\\Project\\Marks.txt");
                
        try(PrintWriter mpw = new PrintWriter(Marks))
        {
            System.out.println("File refreshed!");
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
                
        for (int i = 0; i < NumberOfFields; i++)
        {
           // count++;
            
            JLabel qlabel = new JLabel("QUESTIONS:");
                        
            panel.add(qlabel);
                        
            JTextField qtextField = new JTextField();
                        
            qtextField.addActionListener((ActionEvent e)->
            {
                                 
                try
                {
                    FileWriter qwriter = new FileWriter(Questions, true);
                                        
                    qwriter.write(qtextField.getText() + "\n");
                                        
                    qwriter.close();                       
                }
                catch (IOException et)
                {
                    et.printStackTrace();
                }
                                
                qtextField.transferFocus();
                            
            });
                        
            panel.add(qtextField);
                        
            JLabel alabel = new JLabel("ANSWER:");
                        
            panel.add(alabel);
                        
            JTextField atextfield = new JTextField();
                        
            atextfield.addActionListener((ActionEvent e) -> 
            {
                try 
                {
                    FileWriter awriter = new FileWriter(Answers, true);
                            
                    awriter.write(atextfield.getText() + "\n");
                            
                    awriter.close();
                }
                catch (IOException et) 
                {
                    et.printStackTrace();
                }
                            
                atextfield.transferFocus();
                        
            });
                        
            panel.add(atextfield);
                        
            JLabel mlabel = new JLabel("MARKS:");
                        
            panel.add(mlabel);
                        
            JTextField mtextfield = new JTextField();
                        
            mtextfield.addActionListener((ActionEvent e) -> 
            {
                try 
                {
                    FileWriter mwriter = new FileWriter("C:\\Project\\Marks.txt", true);
                            
                    mwriter.write(mtextfield.getText() + "\n");
                            
                    mwriter.close();
                }
                catch (IOException et) 
                {
                    et.printStackTrace();
                }
                            
                mtextfield.transferFocus();
            });
            
            panel.add(mtextfield);
                        
        }
                
   /* if(count==NumberOfFields)
    {
        panel.setLayout(null);
        
        frame.setSize(500,500);
        
        JButton jBtn = new JButton("SAVE QUIZ");
        
        frame.setSize(500,500);
        
        jBtn.setBounds(250,250,200,45);
        
        panel.add(jBtn);
        
        JFrame frame1 = Courses.crsFrm;
                    
        jBtn.addActionListener((ActionEvent e) -> 
        {
            frame.setVisible(false);
            
            frame1.setVisible(false);
        });
    }  */ 
    frame.setVisible(true);
        
    }
}
