package project;
import java.sql.*;
public class ConectionProvider {
    //public static void main(String args[]){
    public static Connection getCon(){
    Connection Con=null;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","1357anik");
    return Con;
    }
    catch(Exception e){
    return null;
    }
    }
}
