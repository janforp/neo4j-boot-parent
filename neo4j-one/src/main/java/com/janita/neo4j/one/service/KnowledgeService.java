package com.janita.neo4j.one.service;

import com.janita.neo4j.one.domain.Knowledge;
import com.janita.neo4j.one.repository.KnowledgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Janita on 2017-03-22 11:31
 */
@Service
public class KnowledgeService {

    @Autowired
    private KnowledgeRepository knowledgeRepository;

    public Knowledge createKnowledge(Knowledge knowledge){

        knowledge.setCreateTime(new Date());
        knowledge.setModifyTime(new Date());

        return knowledgeRepository.save(knowledge);
    }

    public Knowledge findKnowledgeById(Long id) {
        return knowledgeRepository.findOne(id);
    }
}
