package com.example.fx.controllers;

import com.example.fx.Repository.Repository;
import com.example.fx.model.Persona;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

@Component
public class IndexController implements Initializable {

    @Autowired
    @Qualifier("titulo2")
    private String tituloDos;

    @Autowired
    private Repository repo;

    public String til;

    public String tituloController() {
        return  "welcome controller";
    }

    @FXML
    private Label lblTitulo;

    @FXML
    private TextField txtNombre;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("ejecutado");
        save();
        lblTitulo.setText(tituloDos);
    }

    public void save(){
        Persona per = repo.findById(1L).get();
        //per.setNombre(txtNombre.getText());
        per.setNombre("patrick");
        repo.save(per);
    }
}
