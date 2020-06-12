import java.util.*;

public class ServicioNotificacion {
	AccuWeatherAPI apiClima = new AccuWeatherAPI();
	Map<String, Object> alertas = apiClima.getWeather("Buenos Aires").get(0); 
	Object generarAlertas(){
	return alertas.get("CurrentAlerts"); //Devuelve un objeto como [“STORM”, “HAIL”, ...]
	}
}
