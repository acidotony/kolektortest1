package com.kolektor.dc.wsrestdcintegracion.controller;

import com.kolektor.dc.wsrestdcintegracion.utiles.conversores.Mensajes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id = "healthz")
@Component
public class Healthz{

    @Autowired
    private Mensajes mensajes;

    @ReadOperation
    public Map<String, String> getOK() {
        HashMap<String, String> response = new HashMap<String, String>();
        response.put("status", mensajes.get("response.ok"));
        return response;
    }
}