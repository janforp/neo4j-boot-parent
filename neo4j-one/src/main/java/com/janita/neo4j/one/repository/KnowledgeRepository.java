package com.janita.neo4j.one.repository;

import com.janita.neo4j.one.domain.Knowledge;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Janita on 2017-03-22 11:30
 */
@Repository
public interface KnowledgeRepository extends GraphRepository<Knowledge> {
}
