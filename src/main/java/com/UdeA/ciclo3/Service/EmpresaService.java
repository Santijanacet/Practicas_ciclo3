package com.UdeA.ciclo3.Service;

import com.UdeA.ciclo3.modelos.empresa;
import com.UdeA.ciclo3.repositorios.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaService {
    @Autowired
    EmpresaRepository empresaRepository;


    public List<empresa> getAllEmpresa() {
        List<empresa> empresaList = new ArrayList<>();
        empresaRepository.findAll().forEach(empresa -> empresaList.add(empresa));
        return empresaList;
    }

    public empresa terrasoftware(Integer id) {
        return empresaRepository.findById(id).get();

    }


    // metodo para guardar o actualizar
    public boolean softwareterra(empresa terrasoftware) {
        empresa emp = empresaRepository.save(terrasoftware);
        if (empresaRepository.findById(emp.getId()) != null) {

            return true;
        }
        return false;
    }
    // metodo para eliminar empresaas registaradas con el id

    public boolean eliminarempresa(Integer id) {
        empresaRepository.deleteById(id);
        if(terrasoftware(id)!= null){
        return false;
    }
    return true;
    }

}


