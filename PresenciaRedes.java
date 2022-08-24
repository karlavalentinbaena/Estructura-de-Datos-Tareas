package tareaUno;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class PresenciaRedes {
	public static void main(String[] args) {

		// 1. para leer el archivo CSV
		try {
			BufferedReader leer = new BufferedReader(new FileReader(
					"C:\\Users\\hp\\OneDrive - UNIVERSIDAD NACIONAL AUTÓNOMA DE MÉXICO\\Documents\\KARLA\\Estructura de datos\\presenciaredes.csv"));
			String linea = null;
			while ((linea = leer.readLine()) != null) {
				String[] parts = linea.split(",");
				int totalDatos = parts.length;
				for (int i = 0; i < totalDatos; i++) {
					System.out.print(parts[i] + "  |  ");
				}
				System.out.println("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n\n");

		// 2. para obtener la diferencia de followers de twitter, mes de enero y junio
		int sEnero = 62404;
		int sJunio = 67496;
		System.out.println(
				"La diferencia de seguidores entre el mes de enero y junio en twitter es:" + (sJunio - sEnero));
		System.out.println("\n");

		// 3. calcular la diferencia de visualizaciones de YouTube al usuario

		int yEnero = 12226;
		int yFebrero = 15605;
		int yMarzo = 19602;
		int yAbril = 19452;
		int yMayo = 21805;
		int yJunio = 17344;

		Scanner entrada = new Scanner(System.in);
		System.out.println(
				"----------DIFERENCIA DE VISUALIZACIONES EN YOUTUBE ENTRE LOS MESES DE ENERO A JUNIO---------");
		System.out.println("Por favor, escribe los meses a comparar, por ejemplo: Enero y Mayo:");
		String comparar = entrada.nextLine();
		switch (comparar) {
		case "Enero y Febrero":
			System.out.println("La diferencia de visualizaciones es:" + (yEnero - yFebrero));
			break;
		case "Enero y Marzo":
			System.out.println("La diferencia de visualizaciones es:" + (yEnero - yMarzo));
			break;
		case "Enero y Abril":
			System.out.println("La diferencia de visualizaciones es:" + (yEnero - yAbril));
			break;
		case "Enero y Mayo":
			System.out.println("La diferencia de visualizaciones es:" + (yEnero - yMayo));
			break;
		case "Enero y Junio":
			System.out.println("La diferencia de visualizaciones es:" + (yEnero - yJunio));
			break;
		case "Febrero y Marzo":
			System.out.println("La diferencia de visualizaciones es:" + (yFebrero - yMarzo));
			break;
		case "Febrero y Mayo":
			System.out.println("La diferencia de visualizaciones es:" + (yFebrero - yMayo));
			break;
		case "Febrero y Junio":
			System.out.println("La diferencia de visualizaciones es:" + (yFebrero - yJunio));
			break;
		case "Marzo y Febrero":
			System.out.println("La diferencia de visualizaciones es:" + (yMarzo - yFebrero));
			break;
		case "Marzo y Mayo":
			System.out.println("La diferencia de visualizaciones es:" + (yMarzo - yMayo));
			break;
		case "Marzo y Junio":
			System.out.println("La diferencia de visualizaciones es:" + (yMarzo - yJunio));
			break;
		case "Abril y Mayo":
			System.out.println("La diferencia de visualizaciones es:" + (yAbril - yMayo));
			break;
		case "Abril y Junio":
			System.out.println("La diferencia de visualizaciones es:" + (yAbril - yJunio));
			break;
		case "Mayo y Junio":
			System.out.println("La diferencia de visualizaciones es:" + (yMayo - yJunio));
			break;
		default:
			System.out.println("Los meses elegidos no están disponibles");
			break;
		}

		// 4. calcular promedio de crecimiento de Twitter y facebook de enero a junio
		// Facebook:
		int pEnero = 660;
		int pFebrero = 4850;
		int pMarzo = 3638;
		int pAbril = 4585;
		int pMayo = 5308;
		int pJunio = 7925;
		int promedio;
		promedio = (pEnero + pFebrero + pMarzo + pAbril + pMayo + pJunio) / 6;
		System.out.println("El promedio de crecimiento de seguidores en Facebook es:" + (promedio));

		// Twitter
		int tEnero = 863;
		int tFebrero = 828;
		int tMarzo = 917;
		int tAbril = 1261;
		int tMayo = 945;
		int tJunio = 1141;
		int tpromedio;
		tpromedio = (tEnero + tFebrero + tMarzo + tAbril + tMayo + tJunio) / 6;
		System.out.println("El promedio de crecimiento de seguidores en Twitter es:" + (tpromedio));
	}
}



