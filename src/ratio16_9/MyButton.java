/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratio16_9;

import javafx.scene.control.Button;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author john
 */
class MyButton extends Button {

    Integer a, b;

    public MyButton(int x, int y ,Stage primaryStage) {
        this.a = x;
        this.b = y;
        this.setText(a.toString() + " X " + b.toString());
        final Text actiontarget = new Text();

        this.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("Sign in button pressed");
                primaryStage.setWidth(a);
                primaryStage.setHeight(b);
            }

        });

    }

}
