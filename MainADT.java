package tareaDos;

public class MainADT {
	public static void main(String[] args) {
		ArregloADT<String> info = new ArregloADT<>(5);
		// getLongitud
		System.out.println("El tamaño del arreglo es de:" + info.getLongitud());
		// setElemento
		info.setElemento(3, "H");
		System.out.println("el elemento en la posición 3 es:" + info.getElemento(3));
		info.setElemento(0, "K");
		// getElemento
		System.out.println("El elemento en la posición 0 es:" + info.getElemento(0));
		// limpiar
		info.limpiarInformacion();
		// toString
		System.out.println(info);
	}
}
