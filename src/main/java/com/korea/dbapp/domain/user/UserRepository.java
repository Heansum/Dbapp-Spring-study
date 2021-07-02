package com.korea.dbapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// Data를 가져와서 자바 오브젝트로 만드는 것!! <객체, 프라이머리 키의 자료형> <붙을 수 있는 DB의 종류가 엄청 많음>
// 램에 떠있음
// JpaRespository에 에너테이션이있음!!!!!
//-> 안붙여도됨 그러나 붙인다, 유일한 예외!
//-> 지금은 붙이자
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	
	@Query(value = "SELECT * FROM user WHERE username = :username", nativeQuery = true)
	User mFindByUsername(String username); 
	
	@Query(value = "SELECT * FROM user WHERE username = :username AND password = :password", nativeQuery = true)
	User mLogin(String username, String password);
	
}
