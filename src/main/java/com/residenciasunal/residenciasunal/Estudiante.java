package com.residenciasunal.residenciasunal;

public class Estudiante {

    private final String id;
    private String nombre;
    private String carrera;
    private long puntaje;
    private boolean asignado;

    public Estudiante(String id, String nombre, String carrera, long puntaje) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
        this.puntaje = puntaje;
        this.asignado = false;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public long getPuntaje() {
        return puntaje;
    }
    
    public boolean getAsignado(){
        return asignado;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setPuntaje(long puntaje) {
        this.puntaje = puntaje;
    }

    public void setAsignado(boolean asignado){
        this.asignado = asignado;
    }
    
    @Override
    public String toString() {
        return "Estudiante{"
                + "id='" + id + '\''
                + ", nombre='" + nombre + '\''
                + ", carrera='" + carrera + '\''
                + ", puntaje=" + puntaje
                + '}';
    }
}
