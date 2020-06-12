
public class ActualizarSugerenciaObserver implements AlertaObserver {
	Empleado empleado;
	Sugerencia nuevaSugerencia; 
	public void recibirAlerta(Object alerta) {
		//nuevaSugerencia.crearSegunCriterio(criterio)
		empleado.enviarSugerencias(nuevaSugerencia);
	}

}
