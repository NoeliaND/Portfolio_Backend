package servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Persona;

@WebServlet(name = "SvPersona", urlPatterns = {"/SvPersona"})
public class SvPersona extends HttpServlet {
    
    Controladora control=new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        List<Persona> listaPersonas = control.traerPersona();
        
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaPersonas",listaPersonas);
        
        response.sendRedirect("verPersonas.jsp");        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        Persona pers = new Persona(0,dni,nombre,apellido,telefono);
        control.crearPersona(pers);
        
        response.sendRedirect("index.jsp");
        
        /*System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Telefono: " + telefono);*/
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
