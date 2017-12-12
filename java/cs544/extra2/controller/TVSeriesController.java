package cs544.extra2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class TVSeriesController {
	
	 @Autowired
	  private TVSeriesService tVSeriesService;
	 
/*	@RequestMapping("/")
	public String redirectRoot() {
		return "redirect:/comments";
	}*/
	
   /*---Add new tVSeries---*/
   @PostMapping("/tVSeries")
   public String save(@RequestBody TVSeries tVSeries) {
      long id = tVSeriesService.save(tVSeries);
      return "New TVSeries has been saved with ID:" + id;
   }

   /*---Get a tVSeries by id---*/
   @GetMapping("/tVSeries/{id}")
   public TVSeries get(@PathVariable("id") long id) {
      TVSeries tVSeries = tVSeriesService.get(id);
      return tVSeries;
   }

   /*---get all tVSeriess---*/
   @GetMapping("/tVSeriess")
   public List<TVSeries> list() {
      List<TVSeries> tVSeriess = tVSeriesService.list();
      return tVSeriess;
   }

   /*---Update a tVSeries by id---*/
   @PutMapping("/tVSeries/{id}")
   public String update(@PathVariable("id") long id, @RequestBody TVSeries tVSeries) {
      tVSeriesService.update(id, tVSeries);
      return "redirect:/tVSeries"; 
   }

   /*---Delete a tVSeries by id---*/
   @DeleteMapping("/tVSeries/{id}")
   public String delete(@PathVariable("id") long id) {
      tVSeriesService.delete(id);
      return "";
   }

}
