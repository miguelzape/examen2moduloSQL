package mains;

import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import daos.UserDao;



public class PrincipalUno {
	
	private static final Logger logger = LogManager.getLogger(PrincipalUno.class);

	public static void main(String[] args) {
		
		PrincipalUno pu = new PrincipalUno();
		pu.proceso();
	}
	
	
	private void proceso() {
		UserDao udao = new UserDao();
		
		//UserDao udao = new UserDao("ejemploHibernateOracle");
//		Direccion dir1=new Direccion("Mayor","28008");
//		Direccion dir2=new Direccion("Prado","28010");
//		Biblioteca b1=new Biblioteca("Nueva",dir1);
//		Biblioteca b2=new Biblioteca("Otra",dir2);
//		
//		udao.insertarBiblios(Arrays.asList(b1,b2));
//		
//		List<Biblioteca> bibliotecas = udao.getbiblioteca();
		
		
		logger.trace("codigo finalizado");
		udao.close();
	}

}
