package com.t1dmlgus.order.infrastructure.user;

import com.t1dmlgus.order.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
