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
    public void generateQuery() {
        Predio predio = new Predio();
        for (int i = 1; i < 100; i++) {
            predio = new Predio();
            predio.setName("Dolphin" + i);
            predio.setCor("Verde");
            predio.setPortaria(true);
            predio.setNomeSindico("Stevam" + i);
            predio.setSalaoFestas(true);
            predio.setQtdeElevadores(2);
            predio.setTipoPadrao("Alto");
            predio.setVagasCobertas(true);
            predio.setQtdeAndares(6 + i);
            predio.setQtdeApartamentos(12 + i);
            String query =  "insert into predio ( name, qtde_andares, cor, tipo_padrao,is_portaria, qtde_elevadores, nome_sindico, vagas_cobertas,qtde_apartamentos, salao_festas )  values ('";
            String values = "Dolphin" + i + "'," + 6 + i +  ",'Verde', 'ALTO' ," +  1  + "," + 6+ i  + ", 'Estevam' ," + 1  + "," + 5 + i + "," + 1 + ");" ;

            System.out.println(query + values);

            this.dataBasesRepository.save(predio);
        }
    }

/**
    String index(Model model, @QuerydslPredicate(root = Predio.class) Predicate predicate,
                 Pageable pageable, @RequestParam MultiValueMap<String, String> parameters) {

        model.addAttribute("predios", dataBasesRepository.findAll(predicate, pageable));

        return "index";
    }

    Predio findByPredicate(String name, String cor){
        Predio predio =  new Predio();
        /**
        QPredio qpredio =  QPredio.predio;

        Predicate predicate = predio.firstname.equalsIgnoreCase("dave")
                .and(predio.lastname.startsWithIgnoreCase("mathews"));

        userRepository.findAll(predicate);*
        return null;
    }*/
}
