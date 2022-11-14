package listaSimpleLigada;

//Karla Valentin Baena

public class ADTColas<T> {
	ListaLigadaADT cola;

	private int tamanio;

	// 1. Constructor
	public ADTColas() {
		this.cola = new ListaLigadaADT();
	}

	// 2.¿Está vacía?
	public boolean estaVacia() {
		return this.cola.estaVacia();
	}

	// 3. Número de elementos en la cola.
	public int getTamanio() {
		return this.cola.getTamanio();
	}

	// 4. Ingresa un elemento al final.
	public void enqueue(T val) {
		this.cola.agregarAlFinal(val);
	}

	// 5. Saca el elemento que se encuentra el frente de la estructura.
	public T dequeue() {
		Object el = this.cola.regreInicio;
		this.cola.eliminarPrimero();
		return (T) el;

	}

	// 6. También opcional para mostrar el estado actual de la cola.
	public void transversal() {
		this.cola.transversal();
	}

	@Override
	public String toString() {
		return "Cola{" + "cola=" + (T) cola + '}';
	}

	public static void main(String[] args) {
		ADTColas funcion = new ADTColas();
		funcion.enqueue(20);
		funcion.enqueue(21);
		funcion.enqueue("njcnjd");
		System.out.println(funcion.getTamanio());
		System.out.println(funcion.toString());
		funcion.transversal();
		System.out.println(funcion.dequeue());
	}

}
