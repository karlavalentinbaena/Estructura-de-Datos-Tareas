package listaDobleLigada;

public class ListaDoble<T> {
	NodoDoble<T> head;
	int tam;

	// 1. Constructor
	public ListaDoble() {
		this.head = null;
		this.tam = 0;
	}

	// 2.- ¿Está vacía?
	public boolean estaVacia() {
		return this.head == null;
	}

	// 3.- número de elementos
	public int nElementos() {
		return tam;

	}

	// 4.- Agregar al inicio
	public void agregarAlInicio(T valor) {
		NodoDoble<T> nuevoI = new NodoDoble<>(valor);
		if (this.estaVacia()) {
			this.head = nuevoI;// igualar el nuevo valor introducido como el head
		} else {
			nuevoI.setSiguiente(this.head);
			head.setAnterior(nuevoI);
			this.head = nuevoI;
		}
	}

	// 5.- Agregar al final
	public void agregarAlFinal(T valor) {
		NodoDoble<T> nuevoF = new NodoDoble<>(valor);
		if (head == null) {
			this.head = nuevoF;
		} else {
			NodoDoble<T> aux = this.head;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			nuevoF.setAnterior(aux);
			aux.setSiguiente(nuevoF);
			aux = null;
			nuevoF = null;
		}
	}

	// 6.- Agregar nodo después del nodo
	public void agregarDespues(int posición, T valor) {
		NodoDoble siguiente = new NodoDoble(valor);
		NodoDoble aux = this.head;
		for (int i = 1; i <= posición - 1; i++) {
			aux = aux.getSiguiente();
		}
		siguiente.setSiguiente(aux.getSiguiente());
		aux.setSiguiente(siguiente);
		aux.setAnterior(aux.getAnterior());
	}

	// 7.- Eliminar primero de la lista
	public void eliminarPrimero() {
		NodoDoble nodo = head;
		if (this.estaVacia()) {
			head = nodo;
		} else {
			head = nodo.getSiguiente();
		}
	}

	// 8.- Eliminar el último
	public void eliminarUltimo() {
		NodoDoble nodo = head;
		if (this.estaVacia()) {
			head = nodo;
		} else {
			while (nodo.getSiguiente().getSiguiente() != null) {
				nodo = nodo.getSiguiente();
			}
			nodo.setSiguiente(null);
		}
	}

	// 9.- Eliminar elemento en cierta posición
	public void eliminar(int posición) {
		NodoDoble nd = head;
		if (this.estaVacia()) {
			System.out.println("No se puede eliminar porque la lista está vacía");
		} else {
			if (posición > head.toString().length()) {
				System.out.println("La posición que se escogio no existe");
			} else {
				for (int i = 1; i < posición - 1; i++) {
					nd = nd.getSiguiente();
				}
			}
		}

		nd.setSiguiente(nd.getSiguiente().getSiguiente());
		nd.setAnterior(nd.getAnterior());
	}

	// 10.- Buscar elemento en la lista y regresar su posición
	public int buscarValor(T valor) {
		NodoDoble elem = head;
		int posición = 1;
		if (this.estaVacia()) {
			System.out.println("No hay nada porque está vacía la lista");
		} else {
			while (elem.getDato() != valor) {
				elem = elem.getSiguiente();
				posición++;
			}
		}
		return posición;
	}

	// 11.- Actualizar un elemento
	public void actualizarValor(T posicion, T valor) {
		NodoDoble elem = head;
		while (elem.getDato() != posicion) {
			elem = elem.getSiguiente();
		}
		elem.setDato(valor);
	}

	// 12.- Transversal
	public void transversal() {
		NodoDoble lista = this.head;
		while (lista != null) {
			System.out.print(lista);
			lista = lista.getSiguiente();
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		ListaDoble listaD = new ListaDoble();
		listaD.agregarAlInicio(19);
		listaD.agregarAlFinal(100);
		listaD.transversal();
		System.out.println("-------------------------");
		listaD.agregarAlFinal(20);
		listaD.agregarAlInicio(1);
		listaD.agregarDespues(1, 10);
		listaD.agregarDespues(2, 40);
		listaD.transversal();
		System.out.print("La posición  del elemento buscado es: ");
		System.out.println(listaD.buscarValor(10));
		System.out.println("---ACTUALIZACIÓN---");
		listaD.actualizarValor(1, 3);
		listaD.eliminar(4);
		listaD.transversal();
		System.out.println("---Eliminación del primer y último elemento---");
		listaD.eliminarPrimero();
		listaD.eliminarUltimo();
		listaD.transversal();
	}
}
