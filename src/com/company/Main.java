package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Стоимость чая");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,200);
        frame.setLocation(300, 300);
        frame.setVisible(true);

        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        final JTextArea text = new JTextArea("Чашек чая: ", 0, 0);
        text.setFocusable(true);
        final JComboBox<String> amount = new JComboBox<String>(new String[] {"0","1","2","3"} );
        final JTextArea Tea = new JTextArea("Чай: ", 0, 0);
        final JComboBox<String> type = new JComboBox<String>(new String[] {"Молочный Улун","Черный","Зеленый"} );
        final JTextArea milk = new JTextArea("Добавить молоко?", 0, 0);
        final JCheckBox yeah = new JCheckBox("Да");
        final JButton btn = new JButton("Итоговая сумма");
        final JTextArea sum = new JTextArea("    ", 0, 0);


        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int res = 0;
                int am=0;
                if (amount.getSelectedItem().equals("0")) {
                    am = 0;
                } else
                if (amount.getSelectedItem().equals("1")) {
                    am =1;
                }
                else
                {
                    if(amount.getSelectedItem().equals("2")) {
                        am=2;
                    }
                    else {
                        if(amount.getSelectedItem().equals("3"))
                        {
                            am=3;
                        }
                    }
                }
                if (type.getSelectedItem().equals("Молочный Улун")) {
                    res = 50;
                }
                else
                if (type.getSelectedItem().equals("Черный")) {
                    res = 40;
                }
                else
                if (type.getSelectedItem().equals("Зеленый")) {
                    res = 55;
                }
                if (yeah.isSelected())
                {
                    res=res+10;
                }
                sum.setText(String.valueOf(res*am));
            }


        });


        frame.add(text);
        frame.add(amount);
        frame.add(Tea);
        frame.add(type);
        frame.add(milk);
        frame.add(yeah);
        frame.add(btn);
        frame.add(sum);
    }
}