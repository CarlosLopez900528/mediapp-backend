package com.mediapp.controller;

import com.mediapp.model.Paciente;
import com.mediapp.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private IPacienteService service;

    @GetMapping
    public List<Paciente> listar() throws Exception{
        return service.listar();
    }

    @GetMapping("/{id}")
    public Paciente listarPorId(@PathVariable("id") Integer id) throws Exception{
        return service.listarPorId(id);
    }

    @PostMapping
    public Paciente registrar(@RequestBody Paciente p) throws Exception{
        return service.registrar(p);
    }

    @PutMapping("/{id}")
    public Paciente modificar(@PathVariable("id") Integer id, @RequestBody Paciente p) throws Exception{
        Paciente pac = service.listarPorId(id);
        if (pac != null){
            return service.modificar(p);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) throws Exception{
        service.eliminar(id);
    }
}
