package canchas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestionCancha {

    public ArrayList<Cancha> canchas;
    public ArrayList<Reserva> reservas;

    public GestionCancha() {
        this.canchas = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarCancha(Cancha cancha) {
        canchas.add(cancha);
    }

    public boolean verificarDisponibilidad(Cancha cancha , LocalDate fechaInicio, int horas) {
        for (Reserva reserva : reservas) {
            if (reserva.getFechaInicio().equals(fechaInicio) || reserva.getCancha().equals(cancha)) {
                return false;
            }
        }
        return true;
    }


    public Reserva reservar(LocalDate fecha, int horas, Cancha cancha, Cliente cliente) {
        if (verificarDisponibilidad(cancha, fecha, horas)  ) {
            double pago = cancha.calcularPagoCanchas(horas);
            Reserva nuevaReserva = new Reserva(fecha, horas, cancha, cliente, pago);
            reservas.add(nuevaReserva);
            System.out.println("Reserva realizada exitosamente para " + cliente.getNombre());
            return nuevaReserva;
        } else {
            System.out.println("La " + fecha + " no esta disponible en la fecha y horas seleccionadas.");
            return null;
        }
    }



    public void eliminarReserva(Reserva reserva) {
        if (reservas.contains(reserva)) {
            reservas.remove(reserva);
            System.out.println("La reserva de la : '" + reserva.getCancha().getNombreCancha()+  "' se elimino.");
        }else {
            System.out.println("La reserva ya se ha eliminado del sistema."); 
        }
    }
     public List<Reserva> obtenerReservas() {
        return reservas;
    }

    
}
