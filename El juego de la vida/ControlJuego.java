package elJuegoDeLaVida;

public class ControlJuego {
	private boolean[][] tablero;
	private int nFilas, nColumnas;

	public ControlJuego(int col, int fil) {
		this.nFilas = fil;
		this.nColumnas = col;
		this.tablero = new boolean[fil][col];
	}

	// Para calcular y pasar la siguiente generación
	public void sigGen() {
		int celula = 0, fil, col;

		boolean[][] areaC = this.copyArea();

		for (fil = 0; fil < nFilas; fil++) {
			for (col = 0; col < nColumnas; col++) {
				{
					if (fil == 0 && col == 0) {
						if (areaC[fil][col + 1])
							celula++;
						if (areaC[fil + 1][col])
							celula++;
						if (areaC[fil + 1][col + 1])
							celula++;
					} else if (fil == 0 && col == nColumnas - 1) {
						if (areaC[fil][col - 1])
							celula++;
						if (areaC[fil + 1][col - 1])
							celula++;
						if (areaC[fil + 1][col])
							celula++;
					} else if (fil == nFilas - 1 && col == 0) {
						if (areaC[fil - 1][col])
							celula++;
						if (areaC[fil - 1][col + 1])
							celula++;
						if (areaC[fil][col + 1])
							celula++;
					} else if (fil == nFilas - 1 && col == nColumnas - 1) {
						if (areaC[fil - 1][col - 1])
							celula++;
						if (areaC[fil - 1][col])
							celula++;
						if (areaC[fil][col - 1])
							celula++;
					} else if (fil == 0 && col != nColumnas - 1 && col != 0) {
						if (areaC[fil][col - 1])
							celula++;
						if (areaC[fil][col + 1])
							celula++;
						if (areaC[fil + 1][col - 1])
							celula++;
						if (areaC[fil + 1][col])
							celula++;
						if (areaC[fil + 1][col + 1])
							celula++;
					} else if (fil == nFilas - 1 && col != nColumnas - 1 && col != 0) {
						if (areaC[fil - 1][col - 1])
							celula++;
						if (areaC[fil - 1][col])
							celula++;
						if (areaC[fil - 1][col + 1])
							celula++;
						if (areaC[fil][col - 1])
							celula++;
						if (areaC[fil][col + 1])
							celula++;
					} else if (fil != nFilas - 1 && fil != 0 && col == 0) {
						if (areaC[fil - 1][col])
							celula++;
						if (areaC[fil - 1][col + 1])
							celula++;
						if (areaC[fil][col + 1])
							celula++;
						if (areaC[fil + 1][col])
							celula++;
						if (areaC[fil + 1][col + 1])
							celula++;
					} else if (fil != nFilas - 1 && fil != 0 && col == nColumnas - 1) {
						if (areaC[fil - 1][col - 1])
							celula++;
						if (areaC[fil - 1][col])
							celula++;
						if (areaC[fil][col - 1])
							celula++;
						if (areaC[fil + 1][col - 1])
							celula++;
						if (areaC[fil + 1][col])
							celula++;
					} else {
						if (areaC[fil - 1][col - 1])
							celula++;
						if (areaC[fil - 1][col])
							celula++;
						if (areaC[fil - 1][col + 1])
							celula++;
						if (areaC[fil][col - 1])
							celula++;
						if (areaC[fil][col + 1])
							celula++;
						if (areaC[fil + 1][col - 1])
							celula++;
						if (areaC[fil + 1][col])
							celula++;
						if (areaC[fil + 1][col + 1])
							celula++;
					}
				}
				if (areaC[fil][col]) {
					if (celula == 0 || celula == 1 || celula >= 4)
						tablero[fil][col] = false;
				} else {
					if (celula == 3)
						tablero[fil][col] = true;
				}
				celula = 0;
			}
		}
	}

	public int sdk() {
		ControlJuego k = (ControlJuego) this.clone();
		int sdk = 0;

		for (int i = 0; i < 1000; i++) {
			boolean[][] areaCopy2 = k.copyArea();

			k.sigGen();

			// ver las matrices si son iguales
			boolean equal = true;
			for (int row2 = 0; row2 < nFilas; row2++) {
				for (int col2 = 0; col2 < nColumnas; col2++) {
					if (areaCopy2[row2][col2] != k.tablero[row2][col2]) {
						equal = false;
						break;
					}
				}
			}

			if (!equal)
				sdk++;
		}

		if (sdk < 1000)
			return sdk;
		else
			return -1;
	}

	public boolean[][] getArea() {
		return tablero;
	}

	public void setArea(boolean[][] area) {
		this.tablero = area;
	}

	private boolean[][] copyArea() {
		boolean[][] areaS = new boolean[nFilas][nColumnas];

		for (int row = 0; row < nFilas; row++)
			for (int col = 0; col < nColumnas; col++)
				areaS[row][col] = tablero[row][col];

		return areaS;
	}

	protected Object clone() {
		ControlJuego k = new ControlJuego(nFilas, nColumnas);

		k.tablero = this.copyArea();

		return k;
	}
}
