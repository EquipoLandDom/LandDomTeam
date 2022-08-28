package com.example.misionTicApp.Controllers;

import com.example.misionTicApp.Entities.Empleado;
import com.example.misionTicApp.View.ViewEmpleado;

public class EmpleadoController {
    private ViewEmpleado View;
    private Empleado Entities;

    public EmpleadoController(ViewEmpleado view, Empleado entities) {
        View = view;
        Entities = entities;
    }

    public ViewEmpleado getView() {
        return View;
    }

    public void setView(ViewEmpleado view) {
        View = view;
    }

    public Empleado getEntities() {
        return Entities;
    }

    public void setEntities(Empleado entities) {
        Entities = entities;
    }
}