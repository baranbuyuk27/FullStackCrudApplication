package com.baranbuyuk.fullstackbackend.repository;

import com.baranbuyuk.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {
}
