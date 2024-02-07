package youtube.telusko.springtutorialtelusko;

import org.springframework.stereotype.Component;

/*@Component annotaion: After writing this, no need of xml manipulation for bean creation */

@Component
public class Cart  implements Vehicle
{
	public void roll()
	{
		System.out.println("Cart is rolling down the street.");
	}
	
	public void drive()
	{
		System.out.println("Cart can't be driven.");
	}
}
