/**
 *
 * @author cadit
 */
package es.isabeljaimeatienza.memory;


import java.lang.reflect.Array;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Carta extends Group{
    
     static final short TAM_CARTA = 70; //tamaño de la carta// para usar la ficha sin tener un objeto usamos static
        
        public Carta(int numCarta){ 
            
            //Cartas 
            Image[] carta = new Image[7];
            carta[0] = new javafx.scene.image.Image(getClass().getResourceAsStream("/images/Carta1.png"));
            carta[1]= new javafx.scene.image.Image(getClass().getResourceAsStream("/images/Carta2.jpg"));
            carta[2] = new javafx.scene.image.Image(getClass().getResourceAsStream("/images/Carta3.jpg"));
            carta[3] = new javafx.scene.image.Image(getClass().getResourceAsStream("/images/Carta4.jpg"));
            carta[4] = new javafx.scene.image.Image(getClass().getResourceAsStream("/images/Carta5.jpg"));
            carta[5] = new javafx.scene.image.Image(getClass().getResourceAsStream("/images/Carta6.jpg"));
            carta[6] = new javafx.scene.image.Image(getClass().getResourceAsStream("/images/Carta7.jpg"));
            
            //Sacar carta dependiendo del numero de la carta
//            ImageView imageView_Carta = null;  
              ImageView imageView_Carta = new ImageView(carta[numCarta]);
              imageView_Carta.setFitWidth(TAM_CARTA*2/1.5);
              imageView_Carta.setFitHeight(TAM_CARTA*2);
            
            imageView_Carta.setX(0);
            imageView_Carta.setY(0); 
            this.getChildren().add(imageView_Carta);


            //Creación de rectángulo para carta
            javafx.scene.shape.Rectangle rectcarta = new javafx.scene.shape.Rectangle(90,130);
            rectcarta.setLayoutX(0); 
            rectcarta.setLayoutY(0);
        }

    }



