package com.janita.neo4j.one.controller;

import com.janita.neo4j.one.domain.ContainRelationship;
import com.janita.neo4j.one.service.ContainRSService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Janita on 2017-03-22 15:06
 */
@RestController
@RequestMapping("/contain")
@Api(description = "知识点包含关系接口")
public class ContainRSController {

    @Autowired
    private ContainRSService containRSService;

    @PostMapping
    @ApiOperation(value = "在两个知识点直接建立包含关系")
    public ContainRelationship createRS(Long start,Long end,String desc){
        return containRSService.createRS(start,end,desc);
    }

    @DeleteMapping
    @ApiOperation(value = "根据关系id删除该关系")
    public ContainRelationship removeRS(Long rsId){
        return containRSService.removeRS(rsId);
    }

    @GetMapping("/list")
    @ApiOperation(value = "列出所有的关系")
    public List<ContainRelationship> listRS(){
        return containRSService.list();
    }
}
