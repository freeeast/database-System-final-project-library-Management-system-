
package Lib_Management_GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Scanner;
import javax.swing.*;


public class Log_In
{
/*
    public class BackgroundPanel extends JPanel {
        private Image image = null;
        private static final long serialVersionUID = -6352788025440244338L;
        public BackgroundPanel(Image image) {
            this.image = image;
        }

        protected void paintComponent(Graphics g) {
            g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
        }

    }
    Image image=new ImageIcon("images/bg.gif").getImage();
    JPanel panel = new BackgroundPanel(image);

 */


    public static boolean S_Or_R;
    Frame log_in = new JFrame("log_in Screen");

    JPanel main1 = new JPanel();

    //init all the elements in this screen
    JLabel Welcome_Label = new JLabel("Library Management System");

    JLabel Log_in_ID_Label = new JLabel("User:");
    JLabel Borrowed_ID_Label = new JLabel("Borrowed_ID:");
    JLabel Credit_Label = new JLabel("Credit:");
    JLabel Password_Label = new JLabel("Password:");


    JButton loginButton = new JButton("login");

    JTextField Log_in_ID_Text = new JTextField(20);
    JTextField Borrowed_ID_Text = new JTextField(20);
    JTextField Credit_Text = new JTextField(20);

    JRadioButton reader = new JRadioButton("Reader");
    JRadioButton staff = new JRadioButton("Staff");

    ButtonGroup Function =  new ButtonGroup();

    JPasswordField Password_Text = new JPasswordField(20);

    boolean sign1 =false;
    boolean sign2 = false;



    String password;
    String Log_in_ID;
    public static void main(String[] args){

        new Log_In();
    }

    public static String to_String(char[] input){
        String result = "";
        for(int i =0;i<input.length;i++){
            result = result+input[i];
        }
        return result;
    }

    Log_In(){

        log_in.setBounds(0,0,800,500);
        log_in.setVisible(true);
        log_in.setLocationRelativeTo(null);
        log_in.setResizable(false);

        log_in.add(main1);
        main1.setVisible(false);
        main1.setLayout(null);


        //set all the elements' location


        Welcome_Label.setBounds(200,10,400,100);

        Log_in_ID_Label.setBounds(200,100,100,20);
        Borrowed_ID_Label.setBounds(200,140,100,20);
        Credit_Label.setBounds(200,180,100,20);
        Password_Label.setBounds(200,220,100,20);

        Log_in_ID_Text.setBounds(320,100,300,20);
        Borrowed_ID_Text.setBounds(320,140,300,20);
        Credit_Text.setBounds(320,180,300,20);

        Password_Text.setBounds(320,220,300,20);

        loginButton.setBounds(200,300,80,20);

        staff.setBounds(400,300,100,25);
        reader.setBounds(520,300,100,25);

        Function.add(staff);
        Function.add(reader);


        //add all the elements to the main panel
        main1.add(Welcome_Label);

        main1.add(Log_in_ID_Label);
        //main1.add(Borrowed_ID_Label);
        //main1.add(Credit_Label);

        //main1.add(Borrowed_ID_Text);
        main1.add(Log_in_ID_Text);
        //main1.add(Credit_Text);
        main1.add(Password_Label);

        main1.add(Password_Text);

        main1.add(loginButton);

        main1.add(staff);
        main1.add(reader);

        main1.setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                S_Or_R = reader.isSelected();
                password = to_String(Password_Text.getPassword());
                Log_in_ID = Log_in_ID_Text.getText();

                if(password.equals("111") ){
                    sign1 =true;

                }
                if(Log_in_ID.equals("111")){
                    sign2 = true;
                }

                if(sign1 && sign2){
                    log_in.dispose();
                    if(S_Or_R){
                        new Main_Screen1();
                        System.out.println(S_Or_R);
                    }
                    else{
                        new Main_Screen();
                    }

                    /*
                }else {
                    loginButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            JOptionPane.showMessageDialog(
                                    log_in,"Error Password or ID !",
                                    "Please Try Again",JOptionPane.INFORMATION_MESSAGE

                            );
                        }
                    });

                     */
                }

            }
        });

    }
}
