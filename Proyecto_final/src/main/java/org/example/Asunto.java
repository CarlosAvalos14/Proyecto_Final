package org.example;

import java.util.Date;

public class Asunto {
    private int idAsunto;
    private int expedienteId;
    private String tipoAsunto;
    private Date fechaAsunto;
    private String estadoAsunto;

    public Asunto(int idAsunto, int expedienteId, String tipoAsunto, Date fechaAsunto, String estadoAsunto) {
        this.idAsunto = idAsunto;
        this.expedienteId = expedienteId;
        this.tipoAsunto = tipoAsunto;
        this.fechaAsunto = fechaAsunto;
        this.estadoAsunto = estadoAsunto;
    }

    // Métodos Getters
    public String getTipoAsunto() {
        return tipoAsunto;
    }

    public String getEstadoAsunto() {
        return estadoAsunto;
    }
}
