package ec.edu.espol;

public class PremiumFactory extends TarjetaCreditoFactory{

	@Override
	protected TarjetaCredito MakeProduct() {
		TarjetaCredito tarjeta = new Premium();
		return tarjeta;
	}

}
