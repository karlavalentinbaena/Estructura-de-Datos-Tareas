package Proyecto;

import java.util.ArrayList;

//Clase ArrayList

public class ArrayL {
	public static void main(String[] args) {
		ArrayList<String> navidad = new ArrayList<>();

		// Método add que va agregando cosas
		navidad.add("luces");
		navidad.add("piñata");
		navidad.add("violin");
		navidad.add("pan de muerto");
		navidad.add("esferas");
		System.out.println("Cosas para navidad:" + navidad);

		// Método remove(): Elimina un elemento de acuerdo a su posición
		navidad.remove(3);
		navidad.remove(2);
		System.out.println("Se eliminaron cosas que no son de navidad, entonces la lista es:" + navidad);

		// Método size: para saber el tamaño
		System.out.println("El número de elementos es:" + navidad.size());

		// Método get: Obtener un elemento del indice que se elija
		System.out.println("El elemento con indice 0 es:" + navidad.get(0));

		// Método clear: borrar todos los elementos
		navidad.clear();
		System.out.println(navidad.toString()); // se nota que ya no hay nada en la lista

		// Método contains
		navidad.contains("luces");

	}

}
