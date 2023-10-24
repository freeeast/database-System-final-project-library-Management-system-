package Lib_Management_GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddBooks {

    boolean S_Or_R = Log_In.S_Or_R;
    JFrame AddBooks_Screen = new JFrame("Book Management");
    JPanel AddBooks_Panel =new JPanel();
    String[] Bookname =  {"ISBN","AUTHOR","NAME"," PUBLISHER_ID","CALL_NUMBER","CATEGORY","PUBLISHER_ID","PUBLICATION_YEAR","PUBLISHER_NAME","AVALIABLE"};
    Label[] Books_Lable =new Label[10];
    TextField[] Books_Field = new TextField[10];
    Button Save = new Button("Save");
    Button Close = new Button("Close");

    String[] temp_INf = new String[10];


    public static void main(String[] args){
        new AddBooks();
    }


    public AddBooks(){
        this.AddBooks_Screen.setBounds(0,0,800,500);
        this.AddBooks_Screen.setLocationRelativeTo(null);
        this.AddBooks_Screen.setVisible(false);
        this.AddBooks_Screen.setResizable(false);


        this.AddBooks_Screen.add(this.AddBooks_Panel);
        this.AddBooks_Panel.setVisible(false);
        this.AddBooks_Panel.setLayout(null);

        int Label_X =50,Label_Y = 50;

        for(int i = 0;i<Bookname.length;i++){
            if(Label_X>800){
                Label_X =50;
                Label_Y = Label_Y + 50;
            }
            Books_Lable[i] = new Label(Bookname[i]);
            Books_Lable[i].setBounds(Label_X,Label_Y,150,20);
            Books_Field[i] = new TextField();
            Books_Field[i].setBounds(Label_X+150,Label_Y,150,20);
            Label_X =Label_X + 400;
            this.AddBooks_Panel.add(Books_Lable[i]);
            this.AddBooks_Panel.add(Books_Field[i]);





        }

        Save.setBounds(200,400,80,25);
        Close.setBounds(450,400,80,25);

        this.AddBooks_Panel.add(Save);
        this.AddBooks_Panel.add(Close);

        this.AddBooks_Panel.setVisible(true);

        this.AddBooks_Screen.setVisible(true);



//add function

        Close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(S_Or_R);
                AddBooks_Screen.dispose();
                if(S_Or_R){
                    new Main_Screen1();


                }
                else{
                    new Main_Screen();

                }

            }
        });

        Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0;i<Books_Field.length;i++){
                    temp_INf[i] = Books_Field[i].getText();
                    System.out.println(temp_INf[i]);
                }
                //将储存书的中间数组加入到数据库中


            }
        });





    }


}
