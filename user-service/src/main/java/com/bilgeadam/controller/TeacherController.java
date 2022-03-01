package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Teacher;
import com.bilgeadam.request.TeacherRequestDto;
import com.bilgeadam.service.TeacherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
@RequiredArgsConstructor
public class TeacherController {
	private final TeacherService service;

	@PostMapping()
	public Teacher createTeacher(@RequestBody TeacherRequestDto dto) {
		return service.cerateTeacher(dto);
	}
}
