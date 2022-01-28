package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        User user = new User("Pit","Sam", (byte) 12);
        User user1 = new User("Sam","Pit", (byte) 32);
        User user2 = new User("Bob","Smit", (byte) 22);
        User user3 = new User("Smit","Bob", (byte) 42);
        User user4 = new User("Neo","Triniti", (byte) 2);
        UserService userService = new UserServiceImpl();

//        userDaoHibernate.createUsersTable();
//        userDaoHibernate.saveUser(user.getName(),user.getLastName(),user.getAge());
//        userDaoHibernate.saveUser(user1.getName(),user1.getLastName(),user1.getAge());
//        userDaoHibernate.saveUser(user2.getName(),user2.getLastName(),user2.getAge());
//        userDaoHibernate.saveUser(user3.getName(),user3.getLastName(),user3.getAge());
//        userDaoHibernate.removeUserById(3);
//        userDaoHibernate.dropUsersTable();
        }
    }
