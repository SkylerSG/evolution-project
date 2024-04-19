import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InstructionList {
	ArrayList<Instruction> iList;
	
	public InstructionList(){
		this.iList = new ArrayList<Instruction>(); // random genetic sequence for case 0's (100 instructions long)
		for(int i = 0;i < 100;i++) {
			Instruction inst = new Instruction();
			iList.add(inst);
		}
	}
	public void forcedMutation() {
		if(iList.size() > 0) {
			
		}
	}
	public InstructionList(InstructionList inheritedList, InstructionList inheritedList2) { 
		List<Instruction> parentOneList = inheritedList.iList.subList(0,inheritedList.iList.size()/2);
		List<Instruction> parentTwoList = inheritedList2.iList.subList(inheritedList2.iList.size()/2,inheritedList2.iList.size());
		ArrayList<Instruction> finalList = new ArrayList<Instruction>();
		finalList.addAll(parentOneList);
		finalList.addAll(parentTwoList);
		Random r = new Random(); 
		int mutation = r.nextInt(500);
		if(r.nextInt(500) == mutation) {
			int mutationSection = r.nextInt(finalList.size());
			finalList.set(mutationSection, new Instruction());
			System.out.println("Mutation occurred at: "+mutationSection);
		}
		this.iList = finalList;
	}
	
	public String toString() {
		String printList = "[";
		for(Instruction i:this.iList) {
			printList += (i.instruct) + " ";
		}
		return printList+"]";
	}
}
