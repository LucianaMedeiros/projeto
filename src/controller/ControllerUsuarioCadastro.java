package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Usuario;
import manager.BeanUsuario;

 
@WebServlet("/ControllerUsuarioCadastro")
public class ControllerUsuarioCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		 Usuario u = new Usuario();
		   u.setIdUsuario(new Integer(request.getParameter("id")));
		   u.setNome(request.getParameter("nome"));
		   u.setEmail(request.getParameter("email"));
		   u.setSenha(request.getParameter("senha"));
		   BeanUsuario.adicionar(u);
		
		   System.out.println(BeanUsuario.usuarios);
		   
		   request.setAttribute("msg","Dados Gravados");
		   request.getRequestDispatcher("sistema.jsp").
		     forward(request, response);
		 
	}

}
