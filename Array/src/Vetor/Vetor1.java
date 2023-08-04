package Vetor;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner leia = new Scanner(System.in);
	        int[] vetor = { 100, 57, 645, 912, 9, 34, 56, 15, 17, 63 };

	        System.out.print("Digite um número para pesquisar: ");
	        int numeroPesquisa = leia.nextInt();

	        int posicao = -1;

	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == numeroPesquisa) {
	                posicao = i;
	                break;
	            }
	        }

	        if (posicao != -1) {
	            System.out.println("\nO número " + numeroPesquisa + " foi encontrado na posição " + posicao + " do vetor.");
	        } else {
	            System.out.println("\nNão foi encontrado!!!! :(");
	        }

	       
	    }
	
	}

