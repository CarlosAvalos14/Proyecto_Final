package org.example;

public class Abogado {
    private int idAbogado;
    private String nombre;
    private String especialidad;
    private int expedienteId;
    private String telefono;
    private String email;

    public Abogado(int idAbogado, String nombre, String especialidad, int expedienteId, String telefono, String email) {
        this.idAbogado = idAbogado;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.expedienteId = expedienteId;
        this.telefono = telefono;
        this.email = email;
    }

    // Métodos Getters
    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
}
