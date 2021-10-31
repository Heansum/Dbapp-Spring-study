# 🔔 Repository 소개
<strong>💻 [코리아IT아카데미](http://busan.koreaisacademy.com/?dGubun=1&_ga=2.118731840.895175949.1635676317-1194081919.1635589884)에서 교육한 것을 기록한 Repository입니다.</strong><br>
⌨ <strong>Springboot 교육 기간 (21.06.21~21.07.21)</strong>

## 📄 블로그 정리

### ⚙ 환경 설정
[Download the Spring Tools[스프링 툴 다운로드하기]](https://valuelog.tistory.com/3)

### 📒 스프링 입문을 위한 기초 지식
[The foundation for entering Spring [스프링 입문의 기초 지식][1]](https://valuelog.tistory.com/4)<br>
[The foundation for entering Spring [스프링 입문의 기초 지식][2]](https://valuelog.tistory.com/5)

### 📚 Spring
[[Spring][1] MVC pattern [MVC 패턴]](https://valuelog.tistory.com/7)<br>
[[Spring][2] The practice of MVC pattern [MVC 패턴 실습]](https://valuelog.tistory.com/10)<br>
[[Spring][3] Dependency Injection[의존성 주입]](https://valuelog.tistory.com/16)<br>
[[Spring][4] DB Connection Practice[DB 연결 실습]](https://valuelog.tistory.com/17)<br>
[[Spring][5] TCP/JPARepository for CRUD[TCP통신과 JPA를 이용한 Repository 설계]](https://valuelog.tistory.com/19)<br>
[[Spring][6] Desigin of RestfulAPI/UPDATE in CRUD[RestfulAPI와 업데이트 실습]](https://valuelog.tistory.com/20)<br>
[[Spring][7] Join practice[회원가입 실습]](https://valuelog.tistory.com/21)<br>
[[Spring][8] Login Practice[로그인 실습]](https://valuelog.tistory.com/24)<br>
[[Spring][9] RDB, Object Relationship Mapping in Spring[관계형 데이터베이스, ORM]](https://valuelog.tistory.com/25)<br>
[[Spring][10] ORM, JPA oneToMany[양방향 Mapping 실습]](https://valuelog.tistory.com/26)<br>
[[Spring][11] JPA fetchType, Mapping, Open-in-view[양방향 맵핑 정리,LAZYloading]](https://valuelog.tistory.com/27)<br>
[[Spring][12] API 활용하기](https://valuelog.tistory.com/28)<br>
[[Spring][13] API Practice[API 실습, test]](https://valuelog.tistory.com/29)<br>
[[Spring][14] API Practice2[Address API 구현코드, Debug]](https://valuelog.tistory.com/30)<br>
[[Spring][15] Update practice[회원정보 수정 및 주소 API활용하여 가져오기]](https://valuelog.tistory.com/32)<br>
[[Spring][16] Main Page[메인페이지, 상세페이지 구현]](https://valuelog.tistory.com/33)<br>
[[Spring][17] Page Update, Delete[게시글 수정,삭제 구현]](https://valuelog.tistory.com/35)<br>
[[Spring][18] Using summernote[글쓰기 작성 구현]](https://valuelog.tistory.com/36)<br>
[[Spring][19] Updating post[글쓰기 수정 구현]](https://valuelog.tistory.com/37)<br>
[[Spring][20] Page update and delete by JS[JS를 활용하여 update, delete구현]](https://valuelog.tistory.com/39)


# 📌 DBAPP

## 데이터베이스 생성
```sql
create user 'korea'@'%' identified BY 'korea1234';
GRANT ALL PRIVILEGES ON *.* TO 'korea'@'%';
create database koreadb;
```

### 더미데이터
```sql
INSERT INTO user(username, PASSWORD) VALUES('ssar', '1234');
INSERT INTO user(username, PASSWORD) VALUES('cos', '1234');

SELECT * FROM user;


INSERT INTO post(title, content, user_id) VALUES('제목1', '내용1', 1);
INSERT INTO post(title, content, user_id) VALUES('제목2', '내용2', 1);
INSERT INTO post(title, content, user_id) VALUES('제목3', '내용3', 1);
INSERT INTO post(title, content, user_id) VALUES('제목4', '내용4', 2);
INSERT INTO post(title, content, user_id) VALUES('제목5', '내용5', 2);

SELECT * FROM post;
```


### 추가 의존성
```xml
<dependency>
    <groupId>org.apache.tomcat</groupId>
    <artifactId>tomcat-jasper</artifactId>
    <version>9.0.46</version>
</dependency>

<dependency>
	<groupId>javax.servlet</groupId>
	<artifactId>jstl</artifactId>
	<version>1.2</version>
</dependency>
```

### JSTL 태그 라이브러리
```jsp
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
```

### application.yml
```yml
server:
  port: 8000
  servlet:
    encoding:
      charset: UTF-8
      
spring:
  mvc:
    view:
      prefix: /WEB-INF/views/
      suffix: .jsp
      
  datasource:
    driver-class-name: org.mariadb.jdbc.Driver
    username: korea
    password: korea1234
    url: jdbc:mysql://localhost:3306/koreadb
    
  jpa:
    hibernate:
      ddl-auto: none # create, update, none
    show-sql: true
```


