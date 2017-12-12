package cs544.extra2.dao;

import java.util.List;
@Repository
public class SeasonDAOImpl implements SeasonDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public long save(Season season) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(season);
		return season.getSeasonId();
	}

	@Override
	public void update(long id, Season season) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(season);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Season> list() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Season> actorsList = session.createQuery("from Season").list();
	
		return actorsList;
	}

	@Override
	public Season get(long id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Season season = (Season) session.load(Season.class, new Long(id));
		return season;
	}

	@Override
	public void delete(long id) {
		Session session = this.sessionFactory.getCurrentSession();
		Season season = (Season) session.load(Season.class, new Long(id));
		if(null != season){
			session.delete(season);
		}
	}
}
