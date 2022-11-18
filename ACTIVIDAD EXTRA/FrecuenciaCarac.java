package actividadExtra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FrecuenciaCarac {
	public static void main(String[] args) {
		int let = 0;
		char actualizada;
		int let_a = 0;
		int let_b = 0;
		int let_c = 0;
		int let_d = 0;
		int let_e = 0;
		int let_f = 0;
		int let_g = 0;
		int let_h = 0;
		int let_i = 0;
		int let_j = 0;
		int let_k = 0;
		int let_l = 0;
		int let_m = 0;
		int let_n = 0;
		int let_ñ = 0;
		int let_o = 0;
		int let_p = 0;
		int let_q = 0;
		int let_r = 0;
		int let_s = 0;
		int let_t = 0;
		int let_u = 0;
		int let_v = 0;
		int let_w = 0;
		int let_x = 0;
		int let_y = 0;
		int let_z = 0;
		int let_A = 0;
		int let_B = 0;
		int let_C = 0;
		int let_D = 0;
		int let_E = 0;
		int let_F = 0;
		int let_G = 0;
		int let_H = 0;
		int let_I = 0;
		int let_J = 0;
		int let_K = 0;
		int let_L = 0;
		int let_M = 0;
		int let_N = 0;
		int let_Ñ = 0;
		int let_O = 0;
		int let_P = 0;
		int let_Q = 0;
		int let_R = 0;
		int let_S = 0;
		int let_T = 0;
		int let_U = 0;
		int let_V = 0;
		int let_W = 0;
		int let_X = 0;
		int let_Y = 0;
		int let_Z = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(
					"C:\\Users\\hp\\OneDrive - UNIVERSIDAD NACIONAL AUTÓNOMA DE MÉXICO\\Documents\\KARLA\\Estructura de datos\\el_quijote.txt"));
			System.out.println("----- -----\n");

			String linea = li.readLine();
			while (linea != null) {
				System.out.println(linea);
				for (int i = 0; i < i.length(); i++) {

					actualizada = linea.charAt(i);

					if (actualizada  == 'a') {
						contador_a++;
					}
					if (actualizada  == 'b') {
						contador_b++;
					}
					if (actualizada  == 'c') {
						contador_c++;
					}
					if (actualizada  == 'd') {
						contador_d++;
					}
					if (actualizada  == 'e') {
						contador_e++;
					}
					if (actualizada  == 'f') {
						contador_f++;
					}
					if (actualizada  == 'g') {
						contador_g++;
					}
					if (actualizada  == 'h') {
						contador_h++;
					}
					if (actualizada  == 'i') {
						contador_i++;
					}
					if (actualizada  == 'j') {
						contador_j++;
					}
					if (actualizada  == 'k') {
						contador_k++;
					}
					if (actualizada  == 'l') {
						contador_l++;
					}
					if (actualizada  == 'm') {
						contador_m++;
					}
					if (actualizada  == 'n') {
						contador_n++;
					}
					if (actualizada  == 'ñ') {
						contador_ñ++;
					}
					if (actualizada  == 'o') {
						contador_o++;
					}
					if (actualizada  == 'p') {
						contador_p++;
					}
					if (actualizada  == 'q') {
						contador_q++;
					}
					if (actualizada  == 'r') {
						contador_r++;
					}
					if (actualizada  == 's') {
						contador_s++;
					}
					if (actualizada  == 't') {
						contador_t++;
					}
					if (actualizada  == 'u') {
						contador_u++;
					}
					if (actualizada  == 'v') {
						contador_v++;
					}
					if (actualizada  == 'w') {
						contador_w++;
					}
					if (actualizada  == 'x') {
						contador_x++;
					}
					if (actualizada  == 'y') {
						contador_y++;
					}
					if (letractual == 'z') {
						contador_z++;
					}

					if (actualizada  == 'A') {
						contador_A++;
					}
					if (actualizada  == 'B') {
						contador_B++;
					}
					if (actualizada  == 'C') {
						contador_C++;
					}
					if (actualizada  == 'D') {
						contador_D++;
					}
					if (actualizada  == 'E') {
						contador_E++;
					}
					if (actualizada  == 'F') {
						contador_F++;
					}
					if (actualizada  == 'G') {
						contador_G++;
					}
					if (actualizada  == 'H') {
						contador_H++;
					}
					if (actualizada  == 'I') {
						contador_I++;
					}
					if (actualizada  == 'J') {
						contador_J++;
					}
					if (actualizada  == 'K') {
						contador_K++;
					}
					if (actualizada  == 'L') {
						contador_L++;
					}
					if (actualizada  == 'M') {
						contador_M++;
					}
					if (actualizada  == 'N') {
						contador_N++;
					}
					if (actualizada  == 'Ñ') {
						contador_Ñ++;
					}
					if (actualizada  == 'O') {
						contador_O++;
					}
					if (actualizada  == 'P') {
						contador_P++;
					}
					if (actualizada  == 'Q') {
						contador_Q++;
					}
					if (actualizada  == 'R') {
						contador_R++;
					}
					if (actualizada  == 'S') {
						contador_S++;
					}
					if (actualizada  == 'T') {
						contador_T++;
					}
					if (actualizada  == 'U') {
						contador_U++;
					}
					if (actualizada  == 'V') {
						contador_V++;
					}
					if (actualizada  == 'W') {
						contador_W++;
					}
					if (actualizada  == 'X') {
						contador_X++;
					}
					if (actualizada == 'Y') {
						contador_Y++;
					}
					if (actualizada  == 'Z') {
						contador_Z++;
					}

				}
				linea = li.readLine();
			}
			li.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Número de caracter a encontrados:" + let_a);
		System.out.println("Número de caracter b encontrados:" + let_b);
		System.out.println("Número de caracter c encontrados:" + let_c);
		System.out.println("Número de caracter d encontrados: " + let_d);
		System.out.println("Número de caracter e encontrados: " + let_e);
		System.out.println("Número de caracter f encontrados:" + let_f);
		System.out.println("Número de caracter g encontrados:" + let_g);
		System.out.println("Número de caracter h encontrados:" + let_h);
		System.out.println("Número de caracter i encontrados: " + let_i);
		System.out.println("Número de caracter j encontrados:" + let_j);
		System.out.println("Número de caracter k encontrados: " + let_k);
		System.out.println("Número de caracter l encontrados:" + let_l);
		System.out.println("Número de caracter m encontrados:" + let_m);
		System.out.println("Número de caracter n encontrados:" + let_n);
		System.out.println("Número de caracter ñ encontrados:" + let_ñ);
		System.out.println("Número de caracter o encontrados:" + let_o);
		System.out.println("Número de caracter p encontrados:" + let_p);
		System.out.println("Número de caracter q encontrados:" + let_q);
		System.out.println("Número de caracter r encontrados:" + let_r);
		System.out.println("Número de caracter s encontrados: " + let_s);
		System.out.println("Número de caracter t encontrados: " + let_t);
		System.out.println("Número de caracter u encontrados:" + let_u);
		System.out.println("Número de caracter v encontrados:" + let_v);
		System.out.println("Número de caracter w encontrados:" + let_w);
		System.out.println("Número de caracter x encontrados:" + let_x);
		System.out.println("Número de caracter y encontrados:" + let_y);
		System.out.println("Número de caracter z encontrados:" + let_z);

		System.out.println("Número de caracter A encontrados:" + let_A);
		System.out.println("Número de caracter B encontrados:" + let_B);
		System.out.println("Número de caracter C encontrados: " + let_C);
		System.out.println("Número de caracter D encontrados:" + let_D);
		System.out.println("Número de caracter E encontrados: " + let_E);
		System.out.println("Número de caracter F encontrados: " + let_F);
		System.out.println("Número de caracter G encontrados:" + let_G);
		System.out.println("Número de caracter H encontrados: " + let_H);
		System.out.println("Número de caracter I encontrados: " + let_I);
		System.out.println("Número de caracter J encontrados:" + let_J);
		System.out.println("Número de caracter K encontrados:" + let_K);
		System.out.println("Número de caracter L encontrados:" + let_L);
		System.out.println("Número de caracter M encontrados:" + let_M);
		System.out.println("Número de caracter N encontrados:" + let_N);
		System.out.println("Número de caracter Ñ encontrados: " + let_Ñ);
		System.out.println("Número de caracter O encontrados:" + let_O);
		System.out.println("Número de caracter P encontrados:" + let_P);
		System.out.println("Número de caracter Q encontrados:" + let_Q);
		System.out.println("Número de caracter R encontrados: " + let_R);
		System.out.println("Número de caracter S encontrados:" + let_S);
		System.out.println("Número de caracter T encontrados:" + let_T);
		System.out.println("Número de caracter U encontrados:" + let_U);
		System.out.println("Número de caracter V encontrados:" + let_V);
		System.out.println("Número de caracter W encontrados: " + let_W);
		System.out.println("Número de caracter X encontrados:" + let_X);
		System.out.println("Número de caracter Y encontrados:" + let_Y);
		System.out.println("Número de caracter Z encontrados: " + let_Z);

	}

}
