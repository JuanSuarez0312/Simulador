package test;

import java.util.List;
import modelo.Proyeccion;
import modelo.proyeccionDAO;

public class prueba {
    public static void main(String[] args) {
        Proyeccion proyeccion = new Proyeccion();
        proyeccionDAO proyeccionDAO = new proyeccionDAO();
        
        List<Proyeccion> lista = proyeccionDAO.generarProyeccion(24, 1, 8000000);
        
        for (Proyeccion proyeccion1 : lista) {
            System.out.println(proyeccion1.toString());
        }
    }
    
    
}
