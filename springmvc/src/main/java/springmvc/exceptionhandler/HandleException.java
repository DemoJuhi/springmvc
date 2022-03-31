package springmvc.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class HandleException {

	
	//@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
		@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
		@ExceptionHandler(value = NullPointerException.class)
		public String NullPointerExceptionHandler(Model model)
		{
			model.addAttribute("message","Null pointer exception has occured");
			System.out.println("null pointer exception has occured");
			return "ExceptionPage";
		}
		
		@ExceptionHandler(ArithmeticException.class)
		public String ArithmeticExceptionHandler(Model model)
		{
			model.addAttribute("message","Arithmetic exception has occured");
			System.out.println("arithmetic exception has occured");
			return "ExceptionPage";
		}
}
