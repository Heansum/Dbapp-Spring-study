# ๐ Repository ์๊ฐ
<strong>๐ป [์ฝ๋ฆฌ์IT์์นด๋ฐ๋ฏธ](http://busan.koreaisacademy.com/?dGubun=1&_ga=2.118731840.895175949.1635676317-1194081919.1635589884)์์ ๊ต์กํ ๊ฒ์ ๊ธฐ๋กํ Repository์๋๋ค.</strong><br>
โจ <strong>Springboot ๊ต์ก ๊ธฐ๊ฐ (21.06.21~21.07.21)</strong>

## ๐ ๋ธ๋ก๊ทธ ์ ๋ฆฌ

### โ ํ๊ฒฝ ์ค์ 
[Download the Spring Tools[์คํ๋ง ํด ๋ค์ด๋ก๋ํ๊ธฐ]](https://valuelog.tistory.com/3)

### ๐ ์คํ๋ง ์๋ฌธ์ ์ํ ๊ธฐ์ด ์ง์
[The foundation for entering Spring [์คํ๋ง ์๋ฌธ์ ๊ธฐ์ด ์ง์][1]](https://valuelog.tistory.com/4)<br>
[The foundation for entering Spring [์คํ๋ง ์๋ฌธ์ ๊ธฐ์ด ์ง์][2]](https://valuelog.tistory.com/5)

### ๐ Spring
[[Spring][1] MVC pattern [MVC ํจํด]](https://valuelog.tistory.com/7)<br>
[[Spring][2] The practice of MVC pattern [MVC ํจํด ์ค์ต]](https://valuelog.tistory.com/10)<br>
[[Spring][3] Dependency Injection[์์กด์ฑ ์ฃผ์]](https://valuelog.tistory.com/16)<br>
[[Spring][4] DB Connection Practice[DB ์ฐ๊ฒฐ ์ค์ต]](https://valuelog.tistory.com/17)<br>
[[Spring][5] TCP/JPARepository for CRUD[TCPํต์ ๊ณผ JPA๋ฅผ ์ด์ฉํ Repository ์ค๊ณ]](https://valuelog.tistory.com/19)<br>
[[Spring][6] Desigin of RestfulAPI/UPDATE in CRUD[RestfulAPI์ ์๋ฐ์ดํธ ์ค์ต]](https://valuelog.tistory.com/20)<br>
[[Spring][7] Join practice[ํ์๊ฐ์ ์ค์ต]](https://valuelog.tistory.com/21)<br>
[[Spring][8] Login Practice[๋ก๊ทธ์ธ ์ค์ต]](https://valuelog.tistory.com/24)<br>
[[Spring][9] RDB, Object Relationship Mapping in Spring[๊ด๊ณํ ๋ฐ์ดํฐ๋ฒ ์ด์ค, ORM]](https://valuelog.tistory.com/25)<br>
[[Spring][10] ORM, JPA oneToMany[์๋ฐฉํฅ Mapping ์ค์ต]](https://valuelog.tistory.com/26)<br>
[[Spring][11] JPA fetchType, Mapping, Open-in-view[์๋ฐฉํฅ ๋งตํ ์ ๋ฆฌ,LAZYloading]](https://valuelog.tistory.com/27)<br>
[[Spring][12] API ํ์ฉํ๊ธฐ](https://valuelog.tistory.com/28)<br>
[[Spring][13] API Practice[API ์ค์ต, test]](https://valuelog.tistory.com/29)<br>
[[Spring][14] API Practice2[Address API ๊ตฌํ์ฝ๋, Debug]](https://valuelog.tistory.com/30)<br>
[[Spring][15] Update practice[ํ์์ ๋ณด ์์  ๋ฐ ์ฃผ์ APIํ์ฉํ์ฌ ๊ฐ์ ธ์ค๊ธฐ]](https://valuelog.tistory.com/32)<br>
[[Spring][16] Main Page[๋ฉ์ธํ์ด์ง, ์์ธํ์ด์ง ๊ตฌํ]](https://valuelog.tistory.com/33)<br>
[[Spring][17] Page Update, Delete[๊ฒ์๊ธ ์์ ,์ญ์  ๊ตฌํ]](https://valuelog.tistory.com/35)<br>
[[Spring][18] Using summernote[๊ธ์ฐ๊ธฐ ์์ฑ ๊ตฌํ]](https://valuelog.tistory.com/36)<br>
[[Spring][19] Updating post[๊ธ์ฐ๊ธฐ ์์  ๊ตฌํ]](https://valuelog.tistory.com/37)<br>
[[Spring][20] Page update and delete by JS[JS๋ฅผ ํ์ฉํ์ฌ update, delete๊ตฌํ]](https://valuelog.tistory.com/39)


# ๐ DBAPP

## ๋ฐ์ดํฐ๋ฒ ์ด์ค ์์ฑ
```sql
create user 'korea'@'%' identified BY 'korea1234';
GRANT ALL PRIVILEGES ON *.* TO 'korea'@'%';
create database koreadb;
```

### ๋๋ฏธ๋ฐ์ดํฐ
```sql
INSERT INTO user(username, PASSWORD) VALUES('ssar', '1234');
INSERT INTO user(username, PASSWORD) VALUES('cos', '1234');

SELECT * FROM user;


INSERT INTO post(title, content, user_id) VALUES('์ ๋ชฉ1', '๋ด์ฉ1', 1);
INSERT INTO post(title, content, user_id) VALUES('์ ๋ชฉ2', '๋ด์ฉ2', 1);
INSERT INTO post(title, content, user_id) VALUES('์ ๋ชฉ3', '๋ด์ฉ3', 1);
INSERT INTO post(title, content, user_id) VALUES('์ ๋ชฉ4', '๋ด์ฉ4', 2);
INSERT INTO post(title, content, user_id) VALUES('์ ๋ชฉ5', '๋ด์ฉ5', 2);

SELECT * FROM post;
```


### ์ถ๊ฐ ์์กด์ฑ
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

### JSTL ํ๊ทธ ๋ผ์ด๋ธ๋ฌ๋ฆฌ
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


