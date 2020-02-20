/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.isabeljaimeatienza.memory;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;

/**
 *
 * @author cadit
 */
public class Tablero extends GridPane{
    
    int rows = 3;
    int columns = 3;
    public Tablero(){
        //Creating a Grid Pane 
        // GridPane gridPane = new GridPane();  
         //Setting size for the pane  
        
       for(int i = 0; i < columns; i++) {
            ColumnConstraints column = new ColumnConstraints(100);
            this.getColumnConstraints().add(column);
        }

        for(int i = 0; i < rows; i++) {
            RowConstraints row = new RowConstraints(120);
            this.getRowConstraints().add(row);
        }

        

        this.setStyle("-fx-background-color: white; -fx-grid-lines-visible: true");
        Scene scene = new Scene(this, (columns * 40) + 100, (rows * 40) + 100, Color.WHITE);
        
    }
        
    }
       
   
    
}
