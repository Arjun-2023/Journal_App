/*
package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

// .\mvnw test

@SpringBootTest
public class UserServiceTests {

    //here we write multiple test as methods

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;


    @ParameterizedTest
    @ArgumentsSource(UserArgumentsProvider.class)
  //  @Disabled
    public void testSaveNewUser(User user){
        assertTrue(userService.saveNewUser(user));
    }


   // @Disabled
    //@Test
   // @ParameterizedTest
   // @CsvSource({})
   // @ValueSource({})
    //ENUMSource({})
    //ArgumentsSource({});

    //@BeforeEach
    //@BeforeAll
    //@AfterAll
    //coverage for java

    @Disabled
    @ParameterizedTest
    @ValueSource(strings = {
            "ram",
            "arjun",
            "Vipul"
    })
    public void testFindByUserName(String name){
       // assertEquals(4,2+2);

      //  assertNotNull(userRepository.findByUserName("arjun"));

        User user =  userRepository.findByUserName(name);
        assertTrue(user.getJournalEntries().isEmpty());
    }

    @Disabled
    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,10,12",
            "3,6,9"

    })
    public void test(int a, int b , int expected){
        assertEquals(expected, a+b);
    }

}


 */