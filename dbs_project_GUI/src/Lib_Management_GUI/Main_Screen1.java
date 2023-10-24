package Lib_Management_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_Screen1 {
    JFrame Main_Screen1 =new JFrame("Library Management System");
    JPanel Main_Panel1 = new JPanel();
    //Button Books_Management = new Button("Books Management");
    //Button Readers_Management = new Button("Readers Management");
    JLabel Help =new JLabel("Help: If you have any question,please connect @Group 6");
    Button Books_Searching = new Button("Books Searching");
    Button Account_Management = new Button("Account_Management");

    //Button Borrow_Return_System = new Button("Borrow_Return_System");
    //Button Generate_Report = new Button("Generate_Report");
    Button Exit = new Button("Exit");

    public static void main(String[] args){
        new Main_Screen();
    }

    Main_Screen1(){
        this.Main_Screen1.setBounds(0,0,800,500);
        this.Main_Screen1.setLocationRelativeTo(null);
        this.Main_Screen1.setVisible(true);
        this.Main_Screen1.setResizable(true);


        this.Main_Screen1.add(this.Main_Panel1);
        this.Main_Panel1.setVisible(false);
        this.Main_Panel1.setVisible(true);
        this.Main_Panel1.setLayout(null);

        //this.Books_Management.setBounds(300,100,200,40);
        this.Help.setBounds(250,100,400,40);
        //this.Readers_Management.setBounds(300,110,200,40);
        this.Books_Searching.setBounds(300,200,200,40);
        //this.Generate_Report.setBounds(300,270,200,40);
        //this.Borrow_Return_System.setBounds(300,360,200,40);
        this.Account_Management.setBounds(300,300,200,40);

        this.Exit.setBounds(650,400,80,20);

        Main_Panel1.add(Help);
        //Main_Panel.add(Readers_Management);
        Main_Panel1.add(Books_Searching);
        //Main_Panel.add(Generate_Report);
        //Main_Panel.add(Borrow_Return_System);
        Main_Panel1.add(Account_Management);
        Main_Panel1.add(Exit);

        /*
        Books_Management.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_Screen1.dispose();
                new AddBooks();
            }
        });

         */

        /*

        Readers_Management.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_Screen_.dispose();
                new Readers_Inf();

            }
        });

         */

        Books_Searching.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_Screen1.dispose();
                new Search_Books();
            }
        });
        Account_Management.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_Screen1.dispose();
                new Account_Management_S();
            }
        });

        /*

        Generate_Report.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_Screen_.dispose();
                new Generate_Report();
            }
        });

         */

        /*

        Borrow_Return_System.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_Screen_.dispose();
                new Borrow_Return();
            }
        });

         */

        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_Screen1.dispose();
                new Log_In();
            }
        });
    }


}
