package br.ufc.es.pds.bancoimobiliario.controllers.interfaces;

import br.ufc.es.pds.bancoimobiliario.entities.Peao;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicao;
import br.ufc.es.pds.bancoimobiliario.entities.enums.CorPeao;

public interface IControllerPeao {
  Peao criarPeao(CorPeao cor, IPosicao posicao);
}
