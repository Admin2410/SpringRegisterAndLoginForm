package com.slr.springboot.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slr.springboot.Model.System_User;

import java.util.List;


@Repository
public interface UserRepo extends JpaRepository<System_User, String> {
	public System_User findByUserName(String userName);
}
