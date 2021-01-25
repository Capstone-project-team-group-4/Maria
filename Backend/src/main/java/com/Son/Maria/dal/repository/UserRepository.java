/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Son.Maria.dal.repository;

import com.Son.Maria.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author roboc
 */
public interface UserRepository extends JpaRepository<User, Integer>{

    @Override
    public User save(User user);

    @Override
    public boolean existsById(Integer userID);

    @Override
    public void deleteById(Integer userID); 
}
