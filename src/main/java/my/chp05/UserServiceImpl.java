package my.chp05;

/**
 * Created by Wojciech_Soltys on 02.01.2017.
 */
public class UserServiceImpl {
    private UserDAO userDAO;
    private SecurityService securityService;
    public void assignPassword(User user) {
        String passwordMd5 = securityService.md5(user.getPassword());
        user.setPassword(passwordMd5);
        userDAO.updateUser(user);
    }
    public UserServiceImpl(UserDAO dao, SecurityService security) {
        this.userDAO = dao;
        this.securityService = security;
    }
}
