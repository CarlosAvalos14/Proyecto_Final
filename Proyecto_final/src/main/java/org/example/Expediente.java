package org.example;

import java.util.Date;

public class Expediente {
    private int idExpediente;
    private Date fechaInicio;
    private String estado;
    private String descripcion;
    private String tipo;
    private int clienteId;

    public Expediente(int idExpediente, Date fechaInicio, String estado, String descripcion, String tipo, int clienteId) {
        this.idExpediente = idExpediente;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.clienteId = clienteId;
    }

    // Métodos Getters
    public int getIdExpediente() {
        return idExpediente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }
}
