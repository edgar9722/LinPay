package sample.Complements;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class Mssql {
    String username, password;
    static Connection conn;

    public static void Connect(String username,String password) {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=LinPay;user="+username+";password="+password+"";

        // Load SQL Server JDBC driver and establish connection.
        System.out.print("Connecting to SQL Server ... ");
        try {
            // Load SQL Server JDBC driver and establish connection.
            System.out.print("Connecting to SQL Server ... ");
            try (Connection connection = DriverManager.getConnection(connectionUrl)) {
                System.out.println("Done.");
                conn = connection;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Mssql.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Connection getConnection() {
        if (conn == null) Connect("SA","<Barong58");
        return conn;
    }


    public static void Disconnect() {
        try {
            conn.close();
            System.out.println("Se ha finalizado la conexión con el servidor");
        } catch (SQLException ex) {
            Logger.getLogger(Mssql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    }


