package cs544.extra2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
@Controller
public class PictureController {
 @Autowired
 private PictureService pictureService;
	 
/*	@RequestMapping("/")
	public String redirectRoot() {
		return "redirect:/comments";
	}*/
	
  /*---Add new picture---*/
  @PostMapping("/picture")
  public String save(@RequestBody Picture picture) {
     long id = pictureService.save(picture);
     return "New Picture has been saved with ID:" + id;
  }

  /*---Get a picture by id---*/
  @GetMapping("/picture/{id}")
  public Picture get(@PathVariable("id") long id) {
     Picture picture = pictureService.get(id);
     return picture;
  }

  /*---get all pictures---*/
  @GetMapping("/pictures")
  public List<Picture> list() {
     List<Picture> pictures = pictureService.list();
     return pictures;
  }

  /*---Update a picture by id---*/
  @PutMapping("/picture/{id}")
  public String update(@PathVariable("id") long id, @RequestBody Picture picture) {
     pictureService.update(id, picture);
     return "redirect:/picture"; 
  }

  /*---Delete a picture by id---*/
  @DeleteMapping("/picture/{id}")
  public String delete(@PathVariable("id") long id) {
     pictureService.delete(id);
     return "";
  }
}
