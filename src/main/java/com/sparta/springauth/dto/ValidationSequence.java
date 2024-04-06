package com.sparta.springauth.dto;

import com.sparta.springauth.dto.ValidationGroups.NotBlankGroup;
import com.sparta.springauth.dto.ValidationGroups.PatternGroup;
import com.sparta.springauth.dto.ValidationGroups.SizeGroup;
import jakarta.validation.GroupSequence;

@GroupSequence({NotBlankGroup.class, PatternGroup.class, SizeGroup.class})
public interface ValidationSequence {
}
