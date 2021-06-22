package src.tablero;

public class Celda {

    private boolean esColor; 
private Ficha ficha;
private char celda = (char) 178;
private char celdaColor = (char) 177;

    public Celda(boolean esColor){
       this.esColor = esColor;
       this.ficha = null;
    }
    public String pintarCelda( int linea) {
   String res = "";
  if(esColor){

    res = celdaColor+celdaColor+celdaColor+celdaColor+"";
  }
  else{
    res = celda+celda+celda+celda+"";
  }
   return res;
    }
}