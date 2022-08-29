package tareaDos;

import java.util.ArrayList;

public class ArregloADT<T> {
	private int tamanio;
	private ArrayList<T> datos;

	// contructor
	public ArregloADT(int taman) {
		this.tamanio = taman;
		datos = new ArrayList<>();
		for (int i = 0; i < taman; i++) {
			datos.add((T) new Object());
		}
	}

// longitud
	public int getLongitud() {
		return datos.size();
	}

	// elemento
	public T getElemento(int indice) {
		if (indice >= 0 && indice < this.tamanio) {
			return datos.get(indice);
		}
		return null;
	}

	public void setElemento(int indice, T elemento) {
		if (indice >= 0 && indice < this.tamanio) {
			datos.set(indice, elemento);
		}
	}

	// limpiar
	public void limpiarInformacion() {
		for (int i = 0; i < tamanio; i++) {
			datos.set(i, null);
		}
	}

	// to string
	@Override
	public String toString() {
		return "Estado actual del arreglo: [ datos del arreglo: " + datos + ", Longitud del arreglo es de: "
				+ getLongitud() + "]";
	}
}
