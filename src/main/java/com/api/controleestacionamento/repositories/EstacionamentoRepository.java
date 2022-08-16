package com.api.controleestacionamento.repositories;

import com.api.controleestacionamento.models.EstacionamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EstacionamentoRepository extends JpaRepository<EstacionamentoModel, UUID> {
}
