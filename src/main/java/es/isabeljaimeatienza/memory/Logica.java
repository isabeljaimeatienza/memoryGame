/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.isabeljaimeatienza.memory;

import static es.isabeljaimeatienza.memory.Tablero.COLUMNS;
import static es.isabeljaimeatienza.memory.Tablero.ROWS;
import java.util.Random;

/**
 *
 * @author cadit
 */
public class Logica {

    static final int CARTA = 0;
    int numeroCarta = 0;

    int[][] cuadricula = new int[ROWS][COLUMNS];
// con dos corchetes quiere decir en 2 dimensiones, 
    //por tanto al querer una tabla ponemos 2, [6][] es 6 por 4. Se le llama a esto array o matriz

    // Metodo constructor que llamaremos como la clase
    //Aqui empezaremos la partida
    public Logica() {

        double numeroCarta = 0;       
        for (int f = 0; f < ROWS; f++) {
            for (int c = 0; c < COLUMNS; c++) {

//                colocarCarta(c, f, ((int) Math.floor(numeroCarta))); // redondeo hacia abajo con math.floor
                cuadricula[f][c] = ((int) Math.floor(numeroCarta));
                numeroCarta = numeroCarta + 0.5;

            }

        }

        desordenarCartas();

    }

    public void mostrarConsola() {
        for (int f = 0; f < ROWS; f++) {
            for (int c = 0; c < COLUMNS; c++) {
                System.out.print("|" + cuadricula[f][c]); // mostraría en consola los numeros de carta en su posición
            }
            System.out.println("");

        }

    }

    public void colocarCarta(int fila, int columna, int carta) { //esta carta es la que guardo en parámetro
//    System.out.println("Colocando carta en matriz: "+fila+","+columna+","+numeroCarta);
//    cuadricula[fila][columna] = carta;
    }

    public void desordenarCartas() { // la carta la paso como char porque sino da error
        //Intercambiamos la carta de la posición (0,1) con la (2,3)

        Random r = new Random();
        for (int fi = 0; fi < ROWS; fi++) {
            for (int co = 0; co < COLUMNS; co++) {
                int rC = r.nextInt(COLUMNS);
                int rF = r.nextInt(ROWS);
                int cartaOrigen = cuadricula[fi][co];
                int cartaDestino = cuadricula[rF][rC];
                cuadricula[fi][co] = cartaDestino;
                cuadricula[rF][rC] = cartaOrigen;
                
         // En cada vuelta del bucle deberá de cambiar rF y rC. 

//                            indice= 6*fi+co;
//                           System.out.println("Columna:"+ co+"Fila:"+ fi+"indice:"+indice);
            }
        }

    }

}
