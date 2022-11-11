package com.edu.qt.service;

import com.edu.qt.model.QAInternProject;
import com.edu.qt.repository.QAInternProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QAInternProjectService {

    @Autowired
    QAInternProjectRepository QAInternProjectRepository ;

    public List<QAInternProject> fetchAllQAInternProject() {
        List<QAInternProject> QAInternProjectList = (List<QAInternProject>) QAInternProjectRepository.findAll();
        return QAInternProjectList;

    }

}

