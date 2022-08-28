package com.example.misionTicApp.Entities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "Transaction")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTransaction;

    @Column(name = "concept")
    private String concept;

    @Column(name = "amount")
    private float amount;

    @ManyToOne
    @JoinColumn(name = "idEmployee")
    private Empleado employee;

    @ManyToOne
    @JoinColumn(name = "idEnterprise")
    private Empresa enterprise;

    //Attributes
    private String concepto;
    private float monto;
    //Monto positivos y negativos son metodos que pueden hacer esto
    private double total;
    //Attributes

    //Constructor
    public MovimientoDinero(String concepto, float monto, double total, double montoPositivo, double montoNegativo) {
        this.concepto = concepto;
        this.monto = monto;
    }
    //constructor

    //Methods
    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    //-------.-.-.-.-.

    public double total() {
        return total;
    }

    public void montoPositivo(double monto){
        total = total + monto;
    }

    public void montoNegativo(double monto){
        total = total - monto;
    }

    //-------.-.-.-.-.

    public static String fecha () {
        LocalDate fechaActual = LocalDate.now();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("DD/MM/YYYY");

        return formatoFecha.format(fechaActual);
    }
    //Methods
}
