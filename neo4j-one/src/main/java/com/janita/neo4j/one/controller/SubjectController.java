package com.janita.neo4j.one.controller;

import com.janita.neo4j.one.domain.Subject;
import com.janita.neo4j.one.service.SubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-03-25 09:22
 */
@RestController
@RequestMapping("/subject")
@Api(description = "科目接口")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping
    @ApiOperation(value = "添加科目")
    public Subject createSubject(@RequestBody Subject subject){
        return subjectService.createSubject(subject);
    }
}
