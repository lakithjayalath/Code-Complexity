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
		int switchComp = 0;
		int switchPresent = 0;
		int lineTotalCtc = 0;
		int lineNo = 0;
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
		int noOfLines=0;

		while ((code = br.readLine()) != null)   {
			noOfLines++;
		}

		code =null;
		FileInputStream fstream2 = new FileInputStream("C:/Users/L/Desktop/SPM new/SPM project/sample.txt");
		BufferedReader br2 = new BufferedReader(new InputStreamReader(fstream2));
		int conditionalWeight[] = new int[noOfLines];
		int iterativeWeight[] = new int[noOfLines];
		int catchWeight[] = new int[noOfLines];
		int switchWeight[] = new int[noOfLines];
		//Read File Line By Line
		while ((code = br2.readLine()) != null)   {
			 //Check comments lines
	    	  boolean isPresentSingleComment = code.indexOf("//") != -1 ? true : false;
	    	  boolean isPresentMultipleCommentStart = code.indexOf("/*") != -1 ? true : false;
	    	  boolean isPresentMultipleCommentMiddle = code.indexOf("*") != -1 ? true : false;
	    	  boolean isPresentMultipleCommentEnd = code.indexOf("*/") != -1 ? true : false;
	    	  boolean isPresentMultipleSystem = code.indexOf("System.out") != -1 ? true : false;
	    	  ConditionalComplexity conditional = new ConditionalComplexity();
	    	  IterativeComplexity iterative =new IterativeComplexity();
	    	  CatchComplexity c = new CatchComplexity();
	    	  SwitchComplexity sw = new SwitchComplexity();
	    	//Ignore the comments
	    	  if(isPresentSingleComment || isPresentMultipleCommentStart || isPresentMultipleCommentEnd || isPresentMultipleCommentMiddle || isPresentMultipleSystem) {
		    		iterativeWeight[lineNo] =0;
					conditionalWeight[lineNo] = 0;  
					catchWeight[lineNo]= 0;
					switchWeight[lineNo] = 0;

	    	  }
	    	  else {
	    		iterativeWeight[lineNo] =iterative.iterativeComplex(code);
				conditionalWeight[lineNo] = conditional.conditonalComplex(code);  
				catchWeight[lineNo]= c.catchComplex(code);
				switchPresent =  switchPresent+sw.switchComplex(code);
				
				if(switchPresent == 1) {
					CaseComplexity cc = new CaseComplexity();
					switchComp = cc.caseComplex(code, switchPresent);
				}
				
				switchWeight[lineNo] = switchComp;
	    	  }
	    	  
	    	  lineTotalCtc =switchWeight[lineNo]+catchWeight[lineNo]+iterativeWeight[lineNo]+conditionalWeight[lineNo];
		  
	    	// Print the content on the console
	  			System.out.println (code);
	  			System.out.println("Ctc "+lineTotalCtc);

				totalWeight = totalWeight + lineTotalCtc;
	  			lineTotalCtc = 0;
	  			lineNo++;
	  			
			
//			IterativeComplexity ic = new IterativeComplexity();
//			iterativeWeight = ic.iterativeComplex(code);
//			System.out.println("Iterative Weight : " + iterativeWeight);
//			
			
			
//			CtcComplex x = new CtcComplex();
//			System.out.println("Total Weight = " + x.totalWeight());

		}
		System.out.println("\n\nTotal weight : " + totalWeight);

		
		//Close the input stream
		fstream.close();

	}
}
