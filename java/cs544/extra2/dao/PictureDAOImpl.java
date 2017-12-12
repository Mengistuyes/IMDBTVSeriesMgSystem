package cs544.extra2.dao;

import java.util.List;
@Repository
public class PictureDAOImpl implements PictureDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public long save(Picture picture) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(picture);
		return picture.getPictureId();
	}

	@Override
	public void update(long id, Picture picture) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(picture);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Picture> list() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Picture> actorsList = session.createQuery("from Picture").list();
	
		return actorsList;
	}

	@Override
	public Picture get(long id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Picture picture = (Picture) session.load(Picture.class, new Long(id));
		return picture;
	}

	@Override
	public void delete(long id) {
		Session session = this.sessionFactory.getCurrentSession();
		Picture picture = (Picture) session.load(Picture.class, new Long(id));
		if(null != picture){
			session.delete(picture);
		}
	}
}
