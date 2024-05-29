package br.com.facisa.projeto.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.facisa.projeto.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
