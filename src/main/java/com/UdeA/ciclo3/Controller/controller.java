package com.UdeA.ciclo3.Controller;

import com.UdeA.ciclo3.Service.EmpresaService;
import com.UdeA.ciclo3.modelos.empresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class controller {
    @Autowired
    EmpresaService empresaService;

    @GetMapping ({"/Empresas","/verEmpresas"})
    public String ViewEmpresas(Model model){
        List<empresa> ListaEmpresas=empresaService.getAllEmpresa();
        model.addAttribute("listaEmpleados",ListaEmpresas);
        return "VerEmpreas";
    }
}
