package parteIII;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import utils.Utilidades;
import utils.UtilsDB;

public class Main {
	
private static final Logger logger = LogManager.getLogger(Main.class);
	

	public static void main(String[] args) {
	
		Main grupoBiblio = new Main();
		grupoBiblio.todo();
	}
	
	private void todo() {
		
		logger.trace("inicio");
		// insertar productos en la tabla TB_Productos
		
		
		
	
	}
}
	

