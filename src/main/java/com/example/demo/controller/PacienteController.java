package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entitis.Paciente;
import com.example.demo.repository.PacienteRepsitory;

import java.util.List;
import java.util.Optional;

public class PacienteController {

    @Autowired
	PacienteRepsitory pacienteRepsitory;

    @GetMapping
	public List<Paciente> getPacienteAll() {

		return pacienteRepsitory.findAll();
	}

    @DeleteMapping("/{id}")
	public Paciente deletePacientesbyId(@PathVariable Integer id) {
		
		Optional<Paciente> paciente = pacienteRepsitory.findById(id);
		
		if (paciente.isPresent()) {
			
			final Paciente pacienteReturn = paciente.get();
			
			pacienteRepsitory.deleteById(id);
			
			return pacienteReturn;
		}
		
		return null;

	}

    @PostMapping
	public Paciente postPaciente(@RequestBody Paciente paciente) {
		
		pacienteRepsitory.save(paciente);
		
		return paciente;
		

	}

    
}
