package app.adapters.Users.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.adapters.Users.entity.UserEntity;
import app.adapters.persons.entity.PersonEntity;
import app.domain.models.User;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

	public boolean existsByUserName(String userName);

	public UserEntity findByPersonId(PersonEntity personEntity);

	public UserEntity findByUserName(String userName);

}
