package src.principal;

import src.tablero.Celda;

public class Main {
    public static void main(String[] args) {
        Celda t = new Celda(false);
        System.out.println(t.pintarCelda(0));
        System.out.println(t.pintarCelda(1));
        System.out.println(t.pintarCelda(2));
        System.out.println(t.pintarCelda(3));

    }
    
}
