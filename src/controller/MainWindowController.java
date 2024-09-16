package controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

public class MainWindowController {

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
    private TableView<?> tablaTerritorios;

    @FXML
    private TableColumn<?, ?> columNombreTerritorio;

    @FXML
    private TableColumn<?, ?> columPoblacionTerritorio;

    @FXML
    private TableColumn<?, ?> columExtencionTerritorio;

    @FXML
    private TableColumn<?, ?> columTierraTerritorio;

    @FXML
    private TableColumn<?, ?> columFechaTerritorio;

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
    void initialize() {
       

    }
}
