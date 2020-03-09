/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.isabeljaimeatienza.memory;

import java.util.Random;
import javafx.scene.Group;

/**
 *
 * @author cadit
 */
public class ModoJuego{
        Random aleatorioY = new Random();
        Random aleatorioX = new Random();
        int cartaAleatoriaY= aleatorioY.nextInt(5);
        int cartaAleatoriaX= aleatorioX.nextInt(5);
//        Carta carta = new Carta(Tablero.numCarta);
        
        //Tablero tablero= new Tablero();
        char[][] cuadricula = new char[6][7];
        Group[][] carta =  new Group[cartaAleatoriaY][cartaAleatoriaX];
        
        
        public ModoJuego (){
            for(int f=0; f<6; f++){
                for(int c=0; c<7; c++){
                    cuadricula[f][c] = '.';
                }
        
            }
        }
    
    
   
    
}