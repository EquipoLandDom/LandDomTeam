package com.example.misionTicApp.Controllers;

import com.example.misionTicApp.Entities.MovimientoDinero;
import com.example.misionTicApp.View.ViewMovimientoDinero;

public class MovimientoDineroController {
    private ViewMovimientoDinero View;
    private MovimientoDinero Entities;

    public MovimientoDineroController(MovimientoDinero Entities, ViewMovimientoDinero View) {
        this.Entities = Entities;
        this.View = View;
    }

    public ViewMovimientoDinero getView() {
        return View;
    }

    public void setView(ViewMovimientoDinero view) {
        View = view;
    }

    public MovimientoDinero getEntities() {
        return Entities;
    }

    public void setEntities(MovimientoDinero entities) {
        Entities = entities;
    }
}
