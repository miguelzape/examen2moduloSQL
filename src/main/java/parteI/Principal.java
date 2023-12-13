package parteI;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Principal { 

	private static final Logger logger = LogManager.getLogger(Principal.class);

	public static void main(String[] args) {

		Principal p = new Principal();
		p.hacerTodo();

	}

	private void hacerTodo() {

		// 1. Crear 3 masters y guardarlos en un mapa
		Map<String, Master> masters = crearMasters();
 
		// 2. de los masters existentes, eliminar uno por su codigo
		eliminaMasterPorCodigo(masters, "PyC1");

		// 3. mostrar los nombres de los masters disponibles. Solo los oficiales
		mostrarNombresMastersOficiales(masters);

	}

	private Map<String, Master> crearMasters() {

		Map<String, Master> masters = new HashMap<String, Master>();

		Master m1 = new Master("Ingles", "IngA1", 30, false);
		Master m2 = new Master("Java", "JB1", 17, true);
		Master m3 = new Master("Python", "PyC1", 17, true);

		masters.put(m1.getcodigo(), m1);
		masters.put(m2.getcodigo(), m2);
		masters.put(m3.getcodigo(), m3);

		return masters;
	}

	private void eliminaMasterPorCodigo(Map<String, Master> masters, String code) {

		masters.remove(code);
	}

	private void mostrarNombresMastersOficiales(Map<String, Master> masters) {
		
		Set<Entry<String, Master>> m = masters.entrySet();
		for (Entry<String, Master> entry : m) {
			if (entry.getValue().isOficial()) {
				logger.info(entry.getValue().getNombreCurso());
			}
		}
	}

}
