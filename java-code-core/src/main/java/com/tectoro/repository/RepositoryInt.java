package com.tectoro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.entity.JavaEntity;
@Repository
public interface RepositoryInt extends JpaRepository<JavaEntity, Integer>  {

}
