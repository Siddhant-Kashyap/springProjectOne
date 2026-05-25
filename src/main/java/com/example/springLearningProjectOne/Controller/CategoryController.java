package com.example.springLearningProjectOne.Controller;

import com.example.springLearningProjectOne.DTO.CategoryRequestDto;
import com.example.springLearningProjectOne.DTO.CategoryResponseDto;
import com.example.springLearningProjectOne.Services.ICategory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    public ICategory categoryService;
    public CategoryController(ICategory categoryService){
        this.categoryService=categoryService;
    }

    @PostMapping
    public ResponseEntity<CategoryResponseDto> createCategory(@RequestBody CategoryRequestDto requestDto){
        CategoryResponseDto categoryResponseDto = categoryService.createCategory(requestDto);
        return  new ResponseEntity<>(categoryResponseDto, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<CategoryResponseDto>> getAllCategory(){
        return ResponseEntity.ok(categoryService.getAllCategory());
    }

}
