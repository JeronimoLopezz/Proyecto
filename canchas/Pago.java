package canchas;

import java.time.LocalDate;

public class Pago implements Pagable {

    private Reserva reserva;
    private double montoAPagar;
    private LocalDate fechaPago;
    private int horas;

    public Pago(Reserva reserva, LocalDate fechaPago) {
        this.reserva = reserva;
        this.fechaPago = fechaPago;
    }


    @Override
    public double calcularMonto() {
        double tarifaPorHora = reserva.getCancha().getTarifaHora();
        double montoAPagar = reserva.getHoras() * tarifaPorHora;
        System.out.println("El monto que debe pagar es de " +   montoAPagar);
        return montoAPagar;
    }

    @Override
    public void realizarPago(double montoCalculado) {

        this.fechaPago =  LocalDate.now();

        System.out.println
        ("Pago realizado por el monto de: " + montoCalculado +"\n" + 
        "Reserva asociada al cliente: "+ reserva.getCliente().getNombre() +
        ", Fecha de pago: " + fechaPago +
        ", " + reserva.getCancha().getNombreCancha());

    }

    public Reserva getReserva() {
        return reserva;
    }
    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    public LocalDate getFechaPago() {
        return fechaPago;
    }
    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getMontoAPagar() {
        return montoAPagar;
    }
    public void setMontoAPagar(double montoAPagar) {
        this.montoAPagar = montoAPagar;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }


    
}
