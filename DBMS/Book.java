package DBMS;
import java.io.*;
import java.sql.*;
import oracle.jdbc.driver.*;
import oracle.sql.*;
import java.util.Scanner;

public class Book {
    

    String ISBN;
    String Book_name;
    String Category;
    String Publisher;
    Boolean Available;
    String Author;

    Book(){}

    Book(OracleConnection con){
        Scanner scan_ISBN = new Scanner(System.in);
        System.out.print("Please enter the id of the book: ");
        ISBN = scan_ISBN.nextLine();
        Scanner scan_book = new Scanner(System.in);
        System.out.println("Please enter the name of the book: ");
        Book_name = scan_book.nextLine();
        Scanner scan_category = new Scanner(System.in);
        System.out.print("Please enter the category of the book: ");
        Category = scan_category.nextLine();
        Scanner scan_pubilisher = new Scanner(System.in);
        System.out.print("Please enter the pubulisher of the book: ");
        Publisher = scan_publisher.nextLine();

        String sql_book=("INSERT INTO BOOK VALUES (?,?,?,?)");
        PreparedStatement ps_book=con.prepareStatement(sql_book);
        ps_book.setString(1, ISBN);
        ps_book.setString(2, CATEGORY);
        ps_book.setString(3, AUTHOR);
        ps_book.setString(4, NAME);
        ps_book.executeUpdate();
    }

}
