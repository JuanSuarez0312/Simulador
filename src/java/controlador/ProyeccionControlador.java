package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import modelo.Proyeccion;
import modelo.proyeccionDAO;
/**
 *
 * @author Aprendiz
 */
@ManagedBean
@SessionScoped
public class ProyeccionControlador  {


    public ProyeccionControlador() {
    }
    Proyeccion proyeccion;
    proyeccionDAO proyeccionDAO = new proyeccionDAO();
    List<Proyeccion> lista = new ArrayList();
    int plazo=0;
    double monto=0;
    double interes=0;
    
    
    
    public void calcularCuota(){
        proyeccionDAO.calcularCuota(plazo, interes, monto);
        lista = proyeccionDAO.generarProyeccion(plazo, interes, monto);
    }

    public Proyeccion getProyeccion() {
        return proyeccion;
    }

    public void setProyeccion(Proyeccion proyeccion) {
        this.proyeccion = proyeccion;
    }

    public proyeccionDAO getProyeccionDAO() {
        return proyeccionDAO;
    }

    public void setProyeccionDAO(proyeccionDAO proyeccionDAO) {
        this.proyeccionDAO = proyeccionDAO;
    }

    public List<Proyeccion> getLista() {
        return lista;
    }

    public void setLista(List<Proyeccion> lista) {
        this.lista = lista;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    
}
