package com.kubernetesdemo.kuberdemo.user.repository;

import com.kubernetesdemo.kuberdemo.user.model.User;
import com.kubernetesdemo.kuberdemo.user.model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
