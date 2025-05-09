package dev.cadastroDeColaboradores.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    //Chamadada do repository
    private EmployeeRepository empRepository;

    public EmployeeService(EmployeeRepository empRepository) {
        this.empRepository = empRepository;
    }

    //listar todos os meus Ninjas // puxando a variavel do repository
    public List<EmployeeModel>listarEmployee(){
        return empRepository.findAll();
    }

    // Listar todos meus ninjas por ID
    public EmployeeModel listarEmployeeID(Long id ){
        Optional<EmployeeModel> empModel = empRepository.findById(id);
        return empModel.orElse(null);
    }

    // Criar um novo Employee
    public EmployeeModel criarEmployee(EmployeeModel employee){
        return empRepository.save(employee);
    }

    // Deletar o Employee -> Void
        public void deletarEmployeeID(Long id){
        empRepository.deleteById(id);
    }

    // Atualizar Employee
//    public EmployeeModel atualizarNinja(Long id, EmployeeModel empAtualizado){
//        if(empRepository.existsById(id)){
//            empAtualizado.setId(id);
//            return empRepository.save(empAtualizado);
//        }
//        return null;
//    }


}
