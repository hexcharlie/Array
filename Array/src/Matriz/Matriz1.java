package Matriz;

import java.util.Scanner;

// Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
// Todos os elementos da Diagonal Principal
// Todos os elementos da Diagonal Secundária
// A Soma de todos os elementos da Diagonal Principal
// A Soma de todos os elementos da Diagonal Secundária


public class Matriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
        
        int[][] matriz = new int[3][3];
        
        
        System.out.println("\nDigite os números da matriz 3x3:");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                matriz[l][c] = leia.nextInt();
            }
        }
        
        System.out.println("\nNúmeros da Diagonal Principal:");
        for (int l = 0; l < 3; l++) {
            System.out.print(matriz[l][l] + " ");
        }
        System.out.println();
        
        System.out.println("\nNúmeros da Diagonal Secundária:");
        for (int l = 0; l < 3; l++) {
            System.out.print(matriz[l][2 - l] + " ");
        }
        System.out.println();
        
        int somaDiagonalPrincipal = 0;
        int somaDiagonalSecundaria = 0;
        
        for (int l = 0; l < 3; l++) {
            somaDiagonalPrincipal += matriz[l][l];
            somaDiagonalSecundaria += matriz[l][2 - l];
        }
        
        System.out.println("\nSoma da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("\nSoma da Diagonal Secundária: " + somaDiagonalSecundaria);
        
        
    }


	}


