package com.janita.neo4j.one.service;

import com.janita.neo4j.one.domain.Knowledge;
import com.janita.neo4j.one.repository.KnowledgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Janita on 2017-03-22 11:31
 */
@Service
public class KnowledgeService {

    @Autowired
    private KnowledgeRepository knowledgeRepository;

    /**
     * 创建知识点节点
     * @param knowledge
     * @return
     */
    public Knowledge createKnowledge(Knowledge knowledge){
        knowledge.setCreateTime(new Date());
        knowledge.setModifyTime(new Date());
        return knowledgeRepository.save(knowledge);
    }

    /**
     * 根据id查询知识点
     * @param id
     * @return
     */
    public Knowledge findKnowledgeById(Long id) {
        return knowledgeRepository.findOne(id);
    }

    /**
     * 查询知识点列表
     * @return
     */
    public List<Knowledge> findAll() {
        List<Knowledge> knowledgeList = new ArrayList<>();
        for (Knowledge knowledge : knowledgeRepository.findAll()){
           knowledgeList.add(knowledge);
        }
        return knowledgeList;
    }
}
