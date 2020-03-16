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
            Image[] carta = new Image[12];
                for(int card = 0; card<12; card++){
                    carta[card] = new javafx.scene.image.Image(getClass().getResourceAsStream("/images/Carta" + card +".jpg"));
                        
                    }
            
//           
            
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

