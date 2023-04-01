package com.trybe.idadeemdias;

import java.util.Scanner;

/*
 * Classe Main.
 */

public class Main {
  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String nome;
    System.out.println("Qual é o seu nome?");
    nome = scan.next();

    int anos;
    System.out.println("Qual é sua idade em anos, meses e dias?\nanos:");
    anos = scan.nextInt();

    int meses;
    System.out.println("meses:");
    meses = scan.nextInt();

    int dias;
    System.out.println("dias:");
    dias = scan.nextInt();

    Pessoa pessoa = new Pessoa();
    int idadeEmDias = pessoa.calcularIdadeEmDias(anos, meses, dias);

    System.out.println("Olá " + nome + ", sua idade em dias é " + idadeEmDias);
    scan.close();
  }

}
