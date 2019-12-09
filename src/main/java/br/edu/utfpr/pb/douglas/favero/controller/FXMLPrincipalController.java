package br.edu.utfpr.pb.douglas.favero.controller;

import br.edu.utfpr.pb.douglas.favero.model.Usuario;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

public class FXMLPrincipalController implements Initializable {

    @FXML
    private VBox vboxPrincipal;

    private Usuario usuarioAutenticado;

    public void setUsuarioAutenticado(Usuario usuario) {
        this.usuarioAutenticado = usuario;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void SetDataPane(Node node) {
        vboxPrincipal.getChildren().setAll(node);
    }

    public VBox openVBox(String url) throws IOException {
        VBox v = (VBox) FXMLLoader.load(
                this.getClass().getResource(url));
        FadeTransition ft = new FadeTransition(
                Duration.millis(1000));
        ft.setNode(v);
        ft.setFromValue(0.1);
        ft.setToValue(1);
        ft.setCycleCount(1);
        ft.setAutoReverse(false);
        ft.play();
        return v;
    }
    
    
}
