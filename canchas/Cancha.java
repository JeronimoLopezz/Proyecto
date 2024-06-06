package canchas;

import java.util.ArrayList;

public class Cancha {

    private String nombreCancha;
    private String disponibilidad;
    private String tamaño;
    private int capacidad;
    private double tarifaHora;
    public ArrayList<Reserva> reservas;


    public Cancha(String nombreCancha, String disponibilidad, String tamaño, int capacidad, double tarifaHora) {
        this.nombreCancha = nombreCancha;
        this.disponibilidad = disponibilidad;
        this.tamaño = tamaño;
        this.capacidad = capacidad;
        this.tarifaHora = tarifaHora;
        this.reservas = new ArrayList<>();


    }

    public double calcularPagoCanchas(int horas) {
        return horas * 20000; // Precio por hora para la cancha
    }

    public String getNombreCancha() {
        return nombreCancha;
    }
    public void setNombreCancha(String nombreCancha) {
        this.nombreCancha = nombreCancha;
    }
    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    public String getTamaño() {
        return tamaño;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public double getTarifaHora() {
        return tarifaHora;
    }
    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    @Override
    public String toString() {
        return "CANCHA: " + nombreCancha;
    }



}
  


    

