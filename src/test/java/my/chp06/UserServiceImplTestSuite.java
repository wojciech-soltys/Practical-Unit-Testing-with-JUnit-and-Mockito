package my.chp06;

import my.chp05.UserServiceImplTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        UserServiceImplTest.class,
        UserServiceImplTest2.class })

public class UserServiceImplTestSuite {

}