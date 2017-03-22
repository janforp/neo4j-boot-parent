package com.janita.neo4j.one.repository;

import com.janita.neo4j.one.domain.ContainRelationship;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Janita on 2017-03-22 15:11
 */
@Repository
public interface ContainRSRepository extends GraphRepository<ContainRelationship> {
}
