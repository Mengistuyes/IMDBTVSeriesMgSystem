package cs544.extra2.dao;

import java.util.List;

import cs544.extra2.model.Actor;

public interface ActorDAO {
	   long save(Actor actor);
	   Actor get(long id);
	   List<Actor> list();
	   void update(long id, Actor actor);
	   void delete(long id);
}
