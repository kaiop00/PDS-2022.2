package br.ufc.es.pds.bancoimobiliario.entities.interfaces;

import br.ufc.es.pds.bancoimobiliario.entities.Jogador;

public interface IJogo {
  void jogar();
  void sair();
  void status();
  boolean adicionarJogador(Jogador jogador);
}
