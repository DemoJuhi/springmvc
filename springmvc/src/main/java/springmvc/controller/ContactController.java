package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonmodel(Model model)
	{
		model.addAttribute("hdr", "Learning code with Juhi");
		model.addAttribute("desc", "Home for programmers");
	}
	
	@RequestMapping("/contact")
	public String showForm()
	{
		//String str=null;
		//str.length();
		
		return "contact";
	}
	/*@RequestMapping(path="/processForm",method = RequestMethod.POST)
	public String handleForm(
	@RequestParam(name="email", required = true) String email,
	@RequestParam("username") String username, 
	@RequestParam("password") String password,
	Model model)
	{
		
		User user=new User();
		
		user.setEmail(email);
		user.setPassword(password);
		user.setUsername(username);
		model.addAttribute("user",user);
		
		return "success";
	}*/
	@RequestMapping(path="/processForm",method = RequestMethod.POST)
	public String handleForm(@ModelAttribute(name = "user") User user, Model model,BindingResult result)
			{
		if(result.hasErrors())
		{
			
			return "contact";
		}
		this.userService.CreateUser(user);
		System.out.println(user);
				return "success";

}
	@RequestMapping(path = "/user/{id}/{name}")
	public String getUserdetails(@PathVariable(name = "id") String userId,@PathVariable(name="name") String username)
	{
		System.out.println("the is is"+userId+" "+username);
		return "help";
	}
	
	/*//@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String NullPointerExceptionHandler(Model model)
	{
		model.addAttribute("message","Null pointer exception has occured");
		System.out.println("null pointer exception has occured");
		return "ExceptionPage";
	}
	
	@ExceptionHandler(ArithmeticException.class)
	public String NArithmeticExceptionHandler(Model model)
	{
		model.addAttribute("message","Arithmetic exception has occured");
		System.out.println("arithmetic exception has occured");
		return "ExceptionPage";
	}*/
}
