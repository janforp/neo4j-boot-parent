package com.janita.neo4j.one.service;

import com.janita.neo4j.one.domain.ContainRelationship;
import com.janita.neo4j.one.domain.Knowledge;
import com.janita.neo4j.one.repository.ContainRSRepository;
import com.janita.neo4j.one.repository.KnowledgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * 根据关系id取消该关系
     * @param rsId
     * @return
     */
    public ContainRelationship removeRS(Long rsId) {
        containRSRepository.delete(rsId);
        return containRSRepository.findOne(rsId);
    }

    /**
     * 列出所有关系
     * @return
     */
    public List<ContainRelationship> list() {
        List<ContainRelationship> containRelationships = new ArrayList<>();
        for (ContainRelationship relationship : containRSRepository.findAll()){
            containRelationships.add(relationship);
        }
        return containRelationships;
    }

    /**
     * 查询某个知识点下所有包含的知识点
     * @param parentId
     * @return
     */
    public List<Knowledge> findChildById(Long parentId) {
        //自己写match()语句
        return null;
    }
}
