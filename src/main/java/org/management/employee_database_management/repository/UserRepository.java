package org.management.employee_database_management.repository;

import org.management.employee_database_management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("from user_table u where u.username = :username and u.password = :password")
    User findByUsernameAndPwd(@Param("username") String username, @Param("password") String password);

    @Query("from user_table u where u.username=?1")
    User findUserByUsername(String username);

}
