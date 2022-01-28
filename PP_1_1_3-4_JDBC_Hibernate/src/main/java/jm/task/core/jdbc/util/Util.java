package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import java.sql.*;

import java.util.Properties;

public class Util {
    public static final String URL = "jdbc:mysql://localhost:3306/tableTest?useSSL=false";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "admin0000";
    public static final String DRIVER = "com.mysql.jdbc.Driver";

    private static SessionFactory sessionFactory;

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration()
                .setProperty( "hibernate.connection.driver_class",
                        "com.mysql.jdbc.Driver" )
                .setProperty( "hibernate.connection.url", URL)
                .setProperty( "hibernate.connection.username", USERNAME)
                .setProperty( "hibernate.connection.password", PASSWORD)
                .setProperty( "hibernate.connection.pool_size", "1" )
                .setProperty( "hibernate.connection.autocommit", "false" )
                .setProperty( "hibernate.cache.provider_class",
                        "org.hibernate.cache.NoCacheProvider" )
                .setProperty( "hibernate.cache.use_second_level_cache",
                        "false" )
                .setProperty( "hibernate.cache.use_query_cache", "false" )
                .setProperty( "hibernate.dialect",
                        "org.hibernate.dialect.MySQL5Dialect" )
                .setProperty( "hibernate.show_sql","false" )
                .setProperty( "hibernate.current_session_context_class",
                        "thread" )
                .addPackage( "ru.miralab.db" )
                .addAnnotatedClass(User.class);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        return configuration.buildSessionFactory(serviceRegistry);
    }
    // реализуйте настройку соеденения с БД
}
