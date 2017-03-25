package com.janita.neo4j.one.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.io.Serializable;

/**
 * Created by Janita on 2017-03-25 09:27
 */
@RelationshipEntity(type = "NEXT")
public class NextSubjectRelationship implements Serializable {
    @GraphId
    private Long id ;

    @StartNode
    Subject now;

    @EndNode
    Subject next;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Subject getNow() {
        return now;
    }

    public void setNow(Subject now) {
        this.now = now;
    }

    public Subject getNext() {
        return next;
    }

    public void setNext(Subject next) {
        this.next = next;
    }
}
