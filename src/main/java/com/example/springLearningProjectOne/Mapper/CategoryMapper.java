package com.example.springLearningProjectOne.Mapper;

import com.example.springLearningProjectOne.DTO.CategoryRequestDto;
import com.example.springLearningProjectOne.DTO.CategoryResponseDto;
import com.example.springLearningProjectOne.Entity.Category;

public class CategoryMapper {
    public static Category toEntity(CategoryRequestDto dto){
        Category category = new Category();
        category.setName(dto.getName());
        category.setDescription(dto.getDescription());
        return category;
    }
    public static CategoryResponseDto toResponseDto(Category category){
        return new CategoryResponseDto(category.getId(),category.getName(),category.getDescription(),category.getCreatedAt(),category.getUpdatedAt());
    }
}
