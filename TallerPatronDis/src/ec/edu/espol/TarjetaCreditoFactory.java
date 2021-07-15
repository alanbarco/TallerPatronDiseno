package ec.edu.espol;

public abstract class TarjetaCreditoFactory {
	protected abstract TarjetaCredito MakeProduct();
	public TarjetaCredito CrearProducto() {
		return this.MakeProduct();
	}
}
