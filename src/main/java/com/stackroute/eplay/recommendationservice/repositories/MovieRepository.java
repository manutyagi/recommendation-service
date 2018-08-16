package com.stackroute.eplay.recommendationservice.repositories;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import com.stackroute.eplay.recommendationservice.domain.Movie;

public interface MovieRepository extends Neo4jRepository<Movie, Integer> {
//	@Query("MATCH (m:Movie) WHERE m.title ={title} RETURN m")
	Movie findByTitleLike(@Param("title") String title);
//	Movie findByTitle(@Param("title") String title);
}
