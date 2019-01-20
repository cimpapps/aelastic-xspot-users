package com.aelastic.xspot.users.models.documents;


import com.aelastic.xspot.users.models.Location;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDocument implements Serializable {

    @Id
    private String id;
    //TODO add fields

    private String email;

    private boolean activated;

    private Location homeLocation;

    private Location workLocation;

    private List<String> preferences;

    private long nrOfPenalties;


}
