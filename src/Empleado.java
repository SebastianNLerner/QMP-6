import java.util.List;

public class Empleado {
  List<Usuario> usuarios;
  List<AlertaObserver> alertaObservers;
  //MailSender mailSender;
  
  void enviarSugerencias(Sugerencia sugerencia) {
	  usuarios.forEach((usuario)->{usuario.actualizarSugerencia(sugerencia);});
  }
  
  void actualizarAlertas(ServicioNotificacion servicioNotificador) {
	  alertaObservers.forEach((alerta)->{alerta.recibirAlerta(servicioNotificador.generarAlertas());});
  }
  
  void enviarMailUsuarios(Object alerta) {
	  usuarios.forEach(usuario->{mailSender.enviarMail(usuario,alerta);});
  }
  
  void eliminarObserver(AlertaObserver observer) {
	  alertaObservers.remove(observer);
  }
  
  void agregarObserver(AlertaObserver observer) {
	  alertaObservers.add(observer);
  }
}
