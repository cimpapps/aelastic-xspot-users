package com.aelastic.xspot.users.models.documents;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDocument {

    @Id
    private String id;
    //TODO add fields

    private String email;
}
