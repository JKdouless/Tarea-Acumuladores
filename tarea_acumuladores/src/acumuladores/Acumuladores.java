package acumuladores;

public class Acumuladores {
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) {
		boolean ret = false;
		if (mat.length > 0 && num > 0) {
			for (int f = 0; f < mat.length; f++) {
				boolean todos = true;
				for (int c = 0; c < mat[f].length; c++) {
					todos = todos && mat[f][c] % num == 0;
				}
				ret = ret || todos;
			}
		}
		return ret;
	}

	public boolean hayInterseccionPorFila(int[][] mat1, int[][] mat2) {
		boolean ret = false;
		if (mat1.length > 0 &&
			mat2.length > 0 &&
			mat1.length == mat2.length) {
			ret = true;
			for (int f = 0; f < mat1.length; f++) {
				boolean hayInterseccion = false;
				for (int c1 = 0; c1 < mat1[f].length; c1++) {
					for (int c2 = 0; c2 < mat2[f].length; c2++) {
						hayInterseccion =
							hayInterseccion ||
							mat1[f][c1] == mat2[f][c2];
					}
				}

				ret = ret && hayInterseccion;
			}
		}
		return ret;
	}
	
	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) {
		boolean ret = false;
		if (mat.length > 0 &&
			nColum >= 0 &&
			nColum < mat[0].length) {

			int sumaColumna = 0;

			for (int f = 0; f < mat.length; f++) {
				sumaColumna += mat[f][nColum];
			}
			for (int f = 0; f < mat.length; f++) {

				int sumaFila = 0;

				for (int c = 0; c < mat[f].length; c++) {
					sumaFila += mat[f][c];
				}
				ret = ret || sumaFila > sumaColumna;
			}
		}
		return ret;
	}

	public boolean hayInterseccionPorColumna(int[][] mat1, int[][] mat2) {
		boolean ret = false;
		if (mat1.length > 0 &&
			mat2.length > 0 &&
			mat1[0].length == mat2[0].length) {
			ret = true;
			for (int c = 0; c < mat1[0].length; c++) {
				boolean hayInterseccion = false;
				for (int f1 = 0; f1 < mat1.length; f1++) {
					for (int f2 = 0; f2 < mat2.length; f2++) {
						hayInterseccion =
							hayInterseccion ||
							mat1[f1][c] == mat2[f2][c];
					}
				}
				ret = ret && hayInterseccion;
			}
		}
		return ret;
	}
}