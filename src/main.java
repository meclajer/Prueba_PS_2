/*
 * Autor: Miguel Eduardo Castillo Landeros
 * Fecha: 6/6/21
 * Descripcion: Prueba de Punto Singular punto 2
 */

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//Objeto necesario para la entrada de los datos
		Scanner mScanner = new Scanner(System.in);
		
		//Variables necesarias
		String palabra;
		char[] letras;
		boolean[] vocales;
		byte cantidadConsonantes = 0, contador = 0;
		
		System.out.print("Programa 1.\n\tPalabra a evaluar: ");
		palabra = mScanner.next();
		mScanner.close();
		
		//separar la palabra por letras
		letras = palabra.toCharArray();
		
		//identificar las vocales y su ubicacion
		vocales = new boolean[letras.length];
		for (int i = 0; i < letras.length; i++) {
			if ( 	String.valueOf( letras[i] ).equalsIgnoreCase("a") || String.valueOf( letras[i] ).equalsIgnoreCase("á") || 
					String.valueOf( letras[i] ).equalsIgnoreCase("e") || String.valueOf( letras[i] ).equalsIgnoreCase("é") || 
					String.valueOf( letras[i] ).equalsIgnoreCase("i") || String.valueOf( letras[i] ).equalsIgnoreCase("í") || 
					String.valueOf( letras[i] ).equalsIgnoreCase("o") || String.valueOf( letras[i] ).equalsIgnoreCase("ó") || 
					String.valueOf( letras[i] ).equalsIgnoreCase("u") || String.valueOf( letras[i] ).equalsIgnoreCase("ú") ) {
				vocales[i] = true;
				if ( cantidadConsonantes < contador ) {
					cantidadConsonantes = contador;
				}
				contador = 0;
			} else {
				vocales[i] = false;
				contador++;
			}
		}
		
		//ver la cantidad de consonantes entre vocal y vocal, para identificar a que regla pertenecen
		switch (cantidadConsonantes) {
		case 1: {//regla 1 (Una sola consonante entre dos vocales se agrupa con la vocal que sigue)
			//cortar por secciones hasta cada vocal
				//Cargar resultado a variable de resultado String
			
			
			break;
		}
		case 2: {//regla 2 (Dos consonantes entre dos vocales se agrupan una para cada vocal.)
	  		//buscar las exepciones de grupos consonanticos: pr, pl, br, bl, fr, fl, tr, tl, dr, dl, cr, cl, gr, ch, ll o rr
			
			
			//Reestructurar uniendo las consonantes de la exepcion (bucle)
	
	
			//reidentificar las vocales y su ubicacion
	
	
			//Bucle para cortar la palabra conforme a la regla
				//si entre vocal y vocal solo hay una consonante se agrupara a la siguiente vocal
					//Cargar resultado a variable de resultado String
	
				//si hay dos consonantes una consonante para cada vocal
					//Cargar resultado a variable de resultado String
				
					
			break;
				}
		case 3: {//regla 3 (Tres consonantes en medio de dos vocales se agrupan dos con la primera vocal y la tercera con la vocal que sigue.)
			//buscar las exepciones de grupos consonanticos: pr, pl, br, bl, fr, fl, tr, tl, dr, dl, cr, cl, gr, ch, ll o rr
			
			
			//Reestructurar uniendo las consonantes de la exepcion (bucle)

			//reidentificar las vocales y su ubicacion
	
			//Bucle para cortar la palabra conforme a la regla
				//si hay 3 consonantes dos para la vocal izquierda y una para la derecha
					//Cargar resultado a variable de resultado String
	
				//si entre vocal y vocal hay 2 consonantes, una consonante para cada vocal
					//Cargar resultado a variable de resultado String

				//si entre vocal y vocal hay 1 consonantes dejar para la vocal derecha
					//Cargar resultado a variable de resultado String
			
			
			break;
		}
		case 4: {//regla 4 (Cuatro consonantes en medio de dos vocales se agrupan dos con la primera vocal y las otras dos con la vocal que sigue.)
			//Bucle para cortar la palabra conforme a la regla
			//dividir las 4 consonantes 2 para cada vocal (izq y derecha)
				//Cargar resultado a variable de resultado String

			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + cantidadConsonantes);
		}//Fin de switch de reglas
		
		
		//Mostrar en pantalla el resultado
		
	}

}
