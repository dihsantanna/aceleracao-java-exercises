package com.trybe.acc.java.estadosbrasileiros;

import java.util.Random;

/**
 * Classe EstadosBrasileiros.
 */

public class EstadosBrasileiros {
  /**
   * Método principal para a execuçao do código.
   *
   */
  public static void main(String[] args) {
    String[] siglas = { "CE", "SC", "AM" };
    int pos = new Random().nextInt(siglas.length);

    mostraNomeEstado(siglas[pos]);
  }

  static void mostraNomeEstado(String uf) {
    if (uf == "CE") {
      imprime("CEARA");
    } else if (uf == "SC") {
      imprime("SANTA CATARINA");
    } else {
      imprime("AMAZONAS");
    }
    ;
  }

  static void imprime(String nomeEstado) {
    System.out.println(nomeEstado);
  }
}
