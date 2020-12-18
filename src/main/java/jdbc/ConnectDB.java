package jdbc;





import pojo.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ConnectDB {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        List<Employee> employeeList=new ArrayList<Employee>();


        Class.forName("com.mysql.jdbc.Driver");
        String dbConURL="jdbc:mysql://localhost:3306/jdbc";
        String uName="root";
        String passWord="1Nellore$";

        Connection connection= DriverManager.getConnection(dbConURL,uName,passWord);

        Statement statement=connection.createStatement();

        ResultSet resultSet=statement.executeQuery("select * from employee");

        while(resultSet.next()){
Employee employee=new Employee();
employee.setId(resultSet.getInt(1));
employee.setName(resultSet.getString("name"));
employee.setPlace(resultSet.getString("place"));
employee.setSalaray(Double.valueOf(resultSet.getString("salaray")));
employeeList.add(employee);
        }

        for (Employee employee :employeeList)
        {
            System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getSalaray()+" "+employee.getSalaray());
        }

    }
}
