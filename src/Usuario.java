import java.util.Map;

public class Usuario {
	Sugerencia sugerenciaDiaria;
	
	public void actualizarSugerencia (Sugerencia sugerencia) {
		sugerenciaDiaria = sugerencia;
	}
	
	public Map<String, Object> obtenerUltimasAlertas(ServicioNotificacion servicioNotificacion){
		return servicioNotificacion.alertas;
	}
	
	}
