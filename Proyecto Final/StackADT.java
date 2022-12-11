package Proyecto;

import java.util.Stack;

public class StackADT {
	public static void main(String[] args) {
		Stack<Integer> pila = new Stack<Integer>();

		System.out.println("¿En este momento la pila está vacía? " + pila.isEmpty());

		// Agregar elementos
		pila.push(11);
		pila.push(9);
		pila.push(3);
		pila.push(15);

		// Hacer recorrido
		for (Integer datos : pila) {
			System.out.println(datos);
		}

		System.out.println("La pila es:" + pila);
		System.out.println("¿Está vacía la pila?: " + pila.isEmpty());

		// Eliminar último dato que entró
		pila.pop();
		System.out.println("Después de aplicar pop queda: " + pila);

		// Buscar un elemento
		System.out.println("¿En qué indice está el número 9? " + pila.search(9));

		// Obtener el último valor
		System.out.println("El último valo es: " + pila.peek());
	}
}
