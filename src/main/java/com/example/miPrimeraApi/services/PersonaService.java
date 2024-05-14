package com.example.miPrimeraApi.services;

import com.example.miPrimeraApi.entities.Persona;
import com.example.miPrimeraApi.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public Persona crearPersona(Persona persona){
        return personaRepository.save(persona);
    }

    public Persona buscarPersonaPorId(Long id){
        return personaRepository.findById(id).orElse(null);
    }

    public List<Persona> listarPersonas(){
        return personaRepository.findAll();
    }

    public Persona actualizarPersona(Persona persona){
        return personaRepository.save(persona);
    }

    public void eliminarPersona(Long id){
        personaRepository.deleteById(id);
    }

}
