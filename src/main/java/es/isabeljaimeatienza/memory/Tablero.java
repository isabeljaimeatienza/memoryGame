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
  
    
    int rows = 4;
    int columns = 6;
    Random randomCard = new Random();   
    int RC =randomCard.nextInt(12);
    Carta carta = new Carta(RC);
    static int numCarta=0;
    
    public Tablero(){
   
    carta= new Carta(RC);
       
 
         //Setting size for the pane  
       
       for(int i = 0; i < columns; i++) {
            ColumnConstraints column = new ColumnConstraints(100);
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
                    double RC = 0;
                    for (int fi=0; fi<=4; fi++){
                        for(int co=0; co<=5; co++){
                            
                           colocarCarta(co,fi,(int) Math.floor(RC)); // redondeo hacia abajo con math.floor
                           RC = RC+0.5;
                            System.out.println("Columna:"+ co+"Fila:"+ fi);    
                        }
                    }//Columna-fila-carta
                   
                   
                }
            });
        }
       
   private void colocarCarta(int columna, int fila, int RC){
       
       Carta carta = new Carta(RC); // numCarta te dirá quien da el click, viene en el parametro de este metodo el anterior da igual
     
       //carta.setLayoutY(Carta.TAM_CARTA/2);
       this.add(carta,columna,fila);
       
    }  
    
}


