package cs544.extra2.dao;

import java.util.List;
@Repository
public class GenreDAOImpl implements GenreDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public long save(Genre genre) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(genre);
		return genre.getGenreId();
	}

	@Override
	public void update(long id, Genre genre) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(genre);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Genre> list() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Genre> actorsList = session.createQuery("from Genre").list();
	
		return actorsList;
	}

	@Override
	public Genre get(long id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Genre genre = (Genre) session.load(Genre.class, new Long(id));
		return genre;
	}

	@Override
	public void delete(long id) {
		Session session = this.sessionFactory.getCurrentSession();
		Genre genre = (Genre) session.load(Genre.class, new Long(id));
		if(null != genre){
			session.delete(genre);
		}
	}
}
