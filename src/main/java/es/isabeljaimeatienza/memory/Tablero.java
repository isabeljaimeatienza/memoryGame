/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.isabeljaimeatienza.memory;

import java.util.Random;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

/**
 *
 * @author cadit
 */
public class Tablero extends GridPane{
    static int numCarta=0;
    Carta carta = new Carta(numCarta);
    int rows = 4;
    int columns = 6;
    public Tablero(){
        
    carta= new Carta(numCarta);
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

     
       
        this.setStyle("-fx-background-color: WHITE ;-fx-padding: 200 ; -fx-insets-background: BLUE; -fx-grid-lines-visible: true");
       
        
        

        
    
               // Detectar clic en ratón (pulsado y soltado)
           this.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    // Insertar aquí el código a ejecutar cuando se haga clic en el ratón
                    System.out.println("Mouse clicked X , Y:  " + 
                        mouseEvent.getX() + " : " + mouseEvent.getY());
                    int clicX = (int) mouseEvent.getX();
//                    int columna = clicX / Carta.TAM_CARTA;
                    double numeroCarta = 0;
                    for (int fi=0; fi<=4; fi++){
                        for(int co=0; co<=5; co++){
                            
                           colocarCarta(co,fi,(int) Math.floor(numeroCarta)); // redondeo hacia abajo con math.floor
                           numeroCarta = numeroCarta+0.5;
                            System.out.println("Columna:"+ co+"Fila:"+ fi);    
                        }
                    }//Columna-fila-carta
                   
                   
                }
            });
        }
       
   private void colocarCarta(int columna, int fila, int numCarta){
       Carta carta = new Carta(numCarta); // numCarta te dirá quien da el click, viene en el parametro de este metodo el anterior da igual
     
       //carta.setLayoutY(Carta.TAM_CARTA/2);
       this.add(carta,columna,fila);
       
    }  
    
}


