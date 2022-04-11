package com.example.demo.repositories.jpa;

import java.util.Optional;
import java.util.List;

import com.example.demo.datamodel.GroupJpa;
import com.example.demo.domain.valueobjects.GroupId;

import org.springframework.data.repository.CrudRepository;

public interface GroupJpaRepository extends CrudRepository<GroupJpa, GroupId> {

	List<GroupJpa> findAll();

	List<GroupJpa> findByName(String lastName);

	Optional<GroupJpa> findById(GroupId id);
}