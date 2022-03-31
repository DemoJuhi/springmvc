package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	@RequestMapping("/one")
	public String one()
	{
		//RedirectView re=new RedirectView();
		//re.setUrl("two");
		System.out.println("one handler");
		//return re;
		return "redirect:two";
	}
	@RequestMapping("/two")
	public String two()
	{
		System.out.println("two handler");
		return "";
	}
}
