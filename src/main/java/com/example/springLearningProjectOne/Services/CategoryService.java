package com.example.springLearningProjectOne.Services;

import com.example.springLearningProjectOne.DTO.CategoryRequestDto;
import com.example.springLearningProjectOne.DTO.CategoryResponseDto;
import com.example.springLearningProjectOne.Entity.Category;
import com.example.springLearningProjectOne.Mapper.CategoryMapper;
import com.example.springLearningProjectOne.Repository.ICategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategory{
    public final ICategoryRepository categoryRepository;

    public CategoryService(ICategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryResponseDto createCategory(CategoryRequestDto requestDto) {
        Category category =categoryRepository.save(CategoryMapper.toEntity(requestDto));
        return CategoryMapper.toResponseDto(category);
    }

    @Override
    public List<CategoryResponseDto> getAllCategory() {
        List<Category> categoryList = categoryRepository.findAll();
        return categoryList.stream().map(CategoryMapper::toResponseDto).toList();
    }

}
