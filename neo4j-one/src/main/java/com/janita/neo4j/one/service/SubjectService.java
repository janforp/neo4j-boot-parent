package com.janita.neo4j.one.service;

import com.janita.neo4j.one.domain.Subject;
import com.janita.neo4j.one.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017-03-25 09:24
 */
@Service("subjectService")
public class SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public Subject findSubjectById(Long subjectId) {
        return subjectRepository.findOne(subjectId);
    }
}
