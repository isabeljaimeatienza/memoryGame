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
       
        
        
//       private void colocarCarta(int columna, int carta) {
//         Random aleatorio = new Random();
//        int posColumn= aleatorio.nextInt(5);
//        for (int i=1; i<rows; i++)
//            this.add(carta,aleatorio,aleatorio);
//       
//   
////        Scene scene = new Scene(this, (columns * 40) + 100, (rows * 40) + 100, Color.BLUE);
// 
//        this.add(carta, 2,0);
//       
        
    
               // Detectar clic en ratón (pulsado y soltado)
           this.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    // Insertar aquí el código a ejecutar cuando se haga clic en el ratón
                    System.out.println("Mouse clicked X , Y:  " + 
                        mouseEvent.getX() + " : " + mouseEvent.getY());
                    int clicX = (int) mouseEvent.getX();
//                    int columna = clicX / Carta.TAM_CARTA;
                    colocarCarta(columns, rows, numCarta);
                    System.out.println("Columna:"+ columns+ "Filas:"+ rows);
                
                }
            });
        }
       
   private void colocarCarta(int columna, int fila, int numCarta){
       Carta carta = new Carta(numCarta); // numCarta te dirá quien da el click, viene en el parametro de este metodo el anterior da igual
       carta.setLayoutX((columna + 0.5) * Carta.TAM_CARTA);
       carta.setLayoutY((fila + 0.5) * Carta.TAM_CARTA);
       //carta.setLayoutY(Carta.TAM_CARTA/2);
       this.getChildren().add(carta);
       
    }  
    
}


