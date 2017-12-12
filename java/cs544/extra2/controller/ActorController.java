package cs544.extra2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Actor;
import service.ActorService;
@Controller
public class ActorController {

	 @Autowired
	   private ActorService actorService;

		@RequestMapping("/")
		public String redirectRoot() {
			return "redirect:/comments";
		}
		
	   /*---Add new actor---*/
	   @PostMapping("/actor")
	   public String save(@RequestBody Actor actor) {
	      long id = actorService.save(actor);
	      return "New Actor has been saved with ID:" + id;
	   }

	   /*---Get a actor by id---*/
	   @GetMapping("/actor/{id}")
	   public Actor get(@PathVariable("id") long id) {
	      Actor actor = actorService.get(id);
	      return actor;
	   }

	   /*---get all actors---*/
	   @RequestMapping("/actors")
	   public List<Actor> list() {
		   System.out.println("I am doin something");
	      List<Actor> actors = actorService.list();
	      return actors;
	   }

	   /*---Update a actor by id---*/
	   @PutMapping("/actor/{id}")
	   public String update(@PathVariable("id") long id, @RequestBody Actor actor) {
	      actorService.update(id, actor);
	      return "redirect:/actor"; 
	   }

	   /*---Delete a actor by id---*/
	   @DeleteMapping("/actor/{id}")
	   public String delete(@PathVariable("id") long id) {
	      actorService.delete(id);
	      return "Actor with id " + id + " deleted";
	   }
}
