package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConecction {
    
    // URL para la base de datos SQLite
    private static final String URL = "jdbc:sqlite:datos.db";

    public static void connect() {
        try {
            Class.forName("org.sqlite.JDBC");
              Connection conn = DriverManager.getConnection(URL);
               System.out.println("Conexión a la base de datos establecida.");
           } catch (ClassNotFoundException | SQLException e) {
               System.out.println("Error en la conexión: " + e.getMessage());
           }
       }
    }


