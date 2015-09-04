//Winston La
//September 4th
//Lab 02 Cyclometer
// My bicycle cyclometer (meant to measure speed, distance, etc.) 
//records two kinds of data, the time elapsed in seconds, and the number of 
//rotations of the front wheel during that time. For two trips, given time and rotation count, your program should
//print the number of minutes for each trip
//print the number of counts for each tirp
//print the distance of each trip in miles
//print the distance for the two trips combined

//Define class
public class Cyclometer {
    	// main method required for every Java program
   	public static void main(String[] args) {
   	    //declare variables
   	    int secsTrip1=480;  // number of seconds elasped in trip 1
       	int secsTrip2=3220;  //number of seconds elasped in trip 2
		int countsTrip1=1561;  // number of rotation counts in trip 1
		int countsTrip2=9037; // number of rotation count in trip 2
   	    
   	    
   	    //Useful constants for calculating the distances
   	    double wheelDiameter=27.0,  //Diameter of the wheel. Note the comma, everything to ; is doubled
    	PI=3.14159, //value of PI
    	feetPerMile=5280,  // The conversion of feets in miles
  	    inchesPerFoot=12,   // the conversion of inches in feet
  	    secondsPerMinute=60;  // Seconds per minute . Note the semicolon here.
    	double distanceTrip1, distanceTrip2,totalDistance;  // Doubles all these variables which will be determined later
    	
    	//Print out stored variables
    	//notifies user how long each trip took and how many counts they had
    	System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	    System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
   	    
   	    
   	    //run the calculations; store the values.
		//Values are total distances traveled in individual trips and total distances.
    	distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
    	distanceTrip1/=inchesPerFoot*feetPerMile; // Note the goddamn /=. it is not a mistake. Gives distance in miles
    	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    	totalDistance=distanceTrip1+distanceTrip2;

        //Print out distances
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
	    System.out.println("Trip 2 was "+distanceTrip2+" miles");
	    System.out.println("The total distance was "+totalDistance+" miles");
        
	}  //end of main method   
} //end of class