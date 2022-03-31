package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {

@RequestMapping(path="/home", method = RequestMethod.POST )	
public String home(Model model)
{
	model.addAttribute("name", "Shubham Shrivastava");
	model.addAttribute("id",1234);
	List<String> friends=new ArrayList<String>();
	friends.add("Juhi");
	friends.add("Shubham");
	friends.add("abc");
	friends.add("xyz");
	model.addAttribute("friends",friends);
	System.out.println("this is home url");
	return "index";
}
@RequestMapping("/about")
public String about()
{
	System.out.println("this is about controller");
	return "about";
}
@RequestMapping("/help")
public ModelAndView help()
{
	
	List<String> friends=new ArrayList<String>();
	friends.add("bihar");
	friends.add("purnia");
	friends.add("kolkata");
	friends.add("west bengal");
	ModelAndView modelandview=new ModelAndView();
	modelandview.addObject("help", "Please help me , This is help page");
	modelandview.setViewName("help");
	modelandview.addObject("name", "Juhi");
	LocalDateTime date= LocalDateTime.now();
	modelandview.addObject("date", date);
	modelandview.addObject("friends", friends);
	System.out.println("this is help controller");
	return modelandview;
}
}
