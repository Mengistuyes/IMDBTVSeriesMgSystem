package cs544.extra2.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cs544.extra2.model.Actor;
@Repository
public class ActorDAOImpl implements ActorDAO {
@Autowired
private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public long save(Actor actor) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(actor);
		return actor.getActorId();
	}

	@Override
	public void update(long id, Actor actor) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(actor);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Actor> list() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Actor> actorsList = session.createQuery("from Actor").list();
	
		return actorsList;
	}

	@Override
	public Actor get(long id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Actor actor = (Actor) session.load(Actor.class, new Long(id));
		return actor;
	}

	@Override
	public void delete(long id) {
		Session session = this.sessionFactory.getCurrentSession();
		Actor actor = (Actor) session.load(Actor.class, new Long(id));
		if(null != actor){
			session.delete(actor);
		}
	}


}
