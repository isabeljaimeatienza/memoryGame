/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.isabeljaimeatienza.memory;

/**
 *
 * @author cadit
 */
public class Logica {
   
    char[][] cuadricula = new char[4][6];
// con dos corchetes quiere decir en 2 dimensiones, 
    //por tanto al querer una tabla ponemos 2, [6][] es 6 por 4. Se le llama a esto array o matriz
    
   // Metodo constructor que llamaremos como la clase
    //Aqui empezaremos la partida
    public Logica (){
        for(int f=0; f<Tablero.rows; f++){
            for(int c=0; c<Tablero.columns; c++){
                cuadricula[f][c] ='.';
            }
        
        }
    }
    
    public void mostrarConsola(){
        for(int f=0; f<Tablero.rows; f++){
            for(int c=0; c<Tablero.columns; c++){
//                System.out.print(cuadricula[f][c]); // mostraría en consola los puntitos
            }
//            System.out.println("");
         
        }
        
    } 
        public int getFilaColocar(int columnaColocar){
        int filaColocar = -1; // -1  nos referimos que no se pueda colocar
        // Mientras no hayamos llegado al final y la fila de abajo esté vacía
        while(filaColocar<Tablero.rows && cuadricula[filaColocar+1][columnaColocar]=='.'){
            filaColocar++;
        }
//        System.out.println(filaColocar);
//          System.out.println(filaColocar);
        return filaColocar;
            
    }
    

    
}
