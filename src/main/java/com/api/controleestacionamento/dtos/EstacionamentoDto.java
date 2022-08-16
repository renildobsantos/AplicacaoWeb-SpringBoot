package com.api.controleestacionamento.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class EstacionamentoDto {

    @NotBlank
    private  String estacionamentoNumber;
    @NotBlank
    @Size(max = 7)
    private  String placaCar;
    @NotBlank
    private  String marcaCar;
    @NotBlank
    private  String modeloCar;
    @NotBlank
    private  String corCar;
    @NotBlank
    private  String nomeResponsavel;
    @NotBlank
    private  String apartamento;
    @NotBlank
    private  String bloco;

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
}
