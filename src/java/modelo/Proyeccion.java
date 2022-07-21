package modelo;

public class Proyeccion {

    int mes;
    double saldoInicial;
    double intereses;
    double cuota;
    double capital;
    double saldoFinal;

    public Proyeccion() {
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    @Override
    public String toString() {
        return "Proyeccion{" + "mes=" + mes + ", saldoInicial=" + saldoInicial + ", intereses=" + intereses + ", cuota=" + cuota + ", capital=" + capital + ", saldoFinal=" + saldoFinal + '}';
    }
    
    
    
    
}
