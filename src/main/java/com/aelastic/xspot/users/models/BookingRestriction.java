package com.aelastic.xspot.users.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingRestriction implements Serializable {

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    private int nrOfPenalties;

}
