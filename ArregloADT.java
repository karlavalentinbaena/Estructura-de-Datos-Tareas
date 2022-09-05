package ArregloADTClase;

import java.util.ArrayList;

public class ArregloADT<T> {

	int tamanio;
	private final ArrayList<T> datos;

	public ArregloADT(int tam) {
		this.tamanio = tam;
		this.datos = new ArrayList<>(tamanio);
		for (int i = 0; i < tamanio; i++) {
			datos.add(null);
		}
	}

	public T getElemento(int indice) {
		if (indice >= 0 && indice < this.tamanio) {
			return datos.get(indice);
		}
		return null;
	}

	/*
	 * private boolean comprobacion(int indice) { return indice >= 0 && indice <
	 * this.tamanio; }
	 */

	public void setElemento(int indice, T Elemento) {
		if (indice >= 0 && indice < this.tamanio) {
			datos.set(indice, Elemento);
		} else {
			System.out.println("Fuera del rango");
		}
	}

	public int getLongitud() {
		return datos.size();
	}

	public void limpiar(T Elemento) {
		for (int i = 0; i < datos.size(); i++) {
			datos.set(i, Elemento);
		}
	}

	public String toString() {
		String estado = "------------- " + this.tamanio + " -------------\n";
		for (T dato : datos) {
			if (dato != null) {
				estado += dato.toString() + "\n";
			}
		}
		return estado;
	}
}
