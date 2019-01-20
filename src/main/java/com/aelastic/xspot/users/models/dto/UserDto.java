package com.aelastic.xspot.users.models.dto;

import com.aelastic.xspot.users.models.BookingRestriction;
import com.aelastic.xspot.users.models.Location;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto implements Serializable {

    @Id
    private String id;
    //TODO add fields

    private String email;

    private boolean activated;

    private Location homeLocation;

    private Location workLocation;

    private List<String> preferences;

    private BookingRestriction bookingRestriction;

}
