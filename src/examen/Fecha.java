package examen;
/**
 * 
 *@author dam115
 *@version 1.0
 */
public class Fecha {
	/**
	 * Es un método público de tipo boolean llamado fechaValida
	 */
	public static boolean fechaValida;
	
	/**
	 * Este es un método que se encarga de validar si una fecha es válida o no
	 * @param anio hace referencia al año 
	 * @param mes hace referencia al mes 
	 * @param dia hace referencia al dia
	 * @return tras cumplir todas las condiciones devuelve que la fecha es válida
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}