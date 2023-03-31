package com.trybe.acc.java.numerospares;

/**
 * Classe NumerosPares.
 *
 */

public class NumerosPares {

  /**
   * Método para implementar o for que vai gerar os números de 4 a 20.
   *
   */
  public static void main(String[] args) {
    for (int num = 4; num <= 20; num++) {
      boolean ehPar = num % 2 == 0;
      if (ehPar) {
        imprime(num);
      }
    }
  }

  /**
   * Método para imprimir no console os números de 4 a 20.
   *
   */
  public static void imprime(int numero) {
    System.out.println(numero);
  }

}
