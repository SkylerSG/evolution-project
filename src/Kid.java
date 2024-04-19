public class Kid extends Guy{
	
	public Kid(Guy g1, Guy g2) {
		super();
		this.instructions = new InstructionList(g1.instructions, g2.instructions);
		
	}	
}