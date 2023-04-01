package com.trybe.idadeemdias;

import java.util.Scanner;

/**
 * Classe Main.
 */

public class Main {
  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Qual é o seu nome?");

    String nome = scan.next();

    System.out.println("Qual é sua idade em anos, meses e dias?");
    System.out.println("anos:");

    String anos = scan.next();

    System.out.println("meses:");

    String meses = scan.next();

    System.out.println("dias:");

    String dias = scan.next();

    scan.close();

    Pessoa pessoa = new Pessoa();
    int idadeEmDias = pessoa.calcularIdadeEmDias(
        Integer.parseInt(anos),
        Integer.parseInt(meses),
        Integer.parseInt(dias));

    System.out.println("Olá " + nome + ", sua idade em dias é " + idadeEmDias);
  }

}
