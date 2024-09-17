
package model;

import java.util.Arrays;
import java.util.List;

public class CreateDatabase {
    private DatabaseConecction dbConection = new DatabaseConecction(); 

    public DatabaseConecction getDbConection() {
        return dbConection;
    }

    public void setDbConection(DatabaseConecction dbConection) {
        this.dbConection = dbConection;
    } 
    
       private String tablaTerritorio = "CREATE TABLE IF NOT EXISTS territorios("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "nombre TEXT NOT NULL UNIQUE,"
                + "poblacion INTEGER NOT NULL,"
                + "extencion REAL NOT NULL,"
                + "tierras REAL NOT NULL,"
               +  "fecha TEXT NOT NULL"
                + ");";
    
       private String tablaProducto = "CREATE TABLE IF NOT EXISTS tabla_producto("
               + "id INTEGER,"
               + "territorio_id INTEGER NOT NULL,"
               + "nombre	TEXT NOT NULL,"
               + "tipo TEXT NOT NULL,"
               + "tierras REAL NOT NULL,"
	      + "PRIMARY KEY(id AUTOINCREMENT),"
  	      + "FOREIGN KEY(territorio_id) REFERENCES territorios(id)"
               + ");";
    
       private String tablaRecursos = "CREATE TABLE IF NOT EXISTS tabla_recursos("
               +  "id INTEGER,"
               + "territorio_id INTEGER NOT NULL,"
               + "trabajadores INTEGER NOT NULL,"
               + "PRIMARY KEY(id AUTOINCREMENT),"
               + "FOREIGN KEY(territorio_id) REFERENCES territorios(id)"
               + ");";
        
       private String tablaRecursosA = "CREATE TABLE IF NOT EXISTS tabla_recursos_a("
               + "id INTEGER,"
               + "recursos_id INTEGER NOT NULL,"
               +  "tierras_vianda	REAL NOT NULL,"
               + "tierras_hortaliza REAL NOT NULL,"
               + "tierras_frutales	REAL NOT NULL,"
               + "tierras_grano REAL NOT NULL,"
               + "PRIMARY KEY(id AUTOINCREMENT),"
                + "FOREIGN KEY(recursos_id) REFERENCES tabla_recursos(id)"
                + ");";
        
       private String tablaRecursosP = "CREATE TABLE IF NOT EXISTS tabla_recursos_p("
               +  "id INTEGER,"
               + "recursos_id INTEGER NOT NULL,"
               + "espejo_agua REAL NOT NULL,"
               + "granja_vacuno	INTEGER NOT NULL,"
               + "granja_avicola	INTEGER NOT NULL,"
               + "granja_ovino INTEGER NOT NULL,"
               + "granja_porcino	INTEGER NOT NULL,"
               + "PRIMARY KEY(id AUTOINCREMENT),"
               + "FOREIGN KEY(recursos_id) REFERENCES tabla_recursos(id)"
                + ");";
        
    public void crearTabla() {
        List<String> tablas = Arrays.asList(tablaTerritorio, tablaProducto, tablaRecursos, tablaRecursosA, tablaRecursosP);
        tablas.forEach( tabla ->{
            getDbConection().connect();
            getDbConection().createTable(tabla);       
        });
    }
}
  
