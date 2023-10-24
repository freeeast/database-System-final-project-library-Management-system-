package DBMS;
import java.io.*;
import java.sql.*;
import oracle.jdbc.driver.*;
import oracle.sql.*;
import java.util.Scanner;
import Login;


public class main 
{
    public static void main(String[] args)
    { 
        Scanner scan_type = new Scanner(System.in);
        System.out.println("Please select your account type: ");
        System.out.println("(If you are a reader, please input 1;\r" +
        "If you are a staff, please input 2)");
        //通过数字选择的方法最后会替换成GUI
        int type =scan_type.nextint();
        if (type == 1)
        {
            Login.Reader_Login();     
        }
        if (type == 2)
        {
            Login.Staff_Login();
        }
        else
        {
            System.out.print("Please input a valid number.");
        }
    }
}
