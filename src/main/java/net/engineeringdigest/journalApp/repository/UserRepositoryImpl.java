package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


import java.util.List;

public class UserRepositoryImpl {
    //SA - sentimentAnalysis
    //we introduce MongoTemplates here
    // crieteria and query goes hand in hand.

    @Autowired
    private MongoTemplate mongoTemplate;

    //ne, gte,
    public List<User> getUserSA(){
        Query query = new Query();
        // we did below by using regular expression regex to get valid email
        //

     //   query.addCriteria(Criteria.where("email").exists(True));
      //  query.addCriteria(Criteria.where("email").ne(null).ne(""));
        query.addCriteria(Criteria.where("email").regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,6}$"));
        query.addCriteria(Criteria.where("sentimentAnalysis").is(true));
        List<User> users = mongoTemplate.find(query, User.class);//best eg. for ORM

        // use of operators or ,not also by - Criteria criteria = new Criteria;

        return users;
    }
}
