package br.ufc.es.pds.bancoimobiliario.entities;

import br.ufc.es.pds.bancoimobiliario.entities.interfaces.ICarta;
import br.ufc.es.pds.bancoimobiliario.entities.interfaces.IPosicaoComCarta;

public class Terreno implements IPosicaoComCarta {
  private Integer ID;
  private Integer casas;
  private Boolean temHotel;
  private ICarta carta;

  public Terreno(int ID, ICarta carta) {
    this.ID = ID;
    this.carta = carta;
    this.casas = 0;
    this.temHotel = false;
  }

  public boolean adicionarCasa() {
    if (this.casas < 4) {
      this.casas++;
      return true;
    }
    return false;
  }

  public boolean venderrCasa() {
    if (this.casas > 0) {
      this.casas--;
      return true;
    }
    return false;
  }

  public boolean adicionarHotel() {
    if (this.casas == 4) {
      this.temHotel = true;
      this.casas = 0;
      return true;
    }
    return false;
  }

  public boolean venderHotel() {
    if (this.temHotel) {
      this.temHotel = false;
      this.casas = 4;
      return true;
    }
    return false;
  }

  public int quantidadeDeCasas() {
    return casas;
  }

  public boolean temHotel() {
    return temHotel;
  }

  @Override
  public ICarta getCarta() {
    return this.carta;
  }
}