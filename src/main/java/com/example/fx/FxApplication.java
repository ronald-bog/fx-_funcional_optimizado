package com.example.fx;

import com.example.fx.controllers.IndexController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FxApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {

        var context = SpringApplication.run(FxApplication.class);
        var loader = new FXMLLoader(getClass().getResource("/index.fxml"));
        loader.setControllerFactory(context::getBean);
        var scene = new Scene(loader.load(), 800, 800);
        stage.setScene(scene);
        stage.show();
    }
}
