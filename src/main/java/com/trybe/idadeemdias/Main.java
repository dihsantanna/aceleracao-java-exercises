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
    System.out.println("Qual é o seu nome?");
    String nomeDeUsuario = scan.next();
    System.out.println("Qual é sua idade em anos, meses e dias?\nanos:");
    int anosDeIdade = scan.nextInt();
    System.out.println("meses:");
    int mesesDaIdade = scan.nextInt();
    System.out.println("dias:");
    int diasDaIdade = scan.nextInt();
    scan.close();
    Pessoa pessoa = new Pessoa();
    int idadeEmDias = pessoa.calcularIdadeEmDias(anosDeIdade, mesesDaIdade, diasDaIdade);
    System.out.println("Olá " + nomeDeUsuario + ", sua idade em dias é " + idadeEmDias);
  }

}
