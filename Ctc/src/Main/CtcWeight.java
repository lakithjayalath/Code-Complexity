package Main;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import ComplexityFunctions.CaseComplexity;
import ComplexityFunctions.CatchComplexity;
import ComplexityFunctions.ConditionalComplexity;

import ComplexityFunctions.CtcComplex;
import ComplexityFunctions.IterativeComplexity;
import ComplexityFunctions.SwitchComplexity;
import ComplexityFunctions.SwitchComplexity;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;


public class CtcWeight {
	public static void main(String args[]) throws IOException {
		
		int totalWeight = 0;
		int conditionalWeight = 0;
		int iterativeWeight = 0;
		int catchWeight = 0;
		int switchWeight = 0;
		int switchComp = 0;
		
		/*
		 * String filePath = "C:/Users/L/Desktop/SPM new/SPM project/sample.txt";
		 * CodeGenerator codeGenerator = new CodeGenerator(); String code=
		 * codeGenerator.convert_file_to_string(filePath);
		 */

		/*
		 * String token1 = "";
		 * 
		 * // for-each loop for calculating heat index of May - October
		 * 
		 * // create Scanner inFile1 Scanner inFile1 = new Scanner(new
		 * File("C:/Users/L/Desktop/SPM new/SPM project/sample.txt")).useDelimiter(
		 * "\n\\s*");
		 * 
		 * 
		 * // Original answer used LinkedList, but probably preferable to use ArrayList
		 * in most cases // List<String> temps = new LinkedList<String>(); List<String>
		 * temps = new ArrayList<String>();
		 * 
		 * // while loop while (inFile1.hasNext()) { // find next line token1 =
		 * inFile1.next(); temps.add(token1); } inFile1.close();
		 * 
		 * String code = ""; for (String s : temps) { code = code+s; }
		 * 
		 * System.out.println(code);
		 */
		
		FileInputStream fstream = new FileInputStream("C:/Users/L/Desktop/SPM new/SPM project/sample.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String code;
		int switchPresent = 0;

		//Read File Line By Line
		while ((code = br.readLine()) != null)   {
			 //Check comments lines
	    	  boolean isPresentSingleComment = code.indexOf("//") != -1 ? true : false;
	    	  boolean isPresentMultipleCommentStart = code.indexOf("/*") != -1 ? true : false;
	    	  boolean isPresentMultipleCommentMiddle = code.indexOf("*") != -1 ? true : false;
	    	  boolean isPresentMultipleCommentEnd = code.indexOf("*/") != -1 ? true : false;
	    	  boolean isPresentMultipleSystem = code.indexOf("System") != -1 ? true : false;
	    	  
	    	  ConditionalComplexity conditional = new ConditionalComplexity();
	    	  IterativeComplexity iterative =new IterativeComplexity();
	    	  CatchComplexity c = new CatchComplexity();
	    	  SwitchComplexity sw = new SwitchComplexity();
	    	//Ignore the comments
	    	  if(isPresentSingleComment || isPresentMultipleCommentStart || isPresentMultipleCommentEnd || isPresentMultipleCommentMiddle || isPresentMultipleSystem) {
	    		  
	    	  }
	    	  else {
	    		iterativeWeight = iterativeWeight + iterative.iterativeComplex(code);
				conditionalWeight = conditionalWeight + conditional.conditonalComplex(code);  
				catchWeight= catchWeight + c.catchComplex(code);
				switchPresent = switchPresent + sw.switchComplex(code);
				
				if(switchPresent == 1) {
					CaseComplexity cc = new CaseComplexity();
					switchComp = cc.caseComplex(code, switchPresent);
				}
				
				switchWeight = switchWeight + switchComp;
	    	  }
	    	  
		  
	    	// Print the content on the console
	  			System.out.println (code);
			
//			IterativeComplexity ic = new IterativeComplexity();
//			iterativeWeight = ic.iterativeComplex(code);
//			System.out.println("Iterative Weight : " + iterativeWeight);
//			
//			totalWeight = conditionalWeight + iterativeWeight;
			
			
//			CtcComplex x = new CtcComplex();
//			System.out.println("Total Weight = " + x.totalWeight());

		}
		
		System.out.println("Iterative Weight : " + iterativeWeight);
		System.out.println("Conditional Weight : " + conditionalWeight);
		System.out.println("Catch Weight : " + catchWeight);
		System.out.println("Switch Weight : " + switchPresent);
		totalWeight = totalWeight + conditionalWeight + iterativeWeight + catchWeight + switchWeight;
		System.out.println("Total weight : " + totalWeight);

		//Close the input stream
		fstream.close();

	}
}
