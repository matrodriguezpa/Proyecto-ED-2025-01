package com.residenciasunal.residenciasunal;

public class Estudiante {

    private int cedula;
    private String nombre;
    private String carrera;
    private long puntaje;
    private boolean asignado;

    public Estudiante(int cedula, String nombre, String carrera, long puntaje) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.puntaje = puntaje;
        this.asignado = false;
    }

    public int getCedula() {
        return cedula;
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
    public void setCedula(int cedula) {
        if (cedula < 0) {
            throw new IllegalArgumentException("La cédula no puede ser un número negativo.");
        }
        this.cedula = cedula;
    }


    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
    }
    public void setCarrera(String carrera) {
        if (carrera == null || carrera.trim().isEmpty()) {
            throw new IllegalArgumentException("La carrera no puede ser nula o vacía.");
        }
        this.carrera = carrera;
    }

    public void setPuntaje(long puntaje) {
        if (puntaje < 0) {
            throw new IllegalArgumentException("El puntaje no puede ser negativo.");
        }
        this.puntaje = puntaje;
    }

    public void setAsignado(boolean asignado){
        this.asignado = asignado;
    }
    
    @Override
    public String toString() {
        return "Estudiante{"
                + "cedula='" + cedula + '\''
                + ", nombre='" + nombre + '\''
                + ", carrera='" + carrera + '\''
                + ", puntaje=" + puntaje
                + '}';
    }
     @Override
    public Estudiante clone() throws CloneNotSupportedException {
        Estudiante clon = (Estudiante) super.clone();
        clon.asignado = this.asignado; // Copia también el campo asignado
        return clon;
    }
}