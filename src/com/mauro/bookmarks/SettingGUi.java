package com.mauro.bookmarks;

import javax.swing.*;
import javax.swing.plaf.basic.DefaultMenuLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class SettingGUi extends JFrame {

    JLabel title = new JLabel("Insert your Window User");
    JTextField userField = new JTextField("20",10);
    JButton startBtn = new JButton("Search");

    public SettingGUi(){}

    public void setUp(){

        setSize(640,300);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //setup basic
        setLayout(new FlowLayout());

        //setup components
        add(title);

        add(userField);
        add(startBtn);

        setVisible(true);
        startBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(getValue(userField));
            }
        });
    }

    public String getValue(JTextField userName){
        return userName.getText();

    }

}
