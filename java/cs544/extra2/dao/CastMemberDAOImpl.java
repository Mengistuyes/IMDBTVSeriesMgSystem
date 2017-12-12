package cs544.extra2.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cs544.extra2.model.CastMember;
@Repository
public class CastMemberDAOImpl implements CastMemberDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public long save(CastMember castMember) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(castMember);
		return castMember.getCastMemberId();
	}

	@Override
	public void update(long id, CastMember castMember) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(castMember);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CastMember> list() {
		Session session = this.sessionFactory.getCurrentSession();
		List<CastMember> actorsList = session.createQuery("from CastMember").list();
	
		return actorsList;
	}

	@Override
	public CastMember get(long id) {
		Session session = this.sessionFactory.getCurrentSession();		
		CastMember p = (CastMember) session.load(CastMember.class, new Long(id));
		return p;
	}

	@Override
	public void delete(long id) {
		Session session = this.sessionFactory.getCurrentSession();
		CastMember castMember = (CastMember) session.load(CastMember.class, new Long(id));
		if(null != castMember){
			session.delete(castMember);
		}
	}
}
