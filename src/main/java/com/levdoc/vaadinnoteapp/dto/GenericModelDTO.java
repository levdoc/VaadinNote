package com.levdoc.vaadinnoteapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public abstract class GenericModelDTO {
    private Long id;
    private LocalDateTime createdWhen;
}
