package cs544.extra2.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import cs544.extra2.model.Comment;
@Repository
public class CommentDAOImpl implements CommentDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	@Override
	public long save(Comment comment) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(comment);
		return comment.getCommentId();
	}

	@Override
	public void update(long id, Comment comment) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(comment);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Comment> list() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Comment> actorsList = session.createQuery("from Comment").list();
	
		return actorsList;
	}

	@Override
	public Comment get(long id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Comment p = (Comment) session.load(Comment.class, new Long(id));
		return p;
	}

	@Override
	public void delete(long id) {
		Session session = this.sessionFactory.getCurrentSession();
		Comment comment = (Comment) session.load(Comment.class, new Long(id));
		if(null != comment){
			session.delete(comment);
		}
	}
}
