package org.example;

import java.util.Date;

public class Audiencia {
    private int idAudiencia;
    private int expedienteId;
    private Date fecha;
    private String lugar;
    private String estadoAudiencia;

    public Audiencia(int idAudiencia, int expedienteId, Date fecha, String lugar, String estadoAudiencia) {
        this.idAudiencia = idAudiencia;
        this.expedienteId = expedienteId;
        this.fecha = fecha;
        this.lugar = lugar;
        this.estadoAudiencia = estadoAudiencia;
    }

    // Métodos Getters
    public int getIdAudiencia() {
        return idAudiencia;
    }

    public int getExpedienteId() {
        return expedienteId;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public String getEstadoAudiencia() {
        return estadoAudiencia;
    }
}
