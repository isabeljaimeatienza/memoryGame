/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.isabeljaimeatienza.memory;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;

/**
 *
 * @author cadit
 */
public class Tablero extends GridPane{
    
    int rows = 4;
    int columns = 6;
    public Tablero(){
        //Creating a Grid Pane 
        // GridPane gridPane = new GridPane();  
         //Setting size for the pane  
        
       for(int i = 0; i < columns; i++) {
            ColumnConstraints column = new ColumnConstraints(107);
            this.getColumnConstraints().add(column);
        }

        for(int i = 0; i < rows; i++) {
            RowConstraints row = new RowConstraints(180);
            this.getRowConstraints().add(row);
        }

        

        this.setStyle("-fx-background-color: white; -fx-grid-lines-visible: true");
        Scene scene = new Scene(this, (columns * 40) + 100, (rows * 40) + 100, Color.WHITE);
        Carta carta = new Carta(1);
        this.add(carta, 2,0);
       
        
    
               // Detectar clic en ratón (pulsado y soltado)
    /*        this.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    // Insertar aquí el código a ejecutar cuando se haga clic en el ratón
                    System.out.println("Mouse clicked X , Y:  " + 
                        mouseEvent.getX() + " : " + mouseEvent.getY());
                    int clicX = (int) mouseEvent.getX();
                    int columna = clicX / Carta.TAM_CARTA;
                    System.out.println("Columna:"+ columna);
                    colocarCarta(columna, 1);
                
                }
            });
    }
       
   private void colocarCarta(int columna, int jugador){
       Carta carta = new Carta(jugador); // jugador te dirá quien da el click, viene en el parametro de este metodo el anterior da igual
       carta.setLayoutX((columna + 0.5) * Carta.TAM_CARTA);
       carta.setLayoutY(Carta.TAM_CARTA/2);
       this.getChildren().add(carta);*/
       
    }  
    
}

