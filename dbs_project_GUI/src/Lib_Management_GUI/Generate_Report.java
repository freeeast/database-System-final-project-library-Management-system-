package Lib_Management_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Generate_Report {

    public static boolean S_Or_R = Log_In.S_Or_R;
    JFrame Generate_Report =new JFrame(" Generate_Report");
    JPanel Generate_Report_Panel = new JPanel();
    JLabel Readers_SSN = new JLabel("Readers_SSN:");
    JLabel Books_ISBN = new JLabel("Books_ISBN");
    JTextField Readers_SSN_Text = new JTextField();
    JTextField Books_ISBN_Text = new JTextField();
    Button Search = new Button("Search");

    JLabel Book_Area = new JLabel("**** Book_Area ****");
    String[] Book_Inf_Type = {"Name","Call_Number","Available","Due_Time","#B_Reserve"};
    JLabel[] Book_Inf = new JLabel[5];
    JLabel Reader_Area = new JLabel("**** Reader_Area ****");
    String[] Reader_Inf_Type = {"SSN","Name","E-Mail","Phone_Number","#R_Reserve"};
    JLabel[] Reader_Inf = new JLabel[5];
    Button Close = new Button("Close");

    JLabel[] Book_Results = new JLabel[5];
    JLabel[] Reader_Results = new JLabel[5];

    public static void main(String[] args){
        new Generate_Report();
    }

    Generate_Report(){
        this.Generate_Report.setBounds(0,0,800,500);
        this.Generate_Report.setLocationRelativeTo(null);
        this.Generate_Report.setVisible(false);
        this.Generate_Report.setResizable(true);


        this.Generate_Report.add(this.Generate_Report_Panel);
        this.Generate_Report_Panel.setVisible(false);
        this.Generate_Report_Panel.setLayout(null);

        this.Books_ISBN.setBounds(30,20,100,20);
        this.Books_ISBN_Text.setBounds(120,20,200,20);
        this.Readers_SSN.setBounds(350,20,100,20);
        this.Readers_SSN_Text.setBounds(460,20,200,20);
        this.Search.setBounds(680,20,40,20);

        this.Book_Area.setBounds(330,80,200,20);
        this.Generate_Report_Panel.add(Book_Area);
        int x = 50;
        int y = 120;
        for(int i = 0; i < Book_Inf.length;i++){
            if(x > 800){
                y = y + 30;
                x = 50;
            }
            Book_Inf[i] = new JLabel(Book_Inf_Type[i]);
            Book_Inf[i].setBounds(x,y,150,20);

            Book_Results[i] = new JLabel();

            Book_Results[i].setBounds(x+150,y,150,20);
            x= x + 400;
            this.Generate_Report_Panel.add(Book_Inf[i]);
            this.Generate_Report_Panel.add(Book_Results[i]);

        }

        this.Reader_Area.setBounds(330,y+50,200,20);
        this.Generate_Report_Panel.add(Reader_Area);

        int x1 = 50;
        int y1 = y+80;
        for(int j = 0;j<Reader_Inf.length;j++){
            if(x1 > 800){
                y1 = y1 + 30;
                x1 = 50;
            }
            Reader_Inf[j] = new JLabel(Reader_Inf_Type[j]);
            Reader_Inf[j].setBounds(x1,y1,150,20);

            Reader_Results[j] = new JLabel();

            Reader_Results[j].setBounds(x1+150,y1,150,20);
            x1= x1 + 400;
            this.Generate_Report_Panel.add(Reader_Inf[j]);
            this.Generate_Report_Panel.add(Reader_Results[j]);
        }

        this.Close.setBounds(330,400,100,20);
        this.Generate_Report_Panel.add(Close);




        this.Generate_Report_Panel.add(this.Books_ISBN);
        this.Generate_Report_Panel.add(this.Books_ISBN_Text);
        this.Generate_Report_Panel.add(this.Readers_SSN);
        this.Generate_Report_Panel.add(this.Readers_SSN_Text);
        this.Generate_Report_Panel.add(this.Search);

        this.Generate_Report.setVisible(true);
        this.Generate_Report_Panel.setVisible(true);

        Close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Generate_Report.dispose();
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
