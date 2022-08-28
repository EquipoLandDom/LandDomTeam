package com.example.misionTicApp.Entities;


import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEmployee;

    @Column(name = "nameEmployee")
    private String nameEmployee;

    @Column(name = "documentEmployee")
    private String documentEmployee;

    @Column(name = "emailEmployee", unique = true)
    private String emailEmployee;

    //Attributes
    private String nombreEmpleado;
    private String correoEmpleado;
    private int documentoEmpleado;
    private String empresaEmpleado;
    private String rolEmpleado;
    //Attributes

    //Constructor
    public Empleado(String nombreEmpleado, String correoEmpleado, int documentoEmpleado, String empresaEmpleado, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.documentoEmpleado = documentoEmpleado;
        this.empresaEmpleado = empresaEmpleado;
        this.rolEmpleado = rolEmpleado;
    }
    //Constructor

    //Methods
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public int getDocumentoEmpleado() {
        return documentoEmpleado;
    }

    public void setDocumentoEmpleado(int documentoEmpleado) {
        this.documentoEmpleado = documentoEmpleado;
    }

    public String getEmpresaEmpleado() {
        return empresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        this.empresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }
    //Methods
}
