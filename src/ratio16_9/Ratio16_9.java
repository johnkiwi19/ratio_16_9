/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratio16_9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author john
 */
public class Ratio16_9 extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Hello World!");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        MyButton b1 = new MyButton(1024,567  , primaryStage);
        MyButton b2 = new MyButton(1280,720  , primaryStage);
        MyButton b3 = new MyButton(1600, 900 , primaryStage);
        MyButton b4 = new MyButton(1920, 1080, primaryStage);
        grid.add(b1, 1, 1);
        grid.add(b2, 1, 2);
        grid.add(b3, 1, 3);
        grid.add(b4, 1, 4);

        Text t = new Text("Size");
        grid.add(t,2,2);
        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
