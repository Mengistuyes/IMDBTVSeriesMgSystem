package cs544.extra2.controller;

import org.springframework.stereotype.Controller;
@Controller
public class CommentController {
	  @Autowired
	   private CommentServiceImpl commentService;
		
	  /* ---Add new comment---*/
	   @PostMapping("/comment")
	   public String save(@RequestBody Comment comment) {
	      long id = commentService.save(comment);
	      return "New Comment has been saved with ID:" + id;
	   }

	   /*---Get a comment by id---*/
	   @GetMapping("/comment/{id}")
	   public Comment get(@PathVariable("id") long id) {
	      Comment comment = commentService.get(id);
	      return comment;
	   }

	   /*---get all comments---*/
	   @GetMapping("/comment")
	   public List<Comment> list() {
	      List<Comment> comments = commentService.list();
	      return comments;
	   }

	   /*---Update a comment by id---*/
	   @PutMapping("/comment/{id}")
	   public String update(@PathVariable("id") long id, @RequestBody Comment comment) {
	      commentService.update(id, comment);
	      return "redirect:/comment"; 
	   }

	  /* ---Delete a comment by id---*/
	   @DeleteMapping("/comment/{id}")
	   public String delete(@PathVariable("id") long id) {
	      commentService.delete(id);
	      return "Comment with no " + id +" has been deleted";
	   }
}
