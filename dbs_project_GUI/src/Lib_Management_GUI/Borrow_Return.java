package Lib_Management_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Borrow_Return {

    public static boolean S_Or_R = Log_In.S_Or_R;
    JFrame Borrow_Return =new JFrame("Borrowing Management");
    JPanel Borrow_Return_Panel = new JPanel();
    JLabel Readers_SSN = new JLabel("Readers_SSN:");
    JLabel CALL_NUMBER = new JLabel("CALL_NUMBER");

    JLabel Book_Inf = new JLabel("Book Information");
    JLabel Name = new JLabel("Name");
    JLabel CATEGORY = new JLabel("CATEGORY");
    JLabel Author = new JLabel("Author");
    JLabel PUBLISHER_NAME = new JLabel("PUBLISHER_NAME");

    JLabel Name_content = new JLabel();
    JLabel CATEGORY_content = new JLabel();
    JLabel Author_content = new JLabel();
    JLabel PUBLISHER_NAME_content = new JLabel();

    JTextField Readers_SSN_Text = new JTextField();
    JTextField Books_ISBN_Text = new JTextField();
    Button Search = new Button("Search");
    Button Borrow = new Button("Borrow");
    Button Return = new Button("Return");
    Button Close = new Button("Close");

    String call_number;
    String reader_ssn;
    String name;
    String author;
    String category;
    String publisher_name;

    public static void main(String[] args){
        new Borrow_Return();
    }

    Borrow_Return(){

        this.Borrow_Return.setBounds(0,0,800,500);
        this.Borrow_Return.setLocationRelativeTo(null);
        this.Borrow_Return.setVisible(true);
        this.Borrow_Return.setResizable(true);


        this.Borrow_Return.add(this.Borrow_Return_Panel);
        this.Borrow_Return_Panel.setVisible(false);
        this.Borrow_Return_Panel.setVisible(true);
        this.Borrow_Return_Panel.setLayout(null);

        this.CALL_NUMBER.setBounds(30,20,100,20);
        this.Books_ISBN_Text.setBounds(140,20,200,20);
        this.Readers_SSN.setBounds(350,20,100,20);
        this.Readers_SSN_Text.setBounds(460,20,200,20);
        this.Search.setBounds(680,20,40,20);

        this.Book_Inf.setBounds(340,80,100,20);

        this.Name.setBounds(30,150,100,20);
        this.Author.setBounds(400,150,100,20);
        this.CATEGORY.setBounds(30,200,100,20);
        this.PUBLISHER_NAME.setBounds(400,200,150,20);


        this.Name_content.setBounds(150,150,200,20);
        this.Author_content.setBounds(550,150,200,20);
        this.CATEGORY_content.setBounds(150,200,200,20);
        this.PUBLISHER_NAME_content.setBounds(550,200,200,20);

        this.Borrow.setBounds(150,420,100,20);
        this.Return.setBounds(350,420,100,20);
        this.Close.setBounds(500,420,100,20);


        this.Borrow_Return_Panel.add(this.CALL_NUMBER);
        this.Borrow_Return_Panel.add(this.Books_ISBN_Text);
        this.Borrow_Return_Panel.add(this.Readers_SSN);
        this.Borrow_Return_Panel.add(this.Readers_SSN_Text);
        this.Borrow_Return_Panel.add(this.Search);

        this.Borrow_Return_Panel.add(this.Book_Inf);

        this.Borrow_Return_Panel.add(this.Name);
        this.Borrow_Return_Panel.add(this.Author);
        this.Borrow_Return_Panel.add(this.CATEGORY);
        this.Borrow_Return_Panel.add(this.PUBLISHER_NAME);
        this.Borrow_Return_Panel.add(this.Name_content);
        this.Borrow_Return_Panel.add(this.Author_content);
        this.Borrow_Return_Panel.add(this.CATEGORY_content);
        this.Borrow_Return_Panel.add(this.PUBLISHER_NAME_content);

        this.Borrow_Return_Panel.add(this.Borrow);
        this.Borrow_Return_Panel.add(this.Return);
        this.Borrow_Return_Panel.add(this.Close);


        Search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                call_number = CATEGORY_content.getText();
                reader_ssn = Readers_SSN_Text.getText();
                /*从数据库中找出
                name =;
                author = ;
                category =;
                publisher_name = ;

                 */

                Name_content.setText(name);
                Author_content.setText(author);
                CATEGORY_content.setText(category);
                PUBLISHER_NAME_content.setText(publisher_name);

            }
        });
        Borrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                call_number = CATEGORY_content.getText();
                reader_ssn = Readers_SSN_Text.getText();
                System.out.println(call_number);
                System.out.println(reader_ssn);
            }
        });

        Return.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                call_number = CATEGORY_content.getText();
                reader_ssn = Readers_SSN_Text.getText();
                System.out.println(call_number);
                System.out.println(reader_ssn);
            }
        });



        Close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Borrow_Return.dispose();
                if(S_Or_R){
                    new Main_Screen1();
                    System.out.println(S_Or_R);

                }
                else{
                    new Main_Screen();

                }
            }
        });


    }


}
