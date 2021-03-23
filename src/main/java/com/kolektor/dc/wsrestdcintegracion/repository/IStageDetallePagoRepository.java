package com.kolektor.dc.wsrestdcintegracion.repository;

import com.kolektor.dc.wsrestdcintegracion.data.StageDetallePagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IStageDetallePagoRepository extends JpaRepository<StageDetallePagoEntity, Long> {
}
