/**
 *
 * @author cadit
 */
package es.isabeljaimeatienza.memory;


import javafx.scene.Group;
import javafx.scene.image.ImageView;

public class Carta extends Group{
    
     static final short TAM_CARTA = 4; //tamaño de la ficha // para usar la ficha sin tener un objeto usamos static
        
        public Carta(int numJugador){ 
        javafx.scene.image.Image image1 = new javafx.scene.image.Image(getClass().getResourceAsStream("/images/cartaCorazon.png"));
        ImageView imageView_corazon = new ImageView(image1);  
        imageView_corazon.setX(0);
        imageView_corazon.setY(0); 
        
        
        //Creación de rectángulo para personaje
        javafx.scene.shape.Rectangle rectcarta = new javafx.scene.shape.Rectangle(90,130);
        rectcarta.setLayoutX(0); 
        rectcarta.setLayoutY(0);
    
        this.getChildren().add(rectcarta);
        this.getChildren().add(imageView_corazon);
      
    }
}

