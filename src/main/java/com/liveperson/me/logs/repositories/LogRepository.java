package com.liveperson.me.logs.repositories;

import com.liveperson.me.logs.models.Log;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<Log, String> {

}
