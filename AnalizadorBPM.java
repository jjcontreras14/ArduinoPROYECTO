package LecturaExcel;

import LecturaExcel.ExcelRead;

public class AnalizadorBPM {
	private double valor;

	public AnalizadorBPM(double valor) {
		this.valor = valor;
	}

	public void procesarValor() {
		if (valor > 105) {
			System.out.println("El valor es muy alto, hay riesgo de una taquicardia.");
			//Poner un código que contacte con urgencias.
		} else if (valor < 55) {
			System.out.println("El valor es muy bajo, hay riesgo de una bradicardia.");
			//Poner un código que contacte con urgencias.
		} else {
			System.out.println("El valor está en su rango regular");
		}
	}
}


