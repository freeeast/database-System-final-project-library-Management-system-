package DBMS;
import java.io.*;
import java.io.Console;
import java.sql.*;
import oracle.jdbc.driver.*;
import oracle.sql.*;
import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
import java.util.Date;
import Book;
import Staff_info;

public class Record {

    String Borrower_id; //username or SSN
    String Book_id; //ISBN
    String Staff_id; 
    Date Lend_time;

    Record(){}
    
    Record(OracleConnection con)
    {
        Date lend_time = new Date();
        java.sql.Date lend_time_sql = new java.sql.Date(lend_time.getTime());
        Scanner scan_borrower = new Scanner(System.in);
        System.out.print("Please enter the id of the borrower: ");
        Borrower_id = scan_borrower.nextLine();
        Scanner scan_book = new Scanner(System.in);
        System.out.println("Please enter the ISBN of the book to be lent: ");
        Book_id = scan_book.nextLine();
        Scanner scan_staff = new Scanner(System.in);
        System.out.print("Please enter the id of the staff performing this procedure: ");
        Staff_id = scan_staff.nextLine();

        try{
            String check_borrower=("SELECT DISTINCT SSN FROM READER WHERE SSN=?");
            String check_book=("SELECT DISTINCT ISBN FROM BOOK WHERE ISBN=?");
            String check_staff=("SELECT DISTINCT STAFF_ID FROM STAFF WHERE STAFF_ID=?");

            String sql_record=("INSERT INTO BORROW VALUES (?,?,?,?)");
            PreparedStatement ps_record=con.prepareStatement(sql_record);
            ps_record.setDate(1, lend_time_sql);
            ps_record.setString(2, Borrower_id);
            ps_record.setString(3, Book_id);
            ps_record.setString(4, Staff_id);
            ps_record.executeUpdate();
            
            String sql_bookcopy1=("SELECT * FROM BOOKCOPY WHERE ISBN=?");
            PreparedStatement ps_bookcopy1=con.prepareStatement(sql_bookcopy1);
            ResultSet rs_bookcopy1=ps_bookcopy1.executeQuery();
            int available_num =rs_bookcopy1.getInt("AVAILABLE");
            if(available_num <= 0)
            {
                available_num = 0;
            }

            String sql_bookcopy2 = ("UPDATE BOOKCOPY SET AVAILABLE=? WHERE ISBN=?");
            PreparedStatement ps_bookcopy2 = con.prepareStatement(sql_bookcopy2);
            ps_bookcopy2.setString(1, available_num - 1); 
            ps_bookcopy2.setString(2, Book_id);
            ps_bookcopy2.executeUpdate();
        }
        catch(Exception e)
        {
            System.out.print("The data you entered is incorrect, please try again.");
            e.printStackTrace();
        }

        scan_borrower.close();
        scan_book.close();
        scan_staff.close();
    }
    
}
