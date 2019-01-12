package com.aelastic.xspot.users.models.documents;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Builder

@Document
public class UserDocument {

    @Id
    private String id;
}
