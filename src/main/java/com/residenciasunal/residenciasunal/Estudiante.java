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

    public void setCedula(int cedula){
        this.cedula = cedula;
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
                + "cedula='" + cedula + '\''
                + ", nombre='" + nombre + '\''
                + ", carrera='" + carrera + '\''
                + ", puntaje=" + puntaje
                + '}';
    }
     @Override
    public Estudiante clone() {
        return new Estudiante(this.cedula, this.nombre, this.carrera, this.puntaje);
    }
}
