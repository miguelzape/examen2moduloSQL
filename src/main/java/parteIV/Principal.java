package parteIV;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import parteIV.daos.UserDao;
import parteIV.entities.Contrato;
import utils.UtilsFecha;




public class Principal {
	
	private static final Logger logger = LogManager.getLogger(Principal.class);

	public static void main(String[] args) {
		
		Principal pu = new Principal();
		pu.proceso();
	}
	
	
	private void proceso() {
		UserDao udao = new UserDao();
		
		//crear fechas 31/12/2023, 31/12/2024,  31/12/2025 
		Date final1 = UtilsFecha.crearDate(2023,12,31);
		Date final2 = UtilsFecha.crearDate(2024,12,31);
		Date final3 = UtilsFecha.crearDate(2025,12,31);
		
		//insertar en la tabla estos objetos
		Contrato c1=new Contrato("Manolo",new Date(),final1,1100);
		Contrato c2=new Contrato("Paco",new Date(),final2,2200);
		Contrato c3=new Contrato("Emilio",new Date(),final3,850);
		udao.insertarContratos(Arrays.asList(c1,c2,c3));
		
		//recuperar todos los contratos almacenados en la base de datos y logearlos
		logger.info("Lista de contratos");
		for (Contrato c : udao.getContratos()){
			logger.info(c);
		}
		
		//buscar contrato por nombre de cliente
		List<Contrato> contratos=udao.getContratosByName("Paco");
		for (Contrato c : contratos) {
			logger.info(c);
		}
		
		//Obtener contratos que finalicen después del 10/10/2024
		Date final4 = UtilsFecha.crearDate(2024,10,10);
		logger.info("Lista de contratos posteriores a 10 10 2024");
		for (Contrato c : udao.getContratosByDate(final4)) {
			logger.info(c);
		}
		
		//Encontrar contratos cuyo importe sea superior a cierto valor solicitado.
		logger.info("Lista de contratos con importe mayor a 1000");
		for (Contrato c : udao.getContratosSupImporte(1000)) {
			logger.info(c);
		}
		
		     
		logger.trace("codigo finalizado");
		udao.close();
	}

}
