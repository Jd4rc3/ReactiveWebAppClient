package com.example.chattestclient.cliente;

import com.example.chattestclient.dominio.Factura;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ClienteFacturasService {
    public List<Factura> buscarTodas() {
        RestTemplate plantilla = new RestTemplate();
        Factura[] facturas = plantilla.getForObject("http://localhost:8080/facturas", Factura[].class);
        List<Factura> lista = Arrays.asList(facturas);
        return lista;
    }
}
