/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.isabeljaimeatienza.memory;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;

/**
 *
 * @author cadit
 */
public class Tablero extends GridPane{
  
    
    static final int rows = 3;
    static final int columns = 5;
    Logica logica = new Logica();
    
    
    public Tablero(){
   
 
       
 
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
       
        
        

        
    
               // Detectar clic en ratÃ³n (pulsado y soltado)
           this.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    // Insertar aquÃ­ el cÃ³digo a ejecutar cuando se haga clic en el ratÃ³n
                    System.out.println("Mouse clicked X , Y:  " + 
                        mouseEvent.getX() + " : " + mouseEvent.getY());
                    int clicX = (int) mouseEvent.getX();
                    int columna = clicX / Carta.TAM_CARTA;
                    System.out.println("Columna: " + columna);
                    
                    double numeroCarta = 0;
                    int indice = 0;
                    for (int fi=0; fi<=rows; fi++){
                        for(int co=0; co<=columns; co++){
//                           System.out.println("Columna:"+ co+"Fila:"+ fi+"Carta:" + (int)numeroCarta); 
                           sacarCarta(co,fi,indice);
                           indice=indice+1;
                           colocarCarta(co,fi,(int) Math.floor(numeroCarta)); // redondeo hacia abajo con math.floor
                           numeroCarta = numeroCarta+0.5;
//                         
                              
                        }
                    }//Columna-fila-carta
                        
                   
                }
            });
            
          
    }
    
   private void colocarCarta(int columna, int fila, int numeroCarta){
       
       Carta carta = new Carta(numeroCarta); // numCarta te dirá¡ quien da el click, viene en el parametro de este metodo el anterior da igual
       int filaColocar;
       filaColocar = logica.getFilaColocar(columna);
       logica.mostrarConsola();
//       logica.colocarCarta(columna,filaColocar, numeroCarta);
       
//       this.sacarCarta(numeroCarta,filaColocar,int numecarta);
//       colocarCarta(filaColocar,columna,'1');
       carta.setLayoutY(Carta.TAM_CARTA/2);
       this.add(carta,columna,fila);
        }
       
    // Crear método que me coja la carta que hay en una determinada posición (1,1) que se pase por parámetro
    // Guardar en variable el numero de carta que le corresponde    
//       
        public void sacarCarta(int filaColocar, int columna,int indi){ // la carta la paso como char porque sino da error
//        
        Tablero carta = null;
        int indice=0;
        
        for (int fi=0; fi<=rows; fi++){
                        for(int co=0; co<=columns; co++){
                        
                           System.out.println("Columna:"+ co+"Fila:"+ fi);
                                   }           
                  }
       
        this.getChildren().get(0); // y seria fila x seria columna
        }
    }  
   

    
        
        
    
    



