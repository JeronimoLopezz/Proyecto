package canchas;

import java.time.LocalDate;

public class Reserva {

    private Cliente cliente;
    private Cancha cancha;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private int horas;


    Reserva(LocalDate fecha, int horas, Cancha cancha, Cliente cliente, double pago) {
        this.cliente = cliente;
        this.cancha = cancha;
        this.fechaInicio = fecha;
        this.horas = horas;

    }

    
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cancha getCancha() {
        return cancha;
    }
    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public LocalDate getFechaFinal() {
        return fechaFinal;
    }
    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
public String toString() {
    return "Reserva [Fecha: " + fechaInicio + ", Fecha Final: " + fechaFinal + ", Cancha: " + cancha + ", Cliente: " + cliente + "]";
}


}
