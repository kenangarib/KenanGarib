package task25;

import java.sql.*;
import java.util.Scanner;

public class JDBC {


    public static void main(String[] args) throws InterruptedException, SQLException {
        Scanner mySc = new Scanner(System.in);
        Connection connection = null;
        PreparedStatement preparedStatement;
        Statement statement;
        ResultSet resultSet;
        boolean error;


        do {
            error = false;
            try {
                System.out.print("User name:  ");
                String userName = mySc.next();
                System.out.print("Password: ");
                String password = mySc.next();
                System.out.println("Wait...");
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/University", userName, password);
                Thread.sleep(3000);
                System.out.println("Connected");
                System.out.print("");
            } catch (SQLException ex) {

                error = true;
                Thread.sleep(3000);
                System.out.println("Something is wrong to connect to database ");

            } catch (Exception ex) {
                System.out.println("Error");

            }

        } while (error);


        System.out.println("[A] Add");
        System.out.println("[V] View");
        System.out.println("[U] Update");
        System.out.println("[D] Delete");
        System.out.println("[L] Delete All");
        System.out.print("Select: ");
        System.out.print("");
        Character cc = mySc.next().charAt(0);
        switch (cc) {
            case 'a': {
                System.out.println("[G] Groups");
                System.out.println("[T] Teachers");
                System.out.println("[S] Students");
                System.out.print("Select: ");
                System.out.print("");
                Character c = mySc.next().charAt(0);
                switch (c) {
                    case 'g': {
                        System.out.print("Group Name: ");
                        Integer groupName = mySc.nextInt();


                        String groupQuery = "insert into public.groups(name) values (?)";
                        preparedStatement = connection.prepareStatement(groupQuery);
                        preparedStatement.setInt(1, groupName);
                        int count = preparedStatement.executeUpdate();
                        System.out.println("Added group: " + count);
                        preparedStatement.close();
                        connection.close();
                    }
                    ;
                    break;
                    case 't': {
                        System.out.print("Teacher Name: ");
                        String teacherName = mySc.next();
                        System.out.print("Teacher Surame: ");
                        String teacherSurname = mySc.next();
                        System.out.print("Teacher Class: ");
                        Integer teacherClass = mySc.nextInt();

                        String teacherQuery = "insert into public.teacher(name,surname,groupid) values (?,?,?)";
                        preparedStatement = connection.prepareStatement(teacherQuery);
                        preparedStatement.setString(1, teacherName);
                        preparedStatement.setString(2, teacherSurname);
                        preparedStatement.setInt(3, teacherClass);
                        preparedStatement.executeUpdate();
                        int count = preparedStatement.executeUpdate();
                        System.out.println("Added teacher: " + count);
                        preparedStatement.close();
                        connection.close();
                    }
                    ;
                    break;
                    case 's': {
                        System.out.print("Srudent Name: ");
                        String studentName = mySc.next();
                        System.out.print("Student Name: ");
                        String studentSurname = mySc.next();
                        System.out.print("Student Class: ");
                        Integer studentClass = mySc.nextInt();

                        String studentQuery = "insert into public.student(name,surname,groupid) values (?,?,?)";
                        preparedStatement = connection.prepareStatement(studentQuery);
                        preparedStatement.setString(1, studentName);
                        preparedStatement.setString(2, studentSurname);
                        preparedStatement.setInt(3, studentClass);
                        preparedStatement.executeUpdate();
                        int count = preparedStatement.executeUpdate();
                        System.out.println("Added student: " + count);
                        preparedStatement.close();
                        connection.close();
                    }
                    break;
                    default: {
                        System.out.println("ERROR");
                    }
                }
            }
            break;
            case 'v': {
                System.out.println("[G] Groups");
                System.out.println("[T] Teachers");
                System.out.println("[S] Students");
                System.out.print("Select: ");
                System.out.print("");
                Character c = mySc.next().charAt(0);
                switch (c) {
                    case 'g': {
                        statement = connection.createStatement();
                        resultSet = statement.executeQuery("select * from public.groups order by id");
                        while (resultSet.next()) {
                            System.out.println(resultSet.getInt("id")+": "+resultSet.getString("name"));
                    }
                    }
                    break;
                    case 't': {
                        statement = connection.createStatement();
                        resultSet = statement.executeQuery("select * from public.teacher order by name ASC");
                        while (resultSet.next()) {
                            System.out.println(resultSet.getString("name")+ " " + resultSet.getString("surname") + ": " + resultSet.getInt("groupid"));
                        }
                    }
                    break;
                    case 's': {
                        statement = connection.createStatement();
                        resultSet = statement.executeQuery("select * from public.student order by name ASC");
                        while (resultSet.next()) {
                            System.out.println(resultSet.getString("name")+ " " + resultSet.getString("surname") + ": " + resultSet.getInt("groupid"));
                        }
                    }
                    break;
                    default: {
                        System.out.println("ERROR");
                    }
                }

            }
            break;
            case 'u':{
                System.out.println("[G] Groups");
                System.out.println("[T] Teachers");
                System.out.println("[S] Students");
                System.out.print("Select: ");
                System.out.print("");
                Character c = mySc.next().charAt(0);
                switch (c){
                        case 'g': {
                            System.out.print("Name: ");
                            Integer name = mySc.nextInt();
                            System.out.print("New Name: ");
                            Integer newName = mySc.nextInt();


                            String groupQuery = "update public.groups set name=?  where name=?";
                            preparedStatement = connection.prepareStatement(groupQuery);
                            preparedStatement.setInt(1, newName);
                            preparedStatement.setInt(2,name);
                            int count = preparedStatement.executeUpdate();
                            System.out.println("Updated group: " + count);
                            preparedStatement.close();
                            connection.close();
                        }
                        break;
                    case 't': {
                        System.out.print("Name: ");
                        String name = mySc.next();
                        System.out.print("New Name: ");
                        String newName = mySc.next();
                        System.out.print("New Surname: ");
                        String newSurName = mySc.next();


                        String groupQuery = "update public.teacher set name=?, surname=?  where name=?";
                        preparedStatement = connection.prepareStatement(groupQuery);
                        preparedStatement.setString(1, newName);
                        preparedStatement.setString(2, newSurName);
                        preparedStatement.setString(3,name);
                        int count = preparedStatement.executeUpdate();
                        System.out.println("Updated teacher: " + count);
                        preparedStatement.close();
                        connection.close();



                    }
                    break;
                    case 's': {
                        System.out.print("Name: ");
                        String name = mySc.next();
                        System.out.print("New Name: ");
                        String newName = mySc.next();
                        System.out.print("New Surname: ");
                        String newSurName = mySc.next();


                        String groupQuery = "update public.student set name=?, surname=?  where name=?";
                        preparedStatement = connection.prepareStatement(groupQuery);
                        preparedStatement.setString(1, newName);
                        preparedStatement.setString(2, newSurName);
                        preparedStatement.setString(3,name);
                        int count = preparedStatement.executeUpdate();
                        System.out.println("Updated student: " + count);
                        preparedStatement.close();
                        connection.close();
                    }
                    break;

                    }
                }
            case 'd':{
                System.out.println("[G] Groups");
                System.out.println("[T] Teachers");
                System.out.println("[S] Students");
                System.out.print("Select: ");
                System.out.print("");
                Character c = mySc.next().charAt(0);
                switch (c){
                    case 'g': {
                        System.out.print("Name: ");
                        Integer name = mySc.nextInt();



                        String groupQuery = "delete from public.groups where name=?";
                        preparedStatement = connection.prepareStatement(groupQuery);
                        preparedStatement.setInt(1, name);

                        int count = preparedStatement.executeUpdate();
                        System.out.println("Deleted group: " + count);
                        preparedStatement.close();
                        connection.close();
                    }
                    break;
                    case 't': {
                        System.out.print("Name: ");
                        String name = mySc.next();



                        String groupQuery = "delete from public.teacher where name=?";
                        preparedStatement = connection.prepareStatement(groupQuery);
                        preparedStatement.setString(1, name);

                        int count = preparedStatement.executeUpdate();
                        System.out.println("Deleted teacher: " + count);
                        preparedStatement.close();
                        connection.close();
                    }
                    break;
                    case 's': {
                        System.out.print("Name: ");
                        String name = mySc.next();



                        String groupQuery = "delete from public.student where name=?";
                        preparedStatement = connection.prepareStatement(groupQuery);
                        preparedStatement.setString(1, name);

                        int count = preparedStatement.executeUpdate();
                        System.out.println("Deleted student: " + count);
                        preparedStatement.close();
                        connection.close();
                    }
                    break;
                }

            }
            break;
            case 'l':{
                System.out.println("[G] Groups");
                System.out.println("[T] Teachers");
                System.out.println("[S] Students");
                System.out.print("Select: ");
                System.out.print("");
                Character c = mySc.next().charAt(0);
                switch (c){
                    case 't': {

                        String groupQuery = "delete from public.teacher ";
                        preparedStatement = connection.prepareStatement(groupQuery);

                        int count = preparedStatement.executeUpdate();
                        System.out.println("Deleted teachers: " + count);
                        preparedStatement.close();
                        connection.close();
                    }
                    break;
                    case 's': {

                        String groupQuery = "delete from public.student ";
                        preparedStatement = connection.prepareStatement(groupQuery);

                        int count = preparedStatement.executeUpdate();
                        System.out.println("Deleted students: " + count);
                        preparedStatement.close();
                        connection.close();
                    }
                    break;
                    case 'g': {

                        String groupQuery = "delete from public.groups ";
                        preparedStatement = connection.prepareStatement(groupQuery);

                        int count = preparedStatement.executeUpdate();
                        System.out.println("Deleted groups: " + count);
                        preparedStatement.close();
                        connection.close();
                    }
                    break;
                }

            }

            }

        }


    }



