package cs544.extra2.service;

import java.util.List;

import cs544.extra2.model.Actor;

public interface ActorService {
	  public long save(Actor actor);
	  public Actor get(long id);
	  public List<Actor> list();
	  public void update(long id, Actor actor);
	  public void delete(long id);
}
