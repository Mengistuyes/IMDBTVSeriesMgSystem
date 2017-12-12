package cs544.extra2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.CastMember;
import service.ActorService;
import service.CastMemberService;
import service.CastMemberServiceImpl;
@Controller
public class CastMemberController {

	   @Autowired
	   private CastMemberServiceImpl castMemberService;
	   /*---Add new castMember---*/
	   @RequestMapping(value="/castMember", method = RequestMethod.POST)
	   public String save(@RequestBody CastMember castMember) {
	      long id = castMemberService.save(castMember);
	      return "New CastMember has been saved with ID:" + id;
	   }

	   /*---Get a castMember by id---*/
	 //  @GetMapping("/castMember/{id}")
	   @RequestMapping("/castMember/{id}")
	   public CastMember get(@PathVariable("id") long id) {
	      CastMember castMember = castMemberService.get(id);
	      return castMember;
	   }

	  /* ---get all castMembers---*/
	   @GetMapping("/castMember")
	   public List<CastMember> list() {
	      List<CastMember> castMembers = castMemberService.list();
	      return castMembers;
	   }

	   /*---Update a castMember by id---*/
	   @PutMapping("/castMember/{id}")
	   public String update(@PathVariable("id") long id, @RequestBody CastMember castMember) {
		   castMemberService.update(id, castMember);
	      return "redirect:/castMember"; 
	   }

	   /*---Delete a castMember by id---*/
	   @DeleteMapping("/castMember/{id}")
	   public String delete(@PathVariable("id") long id) {
		   castMemberService.delete(id);
	      return "";
	   }
*/}
