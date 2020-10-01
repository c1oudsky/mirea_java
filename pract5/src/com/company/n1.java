package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class n1 {
    JFrame jframe = new JFrame();
    private int count1=0;
    private int count2=0;
    private JPanel panel1;
    private JButton leftBt;
    private JButton rightBt;
    private JButton centreBt;
    private JLabel leftLb;
    private JLabel rightLb;
    private JLabel centreLb;
    private JLabel mainLb;

    n1() {
        jframe.setVisible(true);
        jframe.setSize(600,450);
        jframe.setResizable(false);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.add(panel1);
        leftLb.setText(Integer.toString(count1));
        rightLb.setText(Integer.toString(count2));
        centreBt.setEnabled(false);
        leftBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count1++;
                leftLb.setText(Integer.toString(count1));
                if (count1 != count2) centreBt.setEnabled(true); else centreBt.setEnabled(false);
            }
        });
        rightBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count2++;
                rightLb.setText(Integer.toString(count2));
                if (count1 != count2) centreBt.setEnabled(true); else centreBt.setEnabled(false);
            }
        });
        centreBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rightLb.setText("");
                centreLb.setText("");
                leftLb.setText("");
                if (count1>count2) { mainLb.setText("вы выиграле"); } else { mainLb.setText("вы пабедили"); }
                rightBt.setVisible(false);
                leftBt.setVisible(false);
                centreBt.setText("ура");
                //centreBt.setEnabled(false);
            }
        });
    }



}
