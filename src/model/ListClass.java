
package model;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public final class ListClass {
       private CreateDatabase db; 
       private DatabaseConecction connection = new DatabaseConecction();
       private ObservableList<Territorio> territorios = FXCollections.observableArrayList();
       

    public ListClass() throws Exception {
                this.db = new CreateDatabase();
                db.crearTabla();
                fetchTerritotios();
    }

    public ObservableList<Territorio> getTerritorios() throws Exception{
        return territorios;
    }
       
       public void crearTerritorio(String nombre, int poblacion, double extencion, double tierras ) throws Exception{
           String fecha = LocalDate.now().toString();
           Territorio territorio = new Territorio(nombre, poblacion, extencion, tierras, fecha);
           String sql = String.format("INSERT INTO territorios (nombre, poblacion, extencion, tierras, fecha) VALUES ('%s', %d, %.2f, %.2f, '%s')", 
                   territorio.getNombre(), territorio.getPoblacion(), territorio.getExtencionGeografica(), territorio.getTierrasProductivas(), territorio.getFecha());
            connection.connect();
            connection.executeUpdate(sql);
       }
       
       private void  fetchTerritotios() throws Exception {
           String sql = "SELECT * FROM territorios";
           connection.connect();
           ResultSet resultSet = connection.executeQuery(sql);
           while (resultSet.next()) {
                    int id = Integer.parseInt(resultSet.getString("id"));
                    String nombre = resultSet.getString("nombre");
                    int poblacion = Integer.parseInt(resultSet.getString("poblacion"));
                    double extencion = Double.parseDouble(resultSet.getString("extencion"));
                    double tierras = Double.parseDouble(resultSet.getString("tierras"));
                    String fecha = resultSet.getString("fecha");
                    Territorio territorio = new Territorio(id, nombre, poblacion, extencion, tierras, fecha);
                     this.territorios.add(territorio);
                             
           }
           connection.close();
       }
       
       public void cargarTerritorio() throws Exception{
                this.territorios.clear();
                fetchTerritotios();
       }
    
       public void eliminarTerritorio(int id) throws Exception{
           String sql = String.format("DELETE FROM territorios WHERE territorios.id=%d", id);
           connection.connect();
           connection.executeUpdate(sql);
       }
}
        
    
    

