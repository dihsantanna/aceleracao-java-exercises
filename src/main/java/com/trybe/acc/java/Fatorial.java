package com.trybe.acc.java;

/**
 * Class.
 */

public class Fatorial {
  /**
   * Method.
   */
  public static void main(String[] args) {
    long x = 18;
    long f18 = x;

    while (x > 1) {
      x--;
      f18 = f18 * x;
    }

    System.out.println("O fatorial de 18 é igual a " + f18);
  }

}
