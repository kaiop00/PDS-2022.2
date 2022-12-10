package br.ufc.es.pds.bancoimobiliario.entities;

public class DadosRolados {
  private Integer dado1;
  private Integer dado2;

  public DadosRolados(int dado1, int dado2) {
    this.dado1 = dado1;
    this.dado2 = dado2;
  }

  public boolean valoresIguais() {
    return this.dado1.intValue() == this.dado2.intValue();
  }

  public int getDado1() {
    return dado1;
  }

  public int getDado2() {
    return dado2;
  }
}
