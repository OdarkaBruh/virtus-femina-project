package com.vf.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vf.model.Form;

@Repository
public interface FormRepo extends JpaRepository<Form, Integer> {
}

	