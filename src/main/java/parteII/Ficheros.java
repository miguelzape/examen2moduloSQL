package parteII;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ficheros {

	private static final Logger logger = LogManager.getLogger(Ficheros.class);

	public static void main(String[] args) {
		Ficheros f = new Ficheros();
		f.inicio();
	} 

	public void inicio() {
		
		// leer todas las lineas del archivo
		String ruta = ".\\recursos\\FicheroEjercicio2.txt";
		List<String> lineas = leerArchivo(ruta);
		// hacer log de las lineas
			for (String cadena : lineas) {
				logger.info(cadena);
			}
			
		// las lineas que contengan "java" se guardan en un mapa
		Map<Integer,String> mapa = new HashMap<>();
		
		int i=1;
		for (String linea : lineas) {
			if (linea.toLowerCase().contains("java")) {
				mapa.put(i, linea);
			}
			i++;
		}
		
		// mostar el numero de lineas con la palabra java
		logger.info("numero de las lineas que contienen la palabra java");
		for (Integer integer : mapa.keySet()) {
			logger.info(integer);
		}
		
		//por cada elemento del mapa mostar la suma de la clave y el numero de caracteres
		logger.info("sumas de la clave + el total de caracteres en el valor");
		
		Set<Entry<Integer, String>> entries = mapa.entrySet();
	
		for (Entry<Integer, String> entry : entries) {
			long posicion=entry.getKey();
			long nChar=entry.getValue().length();
			
			// resto 1 a la suma obtenida para quitar el caracte /n
			logger.info("para la linea " + posicion 
					+ " la suma solicitada es " + (posicion+nChar-1));
		}
			
	}
	

	public List<String> leerArchivo(String nombre) {
		
		List<String> cadenas = new ArrayList<>();
		File archivo = new File(nombre);
		try (Scanner s = new Scanner(archivo)) {
			s.useDelimiter("\n");
			while (s.hasNext()) cadenas.add(s.next());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cadenas;
	}
	
}
