package tareaTresTrabajador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import ArregloADTClase.ArregloADT;

public class NominaADT {
	public static void main(String[] args) throws FileNotFoundException {
		File Arch = new File("C:\\Users\\hp\\OneDrive - UNIVERSIDAD NACIONAL AUTÓNOMA DE MÉXICO\\Documents\\KARLA\\Estructura de datos\\junio.dat");
		NominaADT Ls = new NominaADT(Arch);
		Ls.Sueldos();
		Ls.MenosAnti();
		Ls.MasAnti();
	}

	int tam = 0;
	String LineasL = "";
	ArrayList<ArrayList<String>> OutterArray = new ArrayList();
	ArregloADT<Empleado> Nomina;
	String[] Lineas;
	String[] TamanLis;
	Empleado Empleado;
	Empleado cos;
	Empleado max;
	Empleado med;
	Empleado min;
	Empleado medMin;

	public NominaADT(File Arch) {
		try {
			Path Ruta = Arch.toPath();
			BufferedReader lectura = Files.newBufferedReader(Ruta);
			String Leer;

			while ((Leer = lectura.readLine()) != null) {
				Lineas = Leer.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
				TamanLis = Leer.split("\n");
				tam += TamanLis.length;
				ArrayList<String> Array = new ArrayList();
				for (String datos : Lineas) {
					Array.add(datos);
				}
				OutterArray.add(Array);
			}

			Nomina = new ArregloADT(tam - 1);
			int Columnas = 0;
			for (int Filas = 1; Filas < OutterArray.size(); Filas++) {
				Empleado = new Empleado(Integer.parseInt(OutterArray.get(Filas).get(0)), OutterArray.get(Filas).get(1),
						OutterArray.get(Filas).get(2), OutterArray.get(Filas).get(3),
						Integer.parseInt(OutterArray.get(Filas).get(4)),
						Integer.parseInt(OutterArray.get(Filas).get(5)),
						Integer.parseInt(OutterArray.get(Filas).get(6)));
				Nomina.setElemento(Columnas, Empleado);
				Columnas++;
			}
		} catch (IOException ex) {
		}
	}

	public void Sueldos() {
		for (int tam = 0; tam < Nomina.getLongitud(); tam++) {
			cos = Nomina.getElemento(tam);
			System.out.println("id:" + cos.getNumTrabajador() + "Sueldo:" + cos.calcularSueldo());
		}
	}

	public void MasAnti() {
		int tiemp = 2023;
		String pers = "";
		String pnom = "";
		for (int i = 0; i < Nomina.getLongitud(); i++) {
			max = Nomina.getElemento(i);
			if (max.getAnioIngreso() < tiemp) {
				tiemp = max.getAnioIngreso();
				pers = max.getNombres();
			}
		}
		System.out.println("La persona con mayor antiguedad es: " + pers + "porque trabaja desde el año:" + tiemp);

		for (int i = 0; i < Nomina.getLongitud(); i++) {
			med = Nomina.getElemento(i);
			if (med.getAnioIngreso() < tiemp && med.getNombres().equals(pers)) {
			} else {
				tiemp = med.getAnioIngreso();
				pnom = med.getNombres();
			}
		}
		System.out.println("La segunda persona con mayor antiguedad es:" + pnom + "porque trabaja desde:" + tiemp);
	}

	public void MenosAnti() {
		int tiempM = 2016;
		String persD = "";
		String pnomD = "";
		for (int i = 0; i < Nomina.getLongitud(); i++) {
			min = Nomina.getElemento(i);
			if (min.getAnioIngreso() > tiempM) {
				tiempM = min.getAnioIngreso();
				persD = min.getNombres();
			}
		}
		System.out.println("La persona con menor antiguedad es:" + persD + "porque trabaja desde:" + tiempM);

		int tiemoMi = tiempM;
		for (int i = 0; i < Nomina.getLongitud(); i++) {
			medMin = Nomina.getElemento(i);
			if (medMin.getAnioIngreso() == tiempM) {
				if (medMin.getNombres().equals(persD)) {
				} else {
					tiempM = medMin.getAnioIngreso();
					pnomD = medMin.getNombres();
				}
			}

		}
		System.out.println("La segunda persona con menor antiguedad es:" + pnomD + "porque trabaja desde:" + tiempM);
	}
}
