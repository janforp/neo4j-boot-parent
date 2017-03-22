package com.janita.neo4j.one.service;

import com.janita.neo4j.one.domain.ContainRelationship;
import com.janita.neo4j.one.domain.Knowledge;
import com.janita.neo4j.one.repository.ContainRSRepository;
import com.janita.neo4j.one.repository.KnowledgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017-03-22 15:10
 */
@Service
public class ContainRSService {

    @Autowired
    private ContainRSRepository containRSRepository;
    @Autowired
    private KnowledgeRepository knowledgeRepository;

    public ContainRelationship createRS(Long start,Long end,String desc){

        Knowledge startK = knowledgeRepository.findOne(start);
        Knowledge endK = knowledgeRepository.findOne(end);

        ContainRelationship relationship = new ContainRelationship();
        relationship.setStart(startK);
        relationship.setEnd(endK);
        relationship.setDescription(desc);

        return containRSRepository.save(relationship);
    }
}
