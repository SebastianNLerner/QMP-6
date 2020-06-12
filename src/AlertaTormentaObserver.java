
public class AlertaTormentaObserver implements AlertaObserver{
		public void recibirAlerta(Object alerta) {
			if (/*alerta tiene tormenta*/) {
				new Exception("Va a haber tormenta, salga con paraguas");
			}
		}
}
