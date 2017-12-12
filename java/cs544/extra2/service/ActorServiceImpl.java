package cs544.extra2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cs544.extra2.dao.ActorDAO;
import cs544.extra2.model.Actor;
@Service
public class ActorServiceImpl implements ActorService {
	@Autowired
	private ActorDAO actorDAO;

	public void setActorDAO(ActorDAO actorDAO) {
		this.actorDAO = actorDAO;
	}
	
	@Override
	@Transactional
	public long save(Actor actor) {
		return this.actorDAO.save(actor);
	}

	@Override
	@Transactional
	public void update(long id, Actor actor) {
		this.actorDAO.update(id, actor);;
	}

	@Override
	@Transactional
	public List<Actor> list() {
		return this.actorDAO.list();
	}

	@Override
	@Transactional
	public Actor get(long id) {
		return this.actorDAO.get(id);
	}

	@Override
	@Transactional
	public void delete(long id) {
		this.actorDAO.delete(id);
	}

	


}
