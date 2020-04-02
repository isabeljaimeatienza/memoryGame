/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.isabeljaimeatienza.memory;

import java.util.Optional;
import java.util.Random;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import static javafx.geometry.Pos.CENTER;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

/**
 *
 * @author cadit
 */
public class Tablero extends GridPane {

    static final int ROWS = 4;
    static final int COLUMNS = 6;
    Logica logica = new Logica();
    int contador = 0;
    int contadorTotal = 0;
    int cartaLevantada = 0;
    Carta primeraCarta;

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

        this.setStyle("-fx-background-color: WHITE;-fx-insets-colspan:23; -fx-Vgap=20; -fx-grid-lines-visible: true");
        this.setAlignment(CENTER);
        this.setVgap(10);
        this.setHgap(10);
        this.setStyle("-fx-background-image: url('/images/fondo.jpg');");
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("¿Comenzamos?");
        alert.setHeaderText("¿Desea comenzar una nueva partida?");
        alert.setContentText("Continuar");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            // ... user chose OK

            // Detectar clic en ratÃ³n (pulsado y soltado)
//        this.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
            // Insertar aquÃ­ el cÃ³digo a ejecutar cuando se haga clic en el ratÃ³n
//                System.out.println("Mouse clicked X , Y:  "
//                        + mouseEvent.getX() + " : " + mouseEvent.getY());
//                int clicX = (int) mouseEvent.getX();
            logica.mostrarConsola();
//      
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
//                }//Columna-fila-carta

//            }
            }
        } else {
            // ... user chose CANCEL or closed the dialog
        }
    }

    private void colocarCarta(int fila, int columna, int numeroCarta) {

        //contador antes de esto y aqui aumentar de 1 en 1
//       System.out.println("co:"+columna+"fi:"+fila+"numCarta:"+numeroCarta);
        Carta carta = new Carta(numeroCarta); // numCarta te dirá¡ quien da el click, viene en el parametro de este metodo el anterior da igual
        carta.CambiarImagenCarta(Carta.REVERS);// como es para TODAS las cartas sería más correcto hacer revers static
        carta.setLayoutY(Carta.TAM_CARTA / 2);
        this.add(carta, columna, fila); // para quitar carta usar remove en vez de add
        this.setAlignment(Pos.CENTER);

        carta.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
//              
//                 Insertar aquÃ­ el cÃ³digo a ejecutar cuando se haga clic en el ratÃ³n
                contador++;
//                System.out.println("NumCartas = " + contador);
//                System.out.println("numeroCarta:" + numeroCarta);
                carta.CambiarImagenCarta(numeroCarta);

                if (contador == 1) {
                    cartaLevantada = numeroCarta;
                    primeraCarta = carta;

                }
                if (contador == 2) {
                    if (cartaLevantada == numeroCarta) {
                        System.out.println("correcto!!!");
                        contadorTotal++;
                        //contadorTotal compara parejas se le suma 1
                    } else {
                        System.out.println("error!");
                        Alert alert = new Alert(AlertType.INFORMATION);
                        alert.setTitle("UPS!");
                        alert.setHeaderText(null);
                        alert.setContentText("Error!! Intentalo de nuevo");
                        alert.showAndWait();
                        carta.CambiarImagenCarta(Carta.REVERS);
                        primeraCarta.CambiarImagenCarta(Carta.REVERS);

                    }
                    contador = 0;
                    if(contadorTotal==12){
                        Alert alert = new Alert(AlertType.INFORMATION);
                        alert.setTitle("You WIN!");
                        alert.setHeaderText(null);
                        alert.setContentText("¡¡¡Has ganado!!!");
                        alert.showAndWait();
                    }
                }

            }
            //contador para ir viendo las cartas a las que le doy la vuelta(si contadorTotal= numerocartas total fin partida)
            //contador que inicialmente valga 0 y que aumente a medida que se haga click en determinada carta
            //si contador ha llegado a 2 compruebe pareja (inicialmente hacer con sout
            //variable para cartas que se levanten; la primera carta levantada es la que comparamos
            // si contador es 1 guardar numero carta levantada 
            //variable para guardar objeto carta
//               

            // Crear método que me coja la carta que hay en una determinada posición (1,1) que se pase por parámetro
            // Guardar en variable el numero de carta que le corresponde    
            public void sacarCarta(int indice) { // la carta la paso como char porque sino da error
//        

                indice = 0;

                for (int fi = 0; fi < ROWS; fi++) {
                    for (int co = 0; co < COLUMNS; co++) {
                        indice = 6 * fi + co;
//                           System.out.println("Columna:"+ co+"Fila:"+ fi+"indice:"+indice);
                    }
                }

//                this.getChildren().get(indice);
            }
        });
    }
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
//        }
//    }
//}
