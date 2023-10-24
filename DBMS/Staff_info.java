package DBMS;
import java.io.*;
import java.sql.*;
import oracle.jdbc.driver.*;
import oracle.sql.*;
import java.util.Scanner;

public static class Staff_info 
{

    String password;
    String email;
    String area;

    public static void Selection(String pwd)
    {
        System.out.println("Please select a operation：");
        System.out.println("(If you want to get your information, please input 1；\r" + 
        "If you want to change your password, please input 2;\r" + 
        "If you want to change your email, please input 3.)");
        //通过数字选择的方法最后会替换成GUI
        Scanner scan_operation = new Scanner(System.in);
        int operation =scan_operation.nextint();
        switch (operation)
        {
            case 1:
            {
                Get_info(pwd);
            }
            case 2:
            {
                Change_password(pwd);
            }
            case 3:
            {
                Change_email(pwd);
            }
        }
    }

    static void Get_info(String pwd, OracleConnection con)
    {
        String sql_staff_info=("SELECT * FROM STAFF WHERE STAFF_ID=?");
        PreparedStatement ps_staff_info=con.prepareStatement(sql_staff_info);
        ResultSet rs_staff_info=ps_staff_info.executeQuery();
        System.out.println(rs_staff_info.getString("NAME"));
        System.out.println(rs_staff_info.getString("EMAIL"));
        System.out.println(rs_staff_info.getString("AREA"));
    }

    static void Change_password(String pwd, OracleConnection con)
    {
            System.out.println("Please enter your new password: ");
            Scanner scan_pwd = new Scanner(System.in);
            String newpwd = scan_pwd.nextLine();
            System.out.println("Please enter your new password again: ");
            Scanner scan_pwd_again = new Scanner(System.in);
            String newpwd_again = scan_pwd_again.nextLine();
            if (newpwd == newpwd_again) 
            {
                String sql_pwd = ("UPDATE ACCOUNT SET PASSWARD=? WHERE LOGIN_ID=?");
                PreparedStatement ps4 = conn.prepareStatement(sql_pwd);
                ps4.setString(1, newpwd);
                ps4.setString(2, pwd);
                ps4.executeUpdate();
                System.out.println("Change successfully!");
            }
            else
            {
                System.out.println("new password not match try again");
            }

        }

    static void Change_email(String pwd, OracleConnection con)
    {
        System.out.println("Please enter your new email: ");
        Scanner scan_email = new Scanner(System.in);
        String new_email = scan_email.nextLine();
        String sql_email = ("UPDATE STAFF SET EMAIL=? WHERE STAFF_ID=?");
        PreparedStatement ps_email = con.prepareStatement(sql_email);
        ps_email.setString(1, new_email);
        ps_email.setString(2, pwd);
        ps_email.executeUpdate();
        System.out.println("Change successfully!");
    }

    static void Change_area(String pwd, OracleConnection con)
    {
        System.out.println("Please enter your new area: ");
        Scanner scan_area = new Scanner(System.in);
        String new_email = scan_area.nextLine();
        String sql_area = ("UPDATE STAFF SET AREA=? WHERE STAFF_ID=?");
        PreparedStatement ps_area = con.prepareStatement(sql_area);
        ps_email.setString(1, new_area);
        ps_email.setString(2, pwd);
        ps_email.executeUpdate();
        System.out.println("Change successfully!");
    }

}
