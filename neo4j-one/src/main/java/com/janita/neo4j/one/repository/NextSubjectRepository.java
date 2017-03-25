package com.janita.neo4j.one.repository;

import com.janita.neo4j.one.domain.NextSubjectRelationship;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Janita on 2017-03-25 09:30
 */
@Repository
public interface NextSubjectRepository extends GraphRepository<NextSubjectRelationship>{
}
