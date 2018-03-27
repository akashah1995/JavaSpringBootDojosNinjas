package com.akashah.dojosninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akashah.dojosninjas.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository <Dojo, Long> {

}
