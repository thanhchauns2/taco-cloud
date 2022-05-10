package tacos;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home()
	{
		return "home";
	}
}
