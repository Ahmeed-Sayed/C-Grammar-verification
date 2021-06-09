// Generated from C:/Users/Ahmed Mahdi/Downloads/project1JsonStruct/project1/src\gram.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(gramParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#genericSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericSelection(gramParser.GenericSelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#genericAssocList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssocList(gramParser.GenericAssocListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#genericAssociation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericAssociation(gramParser.GenericAssociationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression(gramParser.PostfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(gramParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(gramParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(gramParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression(gramParser.CastExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(gramParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(gramParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(gramParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(gramParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(gramParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(gramParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(gramParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(gramParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(gramParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(gramParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(gramParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression(gramParser.AssignmentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(gramParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gramParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(gramParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(gramParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(gramParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(gramParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(gramParser.DeclarationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(gramParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(gramParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(gramParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomictype}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomictype(gramParser.AtomictypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structOrUniontype}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUniontype(gramParser.StructOrUniontypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code m128i}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM128i(gramParser.M128iContext ctx);
	/**
	 * Visit a parse tree produced by the {@code m128}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitM128(gramParser.M128Context ctx);
	/**
	 * Visit a parse tree produced by the {@code constantexp}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantexp(gramParser.ConstantexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typedef}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedef(gramParser.TypedefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enum}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum(gramParser.EnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code point}
	 * labeled alternative in {@link gramParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(gramParser.PointContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(gramParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(gramParser.StructOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(gramParser.StructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(gramParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(gramParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(gramParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(gramParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(gramParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(gramParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(gramParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(gramParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#atomicTypeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomicTypeSpecifier(gramParser.AtomicTypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(gramParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#functionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSpecifier(gramParser.FunctionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#alignmentSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignmentSpecifier(gramParser.AlignmentSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(gramParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectDeclarator(gramParser.DirectDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#gccDeclaratorExtension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccDeclaratorExtension(gramParser.GccDeclaratorExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#gccAttributeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeSpecifier(gramParser.GccAttributeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#gccAttributeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttributeList(gramParser.GccAttributeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#gccAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGccAttribute(gramParser.GccAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#nestedParenthesesBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedParenthesesBlock(gramParser.NestedParenthesesBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(gramParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(gramParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(gramParser.ParameterTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(gramParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(gramParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(gramParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(gramParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(gramParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAbstractDeclarator(gramParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(gramParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(gramParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(gramParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(gramParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorList(gramParser.DesignatorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(gramParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#staticAssertDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticAssertDeclaration(gramParser.StaticAssertDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(gramParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(gramParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(gramParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(gramParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statment}
	 * labeled alternative in {@link gramParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatment(gramParser.StatmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code localdeclaration}
	 * labeled alternative in {@link gramParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocaldeclaration(gramParser.LocaldeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(gramParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(gramParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement(gramParser.IterationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(gramParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(gramParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(gramParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(gramParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(gramParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(gramParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functiondeclaration}
	 * labeled alternative in {@link gramParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondeclaration(gramParser.FunctiondeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globaldeclaration}
	 * labeled alternative in {@link gramParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobaldeclaration(gramParser.GlobaldeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code semicolon}
	 * labeled alternative in {@link gramParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolon(gramParser.SemicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(gramParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(gramParser.DeclarationListContext ctx);
}