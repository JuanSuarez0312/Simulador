package modelo;

import java.util.ArrayList;
import java.util.List;

public class proyeccionDAO {

    public proyeccionDAO() {
    }

    public double calcularCuota(int plazo, double interes, double monto) {
        return monto * (Math.pow(1 + interes / 100, plazo) * interes / 100) / (Math.pow(1 + interes / 100, plazo) - 1);
    }

    public List<Proyeccion> generarProyeccion(int plazo, double interes, double monto){
        List<Proyeccion> lista = new ArrayList();
        double cuota = calcularCuota(plazo, interes, monto);
        double auxSaldoFinal=0;
        
        for (int i = 1; i <= plazo; i++) {
            Proyeccion proyeccion = new Proyeccion();
            proyeccion.setMes(i);
            proyeccion.setCuota(cuota);
            
            if (i==1) {
                proyeccion.setSaldoInicial(monto);
            }else{
                proyeccion.setSaldoInicial(auxSaldoFinal);
            }
            proyeccion.setIntereses(proyeccion.getSaldoInicial() * interes/100);
            proyeccion.setCapital(proyeccion.getCuota() - proyeccion.getIntereses());
            proyeccion.setSaldoFinal(proyeccion.getSaldoInicial() - proyeccion.getCapital());
            auxSaldoFinal=proyeccion.getSaldoFinal();
            
            lista.add(proyeccion);
        }
        return lista;
    }
}
