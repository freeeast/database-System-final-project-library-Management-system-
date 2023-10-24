package Lib_Management_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Account_Management_S {
    boolean S_Or_R = Log_In.S_Or_R;
    JFrame Account_Management_Screen = new JFrame("AccountManagement");
    JPanel Account_Management_Panel = new JPanel();

    JLabel Password = new JLabel("Change Password");
    JTextField Password_text = new JTextField();
    JLabel Email = new JLabel("Change E-mail");
    JTextField Email_text = new JTextField();

    JLabel Phone_Number = new JLabel("Change Phone Number");
    JTextField Phone_Number_text = new JTextField();

    JLabel Area = new JLabel("Change Area");
    JTextField Area_text = new JTextField();

    Button Define = new Button("Define");
    Button Close = new Button("Close");

    String password;
    String email;
    String phone_num;
    String area;

    public static void main(String[] args){
        new Account_Management_S();
    }

    Account_Management_S(){
        this.Account_Management_Screen.setBounds(0,0,800,500);
        this.Account_Management_Screen.setLocationRelativeTo(null);
        this.Account_Management_Screen.setVisible(false);
        this.Account_Management_Screen.setResizable(true);


        this.Account_Management_Screen.add(this.Account_Management_Panel);
        this.Account_Management_Panel.setVisible(false);
        this.Account_Management_Panel.setLayout(null);

        this.Password.setBounds(250,50,150,20);
        this.Password_text.setBounds(380,50,200,20);

        this.Email.setBounds(250,150,150,20);
        this.Email_text.setBounds(380,150,200,20);

        this.Phone_Number.setBounds(250,250,150,20);
        this.Phone_Number_text.setBounds(380,250,200,20);

        this.Area.setBounds(250,250,150,20);
        this.Area_text.setBounds(380,250,200,20);

        this.Define.setBounds(220,320,100,20);
        this.Close.setBounds(450,320,100,20);

        Account_Management_Panel.add(this.Password);
        Account_Management_Panel.add(this.Password_text);
        Account_Management_Panel.add(this.Email);
        Account_Management_Panel.add(this.Email_text);
        if(S_Or_R){
            Account_Management_Panel.add(this.Phone_Number);
            Account_Management_Panel.add(this.Phone_Number_text);
        }

        else if(!S_Or_R){
            Account_Management_Panel.add(this.Area);
            Account_Management_Panel.add(this.Area_text);
        }




        Account_Management_Panel.add(this.Define);
        Account_Management_Panel.add(this.Close);
        Account_Management_Screen.add(Account_Management_Panel);

        this.Account_Management_Screen.setVisible(true);
        this.Account_Management_Panel.setVisible(true);


        Define.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                password = Password_text.getText();
                email = Email_text.getText();
                phone_num = Phone_Number_text.getText();
                area = Area_text.getText();
                System.out.println(password + email+ phone_num + area);

            }
        });
        Close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(S_Or_R);
                Account_Management_Screen.dispose();
                if(S_Or_R){
                    new Main_Screen1();
                }
                else{
                    new Main_Screen();
                }
            }
        });





    }
}
