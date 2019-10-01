package ComplexityFunctions;

public class ConditionalComplexity {
	
	int Ctc;
	int conditionalCount;
	int clc;
	int until;

	public ConditionalComplexity() {
		super();
		Ctc = 0;
		conditionalCount = 0;
		clc = 0;
		until=0;
	}

	public int conditonalComplex(String code) {
		if(code.contains("if")) {
			LogicalComplexity lc = new LogicalComplexity();
			clc = lc.conditionalLogicalComplex(code);
			Ctc = Ctc + clc + 1;
			conditionalCount = conditionalCount + 1;
		}
//		until=code.length();
//		LogicalComplexity lc = new LogicalComplexity();
//		for(int j=0;j<code.length();j++) {
//			if((code.charAt(j)=='i' && code.charAt(j+1)=='f')) {
//				Ctc = Ctc + 1;
//				conditionalCount = conditionalCount + 1;
//				for(int i=0;i<until;i++) {
//					if(j==0) {
//						if((code.charAt(j)=='|' && code.charAt(j+1)=='|') || (code.charAt(j)=='|' && code.charAt(j+1)!='|')) {
//							Ctc = Ctc + 1;
////							until = j;
//							System.out.println(Ctc);
//							if(code.charAt(j)=='|' && code.charAt(j+1)=='|') {
//								logicalCount = logicalCount + 1;
//							}
//							else if(code.charAt(j)=='|' && code.charAt(j+1)!='|'){
//								bitwiseCount = bitwiseCount + 1;
//							}
//						}
//					}
//					else {
//						if((code.charAt(j-1)=='|' && code.charAt(j)=='|') || (code.charAt(j-1)!='|' && code.charAt(j)=='|' && code.charAt(j+1)!='|' )) {
//							Ctc = Ctc + 1;
////							until = j;
//							System.out.println(Ctc);
//							if((code.charAt(j-1)=='|') && code.charAt(j)=='|') {
//								logicalCount = logicalCount + 1;
//							}
//							else if(code.charAt(j-1)!='|' && code.charAt(j)=='|' && code.charAt(j+1)!='|'){
//								bitwiseCount = bitwiseCount + 1;
//							}
//						}
//					}
//				}
//				clc = lc.conditionalLogicalComplex(j+1, code);
//			}
//		}
		System.out.println("if = " + conditionalCount);
//		Ctc = Ctc + clc;
		return Ctc;
	}
	
}
