package com.project.rest.service;

import com.project.rest.model.Predio;

import java.util.List;

public interface IDataBasesServices {

    public List<Predio> getAllPredio();
    public Predio save(Predio predio);
    public void delete (Integer id);
}
