package com.janita.neo4j.one.controller;

import com.janita.neo4j.one.domain.NextSubjectRelationship;
import com.janita.neo4j.one.domain.Subject;
import com.janita.neo4j.one.service.NextSubjectRSService;
import com.janita.neo4j.one.service.SubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Janita on 2017-03-25 09:29
 */
@RestController
@RequestMapping("/next")
@Api(description = "科目的next关系接口")
public class NextSubjectRSController {

    @Autowired
    private NextSubjectRSService nextSubjectRSService;
    @Autowired
    private SubjectService subjectService;


    @PostMapping
    @ApiOperation(value = "给两个科目建立next关系")
    public NextSubjectRelationship createNextRs(Long nowSubId, Long nextSubId){

        Subject nowSubject = subjectService.findSubjectById(nowSubId);
        Subject nextSubject = subjectService.findSubjectById(nextSubId);
        if (nowSubject == null || nextSubject == null){
            throw new RuntimeException("科目不能空");
        }
        return nextSubjectRSService.createNextSubjectRS(nowSubject,nextSubject);
    }

    @GetMapping
    @ApiOperation(value = "列出所有的next关系")
    public List<NextSubjectRelationship> list(){
        return nextSubjectRSService.list();
    }

}
