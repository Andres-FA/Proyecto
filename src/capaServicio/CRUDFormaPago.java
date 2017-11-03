package capaServicio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import capaControlador.ParametrosCtrl;

/**
 * Servlet implementation class CRUDFormaPago
 * Servicio que implementa el CRUD de la entidad Forma Pago.
 */
@WebServlet("/CRUDFormaPago")
public class CRUDFormaPago extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CRUDFormaPago() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * Se recibir� como par�metro principal el idoperacion con base en los siguientes valores 
	 *  idoperacion 1 insertar 2 editar 3 Eliminar  4 Consultar, de acuerdo a la id operacion se pedir�n los otros par�metros y se invocar� el m�todo en la capa controlador.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Operaci�n idoperacion 1 insertar 2 editar 3 Eliminar  4 Consultar
		response.addHeader("Access-Control-Allow-Origin", "*");		
		HttpSession sesion = request.getSession();
				response.addHeader("Access-Control-Allow-Origin", "*");
				String idoperacion = request.getParameter("idoperacion");
				ParametrosCtrl ParametrosCtrl = new ParametrosCtrl();
				int operacion;
				String respuesta="";
				try
				{
					operacion = Integer.parseInt(idoperacion);
				}catch(Exception e){
					operacion = 0;
				}
				if (operacion ==1)
				{
					String nombre = request.getParameter("nombre");
					String tipoformapago = request.getParameter("tipoformapago");
					//respuesta = ParametrosCtrl.insertarEstadoPedido(descripcion);
				}else if (operacion ==2)
				{
					int idformapagoedit= Integer.parseInt(request.getParameter("idformapago"));
					String nombreedit= request.getParameter("nombre");
					String tipoformaedit= request.getParameter("tipoformapago");
					//respuesta = ParametrosCtrl.editarEstadoPedido(idestedit, descedit);
				}else if (operacion ==3 )
				{
					int idformaeli = Integer.parseInt(request.getParameter("idformapago"));
					//respuesta = ParametrosCtrl.eliminarEstadoPedido(idesteli);
				}else if (operacion == 4)
				{
					int idformacon = Integer.parseInt(request.getParameter("idformapago"));
					//respuesta = ParametrosCtrl.retornarEstadoPedido(idestcon);
				}else if(operacion == 5)
				{
					respuesta = ParametrosCtrl.retornarFormasPago();
				}
				System.out.println(respuesta);
				PrintWriter out = response.getWriter();
				out.write(respuesta);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
