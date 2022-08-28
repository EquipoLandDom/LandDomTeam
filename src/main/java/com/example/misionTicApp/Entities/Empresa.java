package com.example.misionTicApp.Entities;

import javax.persistence.*;

@Entity
@Table(name = "Enterprise")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idEnterprise;

    @Column(name = "nameEnterprise", unique = true)
    private String nameEnterprise;

    @Column(name = "documentEnterprise", unique = true)
    private String documentEnterprise;

    @Column(name = "phoneEnterprise")
    private String phoneEnterprise;

    @Column(name = "adressEnterprise")
    private String adressEnterprise;

    //Attributes
    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;
    private String nitEmpresa;
    //Attributes

    //Constructor
    public Empresa(String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, String nitEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
    }
    //Constructor

    //Methods
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(String nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }
    //Methods
}
