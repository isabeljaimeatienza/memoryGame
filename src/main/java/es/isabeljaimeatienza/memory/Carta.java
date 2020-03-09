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
    
     static final short TAM_CARTA = 4; //tamaño de la ficha // para usar la ficha sin tener un objeto usamos static
        
        public Carta(int numCarta){ 
            
            //Cartas 
            Image[] carta = new Image[3];
            carta[0] = new javafx.scene.image.Image(getClass().getResourceAsStream("/images/Carta1.png"));
            carta[1]= new javafx.scene.image.Image(getClass().getResourceAsStream("/images/Carta2.jpg"));
            carta[2] = new javafx.scene.image.Image(getClass().getResourceAsStream("/images/Carta3.jpg"));
            
            //Sacar carta dependiendo del numero de la carta
//            ImageView imageView_Carta = null;  
              ImageView imageView_Carta = new ImageView(carta[numCarta]);
                 
            
            
           
            imageView_Carta.setX(0);
            imageView_Carta.setY(0); 
            this.getChildren().add(imageView_Carta);


            //Creación de rectángulo para carta
            javafx.scene.shape.Rectangle rectcarta = new javafx.scene.shape.Rectangle(90,130);
            rectcarta.setLayoutX(0); 
            rectcarta.setLayoutY(0);
        }
//            this.getChildren().add(rectcarta);
//           
            
//            ImageView imageView_jin = new ImageView(image2);  
//            imageView_jin.setX(0);
//            imageView_jin.setY(0); 


//            //Creación de rectángulo para carta
//            javafx.scene.shape.Rectangle rectcarta2 = new javafx.scene.shape.Rectangle(90,130);
//            rectcarta.setLayoutX(0); 
//            rectcarta.setLayoutY(0);
//
//            this.getChildren().add(rectcarta2);
//            this.getChildren().add();
//        
//     Image[] cartaArray = new Image[5];
        
//        public Carta(){
//            cartaArray[0] = new Image("images/cartaCorazon.png");
//            
//
//            cartaArray[1] = new Image("images/CartaV1.png");
//            
//
//            cartaArray[2] = new Image("images/johpe.jpg");
//            
//
//            cartaArray[3] = new Image("images/jimin.jpg");
//            
//
//            cartaArray[4] = new Image("images/jin.jpg");
//           
//
//            cartaArray[5] = new Image("images/rm.jpg", true);*/
//           
//
//        }
    }



