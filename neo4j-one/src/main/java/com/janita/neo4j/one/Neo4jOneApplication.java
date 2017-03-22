package com.janita.neo4j.one;

import com.janita.neo4j.one.config.MyNeo4jConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by Janita on 2017-03-21 19:45
 */
@SpringBootApplication
@Import({MyNeo4jConfig.class})
public class Neo4jOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(Neo4jOneApplication.class, args);
    }
}
