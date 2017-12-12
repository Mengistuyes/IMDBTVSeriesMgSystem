package cs544.extra2.dao;

import java.util.List;

import cs544.extra2.model.Director;
@Repository
public class DirectorDAOImpl implements DirectorDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public long save(Director director) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(director);
		return director.getDirectorId();
	}

	@Override
	public void update(long id, Director director) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(director);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Director> list() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Director> actorsList = session.createQuery("from Director").list();
	
		return actorsList;
	}

	@Override
	public Director get(long id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Director director = (Director) session.load(Director.class, new Long(id));
		return director;
	}

	@Override
	public void delete(long id) {
		Session session = this.sessionFactory.getCurrentSession();
		Director director = (Director) session.load(Director.class, new Long(id));
		if(null != director){
			session.delete(director);
		}
	}
}
