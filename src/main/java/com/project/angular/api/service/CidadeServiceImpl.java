package com.project.angular.api.service;


import com.project.angular.api.model.Cidade;
import com.project.angular.api.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class CidadeServiceImpl implements CidadeService {

    @Autowired
    CidadeRepository cidadeRepository;


    @Override
    public List<Cidade> getAllCidade() {
        return cidadeRepository.findAll();
    }

    @Override
    public Cidade getOne(Long id) {
        return cidadeRepository.getOne(id);
    }

    @Override
    public Cidade createCidade(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }

    @Override
    public Cidade updateCidade(Cidade cidade) {
        if(cidadeRepository.findOne(cidade.getId()) == null){
            throw new EntityNotFoundException("Entidade não encontrada");
        }else
        return cidadeRepository.save(cidade);
    }

    @Override
    public void removeCidade(Long id) {
         cidadeRepository.delete(id);
    }
}
