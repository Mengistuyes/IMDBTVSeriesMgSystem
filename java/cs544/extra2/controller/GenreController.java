package cs544.extra2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
public class GenreController {
	@Autowired
	 private GenreService genreService;
		 
	/*	@RequestMapping("/")
		public String redirectRoot() {
			return "redirect:/comments";
		}*/
		
	  /*---Add new genre---*/
	  @PostMapping("/genre")
	  public String save(@RequestBody Genre genre) {
	     long id = genreService.save(genre);
	     return "New Genre has been saved with ID:" + id;
	  }

	  /*---Get a genre by id---*/
	  @GetMapping("/genre/{id}")
	  public Genre get(@PathVariable("id") long id) {
	     Genre genre = genreService.get(id);
	     return genre;
	  }

	  /*---get all genres---*/
	  @GetMapping("/genres")
	  public List<Genre> list() {
	     List<Genre> genres = genreService.list();
	     return genres;
	  }

	  /*---Update a genre by id---*/
	  @PutMapping("/genre/{id}")
	  public String update(@PathVariable("id") long id, @RequestBody Genre genre) {
	     genreService.update(id, genre);
	     return "redirect:/genre"; 
	  }

	  /*---Delete a genre by id---*/
	  @DeleteMapping("/genre/{id}")
	  public String delete(@PathVariable("id") long id) {
	     genreService.delete(id);
	     return "";
	  }
}
