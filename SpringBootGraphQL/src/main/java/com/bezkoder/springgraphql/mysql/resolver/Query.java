package com.bezkoder.springgraphql.mysql.resolver;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.bezkoder.springgraphql.mysql.model.Author;
import com.bezkoder.springgraphql.mysql.model.Tutorial;
import com.bezkoder.springgraphql.mysql.repository.AuthorRepository;
import com.bezkoder.springgraphql.mysql.repository.TutorialRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;


@Component
public class Query implements GraphQLQueryResolver {
	private AuthorRepository authorRepository;
	private TutorialRepository tutorialRepository;

	@Autowired
	public Query(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
		this.authorRepository = authorRepository;
		this.tutorialRepository = tutorialRepository;
	}

	public Iterable<Author> findAllAuthors() {
		return authorRepository.findAll();
	}

	public Iterable<Tutorial> findAllTutorials() {
		return tutorialRepository.findAll();
	}
	@SuppressWarnings("unused")
	private Optional<Author> findAuthorById(int id) {
		return authorRepository.findById((long) id);}

	public long countAuthors() {
		return authorRepository.count();
	}

	public long countTutorials() {
		return tutorialRepository.count();
	}

}
