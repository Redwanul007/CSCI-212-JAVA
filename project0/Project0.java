import javax.swing.JOptionPane;
/** @author hare4791
 * Lab sec # 11F,Date- 09/24/2019
 * used jOptionPane to create dialouge box javax.swing.joption imports
 * used while loop to go through usen input to find  valid value
 * created a method to stop  
 *
 */




public class Project0 {
	public static void main(String[] args) {
    	while(true){/*infinite loop until stop is entered*/
           	String input = JOptionPane.showInputDialog("Please Enter a sentence");// this asks user for   an input ..
           	int LowerE = 0;//initializing loewer value later incremented and check every value
           	int UpperE = 0;//upper value "    "     	 
           	String y = "Stop";
           	if(y.equalsIgnoreCase(input)){ // checking if the input is stop
               	return;
           	}
           	else{
               	for(int i=0; i<input.length(); i++){ // loop  starting from 0 till hits the number of characters in the string
                   	if(input.charAt(i) =='e'){//looking for character e
                       	LowerE++;//adding character e to the initial value
                   	}
                   	else if(input.charAt(i) == 'E'){//looking for character E
                       	UpperE++;//adding character E to the initial value
                   	}
               	}
               	//printing the number of lower e's and upper E's
               	JOptionPane.showMessageDialog(null, "Number of lower case e's: "+ LowerE + "\nNumber of upper case e's: "+ UpperE);
           	}
       	}
   	}



}
