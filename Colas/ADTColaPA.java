package listaSimpleLigada;

public class ADTColaPA<T> {
	ArregloADT<ADTColas> ColaP;
    int prioridad;

    public ADTColaPA(int pri) {
    	ColaP = new ArregloADT(pri);
        this.prioridad = pri;
        for (int F = 0; F < pri; F++) {
        	ColaP.setElemento(pri, null);
        }
    }

    public boolean estaVacia() {
        int elem = 0;
        for (int i = 0; i < prioridad - 1; i++) {
            if (ColaP.getElemento(i).estaVacia()) {
                elem++;
            }
        }
        return elem == 0;
    }

    public int getTamanio() {
        int tam = 0;
        ADTColas el;
        for (int i = 0; i < prioridad - 1; i++) {
            el = ColaP.getElemento(i);
            tam += el.getTamanio();
        }
        return tam;
    }

    public void enqueue(int Prioridad, T val) {
        if (Prioridad >= 0 && Prioridad < prioridad) {
            ColaP.getElemento(Prioridad).enqueue(val);
        } else if (Prioridad > prioridad) {
            ColaP.getElemento(prioridad - 1).enqueue(val);
        }
    }

    public void dequeue() {
        for (int j = 0; j < prioridad; j++) {
            if (!ColaP.getElemento(j).estaVacia()) {
                ColaP.getElemento(j).dequeue();
                break;
            }
        }
    }

    public void transversal() {
        for (int i = 0; i < prioridad; i++) {
            System.out.print("Prioridad " + i + " ");
            ColaP.getElemento(i).transversal();
        }
    }

    @Override
    public String toString() {
        return "ColaP{" + "ColaPri=" + ColaP.toString() + '}';
    }

    public static void main(String[] args) {
    	ADTColaPA ColPrio = new ADTColaPA(6);
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
