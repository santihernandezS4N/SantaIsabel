package com.example.restaurante.Controlador;

import com.example.restaurante.Dominio.Platillo;
import com.example.restaurante.Servicio.PlatilloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RequestMapping("/api/platillo")
@RestController
public class PlatilloController {

    private final PlatilloService platilloService;

    @Autowired
    public PlatilloController(PlatilloService platilloService) {
        this.platilloService = platilloService;
    }

    @PostMapping
    public void AgregarPlatillo (@RequestBody Platillo platillo){
        platilloService.crearPlatillo(platillo);
    }
}
