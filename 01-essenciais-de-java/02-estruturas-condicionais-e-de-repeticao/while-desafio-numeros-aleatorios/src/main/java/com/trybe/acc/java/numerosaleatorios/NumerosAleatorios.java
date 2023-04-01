package com.trybe.acc.java.numerosaleatorios;

import java.util.Random;

/**
 * Classe NumerosAleatorios.
 */

public class NumerosAleatorios {
  /**
   * Método principal para a execuçao do código. 
   */
  public static void main(String[] args) {
    int numero = numeroAleatorio();

    while (numero != 4) {
      imprime(numero);
      numero = numeroAleatorio();
    }

    imprime(numero);
  }

  static void imprime(int numero) {
    System.out.println(numero);
  }

  static int numeroAleatorio() {
    return numerosAleatorios.entreUmECinco();
  }

  static NumerosAleatorios numerosAleatorios = new NumerosAleatorios();

  int entreUmECinco() {
    return new Random().nextInt(5) + 1;
  }
}
