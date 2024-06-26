import java.util.Random;
// https://github.com/MTyson/java-neural-net/blob/d575844087cd686c4d52151073c0d2d1221d662d/src/main/java/com/infoworld/App.java#L57
public class Neuron {
		    Random random = new Random();
		    private Double oldBias = random.nextDouble(-1, 1), bias = random.nextDouble(-1, 1); 
		    public Double oldWeight1 = random.nextDouble(-1, 1), weight1 = random.nextDouble(-1, 1); 
		    private Double oldWeight2 = random.nextDouble(-1, 1), weight2 = random.nextDouble(-1, 1);
		   
		    public double compute(double input1, double input2){
		      double preActivation = (this.weight1 * input1) + (this.weight2 * input2) + this.bias;
		      double output = Util.sigmoid(preActivation);
		      return output;
		    }
		    
		    public void mutate(Double learnFactor){
		        int propertyToChange = random.nextInt(0, 3);
		        Double changeFactor = (learnFactor == null) ? random.nextDouble(-1, 1) : (learnFactor * random.nextDouble(-1, 1));
		        if (propertyToChange == 0){ 
		          this.bias += changeFactor; 
		        } else if (propertyToChange == 1){ 
		  	this.weight1 += changeFactor; 
		        } else { 
		  	this.weight2 += changeFactor; 
		        };
		      }
		       public void forget(){
		         bias = oldBias;
		         weight1 = oldWeight1;
		         weight2 = oldWeight2;
		       }
		       public void remember(){
		         oldBias = bias;
		         oldWeight1 = weight1;
		         oldWeight2 = weight2;
		       }
		  }