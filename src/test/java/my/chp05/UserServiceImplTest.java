package my.chp05;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;

/**
 * Created by Wojciech_Soltys on 02.01.2017.
 */
public class UserServiceImplTest {

    @Test
    public void assignPasswordShouldSetMD5Hash() throws Exception {
        //given
        UserDAO userDao = mock(UserDAO.class);
        SecurityService securityService = mock(SecurityService.class);
        User user = mock(User.class);
        UserServiceImpl userService = new UserServiceImpl(userDao, securityService);

        //when
        when(securityService.md5(anyString())).thenReturn("482c811da5d5b4bc6d497ffa98491e38");
        when(user.getPassword()).thenReturn("password123");

        userService.assignPassword(user);

        //then
        verify(user).setPassword("482c811da5d5b4bc6d497ffa98491e38");
        verify(userDao).updateUser(user);
    }
}