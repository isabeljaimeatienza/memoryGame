/**
 *
 * @author cadit
 */
package es.isabeljaimeatienza.memory;

import java.lang.reflect.Array;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Carta extends Group {

    int numCarta = 0;
    static final short TAM_CARTA = 70; //tamaño de la carta// para usar la ficha sin tener un objeto usamos static
    static final int REVERS = -1; // CAMBIAR A MAYUSCULAS REVERS POR SER CONSTANTE
    ImageView imageView_Carta;
    Image[] carta;

    public Carta(int numeroCarta) {
        numCarta = numeroCarta;
        //Cartas 
        carta = new Image[12];
        for (int card = 0; card < 12; card++) {
            carta[card] = new javafx.scene.image.Image(getClass().getResourceAsStream("/images/Carta" + card + ".jpg"));

        }

//      Métodos que permita cambiar la imagen de la carta (para reverso y carta/tapar y destapar) 
        // Tapar carta/destapar carta 
        //Sacar carta dependiendo del numero de la carta
//            ImageView imageView_Carta = null;  
        imageView_Carta = new ImageView(carta[numCarta]); //debe de cambiar el imageview a reverso.jpg
        imageView_Carta.setFitWidth(TAM_CARTA * 2 / 1.5);
        imageView_Carta.setFitHeight(TAM_CARTA * 2);
        
        imageView_Carta.setX(0);
        imageView_Carta.setY(0); 
        this.getChildren().add(imageView_Carta);

        //Creación de rectángulo para carta
        javafx.scene.shape.Rectangle rectcarta = new javafx.scene.shape.Rectangle(90, 130);
        rectcarta.setLayoutX(0);
        rectcarta.setLayoutY(0);

    }

    public void CambiarImagenCarta(int numeroCarta) {
        javafx.scene.image.Image rever = new javafx.scene.image.Image(getClass().getResourceAsStream("/images/reverso.jpg"));
        if(numeroCarta==REVERS){
          imageView_Carta.setImage(rever);  
        }
        else{
            imageView_Carta.setImage(carta[numCarta]);
        }
        
        
        
    }

}
