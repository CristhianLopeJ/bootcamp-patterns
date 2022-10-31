package SingletonTask;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserService {
    private Connection connection;

    public UserService() {
        connection = ConnectionDB.getConnection();
    }

    public void printUser() {
        try {
            Statement statement = connection.createStatement();
            String querySentence = "SELECT TOP (1000) idUser, nameUser, ageUser FROM Users001.dbo.TABLE001 ";
            ResultSet resultSet = statement.executeQuery(querySentence);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
            }
        } catch (SQLException exception) {
            System.out.println("Failed Select Users" + exception.getMessage());
        }
    }

    @Override
    public String toString() {
        return "UserService{" +
                "connectionSingleton=" + connection +
                '}';
    }
}
