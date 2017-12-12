package cs544.extra2.service;

import java.util.List;

import cs544.extra2.model.Comment;
@Service
public class CommentServiceImpl implements CommentService{
	@Autowired
	private CommentDAO commentDAO;

	public void setCommentDAO(CommentDAO commentDAO) {
		this.commentDAO = commentDAO;
	}
	
	@Override
	@Transactional
	public long save(Comment comment) {
		return this.commentDAO.save(comment);
	}

	@Override
	@Transactional
	public void update(long id, Comment comment) {
		this.commentDAO.update(id, comment);;
	}

	@Override
	@Transactional
	public List<Comment> list() {
		return this.commentDAO.list();
	}

	@Override
	@Transactional
	public Comment get(long id) {
		return this.commentDAO.get(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		this.commentDAO.delete(id);
	}

}
