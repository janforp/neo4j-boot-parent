package com.janita.neo4j.one.service;

import com.janita.neo4j.one.domain.NextSubjectRelationship;
import com.janita.neo4j.one.domain.Subject;
import com.janita.neo4j.one.repository.NextSubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Janita on 2017-03-25 09:29
 */
@Service
public class NextSubjectRSService {

    @Autowired
    private NextSubjectRepository nextSubjectRepository;

    /**
     * 给两个科目建立next关系
     * @param nowSubject
     * @param nextSubject
     * @return
     */
    public NextSubjectRelationship createNextSubjectRS(Subject nowSubject, Subject nextSubject) {

        NextSubjectRelationship relationship = new NextSubjectRelationship();
        relationship.setNext(nextSubject);
        relationship.setNow(nowSubject);

        return nextSubjectRepository.save(relationship);
    }

    public List<NextSubjectRelationship> list() {
        List<NextSubjectRelationship> relationships = new ArrayList<>();
        for (NextSubjectRelationship relationship : nextSubjectRepository.findAll()){
            relationships.add(relationship);
        }
        return relationships;
    }
}
