package cs544.extra2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import cs544.extra2.dao.CastMemberDAO;
import cs544.extra2.model.CastMember;
@Service
public class CastMemberServiceImpl implements CastMemberService {

	@Autowired
	private CastMemberDAO castMemberDAO;

	public void setCastMemberDAO(CastMemberDAO castMemberDAO) {
		this.castMemberDAO = castMemberDAO;
	}
	
	@Override
	@Transactional
	public long save(CastMember castMember) {
		return this.castMemberDAO.save(castMember);
	}

	@Override
	@Transactional
	public void update(long id, CastMember castMember) {
		this.castMemberDAO.update(id, castMember);;
	}

	@Override
	@Transactional
	public List<CastMember> list() {
		return this.castMemberDAO.list();
	}

	@Override
	@Transactional
	public CastMember get(long id) {
		return this.castMemberDAO.get(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		this.castMemberDAO.delete(id);
	}

}
