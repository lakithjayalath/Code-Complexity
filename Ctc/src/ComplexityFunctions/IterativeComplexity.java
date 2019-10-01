package ComplexityFunctions;
import ComplexityFunctions.LogicalComplexity;

public class IterativeComplexity {
	
	int Ctc;
	int loopCount;
	int forCount;
	int whileCount;
	int doWhileCount;
	int loopEnd;
	int llc;
	
	public IterativeComplexity() {
		super();
		Ctc = 0;
		loopCount = 0;
		forCount = 0;
		whileCount = 0;
		doWhileCount = 0;
		llc = 0;
	}
	
	public int iterativeComplex(String code) {
//		LogicalComplexity lc = new LogicalComplexity();
			if(code.contains("for") || code.contains("while") || code.contains("do while")) {
				LogicalComplexity lc = new LogicalComplexity();
				llc = lc.loopLogicalComplex(code);
				Ctc = Ctc + llc + 2;
//				forCount = 1;
				loopCount =loopCount + 1;
//				loopEnd = lc.endLoop(j, code);
//				llc = lc.loopLogicalComplex(j, code);
			}
//			else if(code.charAt(j)=='w' && code.charAt(j+1)=='h' &&  code.charAt(j+2)== 'i' && code.charAt(j+3)=='l' && code.charAt(j+4) =='e' && code.charAt(j+5)=='(') {
//				Ctc = Ctc + 2;
//				whileCount = 1;
//				loopCount = loopCount + 1;
//				llc = lc.loopLogicalComplex(j, code);
//			}
//			else if(code.charAt(j)=='d' && code.charAt(j+1)=='o' &&  code.charAt(j+2)== ' ' && code.charAt(j+3)=='w' && code.charAt(j+4) =='h' && code.charAt(j+5) =='i' && code.charAt(j+6) == 'l' && code.charAt(j+7) == 'e' && code.charAt(j+8)=='(') {
//				Ctc = Ctc + 2;
//				doWhileCount = 1;
//				loopCount =loopCount + 1;
//				llc = lc.loopLogicalComplex(j, code);
//			}

		System.out.println("Loop Count = " + loopCount);
//		System.out.println("llc : " + llc);
//		System.out.println("llc " + llc + " " + Ctc);
//		Ctc = Ctc + llc;
		return Ctc;
	}
}
