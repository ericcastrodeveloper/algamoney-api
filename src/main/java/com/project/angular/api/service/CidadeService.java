package com.project.angular.api.service;

import com.project.angular.api.model.Cidade;

import java.util.List;


public interface CidadeService {

    List<Cidade> getAllCidade();

    Cidade getOne(Long id);

    Cidade createCidade(Cidade cidade);

    Cidade updateCidade(Cidade cidade);

    void removeCidade(Long id);
}
