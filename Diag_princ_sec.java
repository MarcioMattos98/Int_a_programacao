
package lista_matriz;

import java.util.Random;


public class Questao4_matriz {

    
    public static void main(String[] args) {
        Random gerador = new Random();
        int matriz[][] = new int[5][5];
        int matrizt[][] = new int[5][5];
        int diag_prin[] = new int[5];
        int diag_sec[] = new int [5];
        System.out.println("Dados da Matriz!");
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
                diag_prin[i]= matriz[i][i];
                diag_sec[i]= matriz[i][4-i];
                    
        }
        
        
        
        System.out.println("Diagonal principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(diag_prin[i]+" ");
              
        }
        System.out.println();
        System.out.println("Diagonal secundaria: : ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(diag_sec[i]+" ");
              
        }
        
    }
    
}
