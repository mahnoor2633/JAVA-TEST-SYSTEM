/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.course;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author marsh
 */
public class Marks {
    
    public void Marks() throws FileNotFoundException{
        
        JFrame f = new JFrame();
        
        JPanel p = new JPanel();
        
        p.setLayout(null);
        
        f.setSize(500,100);
        
        f.add(p);
        
        
        
        Scanner sm = new Scanner(new File("C:\\Project\\Marks.txt"));
        ArrayList<Integer> mlist = new ArrayList<>();
        while (sm.hasNextInt())
        {
            mlist.add(sm.nextInt());
        }
        sm.close();
            
        System.out.println(mlist);
        
        Scanner sa = new Scanner(new File("C:\\Project\\Answers.txt"));
        ArrayList<String> alist = new ArrayList<String>();
        while (sa.hasNextLine())
        {
            alist.add(sa.nextLine());
        }
        sa.close();
            
        System.out.println(alist);
        
        Scanner sA = new Scanner(new File("C:\\Project\\studAnswers.txt"));
        ArrayList<String> sAlist = new ArrayList<String>();
        while (sA.hasNextLine())
        {
            sAlist.add(sA.nextLine());
        }
        sA.close();
        
        System.out.println(sAlist);
        
        //int num = CreateQuiz.NumberOfFields;
        
        JLabel tf = new JLabel();
        
        tf.setBounds(250,50,350,45);
        
        //p.add(tf);
    
        int correct = 0;
            
        int wrong = 0;
        
        if (alist.size() != sAlist.size())
        {
            System.out.println("Lists are not equal in size.");
        } 
        else 
        {
            
            for (int i = 0; i < alist.size(); i++)
            {
                if (alist.get(i).equals(sAlist.get(i))) 
                {
                    correct += mlist.get(i);
                    break;
                }
            }
        }    
        /*if(alist.equals(sAlist))
        {
        
        JOptionPane.showConfirmDialog(tf, "Congratulations Full Marks");
        
        }
        else
        {
        
        
        
        }*/
        
        //System.out.println(CollectionUtils.isEqualCollection(alist, sAlist)); 
            
        int sum = 0;
            
        for(int i = 0; i < mlist.size(); i++)
        {
            sum += mlist.get(i);
        }
        
        wrong = sum - correct;
            
        System.out.println("wrong:"+wrong);
        System.out.println("correct:"+correct);
        System.out.println("total"+sum);
        
        tf.setText("Your Total is Correct: " + correct + " Wrong: " + wrong + " out of total: " + sum);
        
        p.add(tf);
        
        f.setVisible(true);
    
}
}
