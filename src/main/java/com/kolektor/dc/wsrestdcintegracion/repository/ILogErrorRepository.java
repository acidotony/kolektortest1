package com.kolektor.dc.wsrestdcintegracion.repository;

import com.kolektor.dc.wsrestdcintegracion.data.LogErrorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

public interface ILogErrorRepository extends JpaRepository<LogErrorEntity, Long>  {

//    @Procedure(name = "logProceso.insert")
//    Long guardarLogProceso(
//            @Param("P_LOP_PAQUETE") String paquete,
//            @Param("P_LOP_PROCED_FUNCION") String procedFuncion,
//            @Param("P_LOP_STATUS_CODE") String statusCode,
//            @Param("P_LOP_STATUS_MESSAGE") String statusMessage
//    );
//
//    @Procedure(name = "logError.insert")
//    void guardarLogError(
//            @Param("P_ID_LOG_PROCESOS") Long idLogProceso,
//            @Param("P_PAQUETE") String paquete,
//            @Param("P_PROCED_FUNCION") String procedFuncion,
//            @Param("P_ERROR_CODE") String errorCode,
//            @Param("P_ERROR_MESSAGE") String errorMessage,
//            @Param("P_TIPO_OBJETO") String tipoObjeto,
//            @Param("P_ID_OBJETO") Long idObjeto
//    );
}
