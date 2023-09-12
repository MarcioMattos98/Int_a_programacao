/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_matriz;

import java.util.Random;

/**
 *
 * @author Márcio
 */
public class Questao7_matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random gerador = new Random();
        int matriz[][] = new int[5][5];
        int matrizt[][] = new int[5][5];
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= gerador.nextInt(21);
            }
        }
        System.out.println();
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"  - ");
            }
            System.out.println();
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizt[j][i] = matriz[i][j];
            }
        }
        System.out.println();
        System.out.println("Matriz transposta: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matrizt[i][j]+"  - ");
            }
            System.out.println();
        }
    }
    
}
