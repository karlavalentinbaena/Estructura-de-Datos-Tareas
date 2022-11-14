package listaSimpleLigada;

// Karla Valentin Baena

public class ADTColaPA<T> {
	ArregloADT<ADTColas> ColaP;
        int pri;

    public ADTColaPA(int pri) {
    	ColaP = new ArregloADT(pri);
        this.pri= pri;
        for (int F = 0; F < pri; F++) {
        	ColaP.setElemento(pri, null);
        }
    }

    public boolean estaVacia() {
        int elem = 0;
        for (int i = 0; i < pri - 1; i++) {
            if (ColaP.getElemento(i).estaVacia()) {
                elem++;
            }
        }
        return elem == 0;
    }

    public int getTamanio() {
        int tam = 0;
        ADTColas el;
        for (int i = 0; i < pri - 1; i++) {
            el = ColaP.getElemento(i);
            tam += el.getTamanio();
        }
        return tam;
    }

    public void enqueue(int Pri, T val) {
        if (Pri >= 0 && Pri < pri) {
            ColaP.getElemento(Pri).enqueue(val);
        } else if (Pri > pri) {
            ColaP.getElemento(pri - 1).enqueue(val);
        }
    }

    public void dequeue() {
        for (int j = 0; j < pri; j++) {
            if (!ColaP.getElemento(j).estaVacia()) {
                ColaP.getElemento(j).dequeue();
                break;
            }
        }
    }

    public void transversal() {
        for (int i = 0; i < pri; i++) {
            System.out.print("Prioridad " + i + " ");
            ColaP.getElemento(i).transversal();
        }
    }

    @Override
    public String toString() {
        return "ColaP{" + "ColaPrioridad=" + ColaP.toString() + '}';
    }

    public static void main(String[] args) {
    	ADTColaPA ColPrio = new ADTColaPA(6); //Cola tamaño 7
    	ColPrio.enqueue(4, "Maestre");
    	ColPrio.enqueue(2, "Niños");
    	ColPrio.enqueue(4, "Mecánico");
    	ColPrio.enqueue(3, "Hombres");
    	ColPrio.enqueue(4, "Vigía");
    	ColPrio.enqueue(5, "Capitán");
    	ColPrio.enqueue(4, "Timonel");
    	ColPrio.enqueue(3, "Mujeres");
    	ColPrio.enqueue(2, "3ra Edad");
    	ColPrio.enqueue(1, "Niñas");
    	ColPrio.transversal();
    
    }
}
