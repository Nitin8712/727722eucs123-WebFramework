package com.example.ex3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ex3.model.Language;

public interface LanguageRepo extends JpaRepository<Language,Integer>
{
    
}
