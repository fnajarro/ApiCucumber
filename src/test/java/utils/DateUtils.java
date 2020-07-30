package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	public static String getDataDiferencaDias(Integer qtdDias) {
		Calendar cal = Calendar.getInstance(); //Retorna uma inst�ncia do Calendar representando a data atual
		cal.add(Calendar.DAY_OF_MONTH, qtdDias); //Adiciona a quantidade de dias passada no par�metro "qtdDias" ao dia do m�s, se por passado o valor 1 ser� somado um e vai resultar na data do dia seguinte
		return getDataFormatada(cal.getTime());// Chama o m�todo que formata a data e retorna a data formatada
	}
	
	public static String getDataFormatada(Date data) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return format.format(data);
	}

}
