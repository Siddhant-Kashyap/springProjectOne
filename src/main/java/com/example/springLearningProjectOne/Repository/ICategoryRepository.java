package com.example.springLearningProjectOne.Repository;

import com.example.springLearningProjectOne.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category,Long> {
}
