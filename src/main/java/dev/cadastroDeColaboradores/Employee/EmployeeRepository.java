package dev.cadastroDeColaboradores.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Long>{
}
