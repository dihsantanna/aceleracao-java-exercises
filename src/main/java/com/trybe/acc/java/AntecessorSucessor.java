package com.trybe.acc.java;

import java.util.Scanner;

/*
 * Class.
*/

public class AntecessorSucessor {
  /*
   * Method
  */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    StringBuilder stringBuilder = new StringBuilder();

	System.out.println("Digite um número:");
	int numero = scan.nextInt();
	scan.close();

	int antecessor = numero - 1;

	int sucessor = numero + 1;
	
	String message = stringBuilder.append("O número ")
			.append(numero)
			.append(" tem ")
			.append(antecessor)
			.append(" como seu antecessor e ")
			.append(sucessor)
			.append(" como seu sucessor.").toString();

	System.out.println(message);
  }
}
