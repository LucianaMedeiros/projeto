package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Usuario;
import manager.BeanUsuario;
 
@WebServlet("/ControllerUsuarioLogin")
public class ControllerUsuarioLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
		try {
		 Usuario a = new Usuario(); 
		  a.setEmail(request.getParameter("email")); 
		  a.setSenha(request.getParameter("senha"));
		   
		   Usuario resposta = BeanUsuario.findByUsuario(a); //se estoura catch
		   
		   
		   HttpSession session = request.getSession(true);
		   session.setAttribute("usuario", resposta);
		   response.sendRedirect("saida.jsp");   
		   
		   
		   /* o que tu fez ????
		    * variável é temporario 
		   // request.setAttribute("usuario", resposta);
		    //  request.getRequestDispatcher("saida.jsp").
		      //  forward(request, response);
		   **/
		   
		}catch(Exception ex) {
		
			request.setAttribute("msg", "error:" + ex.getMessage());
		   request.getRequestDispatcher("error.jsp").
		      forward(request, response);
		
		}
		
		
	}

}
