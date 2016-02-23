package com.ProjectD.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.*;

import com.ProjectD.persistance.data.User;

 public interface ProjectRepository extends MongoRepository<User,String>{

}
