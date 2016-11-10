package com.sinespera.data;

import org.springframework.data.repository.CrudRepository;

import com.sinespera.model.Role;

public interface RolesRepository  extends CrudRepository<Role, String>  {

}
