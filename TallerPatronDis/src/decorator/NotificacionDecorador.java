package decorator;
import ec.edu.espol.TarjetaCredito;
public abstract class NotificacionDecorador implements Notificacion {
	protected Notificacion notificacion;
	private TarjetaCredito tarjeta;
	private String mensaje;

	@Override
	public void enviar() {
		System.out.println(mensaje);
		
	}

	public void NotificacionDecorador(Notificacion notificacion, TarjetaCredito tarjeta, String mensaje) {
		this.notificacion= notificacion;
		this.tarjeta= tarjeta;
		this.mensaje=mensaje;
	}

	public Notificacion getNotificacion() {
		return notificacion;
	}

	public void setNotificacion(Notificacion notificacion) {
		this.notificacion = notificacion;
	}

	public TarjetaCredito getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(TarjetaCredito tarjeta) {
		this.tarjeta = tarjeta;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
}
