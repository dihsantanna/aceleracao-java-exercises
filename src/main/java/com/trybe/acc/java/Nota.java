package com.trybe.acc.java;

/**
 * Classe Nota.
 */

public class Nota {
  /**
   * Calcula a média de 4 notas.
   */
  public double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
    double total = nota1 + nota2 + nota3 + nota4;

    return total / 4;
  }
}
