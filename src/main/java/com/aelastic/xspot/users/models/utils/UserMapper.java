package com.aelastic.xspot.users.models.utils;

import com.aelastic.xspot.users.models.documents.UserDocument;
import com.aelastic.xspot.users.models.dto.UserDto;

public class UserMapper {

    public static UserDto toDto(UserDocument userDocument) {
        return UserDto.builder()
                .id(userDocument.getId())
                .email(userDocument.getEmail())
                .activated(userDocument.isActivated())
                .homeLocation(userDocument.getHomeLocation())
                .workLocation(userDocument.getWorkLocation())
                .preferences(userDocument.getPreferences())
                .bookingRestriction(userDocument.getBookingRestriction())
                .build();

    }

    public static UserDocument toDocument(UserDto userDto) {
        return UserDocument.builder()
                .id(userDto.getId())
                .email(userDto.getEmail())
                .activated(userDto.isActivated())
                .homeLocation(userDto.getHomeLocation())
                .workLocation(userDto.getWorkLocation())
                .preferences(userDto.getPreferences())
                .bookingRestriction(userDto.getBookingRestriction())
                .build();
    }


}
