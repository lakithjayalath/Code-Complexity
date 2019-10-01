package ComplexityFunctions;
import java.io.IOException;

import Main.CodeGenerator;

public class CtcComplex {
	
	public void doNothing() {
		
	}

	public int totalWeight() throws IOException {
		{
			int Ctc = 0;
			
			String filePath = "C:/Users/OneStep/Desktop/SPM project/sample.txt";
			CodeGenerator codeGenerator = new CodeGenerator();
			String code= codeGenerator.convert_file_to_string(filePath);
			
//			for(int i=0; i<code.length; i++) {
//				System.out.println(code[i]);
//			}

//			System.out.println(code.length);

			int caseCount = 0;
			int conditionalCount = 0;
			int logicalCount = 0;
			int bitwiseCount = 0;
			int loopCount = 0;
			int switchCount = 0;
			int catchCount = 0;
			
			
			int forCount = 0;
			int whileCount = 0;
			int doWhileCount = 0;
			int noOfSwitches = 0;
			int outputCount = 0;
			
			for(int j=0; j<code.length()-1; j++) {
					if(outputCount == 1) {
							if(code.charAt(j)=='"' && code.charAt(j+1)==')' || code.charAt(j+1)==')') {
								outputCount = 0;
								
//							if(forCount == 1) {
//								forCount = 0;
//							}
//							else if(whileCount == 1) {
//								whileCount = 0;
//							}
//							else if(doWhileCount == 1) {
//								doWhileCount = 0;
//							}
						}
					}
					else if(code.charAt(j) == ')' && code.charAt(j+1) == '{' && forCount == 1) {
						forCount = 0;
					}
					else if(code.charAt(j)==')' && code.charAt(j+1) == '{' && whileCount == 1) {
						whileCount = 0;
					}
					else if(code.charAt(j) == ')' && code.charAt(j+1) == '{' && doWhileCount == 1) {
						doWhileCount = 0;
					}
					else if((code.charAt(j)=='i' && code.charAt(j+1)=='f')) {
						Ctc = Ctc + 1;
						conditionalCount =conditionalCount + 1;
					}
					else if((code.charAt(j)=='f' && code.charAt(j+1)=='o' &&  code.charAt(j+2)=='r' && code.charAt(j+3)=='(')) {
						Ctc = Ctc + 2;
						forCount = 1;
						loopCount =loopCount + 1;
					}
//					else if(((code.charAt(j-1)=='|' && code.charAt(j)=='|')) || (code.charAt(j-1)!='|' && code.charAt(j)=='|' && code.charAt(j+1)!='|' )) {
//						Ctc = Ctc + 2;
//						if((code.charAt(j-1)=='|') && code.charAt(j)=='|') {
//							logicalCount = logicalCount + 1;
//						}
//						else if(code.charAt(j-1)!='|' && code.charAt(j)=='|' && code.charAt(j+1)!='|'){
//							bitwiseCount = bitwiseCount + 1;
//						}
//					}
					else if(code.charAt(j)=='w' && code.charAt(j+1)=='h' &&  code.charAt(j+2)== 'i' && code.charAt(j+3)=='l' && code.charAt(j+4) =='e' && code.charAt(j+5)=='(') {
						Ctc = Ctc + 2;
						whileCount = whileCount + 1;
						loopCount =loopCount + 1;
					}
//					else if(((code.charAt(j-1)=='|' && code.charAt(j)=='|')) || (code.charAt(j-1)!='|' && code.charAt(j)=='|' && code.charAt(j+1)!='|' )) {
//						Ctc = Ctc + 2;
//						if((code.charAt(j-1)=='|') && code.charAt(j)=='|') {
//							logicalCount = logicalCount + 1;
//						}
//						else if(code.charAt(j-1)!='|' && code.charAt(j)=='|' && code.charAt(j+1)!='|'){
//							bitwiseCount = bitwiseCount + 1;
//						}
//					}
					else if(code.charAt(j)=='d' && code.charAt(j+1)=='o' &&  code.charAt(j+2)== ' ' && code.charAt(j+3)=='w' && code.charAt(j+4) =='h' && code.charAt(j+5) =='i' && code.charAt(j+6) == 'l' && code.charAt(j+7) == 'e' && code.charAt(j+8)=='(') {
						Ctc = Ctc + 2;
						doWhileCount = doWhileCount +1;
						loopCount =loopCount + 1;
					}
//					else if(((code.charAt(j-1)=='|' && code.charAt(j)=='|')) || (code.charAt(j-1)!='|' && code.charAt(j)=='|' && code.charAt(j+1)!='|' )) {
//						Ctc = Ctc + 2;
//						if((code.charAt(j-1)=='|') && code.charAt(j)=='|') {
//							logicalCount = logicalCount + 1;
//						}
//						else if(code.charAt(j-1)!='|' && code.charAt(j)=='|' && code.charAt(j+1)!='|'){
//							bitwiseCount = bitwiseCount + 1;
//						}
//					}
					else if(((code.charAt(j-1)=='|' && code.charAt(j)=='|')) || (code.charAt(j-1)!='|' && code.charAt(j)=='|' && code.charAt(j+1)!='|' )) {
						Ctc = Ctc + 1;
						if((code.charAt(j-1)=='|') && code.charAt(j)=='|') {
							logicalCount = logicalCount + 1;
						}
						else if(code.charAt(j-1)!='|' && code.charAt(j)=='|' && code.charAt(j+1)!='|'){
							bitwiseCount = bitwiseCount + 1;
						}
					}
					else if((((code.charAt(j-1)=='&') && code.charAt(j)=='&')) || (code.charAt(j-1)!='&' && code.charAt(j)=='&' && code.charAt(j+1)!='&')) {
						Ctc = Ctc + 1;
						if((code.charAt(j-1)=='&') && code.charAt(j)=='&') {
							logicalCount = logicalCount + 1;
						}
						else if(code.charAt(j-1)!='&' && code.charAt(j)=='&' && code.charAt(j+1)!='&'){
							bitwiseCount = bitwiseCount + 1;
						}
					}
					else if(code.charAt(j)=='c' && code.charAt(j+1)=='a' &&  code.charAt(j+2)== 't' && code.charAt(j+3)=='c' && code.charAt(j+4) =='h') {
						Ctc = Ctc + 1;
						catchCount =catchCount + 1;
					}
					else if(code.charAt(j)=='s' && code.charAt(j+1)=='w' &&  code.charAt(j+2)== 'i' && code.charAt(j+3)=='t' && code.charAt(j+4) =='c' && code.charAt(j+5) =='h') {
						switchCount++;
						noOfSwitches++;
					}
					else if(noOfSwitches == 1) {
						if(code.charAt(j)=='c' && code.charAt(j+1)=='a' && code.charAt(j+2)=='s' && code.charAt(j+3)=='e') {
							caseCount++;
						}
						else if(code.charAt(j)=='d' && code.charAt(j+1)=='e' && code.charAt(j+2)=='f' && code.charAt(j+3)=='a' && code.charAt(j+4)=='u' && code.charAt(j+5)=='l' && code.charAt(j+6)=='t') {
							noOfSwitches = 0;
						}
					}
					else if(code.charAt(j)=='(' && code.charAt(j+1)=='"' || code.charAt(j)=='(') {
						outputCount = 1;
					}
			}
			
			System.out.println("conditional count = " + conditionalCount);
			System.out.println("logical count = " + logicalCount);
			System.out.println("bitwise count = " + bitwiseCount);
			System.out.println("loop count = " + loopCount);
			System.out.println("catch count = " + catchCount);
			System.out.println("switch count = " + switchCount);
			
			int finalCtc =Ctc + caseCount;
			
			return finalCtc;
		}
	}
}
