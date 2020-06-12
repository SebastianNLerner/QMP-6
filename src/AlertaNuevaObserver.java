
public class AlertaNuevaObserver implements AlertaObserver{
	Empleado empleado;
	
	
	public void recibirAlerta(Object alerta) {
		empleado.enviarMailUsuarios(Alerta);
	}
}
