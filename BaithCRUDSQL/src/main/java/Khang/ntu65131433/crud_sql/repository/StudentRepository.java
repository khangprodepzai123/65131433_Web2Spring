package Khang.ntu65131433.crud_sql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Khang.ntu65131433.crud_sql.models.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}