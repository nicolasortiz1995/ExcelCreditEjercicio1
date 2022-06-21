package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionString {

	public static void main(String[] args) {
		String myString= "asfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342rasfsdalgkjerio435j342234234nh234o32rnowei23io4h324oi32423o4w.,345.,34534534ewf342r";
		
		int length = myString.length();
		int[] enterosList = new int[length]; 
		int[] imparesList = new int[length];
		int suma = 0;
		for(int i=0; i < length; i++) {
			if(Character.isDigit(myString.charAt(i))) {
				enterosList[i] = myString.charAt(i);
			}	
		}
		
		for(int x= 0; x < enterosList.length; x++) {
			if(enterosList[x] % 2 != 0) {
				imparesList[x] = enterosList[x];
			}
		}
		//Lista de enteros
		System.out.println(Arrays.toString(enterosList));
		
		//Lista de impares
		System.out.println(Arrays.toString(imparesList));
		
		//Suma de impares
		int sum = Arrays.stream(imparesList).sum();
		System.out.println(sum);
	}
}


