package capaModelo;

/**
 * Clase que implementa la entidad DetallePedidoPixel la cual tiene los parámetros para detallar al sistema Pos el pedido
 * @author JuanDavid
 *
 */
public class DetallePedidoPixel {
	
	private int idproductoext;
	private double cantidad;
	
	public int getIdproductoext() {
		return idproductoext;
	}
	public void setIdproductoext(int idproductoext) {
		this.idproductoext = idproductoext;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public DetallePedidoPixel(int idproductoext, double cantidad) {
		super();
		this.idproductoext = idproductoext;
		this.cantidad = cantidad;
	}

	
	
	
}
