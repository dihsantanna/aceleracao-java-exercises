package com.trybe.idadeemdias;

/**
 * Classe Pessoa.
 */

public class Pessoa {
  /**
   * Metodo calcularIdadeEmDias.
   * Para simplificar, foi considerado que todos os
   * anos possuem 365 dias e todos os meses 30.
   */
  public int calcularIdadeEmDias(int anos, int meses, int dias) {
    int anosEmDias = anos * 365;
    int mesesEmDias = meses * 30;

    return anosEmDias + mesesEmDias + dias;
  }

}
