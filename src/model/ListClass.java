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
    private ObservableList<Producto> productos = FXCollections.observableArrayList();
    private ObservableList<RecursosAgronomos> recursosAgronomos = FXCollections.observableArrayList();
    private ObservableList<RecursosPecuarios> recursosPecuarios = FXCollections.observableArrayList();

    public ListClass() throws Exception {
        this.db = new CreateDatabase();
        db.crearTabla();
    }

    public ObservableList<Territorio> getTerritorios() throws Exception {
        return territorios;
    }

    public ObservableList<Producto> getProductos() throws Exception {
        return productos;
    }

    public ObservableList<RecursosAgronomos> getRecursosAgronomos() throws Exception {
        return recursosAgronomos;
    }

    public ObservableList<RecursosPecuarios> getRecursosPecuarios() throws Exception {
        return recursosPecuarios;
    }

    public void crearTerritorio(String nombre, int poblacion, double extencion, double tierras) throws Exception {
        String fecha = LocalDate.now().toString();
        Territorio territorio = new Territorio(nombre, poblacion, extencion, tierras, fecha);
        String sql = String.format("INSERT INTO territorios (nombre, poblacion, extencion, tierras, fecha) VALUES ('%s', %d, %.2f, %.2f, '%s')",
                territorio.getNombre(), territorio.getPoblacion(), territorio.getExtencionGeografica(), territorio.getTierrasProductivas(), territorio.getFecha());
        this.connection.connect();
        this.connection.executeUpdate(sql);
        this.connection.close();
    }

    private void fetchTerritotios() throws Exception {
        String sql = "SELECT * FROM territorios";
        this.connection.connect();
        ResultSet resultSet = this.connection.executeQuery(sql);
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

    public void cargarTerritorio() throws Exception {
        this.territorios.clear();
        fetchTerritotios();
    }

    public void eliminarTerritorio(int id) throws Exception {
        String sql = String.format("DELETE FROM territorios WHERE territorios.id=%d", id);
        this.connection.connect();
        this.connection.executeUpdate(sql);
        this.connection.close();
    }

    public void updateTerritorio(int id, String nombre, int poblacion, double extencion, double tierras) throws Exception {
        String fecha = LocalDate.now().toString();
        Territorio territorio = new Territorio(id, nombre, poblacion, extencion, tierras, fecha);
        String sql = String.format("UPDATE territorios SET nombre='%s', poblacion=%d, extencion=%.2f, tierras=%.2f, fecha='%s' WHERE id=%d",
                territorio.getNombre(), territorio.getPoblacion(), territorio.getExtencionGeografica(), territorio.getTierrasProductivas(), territorio.getFecha(), territorio.getId());
        this.connection.connect();
        this.connection.executeUpdate(sql);
        this.connection.close();
    }

    public void crearProducto(int territorio_id, String nombre, String tipo, double tierras) throws Exception {
        Producto producto = new Producto(territorio_id, nombre, tipo, tierras);
        String sql = String.format("INSERT INTO tabla_producto (territorio_id, nombre, tipo, tierras) VALUES (%d, '%s', '%s', %.2f)",
                producto.getTerritorio_id(), producto.getNombre(), producto.getTipo(), producto.getTierrasProductivas());
        this.connection.connect();
        this.connection.executeUpdate(sql);
        this.connection.close();
    }

    private void fetchProductos() throws Exception {
        String sql = "SELECT * FROM tabla_producto";
        this.connection.connect();
        ResultSet resultSet = connection.executeQuery(sql);
        while (resultSet.next()) {
            int id = Integer.parseInt(resultSet.getString("id"));
            int territorio_id = Integer.parseInt(resultSet.getString("poblacion"));
            String nombre = resultSet.getString("nombre");
            String tipo = resultSet.getString("tipo");
            double tierras = Double.parseDouble(resultSet.getString("tierras"));
            Producto producto = new Producto(id, territorio_id, nombre, tipo, tierras);
            this.productos.add(producto);

        }
        connection.close();
    }

    public void eliminarProducto(int id) throws Exception {
        String sql = String.format("DELETE FROM tabla_producto WHERE territorios.id=%d", id);
        this.connection.connect();
        this.connection.executeUpdate(sql);
        this.connection.close();
    }

    public void updateProducto(int id, int territorio_id, String nombre, String tipo, double tierras) throws Exception {
        Producto producto = new Producto(id, territorio_id, nombre, tipo, tierras);
        String sql = String.format("UPDATE tabla_producto SET   territorio_id=%d, nombre='%s', tipo='%s', tierras=%.2f WHERE id=%d",
                producto.getTerritorio_id(), producto.getNombre(), producto.getTipo(), producto.getTierrasProductivas(), producto.getId());
        this.connection.connect();
        this.connection.executeUpdate(sql);
        this.connection.close();

    }

    public void cargarProducto() throws Exception {
        this.productos.clear();
        fetchProductos();
    }

    public void crearRecursoAgronomo(double tierrasVianda, double tierrasHortalizas, double tierrasFrutales, double tierrasGrano, int territorio_id, int trabajadores) throws Exception {
        RecursosHumanos recursoHumano = new RecursosHumanos(0, territorio_id, trabajadores);
        this.connection.connect();
        String sqlR = String.format("INSERT INTO tabla_recursos (territorio_id, trabajadores) VALUES (%d, %d) RETURNING tabla_recursos.id", recursoHumano.getTerritorioId(), recursoHumano.getTrabajadores());
        connection.executeUpdate(sqlR);
        String sql = String.format("SELECT id FROM tabla_recursos WHERE territorio_id=%d", recursoHumano.getTerritorioId());
        ResultSet resultSet = connection.executeQuery(sql);
        recursoHumano.setId(resultSet.getInt("id"));
        RecursosAgronomos recurso = new RecursosAgronomos(tierrasVianda, tierrasHortalizas, tierrasFrutales, tierrasGrano, recursoHumano.getId(), territorio_id, trabajadores);
        String sqlRa = String.format("INSERT INTO tabla_recursos_a (recursos_id, tierras_vianda, tierras_hortaliza, tierras_frutales, tierras_grano) VALUES (%d, %.2f, %.2f, %.2f, %.2f)",
                recurso.getId(), recurso.getTierrasVianda(), recurso.getTierrasHortalizas(), recurso.getTierrasFrutales(), recurso.getTierrasGrano());
        connection.executeUpdate(sqlRa);
        this.connection.close();
    }

    private void fetchRecursoAgronomos() throws Exception {
        String sql = "SELECT tabla_recursos_a.id, "
                + "tabla_recursos_a.tierras_vianda, "
                + "tabla_recursos_a.tierras_hortaliza, "
                + "tabla_recursos_a.tierras_frutales, "
                + "tabla_recursos_a.tierras_grano, "
                + "tabla_recursos.trabajadores, "
                + "tabla_recursos.territorio_id "
                + "FROM tabla_recursos_a "
                + "LEFT JOIN tabla_recursos ON tabla_recursos.id = tabla_recursos_a.recursos_id";
        this.connection.connect();
        ResultSet result = connection.executeQuery(sql);
        while (result.next()) {
            int id = Integer.parseInt(result.getString("id"));
            int territorioId = Integer.parseInt(result.getString("territorio_id"));
            int trabajadores = Integer.parseInt(result.getString("trabajadores"));
            double tierrasVianda = Double.parseDouble(result.getString("tierras_vianda"));
            double tierrasHortalizas = Double.parseDouble(result.getString("tierras_hortaliza"));
            double tierrasFrutales = Double.parseDouble(result.getString("tierras_frutales"));
            double tierrasGrano = Double.parseDouble(result.getString("tierras_grano"));
            RecursosAgronomos recuros = new RecursosAgronomos(tierrasVianda, tierrasHortalizas, tierrasFrutales, tierrasGrano, id, territorioId, trabajadores);
            this.recursosAgronomos.add(recuros);
        }
        connection.close();
    }

    public void eliminarRecursoAgronomo(int id) throws Exception {
        String sql = String.format("DELETE FROM tabla_recursos_a WHERE tabla_recursos_a.id=%d", id);
        this.connection.connect();
        connection.executeUpdate(sql);
        this.connection.close();
    }

    public void cargarRecursoAgronomo() throws Exception {
        this.recursosAgronomos.clear();
        fetchRecursoAgronomos();
    }

    public Territorio obtenerTerritorioPorId(int territorioId) throws Exception {
        Territorio territorio = null;
        String query = String.format("SELECT * FROM territorios WHERE id = %d", territorioId);
        this.connection.connect();
        ResultSet rs = connection.executeQuery(query);
        if (rs.next()) {
            territorio = new Territorio(rs.getInt("id"), rs.getString("nombre"), rs.getInt("poblacion"), rs.getDouble("extencion"), rs.getDouble("tierras"), rs.getString("fecha"));
        }
        this.connection.close();
        return territorio;
    }
    
    public void updateRecursoAgronomo(int id, double tierrasVianda, double tierrasHortalizas, double tierrasFrutales, double tierrasGrano, int territorio_id, int trabajadores) throws Exception {
        RecursosAgronomos recurso = new RecursosAgronomos(tierrasVianda, tierrasHortalizas, tierrasFrutales, tierrasGrano, id, territorio_id, trabajadores);
        String sql = String.format("SELECT recursos_id FROM tabla_recursos_a WHERE id=%d", recurso.getId());
        this.connection.connect();
        ResultSet result = this.connection.executeQuery(sql);
        int idR = result.getInt("recursos_id");
        String sqlR = String.format("UPDATE tabla_recursos SET territorio_id=%d, trabajadores=%d WHERE id=%d", recurso.getTerritorioId(), recurso.getTrabajadores(),  idR);
        connection.executeUpdate(sqlR);
        String sqlRa = String.format("UPDATE tabla_recursos_a SET tierras_vianda=%.2f, tierras_hortaliza=%.2f , tierras_frutales=%.2f, tierras_grano=%.2f  WHERE id=%d",
                 recurso.getTierrasVianda(), recurso.getTierrasHortalizas(), recurso.getTierrasFrutales(), recurso.getTierrasGrano(), recurso.getId());
        this.connection.executeUpdate(sqlRa);
        this.connection.close();
    }

}
