package cs544.extra2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
public class DirectorController {
	@Autowired
	 private DirectorService directorService;
		 
	/*	@RequestMapping("/")
		public String redirectRoot() {
			return "redirect:/comments";
		}*/
		
	  /*---Add new director---*/
	  @PostMapping("/director")
	  public String save(@RequestBody Director director) {
	     long id = directorService.save(director);
	     return "New Director has been saved with ID:" + id;
	  }

	  /*---Get a director by id---*/
	  @GetMapping("/director/{id}")
	  public Director get(@PathVariable("id") long id) {
	     Director director = directorService.get(id);
	     return director;
	  }

	  /*---get all directors---*/
	  @GetMapping("/directors")
	  public List<Director> list() {
	     List<Director> directors = directorService.list();
	     return directors;
	  }

	  /*---Update a director by id---*/
	  @PutMapping("/director/{id}")
	  public String update(@PathVariable("id") long id, @RequestBody Director director) {
	     directorService.update(id, director);
	     return "redirect:/director"; 
	  }

	  /*---Delete a director by id---*/
	  @DeleteMapping("/director/{id}")
	  public String delete(@PathVariable("id") long id) {
	     directorService.delete(id);
	     return "";
	  }
}
