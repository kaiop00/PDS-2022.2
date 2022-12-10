package br.ufc.es.pds.bancoimobiliario.entities;

import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IRolarDados;

public class Dados implements IRolarDados {
  private static Dados uniqueInstance;

  private Dados() { }

  public static synchronized Dados getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new Dados();
    return uniqueInstance;
  }

  @Override
  public DadosRolados rolarDados() {
    int min = 1;
    int max = 6;
    int range = max - min + 1;
    int dado1 = (int)(Math.random() * range) + min;
    int dado2 = (int)(Math.random() * range) + min;
    return new DadosRolados(dado1, dado2);
  }
}
