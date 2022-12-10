package br.ufc.es.pds.bancoimobiliario.factories;

import br.ufc.es.pds.bancoimobiliario.entities.ContaCorrente;
import br.ufc.es.pds.bancoimobiliario.entities.Jogador;
import br.ufc.es.pds.bancoimobiliario.entities.Peao;

public class FabricaJogador {

  private static FabricaJogador uniqueInstance;

  private FabricaJogador() { }

  public static synchronized FabricaJogador getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new FabricaJogador();
    return uniqueInstance;
  }

  public Jogador criarJogador(int ID, Peao peao, ContaCorrente contaCorrente, String nome) {
    Jogador jogador = new Jogador(ID, peao, contaCorrente, nome);
    return jogador;
  }
}
