package SingletonTask;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private ConnectionDB() {

    }

    private static Connection connectionSingleton = null;

    public static Connection getConnection() {
        if (connectionSingleton == null) {
            try {
                String localServer = "DESKTOP-LVSI9S0";
                String databaseName = "Users001;";
                String user = "lopez1;";
                String password = "lopez1;";
                connectionSingleton = DriverManager.getConnection("jdbc:sqlserver://" + localServer + ":1433;databaseName=" + databaseName + "user=" + user + "password=" + password);
                System.out.println("first time");

            } catch (SQLException exception) {
                System.out.println("Failed Connection" + exception.getMessage());
            }
        }
        return connectionSingleton;
    }
}
