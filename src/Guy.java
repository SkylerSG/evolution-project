public class Guy {
	Coordinate location;
	InstructionList instructions;
	Network brain; 
	
	public Guy() {
		this.location = new Coordinate();
		this.instructions = new InstructionList();
		this.brain = new Network(1000);
	}
	
	public String toString() {
		return(""+this.location+this.instructions+this.brain);
	}
	public void move(Double plusX, Double plusY) {
		if(plusX>plusY) {
			location.x++;
		} else {
			location.y++;
		}
		
	}
}

