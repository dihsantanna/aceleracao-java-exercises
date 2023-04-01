package com.trybe.acc.java;

import java.util.Scanner;

/**
 * Classe Main.
 */

public class Main {
  /**
   * Pergunta o nome e as notas da pessoa e retorna a média.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String nome;
    System.out.println("Qual o seu nome?");
    nome = scan.next();

    double nota1;
    System.out.println("Entre com as notas das provas:\nAvaliação 1:");
    nota1 = Double.parseDouble(scan.next());

    double nota2;
    System.out.println("Avaliação 2:");
    nota2 = Double.parseDouble(scan.next());

    double nota3;
    System.out.println("Avaliação 3:");
    nota3 = Double.parseDouble(scan.next());

    double nota4;
    System.out.println("Avaliação 4:");
    nota4 = Double.parseDouble(scan.next());

    Nota nota = new Nota();
    double media = nota.calcularMedia(nota1, nota2, nota3, nota4);

    System.out.println("Olá, " + nome + ", sua média é " + media);

    scan.close();
  }

}
