package ec.edu.espol;

public class Premium implements TarjetaCredito {

	@Override
	public String getTipo() {
		return "Premium";
	}

	@Override
	public int getLimiteCredito() {
		return 750;
	}

	@Override
	public int getCostoAnual() {
		return 7500;
	}

}
