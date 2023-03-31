package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

/**
 * Class.
 */

public class SomaValores {
  /**
   * Method.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    int[] myArray = new int[3];

    for (int index = 0; index < 3; index++) {
      System.out.println("Digite um número:");
      myArray[index] = scan.nextInt();
    }
    scan.close();

    int soma = myArray[0] + myArray[2];

    System.out.println("A soma é: " + soma);

  }

}
