package Lib_Management_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Readers_Inf {
    JFrame AddReaderInf = new JFrame("Add new Readers");
    JPanel Reader_INf_Panel = new JPanel();
    String[] Type = {"SSN","NAME", "MAIL","PHONE_Number","#R_RESERVE"};
    Label[] Reader_Label = new Label[5];
    TextField[] Reader_Text = new TextField[5];

    Button Add= new Button("Add");
    Button Close = new Button("Close");

    public static void main(String[] args){
        new Readers_Inf();
    }

    public Readers_Inf(){
        this.AddReaderInf.setBounds(0,0,800,500);
        this.AddReaderInf.setLocationRelativeTo(null);
        this.AddReaderInf.setVisible(true);
        this.AddReaderInf.setResizable(false);


        this.AddReaderInf.add(this.Reader_INf_Panel);
        this.Reader_INf_Panel.setVisible(true);
        this.Reader_INf_Panel.setLayout(null);


        Reader_Label[0] = new Label(Type[0]);
        Reader_Label[1] = new Label(Type[1]);
        Reader_Label[2] = new Label(Type[2]);
        Reader_Label[3] = new Label(Type[3]);
        Reader_Label[4] = new Label(Type[4]);

        Reader_Label[0].setBounds(50,50,150,20);
        Reader_Label[1].setBounds(450,50,150,20);
        Reader_Label[2].setBounds(50,150,150,20);
        Reader_Label[3].setBounds(450,150,150,20);
        Reader_Label[4].setBounds(50,250,150,20);

        Reader_Text[0] = new TextField(20);
        Reader_Text[1] = new TextField(20);
        Reader_Text[2] = new TextField(20);
        Reader_Text[3] = new TextField(20);
        Reader_Text[4] = new TextField(20);

        Reader_Text[0].setBounds(200,50,150,20);
        Reader_Text[1].setBounds(600,50,150,20);
        Reader_Text[2].setBounds(200,150,150,20);
        Reader_Text[3].setBounds(600,150,150,20);
        Reader_Text[4].setBounds(200,250,150,20);

        this.Reader_INf_Panel.add(Reader_Label[0]);
        this.Reader_INf_Panel.add(Reader_Label[1]);
        this.Reader_INf_Panel.add(Reader_Label[2]);
        this.Reader_INf_Panel.add(Reader_Label[3]);
        this.Reader_INf_Panel.add(Reader_Label[4]);

        this.Reader_INf_Panel.add(Reader_Text[0]);
        this.Reader_INf_Panel.add(Reader_Text[1]);
        this.Reader_INf_Panel.add(Reader_Text[2]);
        this.Reader_INf_Panel.add(Reader_Text[3]);
        this.Reader_INf_Panel.add(Reader_Text[4]);

        Add.setBounds(200,400,80,25);
        Close.setBounds(450,400,80,25);

        this.Reader_INf_Panel.add(Add);
        this.Reader_INf_Panel.add(Close);

        this.Reader_INf_Panel.setVisible(true);

        //add function

        Close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddReaderInf.dispose();
                new Main_Screen();
            }
        });


    }



}
