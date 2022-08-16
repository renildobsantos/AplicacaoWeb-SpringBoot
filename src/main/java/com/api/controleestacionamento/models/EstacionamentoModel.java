package com.api.controleestacionamento.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB-ESTACIONAMENTO")

public class EstacionamentoModel implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String estacionamentoNumber;
    @Column(nullable = false, unique = true, length = 7)
    private String placaCar;
    @Column(nullable = false, length = 70)
    private String marcaCar;
    @Column(nullable = false, length = 70)
    private String modeloCar;
    @Column(nullable = false, length = 70)
    private String corCar;
    @Column(nullable = false, length = 70)
    private LocalDateTime dataRegistro;
    @Column(nullable = false, length = 130)
    private String nomeResponsavel;
    @Column(nullable = false, length = 30)
    private String apartamento;
    @Column(nullable = false, length = 70)
    private String bloco;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEstacionamentoNumber() {
        return estacionamentoNumber;
    }

    public void setEstacionamentoNumber(String estacionamentoNumber) {
        this.estacionamentoNumber = estacionamentoNumber;
    }

    public String getPlacaCar() {
        return placaCar;
    }

    public void setPlacaCar(String placaCar) {
        this.placaCar = placaCar;
    }

    public String getMarcaCar() {
        return marcaCar;
    }

    public void setMarcaCar(String marcaCar) {
        this.marcaCar = marcaCar;
    }

    public String getModeloCar() {
        return modeloCar;
    }

    public void setModeloCar(String modeloCar) {
        this.modeloCar = modeloCar;
    }

    public String getCorCar() {
        return corCar;
    }

    public void setCorCar(String corCar) {
        this.corCar = corCar;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDateTime dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public void setRegistrationDate(LocalDateTime utc) {
    }
}
