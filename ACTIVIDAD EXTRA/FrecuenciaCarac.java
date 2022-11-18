package actividadExtra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FrecuenciaCarac {
	public static void main(String[] args) {
		int contador = 0;
		char letractual;
		int contador_a = 0;
		int contador_b = 0;
		int contador_c = 0;
		int contador_d = 0;
		int contador_e = 0;
		int contador_f = 0;
		int contador_g = 0;
		int contador_h = 0;
		int contador_i = 0;
		int contador_j = 0;
		int contador_k = 0;
		int contador_l = 0;
		int contador_m = 0;
		int contador_n = 0;
		int contador_ñ = 0;
		int contador_o = 0;
		int contador_p = 0;
		int contador_q = 0;
		int contador_r = 0;
		int contador_s = 0;
		int contador_t = 0;
		int contador_u = 0;
		int contador_v = 0;
		int contador_w = 0;
		int contador_x = 0;
		int contador_y = 0;
		int contador_z = 0;
		// mayúsculas
		int contador_A = 0;
		int contador_B = 0;
		int contador_C = 0;
		int contador_D = 0;
		int contador_E = 0;
		int contador_F = 0;
		int contador_G = 0;
		int contador_H = 0;
		int contador_I = 0;
		int contador_J = 0;
		int contador_K = 0;
		int contador_L = 0;
		int contador_M = 0;
		int contador_N = 0;
		int contador_Ñ = 0;
		int contador_O = 0;
		int contador_P = 0;
		int contador_Q = 0;
		int contador_R = 0;
		int contador_S = 0;
		int contador_T = 0;
		int contador_U = 0;
		int contador_V = 0;
		int contador_W = 0;
		int contador_X = 0;
		int contador_Y = 0;
		int contador_Z = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(
					"C:\\Users\\hp\\OneDrive - UNIVERSIDAD NACIONAL AUTÓNOMA DE MÉXICO\\Documents\\KARLA\\Estructura de datos\\el_quijote.txt"));
			System.out.println("TEXTO LEIDO");
			System.out.println("----- -----\n");

			String linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				for (int contadorlínea = 0; contadorlínea < linea.length(); contadorlínea++) {

					letractual = linea.charAt(contadorlínea);

					if (letractual == 'a') {
						contador_a++;
					}
					if (letractual == 'b') {
						contador_b++;
					}
					if (letractual == 'c') {
						contador_c++;
					}
					if (letractual == 'd') {
						contador_d++;
					}
					if (letractual == 'e') {
						contador_e++;
					}
					if (letractual == 'f') {
						contador_f++;
					}
					if (letractual == 'g') {
						contador_g++;
					}
					if (letractual == 'h') {
						contador_h++;
					}
					if (letractual == 'i') {
						contador_i++;
					}
					if (letractual == 'j') {
						contador_j++;
					}
					if (letractual == 'k') {
						contador_k++;
					}
					if (letractual == 'l') {
						contador_l++;
					}
					if (letractual == 'm') {
						contador_m++;
					}
					if (letractual == 'n') {
						contador_n++;
					}
					if (letractual == 'ñ') {
						contador_ñ++;
					}
					if (letractual == 'o') {
						contador_o++;
					}
					if (letractual == 'p') {
						contador_p++;
					}
					if (letractual == 'q') {
						contador_q++;
					}
					if (letractual == 'r') {
						contador_r++;
					}
					if (letractual == 's') {
						contador_s++;
					}
					if (letractual == 't') {
						contador_t++;
					}
					if (letractual == 'u') {
						contador_u++;
					}
					if (letractual == 'v') {
						contador_v++;
					}
					if (letractual == 'w') {
						contador_w++;
					}
					if (letractual == 'x') {
						contador_x++;
					}
					if (letractual == 'y') {
						contador_y++;
					}
					if (letractual == 'z') {
						contador_z++;
					}

					// mayúsculas

					if (letractual == 'A') {
						contador_A++;
					}
					if (letractual == 'B') {
						contador_B++;
					}
					if (letractual == 'C') {
						contador_C++;
					}
					if (letractual == 'D') {
						contador_D++;
					}
					if (letractual == 'E') {
						contador_E++;
					}
					if (letractual == 'F') {
						contador_F++;
					}
					if (letractual == 'G') {
						contador_G++;
					}
					if (letractual == 'H') {
						contador_H++;
					}
					if (letractual == 'I') {
						contador_I++;
					}
					if (letractual == 'J') {
						contador_J++;
					}
					if (letractual == 'K') {
						contador_K++;
					}
					if (letractual == 'L') {
						contador_L++;
					}
					if (letractual == 'M') {
						contador_M++;
					}
					if (letractual == 'N') {
						contador_N++;
					}
					if (letractual == 'Ñ') {
						contador_Ñ++;
					}
					if (letractual == 'O') {
						contador_O++;
					}
					if (letractual == 'P') {
						contador_P++;
					}
					if (letractual == 'Q') {
						contador_Q++;
					}
					if (letractual == 'R') {
						contador_R++;
					}
					if (letractual == 'S') {
						contador_S++;
					}
					if (letractual == 'T') {
						contador_T++;
					}
					if (letractual == 'U') {
						contador_U++;
					}
					if (letractual == 'V') {
						contador_V++;
					}
					if (letractual == 'W') {
						contador_W++;
					}
					if (letractual == 'X') {
						contador_X++;
					}
					if (letractual == 'Y') {
						contador_Y++;
					}
					if (letractual == 'Z') {
						contador_Z++;
					}

				}
				linea = br.readLine();
				System.out.println("línea terminada");
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		//System.out.println("\nPalabras contadas: " + contador);
		System.out.println("caracter a contados: " + contador_a);
		System.out.println("caracter b contados: " + contador_b);
		System.out.println("caracter c contados: " + contador_c);
		System.out.println("caracter d contados: " + contador_d);
		System.out.println("caracter e contados: " + contador_e);
		System.out.println("caracter f contados: " + contador_f);
		System.out.println("caracter g contados: " + contador_g);
		System.out.println("caracter h contados: " + contador_h);
		System.out.println("caracter i contados: " + contador_i);
		System.out.println("caracter j contados: " + contador_j);
		System.out.println("caracter k contados: " + contador_k);
		System.out.println("caracter l contados: " + contador_l);
		System.out.println("caracter m contados: " + contador_m);
		System.out.println("caracter n contados: " + contador_n);
		System.out.println("caracter ñ contados: " + contador_ñ);
		System.out.println("caracter o contados: " + contador_o);
		System.out.println("caracter p contados: " + contador_p);
		System.out.println("caracter q contados: " + contador_q);
		System.out.println("caracter r contados: " + contador_r);
		System.out.println("caracter s contados: " + contador_s);
		System.out.println("caracter t contados: " + contador_t);
		System.out.println("caracter u contados: " + contador_u);
		System.out.println("caracter v contados: " + contador_v);
		System.out.println("caracter w contados: " + contador_w);
		System.out.println("caracter x contados: " + contador_x);
		System.out.println("caracter y contados: " + contador_y);
		System.out.println("caracter z contados: " + contador_z);
		// mayus
		System.out.println("caracter A contados: " + contador_A);
		System.out.println("caracter B contados: " + contador_B);
		System.out.println("caracter C contados: " + contador_C);
		System.out.println("caracter D contados: " + contador_D);
		System.out.println("caracter E contados: " + contador_E);
		System.out.println("caracter F contados: " + contador_F);
		System.out.println("caracter G contados: " + contador_G);
		System.out.println("caracter H contados: " + contador_H);
		System.out.println("caracter I contados: " + contador_I);
		System.out.println("caracter J contados: " + contador_J);
		System.out.println("caracter K contados: " + contador_K);
		System.out.println("caracter L contados: " + contador_L);
		System.out.println("caracter M contados: " + contador_M);
		System.out.println("caracter N contados: " + contador_N);
		System.out.println("caracter Ñ contados: " + contador_Ñ);
		System.out.println("caracter O contados: " + contador_O);
		System.out.println("caracter P contados: " + contador_P);
		System.out.println("caracter Q contados: " + contador_Q);
		System.out.println("caracter R contados: " + contador_R);
		System.out.println("caracter S contados: " + contador_S);
		System.out.println("caracter T contados: " + contador_T);
		System.out.println("caracter U contados: " + contador_U);
		System.out.println("caracter V contados: " + contador_V);
		System.out.println("caracter W contados: " + contador_W);
		System.out.println("caracter X contados: " + contador_X);
		System.out.println("caracter Y contados: " + contador_Y);
		System.out.println("caracter Z contados: " + contador_Z);

	}

}
