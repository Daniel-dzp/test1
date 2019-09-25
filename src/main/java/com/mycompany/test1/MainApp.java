package com.mycompany.test1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import test1.fxml.VentanaController;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("/fxml/Ventana.fxml"));
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Ventana.fxml"));        
        Parent root = loader.load();
        VentanaController controller = loader.<VentanaController>getController();
        
        Scene scene = new Scene(root);
        
        stage.setTitle("Test 1");
        stage.setScene(scene);
        stage.show();
        ToggleGroup a;
        stage.setOnCloseRequest(new EventHandler<WindowEvent>()
        {
            @Override
            public void handle(WindowEvent event)
            {
                //controller.salir(null);
            }
        });
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
