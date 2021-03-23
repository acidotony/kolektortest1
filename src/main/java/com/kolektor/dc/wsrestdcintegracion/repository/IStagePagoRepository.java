package com.kolektor.dc.wsrestdcintegracion.repository;

import com.kolektor.dc.wsrestdcintegracion.data.StagePagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface IStagePagoRepository extends JpaRepository<StagePagoEntity, Long> {
}
