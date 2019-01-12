package com.aelastic.xspot.users.repo;

import com.aelastic.xspot.users.models.documents.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<UserDocument, String> {

}
