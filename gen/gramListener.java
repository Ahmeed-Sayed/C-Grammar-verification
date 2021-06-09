// Generated from C:/Users/Ahmed Mahdi/Downloads/project1JsonStruct/project1/src\gram.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramParser}.
 */
public interface gramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(gramParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(gramParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void enterGenericSelection(gramParser.GenericSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#genericSelection}.
	 * @param ctx the parse tree
	 */
	void exitGenericSelection(gramParser.GenericSelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssocList(gramParser.GenericAssocListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#genericAssocList}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssocList(gramParser.GenericAssocListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void enterGenericAssociation(gramParser.GenericAssociationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#genericAssociation}.
	 * @param ctx the parse tree
	 */
	void exitGenericAssociation(gramParser.GenericAssociationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(gramParser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(gramParser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(gramParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(gramParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(gramParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(gramParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(gramParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(gramParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(gramParser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(gramParser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(gramParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(gramParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(gramParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(gramParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(gramParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(gramParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(gramParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(gramParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(gramParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(gramParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(gramParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(gramParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(gramParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(gramParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(gramParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(gramParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(gramParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(gramParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(gramParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(gramParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(gramParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(gramParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(gramParser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(gramParser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(gramParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(gramParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gramParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gramParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(gramParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(gramParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(gramParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(gramParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(gramParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(gramParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(gramParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(gramParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(gramParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(gramParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(gramParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(gramParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(gramParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(gramParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(gramParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(gramParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomictype}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomictype(gramParser.AtomictypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomictype}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomictype(gramParser.AtomictypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structOrUniontype}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUniontype(gramParser.StructOrUniontypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structOrUniontype}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUniontype(gramParser.StructOrUniontypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code m128i}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterM128i(gramParser.M128iContext ctx);
	/**
	 * Exit a parse tree produced by the {@code m128i}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitM128i(gramParser.M128iContext ctx);
	/**
	 * Enter a parse tree produced by the {@code m128}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterM128(gramParser.M128Context ctx);
	/**
	 * Exit a parse tree produced by the {@code m128}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitM128(gramParser.M128Context ctx);
	/**
	 * Enter a parse tree produced by the {@code constantexp}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantexp(gramParser.ConstantexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantexp}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantexp(gramParser.ConstantexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typedef}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypedef(gramParser.TypedefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typedef}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypedef(gramParser.TypedefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enum}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnum(gramParser.EnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enum}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnum(gramParser.EnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code point}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterPoint(gramParser.PointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code point}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitPoint(gramParser.PointContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(gramParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(gramParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(gramParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(gramParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(gramParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(gramParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(gramParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(gramParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(gramParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(gramParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(gramParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(gramParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(gramParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(gramParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(gramParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(gramParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(gramParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(gramParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(gramParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(gramParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(gramParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(gramParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAtomicTypeSpecifier(gramParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAtomicTypeSpecifier(gramParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(gramParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(gramParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSpecifier(gramParser.FunctionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#functionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSpecifier(gramParser.FunctionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentSpecifier(gramParser.AlignmentSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentSpecifier(gramParser.AlignmentSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(gramParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(gramParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectDeclarator(gramParser.DirectDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectDeclarator(gramParser.DirectDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void enterGccDeclaratorExtension(gramParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 */
	void exitGccDeclaratorExtension(gramParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeSpecifier(gramParser.GccAttributeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeSpecifier(gramParser.GccAttributeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterGccAttributeList(gramParser.GccAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#gccAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitGccAttributeList(gramParser.GccAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void enterGccAttribute(gramParser.GccAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#gccAttribute}.
	 * @param ctx the parse tree
	 */
	void exitGccAttribute(gramParser.GccAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void enterNestedParenthesesBlock(gramParser.NestedParenthesesBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 */
	void exitNestedParenthesesBlock(gramParser.NestedParenthesesBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(gramParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(gramParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(gramParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(gramParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(gramParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(gramParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(gramParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(gramParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(gramParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(gramParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(gramParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(gramParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(gramParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(gramParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(gramParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(gramParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(gramParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(gramParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(gramParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(gramParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(gramParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(gramParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(gramParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(gramParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(gramParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(gramParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(gramParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(gramParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(gramParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(gramParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticAssertDeclaration(gramParser.StaticAssertDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticAssertDeclaration(gramParser.StaticAssertDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gramParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gramParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(gramParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(gramParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(gramParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(gramParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(gramParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(gramParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statment}
	 * labeled alternative in {@link gramParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterStatment(gramParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statment}
	 * labeled alternative in {@link gramParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitStatment(gramParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code localdeclaration}
	 * labeled alternative in {@link gramParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterLocaldeclaration(gramParser.LocaldeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code localdeclaration}
	 * labeled alternative in {@link gramParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitLocaldeclaration(gramParser.LocaldeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(gramParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(gramParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(gramParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(gramParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement(gramParser.IterationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement(gramParser.IterationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(gramParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(gramParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(gramParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(gramParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(gramParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(gramParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(gramParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(gramParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(gramParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(gramParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(gramParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(gramParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functiondeclaration}
	 * labeled alternative in {@link gramParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondeclaration(gramParser.FunctiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functiondeclaration}
	 * labeled alternative in {@link gramParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondeclaration(gramParser.FunctiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globaldeclaration}
	 * labeled alternative in {@link gramParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobaldeclaration(gramParser.GlobaldeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globaldeclaration}
	 * labeled alternative in {@link gramParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobaldeclaration(gramParser.GlobaldeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code semicolon}
	 * labeled alternative in {@link gramParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(gramParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code semicolon}
	 * labeled alternative in {@link gramParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(gramParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(gramParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(gramParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(gramParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(gramParser.DeclarationListContext ctx);
}