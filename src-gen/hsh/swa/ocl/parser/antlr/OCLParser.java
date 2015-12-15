/*
 * generated by Xtext
 */
package hsh.swa.ocl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import hsh.swa.ocl.services.OCLGrammarAccess;

public class OCLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private OCLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected hsh.swa.ocl.parser.antlr.internal.InternalOCLParser createParser(XtextTokenStream stream) {
		return new hsh.swa.ocl.parser.antlr.internal.InternalOCLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "OCL";
	}
	
	public OCLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(OCLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
