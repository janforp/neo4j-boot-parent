package com.janita.neo4j.one.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

import java.io.Serializable;

/**
 * Created by Janita on 2017-03-22 16:03
 */
@NodeEntity
public class Subject implements Serializable {

    @GraphId
    //科目id
    private Long subjectId;
    //科目名称
    private String subjectName;
    //备注
    private String remark;

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
