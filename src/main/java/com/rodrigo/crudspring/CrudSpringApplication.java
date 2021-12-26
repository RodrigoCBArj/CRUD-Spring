package com.rodrigo.crudspring;

import com.rodrigo.crudspring.model.Video;
import com.rodrigo.crudspring.repository.VideoRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(VideoRepository videoRepository) {	// remover quando finalizar o desenvolvimento
		return args -> {
			videoRepository.deleteAll();

			Video v = new Video();
			v.setName("Tiringa e Charles - a cobra que mata 7");
			v.setCategory("Comédia");

			videoRepository.save(v);
		};
	}
}
