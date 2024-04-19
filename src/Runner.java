import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;
public class Runner {

	public static void main(String[] args) {
		
		
		List<List<Integer>> data = new ArrayList<List<Integer>>();
		List<Double> pCorr = new ArrayList<>(); 
		Network network = new Network(10000);
		
		JFrame frame = new JFrame("World");
        World world = new World();
        frame.getContentPane().add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
		ArrayList<Coordinate> initialCoordinates = new ArrayList<>();
		
		for(int i = 0; i<1;i++) {
			Guy founderMale = new Guy();
			//Guy founderFemale = new Guy();
			//Kid k = new Kid(founderFemale,founderMale);
			
			data.add(Arrays.asList(founderMale.location.x,founderMale.location.y));
			
			//data.add(Arrays.asList(founderFemale.location.x,founderFemale.location.y));
			
			pCorr.add(founderMale.location.x+founderMale.location.y*-1.0);
			//initialCoordinates.add(founderFemale.location);
			initialCoordinates.add(founderMale.location);
			network.train(data, pCorr);
			Double predmove = network.predict(founderMale.location.x,founderMale.location.y);
			System.out.println(predmove);
			world.update(initialCoordinates); // run every pred 
			//initialCoordinates.add(k.location);
			
		}
		
		//List<Double> positiveCorr = Arrays.asList(0.0,0.0,1.0,1.0,0.0,0.0,1.0,1.0); // pos corr w env var
        

	    /* OLD DATA - height/weight to gender
		data.add(Arrays.asList(115, 66));
	    data.add(Arrays.asList(175, 78));
	    data.add(Arrays.asList(205, 72));
	    data.add(Arrays.asList(120, 67));
	    List<Double> answers = Arrays.asList(1.0,0.0,0.0,1.0);  
		*/
		
		// Data is taken from 8 env/xy vars 
		
	    
	    
	    // If dead manually remove


	    
	   
	    /*
	    System.out.println("");
	    System.out.println(String.format("  male, 167, 73: network500: %.10f | network: %.10f", network500.predict(167, 73), network.predict(167, 73)));
	    System.out.println(String.format("female, 105, 67: network500: %.10f | network: %.10f", network500.predict(105, 67), network.predict(105, 67))); 
	    System.out.println(String.format("female, 120, 72: network500: %.10f | network: %.10f", network500.predict(120, 72), network.predict(120, 72))); 
	    System.out.println(String.format("  male, 143, 67: network500: %.10f | network: %.10f", network500.predict(143, 67), network.predict(120, 72)));
	    System.out.println(String.format(" male', 130, 66: network500: %.10f | network: %.10f", network500.predict(170, 66), network.predict(130, 66)));
		*/
	    
	    System.out.println(String.format("%.10f",network.predict(30, 78)));
	    System.out.println(String.format("%.10f",network.predict(120, 110)));
	    System.out.println(String.format("%.10f",network.predict(10, 120)));
		System.out.println("\nPD");
		
        
}
}