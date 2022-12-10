package br.ufc.es.pds.bancoimobiliario.entities;

import br.ufc.es.pds.bancoimobiliario.controllers.ControllerContaCorrente;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IBanco;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IRealizarTransacao;

import java.util.ArrayList;
import java.util.List;

public class Banco implements IBanco, IRealizarTransacao {

  private final List<ContaCorrente> contas;
  private final List<Titulo> titulos;

  private final ControllerContaCorrente controllerContaCorrente;

  public Banco() {
    this.contas = new ArrayList<>();
    this.titulos = new ArrayList<>();
    this.controllerContaCorrente = ControllerContaCorrente.getInstance();
  }

  @Override
  public ContaCorrente adicionarContaCorrente(Cliente cliente) {
    ContaCorrente contaCorrente = this.controllerContaCorrente.criarContaCorrente(0, cliente);
    this.contas.add(contaCorrente);
    return contaCorrente;
  }

  @Override
  public void comprar(Titulo titulo) {

  }

  @Override
  public void vender(Titulo titulo) {

  }

  @Override
  public void pagar(Titulo titulo) {

  }
}
