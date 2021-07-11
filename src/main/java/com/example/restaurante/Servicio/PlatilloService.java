package com.example.restaurante.Servicio;

import com.example.restaurante.DAO.PlatilloDAO;
import com.example.restaurante.Dominio.Platillo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatilloService {

    private final PlatilloDAO platilloDAO;

    @Autowired
    public PlatilloService(PlatilloDAO platilloDAO) {
        this.platilloDAO = platilloDAO;
    }

    public void crearPlatillo ( Platillo platillo){
        platilloDAO.crearPlatillo(platillo);
    }
}
