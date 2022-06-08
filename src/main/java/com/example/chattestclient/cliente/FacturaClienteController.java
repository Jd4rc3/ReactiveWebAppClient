package com.example.chattestclient.cliente;

import com.example.chattestclient.dominio.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FacturaClienteController {
    @Autowired
    ClienteFacturasService servicio;

    @RequestMapping("/lista")
    public String lista(Model modelo) {

        List<Factura> lista = new ArrayList<>();
        lista.addAll(servicio.buscarTodas());
        lista.addAll(servicio.buscarTodas());
        lista.addAll(servicio.buscarTodas());

        modelo.addAttribute("lista", lista);
        return "lista";
    }
}