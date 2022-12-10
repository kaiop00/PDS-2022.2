module br.ufc.es.pds.bancoimobiliario {
  requires javafx.controls;
  requires javafx.fxml;

  opens br.ufc.es.pds.bancoimobiliario.views to javafx.fxml;
  opens br.ufc.es.pds.bancoimobiliario to javafx.fxml;
  exports br.ufc.es.pds.bancoimobiliario;
}