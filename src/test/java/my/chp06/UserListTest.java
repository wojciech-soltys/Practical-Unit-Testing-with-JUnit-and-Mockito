package my.chp06;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class UserListTest {

    UserList userList;

    @Before
    public void setUp() throws Exception {
        userList = new UserList();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getUsersShouldReturnZeroUsers() {
        assertThat(userList.getUsers(), empty());
    }

    @Test
    public void addOneUser() {
    }

    @Test
    public void addTwoUsers() {
    }

}