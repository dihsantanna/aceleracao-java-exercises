package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

/**
 * Class.
 */

public class ConverteBytes {
  /**
   * Method.
   * 
   * @param args
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite um número:");
    byte valor = scan.nextByte();
    scan.close();

    // Seu código aqui

    // Imprime a saída no console. OBS: descomente a próxima linha
    // System.out.println(valor + " bytes correspondem a " + qtdBits + " bits");

  }
}
