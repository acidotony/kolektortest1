package com.kolektor.dc.wsrestdcintegracion.repository;

import com.kolektor.dc.wsrestdcintegracion.data.ConceptoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IConceptoRepository extends JpaRepository<ConceptoEntity, Long> {

    List<ConceptoEntity> findByCodigoAndSistemaOrigenAndFechaBajaIsNull(String codigo, String sistemaOrigen);
}
