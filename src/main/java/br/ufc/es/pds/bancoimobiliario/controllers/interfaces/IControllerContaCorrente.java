package br.ufc.es.pds.bancoimobiliario.controllers.interfaces;

import br.ufc.es.pds.bancoimobiliario.entities.Cliente;
import br.ufc.es.pds.bancoimobiliario.entities.ContaCorrente;

public interface IControllerContaCorrente {
  ContaCorrente criarContaCorrente(double saldo, Cliente cliente);
}
