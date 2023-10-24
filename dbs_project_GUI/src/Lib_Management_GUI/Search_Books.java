package Lib_Management_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Search_Books {

    boolean S_Or_R = Log_In.S_Or_R;
    JFrame Search_Books_Screen = new JFrame("Search Books");
    JPanel Search_Books_Panel = new JPanel();

    //Add another search inf is ok
    JLabel Name = new JLabel("Name");
    JTextField Name_Text= new JTextField();
    JLabel Author = new JLabel("Author");
    JTextField Author_Text = new JTextField();

    String name,author;




    String[] ColumnNames = {"ISBN","AUTHOR","NAME"," PUBLISHER_ID","CALL_NUMBER","CATEGORY","PUBLISHER_ID","PUBLICATION_YEAR","PUBLISHER_NAME","AVALIABLE"};

    //import the SQL Code
    Object[][] RowData= {
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1},
    };
    JTable table =
            new JTable(RowData,ColumnNames);
    Button Close = new Button("Close");
    Button Search = new Button("Search");

    public static void main(String[] args){
        new Search_Books();
    }

    Search_Books(){
        this.Search_Books_Screen.setBounds(0,0,800,500);
        this.Search_Books_Screen.setLocationRelativeTo(null);
        this.Search_Books_Screen.setVisible(false);
        this.Search_Books_Screen.setResizable(true);


        this.Search_Books_Screen.add(this.Search_Books_Panel);
        this.Search_Books_Panel.setVisible(false);
        this.Search_Books_Panel.setLayout(null);

        this.Name.setBounds(30,20,100,20);
        this.Name_Text.setBounds(120,20,200,20);
        this.Author.setBounds(350,20,100,20);
        this.Author_Text.setBounds(460,20,200,20);
        this.Search.setBounds(300,50,40,20);
        this.Close.setBounds(400,50,40,20);



        table.setBounds(10,80,750,400);
        table.setRowHeight(30);
        table.getColumnModel().getColumn(0).setPreferredWidth(80);
        table.setPreferredScrollableViewportSize(new Dimension(800,450));

        JScrollPane scrollpane = new JScrollPane(table);

        Search_Books_Panel.add(this.Name);
        Search_Books_Panel.add(this.Name_Text);
        Search_Books_Panel.add(this.Author);
        Search_Books_Panel.add(this.Author_Text);
        Search_Books_Panel.add(this.Search);
        Search_Books_Panel.add(this.Close);
        Search_Books_Panel.add(scrollpane);

        Search_Books_Screen.setContentPane(Search_Books_Panel);



        this.Search_Books_Screen.setVisible(true);
        this.Search_Books_Panel.setVisible(true);

        Search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = Name_Text.getText();
                author = Author_Text.getText();
                if(name == author){



                }
            }
        });

        Close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Search_Books_Screen.dispose();
                System.out.println(S_Or_R);
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
