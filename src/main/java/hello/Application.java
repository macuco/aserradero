/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package hello;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.util.Base64Utils;

import hello.data.Usuario;
import hello.data.UsuarioRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {
	
	private static final Logger log = LoggerFactory.getLogger(Application.class);


	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(UsuarioRepository repository) {
		return (args) -> {
			// save a couple of customers
			//repository.save(new Usuario("uno","Juan Manuel"));
			//repository.save(new Usuario("dos", "Maria isabel"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Usuario customer : repository.findAll()) {
				log.info(customer.toString());
			}
            log.info("");

			// fetch an individual customer by ID
			Usuario customer = repository.findOne("uno");
			log.info("Customer found with findOne(1L):");
			log.info("--------------------------------");
			log.info(customer!=null?customer.toString():"No hay datos");
            log.info("");

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):");
			log.info("--------------------------------------------");
			for (Usuario bauer : repository.findByNombre("Juan Manuel")) {
				log.info(bauer.toString());
			}
            log.info("");
		};
	}

}
