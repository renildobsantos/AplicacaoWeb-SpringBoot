package com.api.controleestacionamento.controllers;

import com.api.controleestacionamento.dtos.EstacionamentoDto;
import com.api.controleestacionamento.models.EstacionamentoModel;
import com.api.controleestacionamento.services.EstacionamentoService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking")
public class EstacionamentoController {

    final EstacionamentoService estacionamentoService;

    public EstacionamentoController(EstacionamentoService estacionamentoService) {
        this.estacionamentoService = estacionamentoService;
    }

    @PostMapping
    public ResponseEntity<Object> saveEstacionamento(@RequestBody @Valid EstacionamentoDto estacionamentoDto){
        EstacionamentoModel estacionamentoModel = new EstacionamentoModel();
        BeanUtils.copyProperties(estacionamentoDto, estacionamentoModel);
        estacionamentoModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(estacionamentoService.save(estacionamentoModel));
    }


}

