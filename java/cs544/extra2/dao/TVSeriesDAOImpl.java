package cs544.extra2.dao;

import java.util.List;
@Repository
public class TVSeriesDAOImpl implements TVSeriesDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public long save(TVSeries tVSeries) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(tVSeries);
		return tVSeries.getTVSeriesId();
	}

	@Override
	public void update(long id, TVSeries tVSeries) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(tVSeries);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TVSeries> list() {
		Session session = this.sessionFactory.getCurrentSession();
		List<TVSeries> actorsList = session.createQuery("from TVSeries").list();
	
		return actorsList;
	}

	@Override
	public TVSeries get(long id) {
		Session session = this.sessionFactory.getCurrentSession();		
		TVSeries tVSeries = (TVSeries) session.load(TVSeries.class, new Long(id));
		return tVSeries;
	}

	@Override
	public void delete(long id) {
		Session session = this.sessionFactory.getCurrentSession();
		TVSeries tVSeries = (TVSeries) session.load(TVSeries.class, new Long(id));
		if(null != tVSeries){
			session.delete(tVSeries);
		}
	}
}
