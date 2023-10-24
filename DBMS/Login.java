package DBMS;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
import java.sql.*;
import oracle.jdbc.driver.*;
import oracle.sql.*;
import Book;
import Record;
import Report;
import Staff_info;

public class Login 
{
    public static void Reader_Login()
    {
        Connection con_reader;
        String url_reader = "xxx";

        Scanner scan_username = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        String username = scan_username.nextLine();
        Scanner scan_pwd = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        String pwd = scan_pwd.nextLine();
        scan_username.close();
        scan_pwd.close();
        try
        {
            Class.forName(JDBCDriver);
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            con_reader = DriverManager.getConnection(url_reader, username, pwd);
            System.out.println("Login successfully!");
         //此处启动reader的各个功能
        }
        catch(Exception e)
        {
            System.out.print("Your username or password is wrong, please try again.");
            con_reader = null;
            e.printStackTrace();
        }
    }

    public static void Staff_Login()
    {
        Connection con_staff;
        String url_staff = "yyy";

        Scanner scan_username = new Scanner(System.in);
        System.out.print("Please enter your username: ");
        String username = scan_username.nextLine();
        Scanner scan_pwd = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        String pwd = scan_pwd.nextLine();
        scan_username.close();
        scan_pwd.close();
        try
        {
            Class.forName(JDBCDriver);
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            con_staff = DriverManager.getConnection(url_staff, username, pwd);
            System.out.println("Login successfully!");
            System.out.println("Please select a function：");
            System.out.println("(If you want to complete the lending record，please input 1；\r" +
            "If you want to generate reports,please input 2;\r" +
            "if you want to add new books into library, please input 3;\r" +
            "If you want to check or change your information, please input 4.)");
            //通过数字选择的方法最后会替换成GUI
            Scanner scan_function = new Scanner(System.in);
            int function =scan_function.nextint();
            if (function == 1)
            {
                Record(con_staff);   
            }
            if (function == 2)
            {
                Report.Selection(pwd);
            }
            if (function == 3)
            {
                Book(con_staff);
            }
            if (function == 4)
            {
                Staff_info.Selection();
            }
            else
            {
                System.out.print("Please input a valid number.");
            }
        }
        catch(Exception e)
        {
            System.out.print("Your username or password is wrong, please try again.");
            con_staff = null;
            e.printStackTrace();
        }
    }
}