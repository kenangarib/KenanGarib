package az.coder.task1.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/University";
        Connection connection = DriverManager.getConnection(url, "postgres", "kenan12345");
        Scanner sc= new Scanner(System.in);
        System.out.println("Ad");
        String name =sc.next();
        System.out.println("Yeeni Ad");
        String surname =sc.next();
        String sql = "update public.teacher set name=?  where name=?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, surname);
        preparedStatement.setString(2,name);

//        System.out.println(statement.executeUpdate(sql));

        int count = preparedStatement.executeUpdate();
        System.out.println("Update olan rowlar" + count);

        preparedStatement.close();
        connection.close();
    }
}