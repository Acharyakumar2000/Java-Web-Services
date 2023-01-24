package assignment.java.project;


	import java.util.Arrays;
	import java.util.List;

	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	public class UserController {
		
		@RequestMapping("/user")
		public List<User> retriveAllUser()
		{
			return Arrays.asList(
					new User(1,"Ramesh Jena","Ram12",4592651541L,"ach@gmail.com"),
					new User(2,"Prasad Swain","Prasad32",8456015451L,"bshv@gmail.com"),
					new User(3,"Abdul Bari","Abdul121",9348015624L,"wd2@gmail.com"),
					new User(4,"Sankar Samal","Sankar4",9348115461L,"dbbd21@gmail.com")
					);		
		}
	}



