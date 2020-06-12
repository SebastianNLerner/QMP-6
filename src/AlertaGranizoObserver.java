
public class AlertaGranizoObserver implements AlertaObserver{
	public void recibirAlerta(Object alerta) {
		if (/*alerta tiene Granizo*/) {
			new Exception("Va a haber granizo, evite salir en auto");
		}
	}

}
