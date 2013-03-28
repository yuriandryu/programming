/* Generated By:JJTree: Do not edit this line. ASTArithExpr.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTArithExpr extends SimpleNode {
  private String op;

  public ASTArithExpr(int id) {
    super(id);
  }

  public ASTArithExpr(LispParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(LispParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
  

  public void setOp (String op) {
  	this.op = op;
  }
  
  public String toString() {
  	return this.op;
  }  
  
  public String getOp () {
  	return this.op;  	
  }  
  
}
/* JavaCC - OriginalChecksum=67235c379227b868aa122d7f522815eb (do not edit this line) */
