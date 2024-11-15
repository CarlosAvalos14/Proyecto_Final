package org.example;

import java.util.Date;

public class SolicitudInasistencia {
    private int idSolicitud;
    private int clienteId;
    private int expedienteId;
    private Date fechaSolicitud;
    private String razonInasistencia;
    private String estadoSolicitud;
    private String documentoAdicional;

    public SolicitudInasistencia(int idSolicitud, int clienteId, int expedienteId, Date fechaSolicitud,
                                 String razonInasistencia, String estadoSolicitud, String documentoAdicional) {
        this.idSolicitud = idSolicitud;
        this.clienteId = clienteId;
        this.expedienteId = expedienteId;
        this.fechaSolicitud = fechaSolicitud;
        this.razonInasistencia = razonInasistencia;
        this.estadoSolicitud = estadoSolicitud;
        this.documentoAdicional = documentoAdicional;
    }

    // Métodos Getters
    public int getIdSolicitud() {
        return idSolicitud;
    }

    public int getClienteId() {
        return clienteId;
    }

    public int getExpedienteId() {
        return expedienteId;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public String getRazonInasistencia() {
        return razonInasistencia;
    }

    public String getEstadoSolicitud() {
        return estadoSolicitud;
    }

    public String getDocumentoAdicional() {
        return documentoAdicional;
    }
}
