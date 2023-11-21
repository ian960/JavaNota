import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyJDBC {

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/login_schema",
                    "root",
                    "123"
            );

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM USERS");

            while (resultSet.next()){
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");

                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
                System.out.println("--------");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
