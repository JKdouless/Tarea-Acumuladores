package acumuladores;

public class Acumuladores {
	public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) {
		boolean res = false;
		if (mat.length > 0 && num > 0) {
			for (int f = 0; f < mat.length; f++) {
				boolean todos = true;
				for (int c = 0; c < mat[f].length; c++) {
					todos = todos && mat[f][c] % num == 0;
				}
				res = res || todos;
			}
		}
		return res;
	}

	public boolean hayInterseccionPorFila(int[][] mat1, int[][] mat2) {
		boolean res = false;
		if (mat1.length > 0 &&
			mat2.length > 0 &&
			mat1.length == mat2.length) {
			res = true;
			for (int f = 0; f < mat1.length; f++) {
				boolean hayInterseccion = false;
				
				for (int c1 = 0; c1 < mat1[f].length; c1++) {
					
					for (int c2 = 0; c2 < mat2[f].length; c2++) {
						hayInterseccion =
							hayInterseccion ||
							mat1[f][c1] == mat2[f][c2];
					}
				} res = res && hayInterseccion;
			}
		}
		return res;
	}
	
	public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) {
		boolean res = false;
		if (mat.length > 0 &&
			nColum >= 0 &&
			nColum < mat[0].length) {
			int sc = 0;
			for (int f = 0; f < mat.length; f++) {
				sc += mat[f][nColum];
			}
			for (int f = 0; f < mat.length; f++) {
				int sf = 0;
				for (int c = 0; c < mat[f].length; c++) {
					sf += mat[f][c];
				} res = res || sf > sc;
			}
		}
		return res;
	}

	public boolean hayInterseccionPorColumna(int[][] mat1, int[][] mat2) {
	boolean res = false;
	if (mat1.length > 0 &&
		mat2.length > 0 &&
		mat1[0].length == mat2[0].length) {
		res = true;
		for (int c = 0; c < mat1[0].length; c++) {
		boolean inter = false;
			for (int f1 = 0; f1 < mat1.length; f1++) {
				for (int f2 = 0; f2 < mat2.length; f2++) {
					inter =	inter || mat1[f1][c] == mat2[f2][c];
					}
				} res = res && inter;
			}
		}
		return res;
	}
}