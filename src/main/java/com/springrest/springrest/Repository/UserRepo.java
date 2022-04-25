package com.springrest.springrest.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.springrest.springrest.entities.User;
public interface UserRepo extends JpaRepository<User, Long>{

}
