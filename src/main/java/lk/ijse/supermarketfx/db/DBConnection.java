package lk.ijse.supermarketfx.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.com
 * --------------------------------------------
 * Created: 4/3/2025 1:54 PM
 * Project: SupermarketFX
 * --------------------------------------------
 **/

public class DBConnection {
    private static DBConnection dbConnection;
    private final Connection connection;

    private DBConnection() throws SQLException {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/supermarketfx",
                "root",
                "Teenu123"
        );
    }

    public static DBConnection getInstance() throws SQLException {
//        if (dbConnection == null) {
//            dbConnection = new DBConnection();
//        }
//        return dbConnection;

        return dbConnection == null ?
                dbConnection = new DBConnection() :
                dbConnection;
    }

    public Connection getConnection() {
        return connection;
    }
}
