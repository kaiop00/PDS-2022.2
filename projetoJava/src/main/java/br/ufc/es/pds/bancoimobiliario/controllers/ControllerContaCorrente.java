package br.ufc.es.pds.bancoimobiliario.controllers;

import br.ufc.es.pds.bancoimobiliario.controllers.interfaces.IControllerContaCorrente;
import br.ufc.es.pds.bancoimobiliario.entities.Cliente;
import br.ufc.es.pds.bancoimobiliario.entities.ContaCorrente;
import br.ufc.es.pds.bancoimobiliario.factories.FabricaContaCorrente;

public class ControllerContaCorrente implements IControllerContaCorrente {

  private static ControllerContaCorrente uniqueInstance;

  private final FabricaContaCorrente fabricaContaCorrente;

  private ControllerContaCorrente() {
    this.fabricaContaCorrente = FabricaContaCorrente.getInstance();
  }

  public static synchronized ControllerContaCorrente getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new ControllerContaCorrente();
    return uniqueInstance;
  }

  @Override
  public ContaCorrente criarContaCorrente(double saldo, Cliente cliente) {
    return this.fabricaContaCorrente.criarContaCorrente(saldo, cliente);  }
}
