package ec.edu.espol;

public class BasicaFactory extends TarjetaCreditoFactory {

	@Override
	protected TarjetaCredito MakeProduct() {
		TarjetaCredito tarjeta = new Basica();
		return tarjeta;
	}

}
