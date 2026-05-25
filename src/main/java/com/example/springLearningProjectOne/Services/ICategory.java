package com.example.springLearningProjectOne.Services;

import com.example.springLearningProjectOne.DTO.CategoryRequestDto;
import com.example.springLearningProjectOne.DTO.CategoryResponseDto;

import java.util.List;

public interface ICategory {
    CategoryResponseDto createCategory(CategoryRequestDto requestDto);
    List<CategoryResponseDto> getAllCategory();
}
