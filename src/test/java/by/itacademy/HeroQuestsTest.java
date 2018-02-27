package by.itacademy;

import by.itacademy.entity.Hero;
import by.itacademy.entity.Quest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.Set;

/**
 * @author i.sukach
 */
public class HeroQuestsTest {

    private static SessionFactory SESSION_FACTORY = null;

    @BeforeClass
    public static void init() {
        SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
    }

    @Test
    public void test() {

    }

    @AfterClass
    public static void destroy() {
        SESSION_FACTORY.close();
    }
}
