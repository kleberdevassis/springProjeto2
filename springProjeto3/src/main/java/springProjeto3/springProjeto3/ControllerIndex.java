package springProjeto3.springProjeto3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerIndex {
	
	@RequestMapping("/")
	public String index() {
		//oi
		return "index";
	}

	
	
}
