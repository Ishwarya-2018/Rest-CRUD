package api.springbootrestapicrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import api.springbootrestapicrud.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}
