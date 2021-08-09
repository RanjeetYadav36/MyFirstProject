package com.springrest.springrest.Dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.springrest.springrest.entities.User;
public interface UserDao extends JpaRepository<User, Long>{

}
