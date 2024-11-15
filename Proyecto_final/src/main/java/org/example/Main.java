package org.example;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un Cliente
        System.out.println("Ingrese los datos del cliente:");
        System.out.print("Nombre completo: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Dirección: ");
        String direccionCliente = scanner.nextLine();

        String telefonoCliente = "";
        while (true) {
            System.out.print("Teléfono (formato +505XXXXXXXX): ");
            telefonoCliente = scanner.nextLine();
            if (isValidPhoneNumber(telefonoCliente)) {
                break;
            } else {
                System.out.println("Teléfono inválido. Debe estar en el formato correcto (+505XXXXXXXX).");
            }
        }

        String emailCliente = "";
        while (true) {
            System.out.print("Correo electrónico: ");
            emailCliente = scanner.nextLine();
            if (isValidEmail(emailCliente)) {
                break;
            } else {
                System.out.println("Correo electrónico inválido. Por favor ingrese un correo electrónico válido.");
            }
        }

        System.out.print("Tipo de cliente (Persona Natural, Persona Jurídica): ");
        String tipoCliente = scanner.nextLine();

        Cliente cliente1 = new Cliente(1, nombreCliente, direccionCliente, telefonoCliente, emailCliente, tipoCliente);

        // Crear un Expediente
        System.out.println("\nIngrese los datos del expediente:");
        System.out.print("Descripción del expediente: ");
        String descripcionExpediente = scanner.nextLine();

        System.out.print("Tipo de expediente (penal, civil, administrativo, etc.): ");
        String tipoExpediente = scanner.nextLine();

        Date fechaInicio = new Date(); // Fecha actual
        Expediente expediente1 = new Expediente(101, fechaInicio, "abierto", descripcionExpediente, tipoExpediente, cliente1.getIdCliente());

        // Crear un Abogado
        System.out.println("\nIngrese los datos del abogado:");
        System.out.print("Nombre completo del abogado: ");
        String nombreAbogado = scanner.nextLine();

        System.out.print("Especialidad del abogado: ");
        String especialidadAbogado = scanner.nextLine();

        Abogado abogado1 = new Abogado(1, nombreAbogado, especialidadAbogado, expediente1.getIdExpediente(), "555-5678", "ana@email.com");

        // Crear un Asunto relacionado con el Expediente
        System.out.println("\nIngrese los datos del asunto:");
        System.out.print("Tipo de asunto (reunión, audiencia, negociación, etc.): ");
        String tipoAsunto = scanner.nextLine();

        Date fechaAsunto = new Date(); // Fecha actual
        Asunto asunto1 = new Asunto(1, expediente1.getIdExpediente(), tipoAsunto, fechaAsunto, "pendiente");

        // Crear una Solicitud de Inasistencia
        System.out.println("\nIngrese los datos de la solicitud de inasistencia:");
        System.out.print("Razón de la inasistencia: ");
        String razonInasistencia = scanner.nextLine();

        SolicitudInasistencia solicitud1 = new SolicitudInasistencia(1, cliente1.getIdCliente(), expediente1.getIdExpediente(), new Date(), razonInasistencia, "pendiente", "documento.pdf");

        // Crear una Audiencia
        System.out.println("\nIngrese los datos de la audiencia:");
        System.out.print("Lugar de la audiencia: ");
        String lugarAudiencia = scanner.nextLine();

        Date fechaAudiencia = new Date(); // Fecha y hora actual
        Audiencia audiencia1 = new Audiencia(1, expediente1.getIdExpediente(), fechaAudiencia, lugarAudiencia, "programada");

        // Imprimir los detalles de los objetos creados
        System.out.println("\nResumen de los datos ingresados:");
        System.out.println("Cliente: " + cliente1.getNombre() + ", Tipo: " + cliente1.getTipoCliente());
        System.out.println("Expediente: " + expediente1.getDescripcion() + ", Estado: " + expediente1.getEstado());
        System.out.println("Abogado: " + abogado1.getNombre() + ", Especialidad: " + abogado1.getEspecialidad());
        System.out.println("Asunto: " + asunto1.getTipoAsunto() + ", Estado: " + asunto1.getEstadoAsunto());
        System.out.println("Solicitud de Inasistencia: " + solicitud1.getRazonInasistencia() + ", Estado: " + solicitud1.getEstadoSolicitud());
        System.out.println("Audiencia: " + audiencia1.getLugar() + ", Estado: " + audiencia1.getEstadoAudiencia());

        scanner.close();
    }

    // Método para validar el formato de correo electrónico
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    // Método para validar el formato del número de teléfono de Nicaragua (+505XXXXXXXX)
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String phoneRegex = "^\\+505\\d{8}$";
        Pattern pattern = Pattern.compile(phoneRegex);
        return pattern.matcher(phoneNumber).matches();
    }
}
