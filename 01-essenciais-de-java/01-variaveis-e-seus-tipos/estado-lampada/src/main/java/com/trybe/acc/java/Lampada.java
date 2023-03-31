package com.trybe.acc.java;

/**
 * Class.
 */

public class Lampada {
  /**
   * Attribute.
   */
  private static boolean state = false;

  /**
   * Method.
   */
  public static void main(String[] args) {
    boolean isOn = state = !state;
    System.out.println("A lampada ligada: " + isOn + "!");

  }

}
