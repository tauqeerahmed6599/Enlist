package com.project.enlist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.enlist.entity.EmployeeDetailsDomain;

@Repository
public interface EmployeeDetailsRepo extends JpaRepository<EmployeeDetailsDomain, Long>  {

}
