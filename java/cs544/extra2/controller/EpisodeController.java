package cs544.extra2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
public class EpisodeController {
	@Autowired
	 private EpisodeService episodeService;
		 
	/*	@RequestMapping("/")
		public String redirectRoot() {
			return "redirect:/comments";
		}*/
		
	  /*---Add new episode---*/
	  @PostMapping("/episode")
	  public String save(@RequestBody Episode episode) {
	     long id = episodeService.save(episode);
	     return "New Episode has been saved with ID:" + id;
	  }

	  /*---Get a episode by id---*/
	  @GetMapping("/episode/{id}")
	  public Episode get(@PathVariable("id") long id) {
	     Episode episode = episodeService.get(id);
	     return episode;
	  }

	  /*---get all episodes---*/
	  @GetMapping("/episodes")
	  public List<Episode> list() {
	     List<Episode> episodes = episodeService.list();
	     return episodes;
	  }

	  /*---Update a episode by id---*/
	  @PutMapping("/episode/{id}")
	  public String update(@PathVariable("id") long id, @RequestBody Episode episode) {
	     episodeService.update(id, episode);
	     return "redirect:/episode"; 
	  }

	  /*---Delete a episode by id---*/
	  @DeleteMapping("/episode/{id}")
	  public String delete(@PathVariable("id") long id) {
	     episodeService.delete(id);
	     return "";
	  }
}
