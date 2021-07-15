package ec.edu.espol;

public class VIPFactory extends TarjetaCreditoFactory{

	@Override
	protected TarjetaCredito MakeProduct() {
		TarjetaCredito tarjeta = new VIP();
		return tarjeta;
	}

}
