package com.example.misionTicApp.Controllers;

import com.example.misionTicApp.Entities.Empresa;
import com.example.misionTicApp.View.ViewEmpresa;

public class EmpresaController {

    private ViewEmpresa View;
    private Empresa Entities;

    public EmpresaController(ViewEmpresa view, Empresa entities) {
        View = view;
        Entities = entities;
    }

    public ViewEmpresa getView() {
        return View;
    }

    public void setView(ViewEmpresa view) {
        View = view;
    }

    public Empresa getEntities() {
        return Entities;
    }

    public void setEntities(Empresa entities) {
        Entities = entities;
    }
}
