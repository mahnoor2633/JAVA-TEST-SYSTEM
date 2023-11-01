/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.course;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author marsh
 */
public class AttemptQuiz extends JFrame{
    
  //  staArrayList<String> sslist = new ArrayList<String>();
     ArrayList<String> qlist = new ArrayList<String>();
    ArrayList<String> mlist = new ArrayList<String>();
    
    //ArrayList<String> alist = new ArrayList<String>();
    
    public void AttemptQuiz() throws FileNotFoundException
    {
        JFrame FRM = new JFrame();
        
            FRM.setSize(1000,800);
    
            JPanel PNL = new JPanel();
        
            PNL.setBorder (new EmptyBorder (50,50,50,50));
        
            FRM.add(PNL);
        
            //CreateQuiz CQ = new CreateQuiz();
            
            int Fields = CreateQuiz.NumberOfFields;
            
            System.out.println(Fields);
    
            PNL.setLayout(new GridLayout(Fields+1, 3,10,20));
            //PNL.setLayout(null);
        
            File studAnswers = new File("C:\\Project\\studAnswers.txt");
        
            try(PrintWriter sapw = new PrintWriter(studAnswers))
            {
                    
                System.out.println("File refreshed!");
                    
            }
            catch(FileNotFoundException f)
            {    
                f.printStackTrace();
            }
            
            /*Scanner sq = new Scanner(new File("C:\\Project\\Questions.txt"));
            //ArrayList<String> qlist = new ArrayList<String>();
            while (sq.hasNextLine())
            {
            qlist.add(sq.nextLine());
            }
            sq.close();*/
            
         //   System.out.println(qlist);
            
         Scanner sm = new Scanner(new File("C:\\Project\\Marks.txt"));
         //ArrayList<String> mlist = new ArrayList<String>();
         while (sm.hasNextLine())
         {
         mlist.add(sm.nextLine());
         }
         sm.close();
         
         // System.out.println(mlist);
            
         /*Scanner sa = new Scanner(new File("C:\\Project\\Answers.txt"));
         //ArrayList<String> alist = new ArrayList<String>();
         while (sa.hasNextLine())
         {
         alist.add(sa.nextLine());
         }
         sa.close();
         
         // System.out.println(alist);*/
         
        Scanner sq = new Scanner(new File("C:\\Project\\Questions.txt"));
        ArrayList<String> qlist = new ArrayList<String>();
        while (sq.hasNextLine())
        {
            qlist.add(sq.nextLine());
        }
        sq.close();
            
        System.out.println(qlist);
            
            
            //ADDING TEXTFIELDS FOR STUDENT TO ANSWERS QUESTIONS
            for(int x = 0; x < Fields; x++)
            {
                JLabel QLabel = new JLabel();
                
                QLabel.setText(qlist.get(x));
                
                //QLabel.setBounds(250,200*x,250,45);
                
                PNL.add(QLabel);
                
                JTextField ans_Field = new JTextField();
                
                //ans_Field.setBounds(550,200*x,250,45);
            
                ans_Field.addActionListener((ActionEvent a) -> 
                {
                    try 
                    {
                        FileWriter sawriter = new FileWriter(studAnswers, true);
                            
                        sawriter.write(ans_Field.getText() + "\n");
                            
                        sawriter.close();
                    }
                    catch (IOException et) 
                    {
                        et.printStackTrace();
                    }
                            
                    ans_Field.transferFocus();
                
                });
                
                
            
                PNL.add(ans_Field);
                
                JLabel MLabel = new JLabel();
                
                //MLabel.setBounds(850,200*x,250,45);
                
                MLabel.setText(mlist.get(x));
                
                PNL.add(MLabel);
            }
            
            /*Scanner ss = new Scanner(new File("C:\\Project\\studAnswers.txt"));
            //ArrayList<String> sslist = new ArrayList<String>();
            while (ss.hasNextLine())
            {
            sslist.add(ss.nextLine());
            }
            ss.close();*/
            
           // System.out.println(sslist);
           
            JButton jBtn = new JButton("ENTER");
            
            jBtn.setBounds(500,800,150,45);
            
            jBtn.addActionListener((ActionEvent j) -> 
            {
            
            try {
                Marks m = new Marks();
                
                m.Marks();
                
                /*String count = null;
                
                int[] wrong = null;
                
                for(int x = 0 ; x<Fields; x++)
                {
                
                if(alist.get(x).equals(sslist.get(x)))
                {
                count += mlist.get(x);
                }
                else
                {
                wrong[x] = x;
                }
                
                }
                
                String sum = null;
                
                for(int i = 0; i < mlist.size(); i++)
                {
                sum += mlist.get(i);
                }
                
                System.out.println("wrong:"+wrong);
                System.out.println("correct:"+count);
                System.out.println("total"+sum);*/
            } catch (FileNotFoundException ex) {
                Logger.getLogger(AttemptQuiz.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            });
            
            PNL.add(jBtn);
           
           
            
        FRM.setVisible(true);
        
    }
  
}
