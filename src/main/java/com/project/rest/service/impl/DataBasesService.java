package com.project.rest.service.impl;


import com.project.rest.model.Predio;
import com.project.rest.repository.IDataBasesRepository;
import com.project.rest.service.IDataBasesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@Service
public class DataBasesService implements IDataBasesServices {
    @Autowired
    private IDataBasesRepository dataBasesRepository;

    @Override
    public List<Predio> getAllPredio() {
        return this.dataBasesRepository.findAll();
    }

    @Override
    public Predio save(Predio predio) {
        return this.dataBasesRepository.save(predio);
    }

    @Override
    public void delete(Integer id) {

        this.dataBasesRepository.deleteById(Long.valueOf(id));
    }

}
