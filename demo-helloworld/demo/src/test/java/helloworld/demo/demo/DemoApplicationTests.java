package helloworld.demo.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTesimport org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import javax.sql.DataSource;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Testcontainers
public class HelloWorldApplicationTests {

    @Container
    private static final MySQLContainer<?> mysqlContainer = new MySQLContainer<>("mysql:latest");

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() {
        // Perform tests that require the database connection
        // For example, you can use JdbcTemplate to execute queries
        // or check if the connection is successful.
        System.out.println("Database URL: " + dataSource.getConnection().getMetaData().getURL());
    }
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import javax.sql.DataSource;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Testcontainers
public class HelloWorldApplicationTests {

    @Container
    private static final MySQLContainer<?> mysqlContainer = new MySQLContainer<>("mysql:latest");

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() {
        // Perform tests that require the database connection
        // For example, you can use JdbcTemplate to execute queries
        // or check if the connection is successful.
        System.out.println("Database URL: " + dataSource.getConnection().getMetaData().getURL());
    }
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import javax.sql.DataSource;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Testcontainers
public class HelloWorldApplicationTests {

    @Container
    private static final MySQLContainer<?> mysqlContainer = new MySQLContainer<>("mysql:latest");

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() {
        // Perform tests that require the database connection
        // For example, you can use JdbcTemplate to execute queries
        // or check if the connection is successful.
        System.out.println("Database URL: " + dataSource.getConnection().getMetaData().getURL());
    }
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import javax.sql.DataSource;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Testcontainers
public class HelloWorldApplicationTests {

    @Container
    private static final MySQLContainer<?> mysqlContainer = new MySQLContainer<>("mysql:latest");

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() {
        // Perform tests that require the database connection
        // For example, you can use JdbcTemplate to execute queries
        // or check if the connection is successful.
        System.out.println("Database URL: " + dataSource.getConnection().getMetaData().getURL());
    }
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import javax.sql.DataSource;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Testcontainers
public class HelloWorldApplicationTests {

    @Container
    private static final MySQLContainer<?> mysqlContainer = new MySQLContainer<>("mysql:latest");

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() {
        // Perform tests that require the database connection
        // For example, you can use JdbcTemplate to execute queries
        // or check if the connection is successful.
        System.out.println("Database URL: " + dataSource.getConnection().getMetaData().getURL());
    }
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import javax.sql.DataSource;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Testcontainers
public class HelloWorldApplicationTests {

    @Container
    private static final MySQLContainer<?> mysqlContainer = new MySQLContainer<>("mysql:latest");

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() {
        // Perform tests that require the database connection
        // For example, you can use JdbcTemplate to execute queries
        // or check if the connection is successful.
        System.out.println("Database URL: " + dataSource.getConnection().getMetaData().getURL());
    }
}
}
}
}
}
}
{

	@Test
	void contextLoads() {
	}

}
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import javax.sql.DataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import javax.sql.DataSource;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Testcontainers
public class HelloWorldApplicationTests {

    @Container
    private static final MySQLContainer<?> mysqlContainer = new MySQLContainer<>("mysql:latest");

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() {
        // Perform tests that require the database connection
        // For example, you can use JdbcTemplate to execute queries
        // or check if the connection is successful.
        System.out.println("Database URL: " + dataSource.getConnection().getMetaData().getURL());
    }
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import javax.sql.DataSource;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Testcontainers
public class HelloWorldApplicationTests {

    @Container
    private static final MySQLContainer<?> mysqlContainer = new MySQLContainer<>("mysql:latest");

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() {
        // Perform tests that require the database connection
        // For example, you can use JdbcTemplate to execute queries
        // or check if the connection is successful.
        System.out.println("Database URL: " + dataSource.getConnection().getMetaData().getURL());
    }
}
}

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Testcontainers
public class HelloWorldApplicationTests {

    @Container
    private static final MySQLContainer<?> mysqlContainer = new MySQLContainer<>("mysql:latest");

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() {
        // Perform tests that require the database connection
        // For example, you can use JdbcTemplate to execute queries
        // or check if the connection is successful.
        System.out.println("Database URL: " + dataSource.getConnection().getMetaData().getURL());
    }
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import javax.sql.DataSource;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Testcontainers
public class HelloWorldApplicationTests {

    @Container
    private static final MySQLContainer<?> mysqlContainer = new MySQLContainer<>("mysql:latest");

    @Autowired
    private DataSource dataSource;

    @Test
    public void contextLoads() {
        // Perform tests that require the database connection
        // For example, you can use JdbcTemplate to execute queries
        // or check if the connection is successful.
        System.out.println("Database URL: " + dataSource.getConnection().getMetaData().getURL());
    }
}
}
