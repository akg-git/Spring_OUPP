package youtube.telusko.springtutorialtelusko;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung {
	@Autowired
	Mobile cpu;

	public Mobile getCpu() {
		return cpu;
	}

	public void setCpu(Mobile cpu) {
		this.cpu = cpu;
	}

	public void specification() {

		System.out.println("Specifications: Octa Core, 6GB RAM, 64GB ROM");
		cpu.process();
	}

}
