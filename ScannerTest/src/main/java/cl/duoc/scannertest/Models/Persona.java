package cl.duoc.scannertest.Models;

import java.util.Date;

public class Persona {
    private static int privateID =10;
    
    private int id;
    private String nombre;
    private String apellido;
    private Date birthday;
    private String rut;
    private String direccion;
    private boolean casado;

    public Persona() {
        this.id = 0;
        this.nombre = "";
        this.apellido = "";
        this.birthday = new Date();
        this.rut = "";
        this.direccion = "";
        this.casado = false;
        
        privateID = privateID+1;
    }

    public Persona(int id, String nombre, String apellido, Date birthday, String rut, String direccion, boolean casad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.birthday = birthday;
        this.rut = rut;
        this.direccion = direccion;
        this.casado = casado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(int year, int month, int day) {
        this.birthday = new Date (year, month, day);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }
}
