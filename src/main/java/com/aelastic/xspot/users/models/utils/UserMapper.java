package com.aelastic.xspot.users.models.utils;

import com.aelastic.xspot.users.models.documents.UserDocument;
import com.aelastic.xspot.users.models.dto.UserDto;

public class UserMapper {

    public static UserDto toDto(UserDocument userDocument) {
        return UserDto.builder()
                //TODO implement
                .build();

    }

    public static UserDocument toDocument(UserDto userDto) {
        return UserDocument.builder()
                //TODO implement
                .build();
    }


}
