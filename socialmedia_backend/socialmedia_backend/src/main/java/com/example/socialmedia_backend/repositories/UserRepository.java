package com.example.socialmedia_backend.repositories;

import com.example.socialmedia_backend.models.User;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByEmail(String email);
    @Query("select u from User u where u.firstName like %:query% or u.lastName like %:query%")
    List<User> searchUser(@RequestParam("query") String query);
}
