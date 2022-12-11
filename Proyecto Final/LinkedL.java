package Proyecto;

//Clase LinkedList
import java.util.LinkedList;

public class LinkedL {
	public static void main(String[] args) {
		LinkedList<String> patos1 = new LinkedList();

		String nombre1 = "Aarón";
		String nombre2 = "Lalo";
		String nombre3 = "Gabriel";
		String nombre4 = "Jaasiel";
		String nombre5 = "Fernando";

		// Método add
		patos1.add(nombre1);
		patos1.add(nombre2);
		patos1.add(nombre3);
		patos1.add(nombre4);
		patos1.add(nombre5);

		// para recorrer la lista:
		System.out.println(patos1);

		// Otra manera de recorrer la lista:
		/*
		 * for(String nombres : patos) { System.out.println(patos); }
		 */

		// Método añadir primero
		String nombre6 = "Tobi";
		patos1.addFirst(nombre6);
		System.out.println("Ahora el nombre del primer pato es:");
		for (String nombres : patos1) {
			System.out.println(patos1);
		}

		// Método tamaño de LinkedList

		System.out.println("El tamaño de la lista de patos es:" + patos1.size());

		// Método para obtener el primer elemento de la lista

		System.out.println("El primer pato de la lista es:" + patos1.getFirst());

		// Método para obtener al último

		System.out.println("El último pato de la lista es:" + patos1.getLast());

		/*
		 * Método addAll: sirve para rellenar una nueva lista con elementos de otra ya
		 * existente
		 */

		LinkedList<String> patos2 = new LinkedList();

		patos2.addAll(patos1);
		System.out.println("Se esta copiando lista 1 a 2");
		for (String nombres : patos2) {
			System.out.println(patos2);
		}
		System.out.println("La lista de patos 1, fue copiada a la lista 2 exitosamente");

	}

}
