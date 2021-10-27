package program;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Application {

	public static void main(String[] args) {
		
		
		/*
		 * formatando a data com: SimpleDateFormat
		 * padronizando a data com: Date date = Date.from(Instant.parse("2021-08-01T19:32:00Z"));
		 */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = Date.from(Instant.parse("2021-08-01T19:32:00Z"));
		
		System.out.println(sdf.format(date)); 
		// será impresso a data no padrão UTC.
		
		/*
		 * utilizando o calendar pegar datas. 
		 */
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);		
		cal.add(Calendar.HOUR_OF_DAY, 3);		
		date = cal.getTime();	
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH); // temos que acrecentar um pois o mes começa com 0....
		
		//vamos pegar os minutos de uma hora....
		
		System.out.println(sdf.format(date));
		//será impresso uma data formatada.		
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}

}
