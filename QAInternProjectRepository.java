package com.edu.qt.repository;

import com.edu.qt.model.QAInternProject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QAInternProjectRepository extends CrudRepository<QAInternProject,Integer> {

}
