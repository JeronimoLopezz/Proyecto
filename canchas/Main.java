package canchas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        GestionCancha sistema = new GestionCancha();

        // Crear canchas
        Cancha cancha1 = new Cancha("Cancha 1", "ff", "Grande", 14 , 20000);
        Cancha cancha2 = new Cancha("Cancha 2", "Disponible", "Grande", 14 , 20000);
        
        //Agregar canchas
        sistema.agregarCancha(cancha1);
        sistema.agregarCancha(cancha2);

        // Crear clientes
        Cliente cliente1 = new Cliente("Luis", "32123", "31326237");
        Cliente cliente2 = new Cliente("Ana Lopez", "C456", "237272");



        LocalDate fechaDeReserva1 = LocalDate.of(2023, 12, 1);
        LocalDate fechaDeReserva2 = LocalDate.of(2022, 12, 23);

       // Realizar reservas
       System.out.println("\n REALIZANDO RESERVAS");
       Reserva reserva1 =  sistema.reservar(fechaDeReserva1, 5, cancha1, cliente1);
       Reserva reserva2 = sistema.reservar(fechaDeReserva2, 3, cancha2, cliente2);



       //Eliminar reserva
       System.out.println("\nRESERVAS ELIMINADAS");
       sistema.eliminarReserva(reserva1);

       //Ya debio haberse eliminado
       sistema.eliminarReserva(reserva1);


       //Info de reservas
        System.out.println("\n Información de las reservas:");
        sistema.obtenerReservas().forEach(System.out::println);

        //CREAR PAGO Y REALIZARLO.
        System.out.println("\n Informacion Sobre PAGOS");
        Pago pago1 = new Pago(reserva2, fechaDeReserva2);

        //Debemos calcular cuanto debemos pagar
        pago1.calcularMonto();

        //Tenemos que calcular el monto antes de pagar
        pago1.realizarPago(60000);



    
    }


        
 }
    

