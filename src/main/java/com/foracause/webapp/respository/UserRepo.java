package com.foracause.webapp.respository;

import com.foracause.webapp.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String>
{
}
