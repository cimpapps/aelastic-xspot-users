package com.aelastic.xspot.users.models.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Builder
@NoArgsConstructor
@Data
public class UserDto {

    @Id
    private String id;

}
