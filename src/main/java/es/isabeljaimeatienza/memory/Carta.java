/**
 *
 * @author cadit
 */
package es.isabeljaimeatienza.memory;


import java.lang.reflect.Array;
import javafx.scene.Group;
import javafx.scene.image.Image;

public class Carta extends Group{
    
     static final short TAM_CARTA = 5; //tamaño de la ficha // para usar la ficha sin tener un objeto usamos static
        
       // public Carta(int numJugador){ 
        /*javafx.scene.image.Image image1 = new javafx.scene.image.Image(getClass().getResourceAsStream("/images/cartaCorazon.png"));
        ImageView imageView_corazon = new ImageView(image1);  
        imageView_corazon.setX(0);
        imageView_corazon.setY(0); 
        
        
        //Creación de rectángulo para carta
        javafx.scene.shape.Rectangle rectcarta = new javafx.scene.shape.Rectangle(90,130);
        rectcarta.setLayoutX(0); 
        rectcarta.setLayoutY(0);
    
        this.getChildren().add(rectcarta);
        this.getChildren().add(imageView_corazon);*/
       
        
        Image[] cartaArray = new Image[5];
        
        public Carta(){
            cartaArray[0] = new Image();
            cartaArray[0].src = 'images/cartaCorazon.png';

            cartaArray[1] = new Image();
            cartaArray[1].src = 'images/CartaV1.png';

            cartaArray[2] = new Image();
            cartaArray[2].src = 'images/johpe.jpg';

            cartaArray[3] = new Image();
            cartaArray[3].src = 'images/jimin.jpg';

            cartaArray[4] = new Image();
            cartaArray[4].src = 'images/jin.jpg';

            cartaArray[5] = new Image("/rm.jpg", true);
            cartaArray[5]. = "images/rm.jpg";

        }
    }


