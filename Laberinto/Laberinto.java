package laberinto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import PruebaLab.Arreglo2D;
import PruebaLab.PilaADT;

public class Laberinto {
	public static void main(String[] args) {

		System.out.println("El laberinto es:");
		try {
			BufferedReader Lab = new BufferedReader(new FileReader(
					"C:\\Users\\hp\\OneDrive - UNIVERSIDAD NACIONAL AUT�NOMA DE M�XICO\\Documents\\KARLA\\plantillas\\plantillaL.csv"));
			String linea = null;
			while ((linea = Lab.readLine()) != null) {
				String[] partes = linea.split(",");
				int totalDatos = partes.length;
				for (int i = 0; i < totalDatos; i++) {
					System.out.print(partes[i] + "    ");
				}
				System.out.println("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n\n");

	}

	ArrayList<ArrayList<String>> OutterArray = new ArrayList();
	String[] Lineas;
	String[] TamLis;
	Arreglo2D TableroLab;
	Arreglo2D cas = new PilaADT();

	public Laberinto(File Arch) {
		int fil;
		int col;
		try {
			Path Ruta = Arch.toPath();
			BufferedReader Lector = Files.newBufferedReader(Ruta);
			String Leido;
			while ((Leido = Lector.readLine()) != null) {
				Lineas = Leido.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
				ArrayList<String> InnerArray = new ArrayList();
				for (String datos : Lineas) {
					InnerArray.add(datos);
				}
				OutterArray.add(InnerArray);
			}

			fil = Integer.parseInt(OutterArray.get(0).get(0));
			col = Integer.parseInt(OutterArray.get(1).get(0));
			TableroLab = new Arreglo2D(fil, col);

		} catch (IOException ex) {
		}
	}

	public void empezar(ArrayList<ArrayList<String>> OutterArray) {
		for (int Fil = 0; Fil < Integer.parseInt(OutterArray.get(0).get(0)); Fil++) {
			for (int Col = 0; Col < Integer.parseInt(OutterArray.get(1).get(0)); Col++) {
				if (OutterArray.get(Fil + 2).get(Col).equals("E")) {
					cas.push(Fil + "," + Col);
				}
			}
		}
	}

	// kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk
	public void buscarCamino(Arreglo2D TableroLab) {
		/*
		 * Empezar� d�nde le diga la pila y solo iterar� a la izquierda, derecha, abajo
		 * o arriba en vez de un cuadrado alrededor del jugador.
		 * 
		 * Todos llevan un push.
		 * 
		 * Agregar una linea extra para el caso donde no pueda ir a ning�n lado y tenga
		 * que hacer un pop().
		 */
		// x es por Filas.
		// y es por Columnas.
		String[] sep = Pila.peek().split(",");
		int x = Integer.parseInt(sep[0]);
		int y = Integer.parseInt(sep[1]);
		int reg = 0;
		// char NO = '*';

		// Ir hacia arriba
		if (reg != 1) {
			if (TableroLab.getElemento(x - 1, y) != "#") {
				// if (TableroLab.getElemento(x - 1, y) != null) {
				if (TableroLab.getElemento(x - 1, y) != "*") {
					if (TableroLab.getElemento(x - 1, y) != "E" && TableroLab.getElemento(x - 1, y) != "S") {
						// x - 1;
						cas.push("," + y);
						TableroLab.setElemento(x, y, "*");
						reg = 2;
					} else {
						if (TableroLab.getElemento(x - 1, y) == "S") {
							// xAdicional = x - 1;
							cas.push("," + y);
							TableroLab.setElemento(y, "S");
							TableroLab.setElemento(x, y, "*");
							reg = 2;
						}
					}
				}
			}
		}

		// Ir hacia abajo
		if (reg != 1 && reg != 2 && reg != 3) {
			if (TableroLab.getElemento(x + 1, y) != "#") {
				// if (TableroLab.getElemento(x + 1, y) != null) {
				if (TableroLab.getElemento(x + 1, y) != "*") {
					if (TableroLab.getElemento(x + 1, y) != "E" && TableroLab.getElemento(x + 1, y) != "S") { 
						// xAdicional = x + 1;
						cas.push("," + y);
						TableroLab.setElemento(x, y, "*");
					} else {
						if (TableroLab.getElemento(x + 1, y) == "S") {
							// xAdicional = x + 1;
							cas.push("," + y);
							TableroLab.setElemento(y, "S");
							TableroLab.setElemento(x, y, "*");
						}
					}
				}
			}
		}

		// Ir hacia el lado derecho
		if (reg != 1 && reg != 2) {
			if (TableroLab.getElemento(x, y + 1) != "#") {
				// if (TableroLab.get_Item(x, y + 1) != null) {
				if (TableroLab.getElemento(x, y + 1) != "*") {
					if (TableroLab.getElemento(x, y + 1) != "E" && TableroLab.getElemento(x, y + 1) != "S") {
	
						// yAdicional = y + 1;
						cas.push(x + ",");
						TableroLab.setElemento(x, y, "*");
						reg = 3;
					} else {
						if (TableroLab.getElemento(x, y + 1) == "S") {
							// yAdicional = y + 1;
							cas.push(x + ",");
							TableroLab.setElemento(x, "S");
							TableroLab.setElemento(x, y, "*");
							reg = 3;
						}
					}
				}
			}
		}

		// Ir hacia el lado izquierdo
		if (TableroLab.getElemento(x, y - 1) != "#") {
			// if (TableroLab.getElemento(x, y - 1) != null) {
			if (TableroLab.getElemento(x, y - 1) != "*") {
				if (TableroLab.getElemento(x, y - 1) != "E" && TableroLab.getElemento(x, y - 1) != "S") {
					// yAdicional = y - 1;
					cas.push(x + ",");
					TableroLab.setElemento(x, y, "*");
					reg = 1;
				} else {
					if (TableroLab.getElemento(x, y - 1) == "S") {
						// yAdicional = y - 1;
						cas.push(x + ",");
						TableroLab.setElemento(x, "S");
						TableroLab.setElemento(x, y, "*");
						reg = 1;
					}
				}
			}
		}

		
		if (TableroLab.getElemento(x + 1, y) == "#") { // Abajo |
			if (TableroLab.getElemento(x, y - 1) == "#") { // Izquierda |
				if (TableroLab.getElemento(x - 1, y) == "#") { // Arriba |
					if (TableroLab.getElemento(x, y + 1) == "*") { // Derecha *
						TableroLab.setElemento(x, y);
						cas.pop();
					}
					
				} else if (TableroLab.getElemento(x, y - 1)) { // Izquierda X
					if (TableroLab.getElemento(x - 1, y) == "#") { // Arriba |
						if (TableroLab.getElemento(x, y + 1) == "*") { // Derecha *
							TableroLab.setElemento(x, y,);
							cas.pop();
						}
						
					} else if (TableroLab.getElemento(x - 1, y)) { // Arriba X
						if (TableroLab.getElemento(x, y + 1) == "*") { // Derecha *
							TableroLab.setElemento(x, y,);
							cas.pop();
						}
					}
				}

			} else if (TableroLab.getElemento(x, y + 1)) { // Derecha X
				if (TableroLab.getElemento(x + 1, y) == "*") { // Abajo *
					TableroLab.setElemento(x, y, );
					cas.pop();
				}
			}

		} else if (TableroLab.getElemento(x - 1, y)) { // Arriba X
			if (TableroLab.getElemento(x, y + 1) == "#") { // Derecha |
				if (TableroLab.getElemento(x + 1, y) == "*") { // Abajo *
					TableroLab.setElemento(x, y,);
					cas.pop();
				}

			} else if (TableroLab.getElemento(x + 1, y)) { // Abajo X
				if (TableroLab.getElemento(x, y - 1) == "*") { // Izquierda *
					TableroLab.setElemento(x, y,);
					cas.pop();
				}
			}

		} else if (TableroLab.getElemento(x, y + 1)) { // Derecha X
			if (TableroLab.getElemento(x + 1, y) == "#") { // Abajo |
				if (TableroLab.getElemento(x, y - 1) == "*") { // Izquierda *
					TableroLab.setElemento(x, y,);
					cas.pop();
				}
			} else if (TableroLab.getElemento(x, y - 1)) { // Izquierda X
				if (TableroLab.getElemento(x - 1, y) == "*") { // Arriba *
					TableroLab.setElemento(x, y,);
					cas.pop();

				}

			}
		}
	}
}
