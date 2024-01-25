import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class First {
	@RequestMapping("/")
	public int mul()
	{
		return 10+20;
	}
}
