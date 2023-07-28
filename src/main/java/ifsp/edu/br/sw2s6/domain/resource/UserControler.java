package ifsp.edu.br.sw2s6.domain.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ifsp.edu.br.sw2s6.domain.model.Gender;
import ifsp.edu.br.sw2s6.domain.model.User;

@RestController
public class UserControler {
	@GetMapping("/users")
	public List<User> list(){
		var user1 = new User();
		user1.setId(1L);
		user1.setName("José");
		user1.setEmail("jose@email.com");
		user1.setPassword("123456");
		user1.setGender(Gender.MASCULINO);
		user1.setAge(40);
		return Arrays.asList(user1);
		
	}

}
