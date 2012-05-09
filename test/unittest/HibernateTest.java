package unittest;

import java.util.List;

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
        this.insertByLevel(0);
        this.insertByLevel(1);
    }

    public void insertByLevel(int level) {
        Person p = new Person();
        p.setName("akweiwei");
        p.setLevel(level);
        this.hibernateTemplate.save(p);
        @SuppressWarnings("unchecked")
        List<Person> list = this.hibernateTemplate.find(
                "from Person where level=?", level);
        Assert.assertEquals(1, list.size());
        Person dbp = list.get(0);
        Assert.assertEquals(p.getPid(), dbp.getPid());
        Assert.assertEquals(p.getName(), dbp.getName());
        Assert.assertEquals(p.getLevel(), dbp.getLevel());
    }

    @Test
    public void delete() {
        Person p = new Person();
        p.setName("akweiwei");
        hibernateTemplate.save(p);
        hibernateTemplate.delete(p);
        Person dbp = this.hibernateTemplate.get(Person.class, p.getPid());
        Assert.assertNull(dbp);
    }
}
