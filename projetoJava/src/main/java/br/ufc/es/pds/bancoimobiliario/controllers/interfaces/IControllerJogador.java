package br.ufc.es.pds.bancoimobiliario.controllers.interfaces;

import br.ufc.es.pds.bancoimobiliario.entities.ContaCorrente;
import br.ufc.es.pds.bancoimobiliario.entities.Jogador;
import br.ufc.es.pds.bancoimobiliario.entities.Peao;

public interface IControllerJogador {
  Jogador criarJogador(int ID, Peao peao, ContaCorrente contaCorrente, String nome);
}
