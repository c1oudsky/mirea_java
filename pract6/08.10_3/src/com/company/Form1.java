package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 extends JFrame {
    private double output=0;
    private JPanel panel1;
    private JTextField inputfield, outputfield;
    private JButton plusBt, minusBt, divBt, multBt, percentBt, equalBt;
    private int prevOp=0, currOp=0;
    int dots;
    private boolean inputright(){
        dots=0;
        boolean a = true;

        if (inputfield.getText().isEmpty()) a=false;

        for(int i=0; i < inputfield.getText().length(); i++) {
            if
            (!
                    (
                            (inputfield.getText().charAt(i)>47 && inputfield.getText().charAt(i)<58)
                            ||
                            (i==0 && inputfield.getText().charAt(i)==45)
                            ||
                            (inputfield.getText().charAt(i)==46 && dotcounter())
                    )
            )
            {
                a=false;
            }
        }
        return a;
    }
    private boolean dotcounter() {
        dots+=1;
        if (dots<2) return true; else return false;
    }
    private double PrevOp() {
        if (prevOp==0) return Double.parseDouble(inputfield.getText());
        else if (prevOp==1) return output+Double.parseDouble(inputfield.getText());
        else if (prevOp==2) return output-Double.parseDouble(inputfield.getText());
        else if (prevOp==3) return output*Double.parseDouble(inputfield.getText());
        else return output/Double.parseDouble(inputfield.getText());
    }
    Form1() {
        setVisible(true);
        setSize(600,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(panel1);
        outputfield.setText(Double.toString(output));
        System.out.println("это был '"+inputfield.getText()+"'");
        plusBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputright()) {
                    output = PrevOp();
                    outputfield.setText( Double.toString(output) );
                    prevOp=1;
                    inputfield.setText("");
                } else outputfield.setText("Ошибка ввода");
            }
        });
        minusBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputright()) {
                    output = PrevOp();
                    outputfield.setText( Double.toString(output) );
                    prevOp=2;
                    inputfield.setText("");
                } else outputfield.setText("Ошибка ввода");
            }
        });
        multBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputright()) {
                    output = PrevOp();
                    outputfield.setText( Double.toString(output) );
                    prevOp=3;
                    inputfield.setText("");
                } else outputfield.setText("Ошибка ввода");
            }
        });
        divBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputright()) {
                    output = PrevOp();
                    outputfield.setText( Double.toString(output) );
                    prevOp=4;
                    inputfield.setText("");
                } else outputfield.setText("Ошибка ввода");
            }
        });
        percentBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputright()) {
                    inputfield.setText( Double.toString( (Double.parseDouble(inputfield.getText()) / output)*100 ) );
                } else outputfield.setText("Ошибка ввода");
            }
        });
        equalBt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (inputright()) {
                    output = PrevOp();
                    outputfield.setText( Double.toString(output) );
                    prevOp=0;
                    inputfield.setText("");
                } else outputfield.setText("Ошибка ввода");
            }
        });
    }
}
