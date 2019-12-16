package br.edu.utfpr.pb.douglas.favero.controller;

import br.edu.utfpr.pb.douglas.favero.dao.ClienteDao;
import br.edu.utfpr.pb.douglas.favero.model.Cliente;
import br.edu.utfpr.pb.douglas.favero.model.EEstados;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLClienteCadastroController implements Initializable {

    @FXML
    private TextField textId;
    @FXML
    private TextField textNome;
    @FXML
    private ComboBox<EEstados> comboEstados;
    @FXML
    private TextField textCidade;
    @FXML
    private TextField textRua;
    @FXML
    private TextField textNumero;
    @FXML
    private TextField textBairro;
    @FXML
    private TextField textTelefone;
    @FXML
    private TextField textEmail;
    @FXML
    private TextField textCpf;
    @FXML
    private TextField textRg;
    @FXML
    private TextField textPassaporte;

    private ClienteDao clienteDao;
    private EEstados eEstados;
    private Cliente cliente;
    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.clienteDao = new ClienteDao();
        ObservableList<EEstados> eEstados
                = FXCollections.observableArrayList(
                        this.cliente.getAll()
                );
        this.comboEstados.setItems(eEstados);
    }

    public void setDialogStage(Stage stage) {
        this.stage = stage;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente.getId() != null) {
            textId.setText(cliente.getId().toString());
            textNome.setText(cliente.getNome());
            comboEstados.setValue(cliente.geteEstados());
            textCidade.setText(cliente.getCidade());
            textRua.setText(cliente.getRua());
            textNumero.setText(cliente.getNumero().toString());
            textBairro.setText(cliente.getBairro());
            textTelefone.setText(cliente.getTelefone());
            textEmail.setText(cliente.getEmail());
            textCpf.setText(cliente.getCpf());
            textRg.setText(cliente.getRg());
            textPassaporte.setText(cliente.getPassaporte());
        }
    }

    @FXML
    private void cancel() {
        this.stage.close();
    }

    @FXML
    private void save() {
        cliente.setNome(textNome.getText());
        cliente.seteEstados(comboEstados.getSelectionModel().getSelectedItem());
        cliente.setCidade(textCidade.getText());
        cliente.setRua(textRua.getText());
        cliente.setNumero(Integer.parseInt(textNumero.getText()));
        cliente.setBairro(textBairro.getText());
        cliente.setTelefone(textTelefone.getText());
        cliente.setEmail(textEmail.getText());
        cliente.setCpf(textCpf.getText());
        cliente.setRg(textRg.getText());
        cliente.setPassaporte(textPassaporte.getText());
        this.clienteDao.save(cliente);
        this.stage.close();
    }
}
