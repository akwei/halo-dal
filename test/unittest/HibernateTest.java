package unittest;

import javax.annotation.Resource;

import junit.framework.Assert;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "/hibernate-spring.xml" })
@Transactional
public class HibernateTest {

    @Resource
    HibernateTemplate hibernateTemplate;

    @Resource
    SessionFactory sessionFactory;

    @Test
    public void insert() {
        Person p = new Person();
        p.setName("akweiwei");
        sessionFactory.getCurrentSession().save(p);
        System.out.println("pid:" + p.getPid());
        Person dbp = (Person) sessionFactory.getCurrentSession().get(
                Person.class, p.getPid());
        Assert.assertEquals(p.getPid(), dbp.getPid());
        Assert.assertEquals(p.getName(), dbp.getName());
        Assert.assertEquals(p.getLevel(), dbp.getLevel());
    }

    @Test
    public void delete() {
        Person p = new Person();
        p.setName("akweiwei");
        sessionFactory.getCurrentSession().save(p);
        sessionFactory.getCurrentSession().delete(p);
        Person dbp = (Person) sessionFactory.getCurrentSession().get(
                Person.class, p.getPid());
        Assert.assertNull(dbp);
    }
}
