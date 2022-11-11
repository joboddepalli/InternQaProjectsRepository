package com.edu.qt.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "Intern_Qa_Projects")


public class QAInternProject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @Column(name = "QAtesters")
    String QAtesters;

    @Column(name = "type")
    String type;

    @Column(name = "domain")
    String domain ;

    public Integer getId() {
        return id;
    }


}

