package parteIII.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ddbb.ejerciciosDelProfesor.biblioteca.entities.Biblioteca;
import utils.Utilidades;
import utils.UtilsDB;

public class ProductosDao {
	
	private static final Logger logger = LogManager.getLogger(ProductosDao.class);
	
	
	public ProductosDao() throws SQLException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int insertarProductos() throws SQLException {
		logger.debug("insertarBiblioteca "+biblioteca);

		String query = "INSERT "
				+ "INTO TB_BIBLIOTECA (NOMBRE,FK_DIRECCION) "
				+ "VALUES (?,?)";
		
		logger.debug("query: "+query);
		PreparedStatement ps = this.getConexion().prepareStatement(query);
		ps.setString(1, biblioteca.getNombre());
		ps.setLong(2, biblioteca.getDireccion().getId());
		
		int insertados = ps.executeUpdate();
		logger.debug("Bibliotecas insertadas "+insertados);
		
		return insertados;
	}
	
}
	
	
	