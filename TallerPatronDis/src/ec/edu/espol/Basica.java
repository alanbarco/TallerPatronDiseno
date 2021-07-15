package ec.edu.espol;

public class Basica implements TarjetaCredito {

	@Override
	public String getTipo() {
		return "Basica";
	}

	@Override
	public int getLimiteCredito() {
		return 500;
	}

	@Override
	public int getCostoAnual() {
		return 5000;
	}
	

}
