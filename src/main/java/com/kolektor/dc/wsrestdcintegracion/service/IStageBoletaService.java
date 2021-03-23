package com.kolektor.dc.wsrestdcintegracion.service;

import com.kolektor.dc.wsrestdcintegracion.model.gant.StageBoletaGantDTO;
import com.kolektor.dc.wsrestdcintegracion.model.psrm.StageBoletaPSRMDTO;

public interface IStageBoletaService {

    void savePSRM(StageBoletaPSRMDTO boletaDTO, String origen) throws Exception;

    void saveGANT(StageBoletaGantDTO boletaDTO, String origen) throws Exception;
}
