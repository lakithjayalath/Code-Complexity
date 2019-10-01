package ComplexityFunctions;

public class LogicalComplexity {

	int Ctc;
	int logicalCount;
	int bitwiseCount;
	int logical;
	int bitwise;
	int loopEnd;
	int breakLoop;
//	int x = 0;
//	char y;
	
	public LogicalComplexity() {
		super();
		Ctc = 0;
		logicalCount = 0;
		bitwiseCount = 0;
		logical = 0;
		bitwise = 0;
		loopEnd = 0;
	}
	
//	public int endLoop(int start, String code) {
//		for(int j = start; j<code.length(); j++) {
//			if(code.charAt(j-1) == ')' && code.charAt(j) == '{') {
//				loopEnd = j+1;
////				y = code.charAt(loopEnd);
//			}
//		}
//		return loopEnd;
//	}
	
	
	
	public int loopLogicalComplex(String code) {
		for(int j=0; j<code.length()-1; j++) {
			if(j == (code.length()-1)) {
				if((code.charAt(j)=='|'  && code.charAt(j+1) == '|') || (code.charAt(j)!='|' && code.charAt(j+1) == '|')) {
					Ctc = Ctc + 2;
				}
				else if((code.charAt(j)=='&' && code.charAt(j+1)=='&') || (code.charAt(j)!='&' && code.charAt(j+1)=='&')) {
					Ctc = Ctc + 2;
				}
			}
			else  {
				
				  if((code.charAt(j)=='|' && code.charAt(j+1)=='|') || (code.charAt(j)!='|' && code.charAt(j+1)=='|' && code.charAt(j+1)!='|' )) { Ctc = Ctc + 2; } else
				  if((code.charAt(j)=='&' && code.charAt(j+1)=='&') || (code.charAt(j)!='&' && code.charAt(j+1)=='&' && code.charAt(j+1)!='&')) { Ctc = Ctc + 2; }
				 
			}
		}
		
		return Ctc;
	}
//		for(int j=loop; j<code.length(); j++) {
//			if((code.charAt(j-1)=='|' && code.charAt(j)=='|') || (code.charAt(j-1)!='|' && code.charAt(j)=='|' && code.charAt(j+1)!='|' )) {
//				Ctc = Ctc + 2;
//				breakLoop = j;
//				if((code.charAt(j-1)=='|') && code.charAt(j)=='|') {
//					logicalCount = logicalCount + 2;
//					if(j==breakLoop) {
//						break;
//					}
//				} 
//				else if(code.charAt(j-1)!='|' && code.charAt(j)=='|' && code.charAt(j+1)!='|'){
//					bitwiseCount = bitwiseCount + 2;
//					if(j==breakLoop) {
//						break;
//					}
//				}
////				x = Ctc;
////				System.out.println("x" + x);
//			}
//			else if((((code.charAt(j-1)=='&') && code.charAt(j)=='&')) || (code.charAt(j-1)!='&' && code.charAt(j)=='&' && code.charAt(j+1)!='&')) {
//				Ctc = Ctc + 2;
//				breakLoop = j;
//				if((code.charAt(j-1)=='&') && code.charAt(j)=='&') {
//					logicalCount = logicalCount + 2;
//					if(j==breakLoop) {
//						break;
//					}
//				}
//				else if(code.charAt(j-1)!='&' && code.charAt(j)=='&' && code.charAt(j+1)!='&'){
//					bitwiseCount = bitwiseCount + 2;
//					if(j==breakLoop) {
//						break;
//					}
//				}
//			}
//		}
//		
////		System.out.println("Logical Count = " + logicalCount);
////		System.out.println("Bitwise count = " + bitwiseCount);
////		logical = logical + 1;
////		bitwise = bitwise + 1;
////		System.out.println("loop end " + loopEnd);
////		System.out.println(y);
//		return Ctc;

	
	public int conditionalLogicalComplex(String code) {
		for(int j=0; j<code.length()-1; j++) {
			if(j == (code.length()-1)) {
				if((code.charAt(j)=='|'  && code.charAt(j+1) == '|') || (code.charAt(j)!='|' && code.charAt(j+1) == '|')) {
					Ctc = Ctc + 1;
				}
				else if((code.charAt(j)=='&' && code.charAt(j+1)=='&') || (code.charAt(j)!='&' && code.charAt(j+1)=='&')) {
					Ctc = Ctc + 1;
				}
			}
			else  {
				
				  if((code.charAt(j)=='|' && code.charAt(j+1)=='|') || (code.charAt(j)!='|' && code.charAt(j+1)=='|' && code.charAt(j+1)!='|' )) { Ctc = Ctc + 1; } else
				  if((code.charAt(j)=='&' && code.charAt(j+1)=='&') || (code.charAt(j)!='&' && code.charAt(j+1)=='&' && code.charAt(j+1)!='&')) { Ctc = Ctc + 1; }
				 
			}
		}
		
		return Ctc;
	}	

				
//				breakLoop = j;
//				if((code.charAt(j-1)=='|') && code.charAt(j)=='|') {
//					logicalCount = logicalCount + 1;
//					if(j==breakLoop) {
//						break;
//					}
//				}
//				else if(code.charAt(j-1)!='|' && code.charAt(j)=='|' && code.charAt(j+1)!='|'){
//					bitwiseCount = bitwiseCount + 1;
//					if(j==breakLoop) {
//						break;
//					}
//				}
//			}
			
//				breakLoop = j;
//				if((code.charAt(j-1)=='&') && code.charAt(j)=='&') {
//					logicalCount = logicalCount + 1;
//					if(j==breakLoop) {
//						break;
//					}
//				}
//				else if(code.charAt(j-1)!='&' && code.charAt(j)=='&' && code.charAt(j+1)!='&'){
//					bitwiseCount = bitwiseCount + 1;
//					if(j==breakLoop) {
//						break;
//					}
//				}
		
		
//		System.out.println("Logical Count = " + logicalCount);
//		System.out.println("Bitwise count = " + bitwiseCount);
//		logical = logical + 1;
//		bitwise = bitwise + 1;
		
}
