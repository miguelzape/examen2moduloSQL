package utils;

import java.util.Calendar;
import java.util.Date;

public class UtilsFecha {
	
	public static Date generaFecha() {
		Date fecha = null;
		Calendar calendario = Calendar.getInstance();

        //calendario.set(2019, Calendar.SEPTEMBER, 25, 18, 20, 10);
        calendario.set(Calendar.YEAR, 2022);
        calendario.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendario.set(Calendar.DAY_OF_MONTH, 1);

        //calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        fecha = calendario.getTime();
		
		return fecha;
	}

//	public static Date generaFechaActual() {
//		Date fecha = new Date();
//		
//		return fecha;
//	}
	
	public static Date fechaHoyCambiaDias(int dias) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, dias);
		Date nowMinusDays = c.getTime();
		return nowMinusDays;
	}
	
	public static Date fechaHoyCambiaAnios(int anios) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, anios);
		return c.getTime();
	}
	
	public static Date crearDate(int year,int month, int day) { 
		
		Calendar calendario = Calendar.getInstance();

        //calendario.set(2019, Calendar.SEPTEMBER, 25, 18, 20, 10);
        calendario.set(Calendar.YEAR, year - 1900);
        calendario.set(Calendar.MONTH, month - 1 );  
        calendario.set(Calendar.DAY_OF_MONTH, day);
		return calendario.getTime(); 
	}
}
