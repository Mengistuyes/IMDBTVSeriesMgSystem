package cs544.extra2.dao;

import java.util.List;
@Repository
public class EpisodeDAOImpl implements EpisodeDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public long save(Episode episode) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(episode);
		return episode.getEpisodeId();
	}

	@Override
	public void update(long id, Episode episode) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(episode);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Episode> list() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Episode> actorsList = session.createQuery("from Episode").list();
	
		return actorsList;
	}

	@Override
	public Episode get(long id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Episode episode = (Episode) session.load(Episode.class, new Long(id));
		return episode;
	}

	@Override
	public void delete(long id) {
		Session session = this.sessionFactory.getCurrentSession();
		Episode episode = (Episode) session.load(Episode.class, new Long(id));
		if(null != episode){
			session.delete(episode);
		}
	}
}
