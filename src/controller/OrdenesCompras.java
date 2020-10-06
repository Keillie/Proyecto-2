package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.Cliente;
import modelo.Orden;
import modelo.Producto;
import utils.VariablesGlobales;

import java.io.IOException;
import java.util.Date;

/**
 * Clase Ordenes de compra para manejar Altas, bajas y cambios para Ordenes de Compra
 */
public class OrdenesCompras {
    public TableView tblOrden;
    public TextField txtId;
    public TableColumn tcNo;
    public TableColumn tcProveedor;
    public TableColumn tcFecha;
    public TableColumn tcProducto;
    public TableColumn tcCantidad;
    public TableColumn tcPrecio;
    public TableColumn tcSubtotal;
    public TableColumn tcTotal;
    public TextField txtNo;
    public TextField txtProveedor;
    public TextField txtFecha;
    public TextField txtNombreProducto;
    public TextField txtCantidad;
    public TextField txtPrecioUnitario;
    public TableColumn tcDiasEnvio;
    public TableColumn tcTipoEnvio;
    public TableColumn tcEstado;
    public ChoiceBox <String>chBoxDiasEnvio;
    public ChoiceBox <String>chBoxTipoEnvio;
    public ChoiceBox <String>chBoxEstado;
    ObservableList list = FXCollections.observableArrayList();
    ObservableList list2 = FXCollections.observableArrayList();
    ObservableList list3 = FXCollections.observableArrayList();

    /**
     *
     */
    @FXML
    public void initialize(){
        tcNo.setCellFactory(new PropertyValueFactory<Orden, Integer>("id"));
        tcProveedor.setCellFactory(new PropertyValueFactory<Orden, String>("nombreProducto"));
        tcFecha.setCellFactory(new PropertyValueFactory<Orden, Date>("precioUnitario"));
        tcProducto.setCellFactory(new PropertyValueFactory<Orden, String>("id"));
        tcCantidad.setCellFactory(new PropertyValueFactory<Orden, Integer>("nombreProducto"));
        tcPrecio.setCellFactory(new PropertyValueFactory<Orden, Double>("id"));
        tcProveedor.setCellFactory(new PropertyValueFactory<Orden, String>("nombreProducto"));
        tcDiasEnvio.setCellFactory(new PropertyValueFactory<Orden, Integer>("nombreProducto"));
        tcTipoEnvio.setCellFactory(new PropertyValueFactory<Orden, String>("id"));
        tcEstado.setCellFactory(new PropertyValueFactory<Orden, String>("nombreProducto"));
        loadData();
    }

    /**
     * Metodo
     * @param actionEvent
     */
    public void calcular(ActionEvent actionEvent) {

    }

    /**
     * Metodo sin retorno para utilizar choiceBox lista despegable con opciones
     */
    private void loadData(){
        list.removeAll(list);
        String dia5 = "5";
        String dia10 = "10";
        String dia15 = "15";
        String dia30 = "30";
        list.addAll(dia5,dia10, dia15, dia30);
        chBoxDiasEnvio.getItems().addAll(list);
    }

    /**
     * Metodo sin retorno para utilizar choiceBox lista despegable con opciones
     */
     public void listEnvio(){
         list2.removeAll(list2);
         String tipo1 = "Terrestre";
         String tipo2 = "Maritima";
         list2.addAll(tipo1,tipo2);
         chBoxTipoEnvio.getItems().addAll(list2);
     }

    /**
     * Metodo sin retorno para utilizar choiceBox lista despegable con opciones
     */
     public void listEstado(){
         list3.removeAll(list3);
         String estado1 = "Pendiente";
         String estado2 = "En proceso";
         list3.addAll(estado1,estado2);
         chBoxEstado.getItems().addAll(list3);
     }

    /**
     * Metodo exit(salir) permite salir del sistema
     * @param actionEvent accion al dar click en el boton salir
     */
    public void exit(ActionEvent actionEvent) {
        System.exit(0);
    }

    /**
     * Metodo implementado para realizar la accion de regresar al menu principal
     * @param actionEvent
     */
    public void retornarMenu(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Menu.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            Stage stageLogin = (Stage) txtNombreProducto.getScene().getWindow();
            stageLogin.close();//cerrar stage o ventana
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
