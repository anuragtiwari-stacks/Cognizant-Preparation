package com.anurag.Learning_REST_APIs.repository;

import com.anurag.Learning_REST_APIs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{

}
/*
Why do we extend JpaRepository?

Answer: JpaRepository provides built-in CRUD operations, pagination, sorting,
and many database methods, so we don't need to write SQL queries for basic operations.

save()
saveAll()
findById()
findAll()
delete()
deleteById()
existsById()
count()
flush()
findAllById()
*/
