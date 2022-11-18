package listaSimpleLigada;

// Karla Valentin Baena

import java.util.ArrayList;

public class ADTTablasHash<T> {
	ArregloADT<ArrayList> TabHash;
    int tam;

    public ADTTablasHash(int tam) {
        this.tam = tam;
        if (tam < 7) {
            this.tam = 7;
            TabHash= new ArregloADT(tam);
        } else {
            double res = tam % 2;
            if ((tam % 2) == 0) { 
                this.tam = tam + 1;
                TabHash = new ArregloADT(tam);
            } else { 
            	TabHash = new ArregloADT(tam);
            }
        }
        for (int i = 0; i < tam; i++) {
        	TabHash.setElemento(i, new ArrayList());
        }
    }

    public void agregarE(int llave, T valor) {
        int posición = llave % tam;
        TabHash.getElemento(posición).add(valor);
    }

    public T valor(int llave) {
        int posición = llave % tam;
        Object fi;
        Object enc = null;

        if (TabHash.getElemento(posición).size() == 1) {
            return (T) TabHash.getElemento(posición).get(0);
        } else {       
            for (int j = 0; j < TabHash.getElemento(posición).size(); j++) {
                if (TabHash.getElemento(posición).get(j).equals(fi)) {
                    enc = TabHash.getElemento(posición).get(j);
                    System.out.println("Está en: " + j);
                }
            }
        
        return (T) fi;
}
    }

    public void eliminar(int llave) {
        int posición = llave % tam;
        Object fi;
        if (TabHash.getElemento(posición).size() == 1) {
        	TabHash.getElemento(posición).remove(0);
        } else {
            for (int j = 0; j < TabHash.getElemento(posición).size(); j++) {
                //if (TabHash.getElemento(posición).get(j).equals(fi)) {
                	TabHash.getElemento(posición).remove(j);
                }
            }
        }
    

    public static void main(String[] args) {
    	ADTTablasHash Tabla = new ADTTablasHash(8);
    	Tabla.agregarE(176, "Hola");
    	Tabla.agregarE(737, "Crayola");
    	Tabla.agregarE(838, "Fresa");
    	Tabla.agregarE(722, "Chocolate");
        System.out.println(Tabla.valor(737));
        Tabla.eliminar(838);
    }
}


