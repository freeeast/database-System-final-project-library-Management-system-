package DBMS;
import java.io.*;
import java.io.Console;
import java.sql.*;
import oracle.jdbc.driver.*;
import oracle.sql.*;
import java.util.Scanner;
import java.util.Date;

public class Report 
{
    static
    {
        int time_limit = 30;
    }

    public static void Selection()
    {
        System.out.println("Please select a kind of report：");
        System.out.println("(If you want to count the borrowing of books in various categories, please input 1；\r" + 
        "If you want to analyze how people borrow books over different time periods, please input 2;\r" + 
        "If you want to count the return of books, please input 3;\r" +
        "If you want to analyze the borrowing situation based on the reader's identity information, please input 4.)");
        //通过数字选择的方法最后会替换成GUI
        Scanner scan_kind = new Scanner(System.in);
        int kind =scan_kind.nextint();
        if (kind == 1)
        {
            Class_proportions();     
        }
        if (kind == 2)
        {
            Frequency_of_distribution();
        }
        if (kind == 3)
        {
            Situation_of_return();
        }
        if (kind == 4)
        {
            Sociological_analysis();
        }
        else
        {
            System.out.print("Please input a valid number.");
        }
    }

    public static void time_set()
    {
        System.out.println("Please select the time_limit(in days) for the data source: ");
        Scanner scan_time = new Scanner(System.in);
        int time =scan_time.nextint();
        time_limit = time;
    }

    public static void Class_proportions(OracleConnection con)
    {
        time_set();
        //gui图表
        //在sql中完成
    }

    public static void Frequency_of_distribution(OracleConnection con)
    {
        time_set();
        //gui图表
        //在sql中完成
    }

    public static void Situation_of_return(OracleConnection con)
    {
        time_set();
        //在sql中完成
    }

    public static void Sociological_analysis(OracleConnection con)
    {
        time_set();
        //在sql中完成
    }
}
