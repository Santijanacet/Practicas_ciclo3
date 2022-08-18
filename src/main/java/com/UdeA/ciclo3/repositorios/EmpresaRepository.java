package com.UdeA.ciclo3.repositorios;

import com.UdeA.ciclo3.modelos.empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<empresa,Integer> {
}
