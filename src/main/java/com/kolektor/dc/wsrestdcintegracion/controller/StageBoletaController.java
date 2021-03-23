package com.kolektor.dc.wsrestdcintegracion.controller;

import com.kolektor.dc.wsrestdcintegracion.config.autorizacion.Escritura;
import com.kolektor.dc.wsrestdcintegracion.model.gant.StageBoletaGantDTO;
import com.kolektor.dc.wsrestdcintegracion.model.psrm.StageBoletaPSRMDTO;
import com.kolektor.dc.wsrestdcintegracion.service.IStageBoletaService;
import com.kolektor.dc.wsrestdcintegracion.utiles.conversores.Mensajes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("${registrar-pagos.api.rest.base-path}/pagos")
public class StageBoletaController {

    @Autowired
    IStageBoletaService boletaService;
    @Autowired
    private Mensajes mensajes;

    private final Logger log = LoggerFactory.getLogger(StageBoletaController.class);

    @Escritura
    @PostMapping("/PSRM/add")
    public ResponseEntity boletaPSRMAdd(@Valid @RequestBody StageBoletaPSRMDTO boletaDTO, BindingResult result) {
        log.debug("Inicio metodo post(). " +" origen PSRM, Id Boleta " + boletaDTO.getIdBoleta());
        log.debug("boletaDTO: " + boletaDTO.toString());
        HashMap<String, List<String>> errorResponse = new HashMap<String, List<String>>();
        if (result.hasErrors()) {
            List<String> listErrores = result.getAllErrors()
                    .stream()
                    .map(ObjectError::getDefaultMessage)
                    .collect(Collectors.toList());
            errorResponse.put("errores", listErrores);
            log.error("Origen PSRM, Id Boleta " + boletaDTO.getIdBoleta() + ". Error en los datos de request al llamar al metodo post(). " + listErrores.toString());
            return new ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST);
        }
        try {
            boletaService.savePSRM(boletaDTO, mensajes.get("origen.psrm"));
        } catch (Exception e) {
            log.error("Origen PSRM, Id Boleta " + boletaDTO.getIdBoleta() + ". Error al persistir los datos del pago  al llamar al metodo post(). " + e.getMessage());
            errorResponse.put("errores", Arrays.asList(e.getMessage()));
            return new ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST);
        }
        log.debug("Fin metodo post()");
        return new ResponseEntity(mensajes.get("response.ok"), HttpStatus.OK);
    }

    @Escritura
    @PostMapping("/GANT/add")
    public ResponseEntity boletaGANTAdd(@Valid @RequestBody StageBoletaGantDTO boletaDTO, BindingResult result) {
        log.debug("Inicio metodo post(). " +" origen GANT, Id Boleta " + boletaDTO.getIdBoleta());
        log.debug("boletaDTO: " + boletaDTO.toString());
        HashMap<String, List<String>> errorResponse = new HashMap<String, List<String>>();
        if (result.hasErrors()) {
            List<String> listErrores = result.getAllErrors()
                    .stream()
                    .map(ObjectError::getDefaultMessage)
                    .collect(Collectors.toList());
            errorResponse.put("errores", listErrores);
            log.error("Origen GANT, Id Boleta " + boletaDTO.getIdBoleta() + ". Error en los datos de request al llamar al metodo post(). " + listErrores.toString());
            return new ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST);
        }
        try {
            boletaService.saveGANT(boletaDTO, mensajes.get("origen.gant"));
        } catch (Exception e) {
            log.error("Origen GANT, Id Boleta " + boletaDTO.getIdBoleta() + ". Error al persistir los datos del pago  al llamar al metodo post(). " + e.getMessage());
            errorResponse.put("errores", Arrays.asList(e.getMessage()));
            return new ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST);
        }
        log.debug("Fin metodo post()");
        return new ResponseEntity(mensajes.get("response.ok"), HttpStatus.OK);
    }
}
