package cs544.extra2.service;

import java.util.List;

import cs544.extra2.model.Actor;
import cs544.extra2.model.CastMember;

public interface CastMemberService {
	public long save(CastMember castMember);
	public CastMember get(long id);
	public List<CastMember> list();
	public void update(long id, CastMember castMember);
	public void delete(long id);
}
