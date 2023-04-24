@Configuration
public class HibernateConfig {


    public SessionFactory getFactory() {
        SessionFactory factory = new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(MovieEntity.class)
                .addAnnotatedClass(VoteEntity.class)
                .buildSessionFactory();
        return factory;
    }
