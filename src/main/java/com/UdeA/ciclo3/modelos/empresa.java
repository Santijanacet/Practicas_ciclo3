package com.UdeA.ciclo3.modelos;

import javax.persistence.*;

@Entity
@Table(name = "empresa")
public class empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;
    private String dirección;
    private String telefono;
    private String nit;


    public empresa() {
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

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public empresa(String dirección, String telefono, String nit, String nombre) {
        this.dirección = dirección;
        this.telefono = telefono;
        this.nit = nit;
        this.nombre = nombre;




    }
}


