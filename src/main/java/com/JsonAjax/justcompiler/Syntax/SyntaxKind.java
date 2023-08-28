/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.JsonAjax.justcompiler.Syntax;

/**
 *
 * @author hyousfi
 */
public enum SyntaxKind {
    // Tokens
    badToken,
    endOfFile, 
    whiteSpace,
    number,
    plus,
    minus,
    slash,
    star,
    leftParen,
    rightParen,
    bang, 
    ampersandAmpersand, 
    pipePipe,
    bangEquals, 
    equalsEquals,

    //keywords
    trueKeyword,
    falseKeyword,
    IdentifierToken,
    
    // Expressions
    binaryExpression,
    unaryExpression,
    literalExpression, 
    parenthesizedExpression, 
}
