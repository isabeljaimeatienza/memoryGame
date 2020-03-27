/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.isabeljaimeatienza.memory;

import java.util.Random;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;

/**
 *
 * @author cadit
 */
public class Tablero extends GridPane {

    static final int ROWS = 4;
    static final int COLUMNS = 6;
    Logica logica = new Logica();

    public Tablero() {

        //Setting size for the pane  
        for (int i = 0; i < COLUMNS; i++) {
            ColumnConstraints column = new ColumnConstraints(Carta.TAM_CARTA * 1.34);
            this.getColumnConstraints().add(column);
        }

        for (int i = 0; i < ROWS; i++) {
            RowConstraints row = new RowConstraints(Carta.TAM_CARTA * 2);
            this.getRowConstraints().add(row);
        }

        this.setStyle("-fx-background-color: WHITE ;-fx-padding: 200 ;-fx-insets-colspan:23; -fx-insets-background: BLUE; -fx-grid-lines-visible: true");

        // Detectar clic en ratÃ³n (pulsado y soltado)
        this.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                // Insertar aquÃ­ el cÃ³digo a ejecutar cuando se haga clic en el ratÃ³n
                System.out.println("Mouse clicked X , Y:  "
                        + mouseEvent.getX() + " : " + mouseEvent.getY());
                int clicX = (int) mouseEvent.getX();
                logica.mostrarConsola();
                int columna = clicX / Carta.TAM_CARTA;
//                    System.out.println("Columna: " + columna);

                double numeroCarta = 0;
                int indice = 0;
                Random r = new Random();
                int rC = r.nextInt(11);
                int rO = r.nextInt(11);
                int cartaOrigen = rO;
                int cartaDestino = rC;
                cartaOrigen = rO;
                cartaDestino = rC;
                rC = cartaOrigen;
                rO = cartaDestino;
                for (int fi = 0; fi < ROWS; fi++) {
                    for (int co = 0; co < COLUMNS; co++) {
//                           System.out.println("Columna:"+ co+"Fila:"+ fi+"Carta:" + (int)numeroCarta); 

//                        borrarCarta(fi, co, indice); //redondeo hacia abajo con math.floor
                        // Consulta el valor de matriz y coloca la carta que se encuentre en ella   
                        colocarCarta(fi, co, logica.cuadricula[fi][co]);

//                           System.out.println("indice:"+indice+"numCarta:"+numeroCarta);
                    }
                }//Columna-fila-carta

            }
        });

    }

    private void colocarCarta(int fila, int columna, int numeroCarta) {

//       System.out.println("co:"+columna+"fi:"+fila+"numCarta:"+numeroCarta);
        Carta carta = new Carta(numeroCarta); // numCarta te dirá¡ quien da el click, viene en el parametro de este metodo el anterior da igual

        carta.setLayoutY(Carta.TAM_CARTA / 2);

        this.add(carta, columna, fila); // para quitar carta usar remove en vez de add
        this.setAlignment(Pos.CENTER);
    }

    // Crear método que me coja la carta que hay en una determinada posición (1,1) que se pase por parámetro
    // Guardar en variable el numero de carta que le corresponde    
//       
    public void sacarCarta(int indice) { // la carta la paso como char porque sino da error
//        

        indice = 0;

        for (int fi = 0; fi < ROWS; fi++) {
            for (int co = 0; co < COLUMNS; co++) {
                indice = 6 * fi + co;
//                           System.out.println("Columna:"+ co+"Fila:"+ fi+"indice:"+indice);
            }
        }

        this.getChildren().get(indice);

    }
//
//    private void borrarCarta() {
//
////       System.out.println("co:"+columna+"fi:"+fila+"numCarta:"+numeroCarta);
//        indice = 0;
//
//        for (int fi = 0; fi < ROWS; fi++) {
//            for (int co = 0; co < COLUMNS; co++) {
//                indice = 6 * fi + co;
////                           System.out.println("Columna:"+ co+"Fila:"+ fi+"indice:"+indice);
//            }
//        }
//
//        this.getChildren().get(indice);
//
//        this.getChildren().remove(indice); // para quitar carta usar remove en vez de add
//        this.setAlignment(Pos.CENTER);
//    }
}
