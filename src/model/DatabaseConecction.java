package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.scene.image.Image;

public class DatabaseConecction {
    private final String URL= "jdbc:sqlite:src/data/datos.db";
    private Connection connection;
    
    //metodo para conectar a la base de datos
    public void connect()  {
        try {
            Class.forName("org.sqlite.JDBC");
            this.connection = DriverManager.getConnection(URL);
        } catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
          
           }
    }
    
    //metodo para crear tablas
    public void createTable(String sql) {
        try (Statement stmt = connection.createStatement() ){
            stmt.execute(sql);
        } catch(SQLException e){
            e.printStackTrace();
             Message.error("ERROR", "Error al crear tabla: ");
        } finally {
            close();
        }
    }
    
    //metodo para actualizar informacion
    public void executeUpdate(String sql){
           try(PreparedStatement pstmt = connection.prepareStatement(sql)){
               pstmt.executeUpdate();
           }catch (SQLException e) {
               e.printStackTrace();
            Message.error("ERROR", "Error en la operación: " + e.getMessage());
         }
       }
    
    /*public void insertTerritorio(String sql, String nombre, int poblacion, double extencion, double tierras, String fecha) {
    try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
        pstmt.setString(1, nombre);
        pstmt.setInt(2, poblacion);
        pstmt.setDouble(3, extencion);
        pstmt.setDouble(4, tierras);
        pstmt.setString(1, fecha);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        Message.error("ERROR", "Error en la operación: " + e.getMessage());
    }
}*/

    
    //metodo para obtener información
    public ResultSet executeQuery(String sql){
        ResultSet resultSet = null;
        PreparedStatement pstmt = null;
        try{
            pstmt = connection.prepareStatement(sql);
            resultSet = pstmt.executeQuery();
            return resultSet;
        }catch(SQLException e){
            Message.error("ERROR", "Error en la operación: " + e.getMessage());
            return null;
        } 
    }
    
    //metodo para cerrar la conexion
    public void close(){
        try {
            if(connection != null && !connection.isClosed()){
                connection.close();
            }
        } catch (SQLException e){
            Message.error("ERROR", "Error en la operación: " + e.getMessage());
        }
    }
    }
  


