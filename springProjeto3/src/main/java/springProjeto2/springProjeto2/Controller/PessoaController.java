package springProjeto2.springProjeto2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PessoaController {
	
	@RequestMapping(method = RequestMethod.GET, value="/cadastropessoa")
	public String inicio() {
		
		return "cadastro/cadastropessoa";
	}

}
