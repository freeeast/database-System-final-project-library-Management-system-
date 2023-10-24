package Lib_Management_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Screen {
    JFrame Main_Screen_ =new JFrame("Library Management System");
    JPanel Main_Panel = new JPanel();
    Button Books_Management = new Button("Books Management");
    Button Account_Management_S = new Button("Account_Management");
    Button Books_Searching = new Button("Books Searching");

    Button Borrow_Return_System = new Button("Borrow_Return_System");
    Button Generate_Report = new Button("Generate_Report");
    Button Exit = new Button("Exit");

    public static void main(String[] args){
        new Main_Screen();
    }

    Main_Screen(){
        this.Main_Screen_.setBounds(0,0,800,500);
        this.Main_Screen_.setLocationRelativeTo(null);
        this.Main_Screen_.setVisible(true);
        this.Main_Screen_.setResizable(true);


        this.Main_Screen_.add(this.Main_Panel);
        this.Main_Panel.setVisible(false);
        this.Main_Panel.setVisible(true);
        this.Main_Panel.setLayout(null);

        this.Books_Management.setBounds(300,30,200,40);
        this.Account_Management_S.setBounds(300,110,200,40);
        this.Books_Searching.setBounds(300,190,200,40);
        this.Generate_Report.setBounds(300,270,200,40);
        this.Borrow_Return_System.setBounds(300,360,200,40);

        this.Exit.setBounds(650,400,80,20);

        Main_Panel.add(Books_Management);
        Main_Panel.add(Account_Management_S);
        Main_Panel.add(Books_Searching);
        Main_Panel.add(Generate_Report);
        Main_Panel.add(Borrow_Return_System);
        Main_Panel.add(Exit);


        Books_Management.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_Screen_.dispose();
                new AddBooks();
            }
        });

        Account_Management_S.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_Screen_.dispose();
                new Account_Management_S();

            }
        });

        Books_Searching.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_Screen_.dispose();
                new Search_Books();
            }
        });

        Generate_Report.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_Screen_.dispose();
                new Generate_Report();
            }
        });

        Borrow_Return_System.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_Screen_.dispose();
                new Borrow_Return();
            }
        });

        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_Screen_.dispose();
                new Log_In();
            }
        });
    }


}
