package ec.edu.espol;

public class VIP implements TarjetaCredito{

	@Override
	public String getTipo() {
		return "VIP";
	}

	@Override
	public int getLimiteCredito() {
		return 1000;
	}

	@Override
	public int getCostoAnual() {
		return 10000;
	}

}
