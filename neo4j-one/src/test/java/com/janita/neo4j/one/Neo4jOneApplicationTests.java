package com.janita.neo4j.one;

import com.janita.neo4j.one.domain.Knowledge;
import com.janita.neo4j.one.repository.KnowledgeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Janita on 2017-03-22 13:40
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class Neo4jOneApplicationTests {

    @Autowired
    private KnowledgeRepository knowledgeRepository;
    @Autowired
    private Configuration configuration;
    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void testDB(){
        System.out.println("*******"+knowledgeRepository);
    }

    @Test
    public void testInsert(){
        Knowledge knowledge = new Knowledge();
        knowledge.setId(1L);
        knowledge.setName("知识");

        knowledgeRepository.save(knowledge);
    }

    @Test
    public void testConfig(){
        System.out.println("*******"+configuration.get("neo4j.ogm.URI"));
    }

    @Test
    public void testSession(){
        System.out.println("*******"+sessionFactory);
    }
}
