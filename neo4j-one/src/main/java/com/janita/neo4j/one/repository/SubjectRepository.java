package com.janita.neo4j.one.repository;

import com.janita.neo4j.one.domain.Subject;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Janita on 2017-03-25 09:25
 */
@Repository
public interface SubjectRepository extends GraphRepository<Subject> {
}
