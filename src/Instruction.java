import java.util.Random;
public class Instruction {
	int instruct;
	
	public Instruction() {
		Random r = new Random(); 
		int startInstruction = r.nextInt(1000); // 1000 diff combinations in single instruction
		instruct = startInstruction;
	}
}
