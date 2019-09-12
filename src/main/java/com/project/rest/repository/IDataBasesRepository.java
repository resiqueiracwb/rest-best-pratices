package com.project.rest.repository;


import com.project.rest.model.Predio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.querydsl.binding.SingleValueBinding;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDataBasesRepository extends JpaRepository<Predio, Long>{
    List<Predio> findAll();
}
