package com.sparta.springauth.dto;

import com.sparta.springauth.dto.ValidationGroups.NotBlankGroup;
import com.sparta.springauth.dto.ValidationGroups.PatternGroup;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupRequestDto {
  @NotBlank(groups = ValidationSequence.class)
  private String username;
  @NotBlank(groups = ValidationSequence.class)
  private String password;
  @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]+$",
      message = "이메일 형식에 맞게 입력해주세요.",groups = ValidationSequence.class)
  @NotBlank(groups = ValidationSequence.class)
  private String email;
  private boolean admin = false;
  private String adminToken = "";


}