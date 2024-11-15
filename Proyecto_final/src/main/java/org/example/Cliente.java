package org.example;

public class Cliente {
    private int idCliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private String tipoCliente;

    public Cliente(int idCliente, String nombre, String direccion, String telefono, String email, String tipoCliente) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.tipoCliente = tipoCliente;
    }

    // Métodos Getters
    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }
}
