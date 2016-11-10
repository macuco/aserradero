package com.sinespera.data;

import org.springframework.data.repository.CrudRepository;

import com.sinespera.model.Cliente;

public interface ClientesRepository  extends CrudRepository<Cliente, String>  {

}
