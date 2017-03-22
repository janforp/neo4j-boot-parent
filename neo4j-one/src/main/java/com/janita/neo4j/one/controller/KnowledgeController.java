package com.janita.neo4j.one.controller;

import com.janita.neo4j.one.domain.ContainRelationship;
import com.janita.neo4j.one.domain.Knowledge;
import com.janita.neo4j.one.service.KnowledgeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Janita on 2017-03-22 11:31
 */
@RestController
@RequestMapping("/knowledge")
@Api(description = "知识点")
public class KnowledgeController {

    @Autowired
    private KnowledgeService knowledgeService;

    @PostMapping
    @ApiOperation(value = "添加知识点",notes = "添加知识点")
    public Knowledge createKnowledge(@RequestBody Knowledge knowledge){
        return knowledgeService.createKnowledge(knowledge);
    }

    @GetMapping
    @ApiOperation(value = "根据id获取知识点")
    public Knowledge getKnowledge(Long id){
        return knowledgeService.findKnowledgeById(id);
    }

    @GetMapping("/list")
    @ApiOperation(value = "获取所有知识点列表")
    public List<Knowledge> findAll(){
        return knowledgeService.findAll();
    }
}
