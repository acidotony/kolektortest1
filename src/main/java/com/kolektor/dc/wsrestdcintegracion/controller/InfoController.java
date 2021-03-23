package com.kolektor.dc.wsrestdcintegracion.controller;

import com.kolektor.dc.wsrestdcintegracion.config.autorizacion.Lectura;
import com.kolektor.dc.wsrestdcintegracion.utiles.conversores.Mensajes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${registrar-pagos.api.rest.base-path}")
public class InfoController {

    @Autowired
    private Mensajes mensajes;

    @Lectura
    @GetMapping("/info")
    public ResponseEntity getInfoRequerida() {
        return new ResponseEntity<>(mensajes.get("response.ok"), HttpStatus.OK);
    }

}
