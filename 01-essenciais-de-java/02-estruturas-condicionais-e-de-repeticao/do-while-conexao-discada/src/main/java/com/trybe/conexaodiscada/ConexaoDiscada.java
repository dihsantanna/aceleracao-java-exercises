package com.trybe.conexaodiscada;

import java.util.Random;

/**
 * Classe ConexaoDiscada.
 *
 */

public class ConexaoDiscada {
  /**
   * Método principal.
   *
   */
  public static void main(String[] args) {
    short tentativa = 1;
    boolean conexao;
    do {
      conexao = conectou();
      if (conexao) {
        System.out.println("Conectado após " + tentativa + " tentativas!");
        break;
      }
      tentativa++;
    } while (tentativa <= 3);

    if (!conexao) {
      System.out.println("Não Conectou!");
    }
  }

  static boolean conectou() {
    return conexaoDiscada.verdadeiroOuFalso();
  }

  static ConexaoDiscada conexaoDiscada = new ConexaoDiscada();

  boolean verdadeiroOuFalso() {
    return new Random().nextInt(2) == 1;
  }

}
