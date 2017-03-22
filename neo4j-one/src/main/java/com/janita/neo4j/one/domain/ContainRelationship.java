package com.janita.neo4j.one.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.io.Serializable;

/**
 * Created by Janita on 2017-03-22 15:04
 */
@RelationshipEntity(type = "CONTAIN")
public class ContainRelationship implements Serializable {

    @GraphId
    private Long id ;

    @StartNode
    Knowledge start;

    @EndNode
    Knowledge end;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Knowledge getStart() {
        return start;
    }

    public void setStart(Knowledge start) {
        this.start = start;
    }

    public Knowledge getEnd() {
        return end;
    }

    public void setEnd(Knowledge end) {
        this.end = end;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
