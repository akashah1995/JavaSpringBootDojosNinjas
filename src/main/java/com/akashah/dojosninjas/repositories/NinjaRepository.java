package com.akashah.dojosninjas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.akashah.dojosninjas.models.*;

@Repository
public interface NinjaRepository extends PagingAndSortingRepository<Ninja, Long>, CrudRepository <Ninja, Long>  {

}
