package com.api.controleestacionamento.services;

import com.api.controleestacionamento.models.EstacionamentoModel;
import com.api.controleestacionamento.repositories.EstacionamentoRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EstacionamentoService {

    final EstacionamentoRepository estacionamentoRepository;

    public EstacionamentoService(EstacionamentoRepository estacionamentoRepository) {
        this.estacionamentoRepository = estacionamentoRepository;
    }

    @Transactional
    public EstacionamentoModel save(EstacionamentoModel estacionamentoModel) {
        return estacionamentoRepository.save(estacionamentoModel);
    }
}
