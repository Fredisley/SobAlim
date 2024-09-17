package controller;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.ListClass;
import model.Message;
import model.Territorio;

public class MainWindowController {
    
    private ListClass repositorio;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private StackPane ventanaPrincipal;

    @FXML
    private Button btnInicio;

    @FXML
    private Button btnTerritorios;

    @FXML
    private Button btnPlanes;

    @FXML
    private Button ptnProduccion;

    @FXML
    private AnchorPane ventanaDashboard;

    @FXML
    private BarChart<?, ?> barChart;

    @FXML
    private CategoryAxis categoryAxis;

    @FXML
    private NumberAxis numberAxis;

    @FXML
    private PieChart pieChart;

    @FXML
    private ComboBox<?> cboxDashboard;

    @FXML
    private Label textPoblacion;

    @FXML
    private Label textTierras;

    @FXML
    private ProgressBar progressBarDashboard;

    @FXML
    private AnchorPane ventanaTerritorios;

    @FXML
    private TableView<Territorio> tablaTerritorios;

    @FXML
    private TableColumn<Territorio, String> columNombreTerritorio;

    @FXML
    private TableColumn<Territorio, Integer> columPoblacionTerritorio;

    @FXML
    private TableColumn<Territorio, Double> columExtencionTerritorio;

    @FXML
    private TableColumn<Territorio, Double> columTierraTerritorio;

    @FXML
    private TableColumn<Territorio,  String> columFechaTerritorio;
    
    private ObservableList<Territorio> territorios;

    @FXML
    private Button btnNuevoTerritorio;

    @FXML
    private Button btnEditarTerritorio;

    @FXML
    private Button btnEliminarTerritorio;

    @FXML
    private TableView<?> tablaAgricola;

    @FXML
    private TableColumn<?, ?> columTerritorioAgricola;

    @FXML
    private TableColumn<?, ?> columTrabajadores;

    @FXML
    private TableColumn<?, ?> columViandas;

    @FXML
    private TableColumn<?, ?> columHortalizas;

    @FXML
    private TableColumn<?, ?> columFrutales;

    @FXML
    private TableColumn<?, ?> columGranos;

    @FXML
    private Button btnNuevoRegistroAgricola;

    @FXML
    private Button btnEditarRegistroAgricola;

    @FXML
    private Button btnEliminarRegistroAgricola;

    @FXML
    private TableView<?> tablaPecuario;

    @FXML
    private TableColumn<?, ?> columTerritorioPecuario;

    @FXML
    private TableColumn<?, ?> columEspejoAgua;

    @FXML
    private TableColumn<?, ?> columGranajaVacuno;

    @FXML
    private TableColumn<?, ?> columGranjaAvicola;

    @FXML
    private TableColumn<?, ?> columGranjaOvino;

    @FXML
    private TableColumn<?, ?> columGranjaPorcino;

    @FXML
    private Button btnNuevoRegistroPecuario;

    @FXML
    private Button btnEditarRegistroPecuario;

    @FXML
    private Button btnEliminarRegistroPecuario;

    @FXML
    private AnchorPane ventanaPlanes;

    @FXML
    private TableView<?> tablaProductos;

    @FXML
    private TableColumn<?, ?> columProducto;

    @FXML
    private TableColumn<?, ?> columTipoProducto;

    @FXML
    private TableColumn<?, ?> columTierraProductiva;

    @FXML
    private TableColumn<?, ?> columCantidad;

    @FXML
    private Button btnNuevoProducto;

    @FXML
    private Button btnEditarProducto;

    @FXML
    private Button btnEliminarProducto;

    @FXML
    private ComboBox<?> cbTerritorio;

    @FXML
    private TableView<?> tablaPercapita;

    @FXML
    private TableColumn<?, ?> columPCViandas;

    @FXML
    private TableColumn<?, ?> culumPCHoratlizas;

    @FXML
    private TableColumn<?, ?> columPCGranos;

    @FXML
    private TableColumn<?, ?> columPCFrutales;

    @FXML
    private TableColumn<?, ?> columPCCarnicos;

    @FXML
    private Button btnPercapita;

    @FXML
    private TableView<?> tablaIdealProduccion;

    @FXML
    private TableColumn<?, ?> columProduccionTerritorio;

    @FXML
    private TableColumn<?, ?> columProduccionVianda;

    @FXML
    private TableColumn<?, ?> columProduccionHortaliza;

    @FXML
    private TableColumn<?, ?> columProduccionGrano;

    @FXML
    private TableColumn<?, ?> columProduccionFrutal;

    @FXML
    private TableColumn<?, ?> columProduccionCarnicos;

    @FXML
    private TableView<?> tablaCumplirCultivo;

    @FXML
    private TableColumn<?, ?> columCultivo;

    @FXML
    private TableColumn<?, ?> columTierraNecesaria;

    @FXML
    private Button btnMultiplicadorCultivo;

    @FXML
    private ComboBox<?> cbTerritorioCultivo;

    @FXML
    private TableColumn<?, ?> columAnimal;

    @FXML
    private TableColumn<?, ?> columSacrificios;

    @FXML
    private ComboBox<?> cbTerritorioAnimal;

    @FXML
    private Button btnMultiplicadorAnimal;

    @FXML
    private AnchorPane ventanaProduccion;

    @FXML
    private TableView<?> tablaProduccionAgricola;

    @FXML
    private TableColumn<?, ?> columAgricolaCultivo;

    @FXML
    private TableColumn<?, ?> columAgricolaProduccion;

    @FXML
    private TableColumn<?, ?> columAgricolaFecha;

    @FXML
    private Button btnProduccionAgricola;

    @FXML
    private Button btnEditarProduccionAgricola;

    @FXML
    private Button btnEliminarProduccionAgricola;

    @FXML
    private TableView<?> tablaProduccionPecuaria;

    @FXML
    private TableColumn<?, ?> columPecuarioCarnico;

    @FXML
    private TableColumn<?, ?> columPecuarioProduccion;

    @FXML
    private TableColumn<?, ?> columPecuarioFecha;

    @FXML
    private Button btnAgregarProduccionPecuari;

    @FXML
    private Button btnEditarProduccionPecuaria;

    @FXML
    private Button btnEliminarProduccionPecuaria;

    @FXML
    void agragarProduccionPecuaria(ActionEvent event) {

    }

    @FXML
    void agragarTerritorio(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/TerritorioForm.fxml"));
            Parent root = loader.load();
            TerritorioFormController controller = loader.getController();
            controller.initAttributes(this.repositorio);
            scene(root, "/resource/image/icon.jpg", "Territorio Form");
            setDataTablaTerritorio();
        } catch(IOException e){
            Message.error("Error", "No se pudo cargar la ventana" + e.getMessage());
        }
            
    }

    @FXML
    void agregarProduccionAgricola(ActionEvent event) {

    }

    @FXML
    void agregarProducto(ActionEvent event) {

    }

    @FXML
    void agregarRegistroAgricola(ActionEvent event) {

    }

    @FXML
    void agregarRegistroPecuario(ActionEvent event) {

    }

    @FXML
    void editarProduccionPecuaria(ActionEvent event) {

    }

    @FXML
    void editarProducto(ActionEvent event) {

    }

    @FXML
    void editarRegistroAgricola(ActionEvent event) {

    }

    @FXML
    void editarRegistroPecuario(ActionEvent event) {

    }

    @FXML
    void editarTerritorio(ActionEvent event) {

    }

    @FXML
    void edtarProduccionAgricola(ActionEvent event) {

    }

    @FXML
    void eliminarProduccionAgricola(ActionEvent event) {

    }

    @FXML
    void eliminarProduccionPecuaria(ActionEvent event) {

    }

    @FXML
    void eliminarProducto(ActionEvent event) {

    }

    @FXML
    void eliminarRegistroAgricola(ActionEvent event) {

    }

    @FXML
    void eliminarRegistroPecuario(ActionEvent event) {

    }

    @FXML
    void eliminarTerritorio(ActionEvent event) {

    }

    @FXML
    void modificarMultiplicadorAnimal(ActionEvent event) {

    }

    @FXML
    void modificarMultiplicadorCultivo(ActionEvent event) {

    }

    @FXML
    void modificarPercapita(ActionEvent event) {

    }
    
    @FXML
    private void abrirDashboar(ActionEvent event){
        this.ventanaDashboard.setVisible(true);
        this.ventanaTerritorios.setVisible(false);
        this.ventanaPlanes.setVisible(false);
        this.ventanaProduccion.setVisible(false);
    }
    
    @FXML
    private void abrirTerritorios(ActionEvent event){
         this.ventanaDashboard.setVisible(false);
        this.ventanaTerritorios.setVisible(true);
        this.ventanaPlanes.setVisible(false);
        this.ventanaProduccion.setVisible(false);
        setDataTablaTerritorio();
    }
    
    @FXML
    private void abrirPlanes(ActionEvent event){
         this.ventanaDashboard.setVisible(false);
        this.ventanaTerritorios.setVisible(false);
        this.ventanaPlanes.setVisible(true);
        this.ventanaProduccion.setVisible(false);
    }
    
    @FXML
    private void abrirProduccion(ActionEvent event){
         this.ventanaDashboard.setVisible(false);
        this.ventanaTerritorios.setVisible(false);
        this.ventanaPlanes.setVisible(false);
        this.ventanaProduccion.setVisible(true);
    }

    private void scene(Parent parent, String url, String title) throws IOException {
        try {
            Scene scene = new Scene(parent);
            Stage stage = new Stage();
            stage.getIcons().add(new Image(url));
            stage.setResizable(false);
            stage.setTitle(title);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
        } catch (Exception e) {
            Message.error("Error", "Unknown Error: " + e.getMessage());
        }
    }
    
    public void initAttributtes(ListClass repositorio){
         this.repositorio =  repositorio;
    }
    
    private void resetTable(TableView table) {
         table.getItems().clear(); // Vaciar el TableView
    }
    
    private void setDataTablaTerritorio( ) {
       try {
       resetTable(tablaTerritorios);
       this.repositorio.cargarTerritorio();
       this.tablaTerritorios.setItems(this.repositorio.getTerritorios());
       this.columNombreTerritorio.setCellValueFactory(new PropertyValueFactory<>("nombre"));
       this.columPoblacionTerritorio.setCellValueFactory(new PropertyValueFactory<>("poblacion"));
       this.columExtencionTerritorio.setCellValueFactory(new PropertyValueFactory<Territorio, Double>("extencionGeografica"));
       this.columTierraTerritorio.setCellValueFactory(new PropertyValueFactory<Territorio, Double>("tierrasProductivas"));
       this.columFechaTerritorio.setCellValueFactory(new PropertyValueFactory<>("fecha"));
       } catch (Exception e){
           Message.error("ERROR", "Error al cargar tabla");
       }
    }
    
    @FXML
    public void initialize() {
        tablaTerritorios.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
           // Habilitar el botón si hay una fila seleccionada, y deshabilitar si no
           btnEditarTerritorio.setDisable(newSelection == null);
          btnEliminarTerritorio.setDisable(newSelection == null);
       });
       

    }
}
