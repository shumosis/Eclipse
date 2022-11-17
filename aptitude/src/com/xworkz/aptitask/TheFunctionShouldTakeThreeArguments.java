package com.xworkz.aptitask;

public class TheFunctionShouldTakeThreeArguments {
			
		function basicMathOp(operation, value1, value2) {
			  if (operation == '+') {
			    return value1 + value2;
			  }
			  if (operation == '-') {
			    return value1 - value2;
			  }
			  if (operation == '*') {
			    return value1 * value2;
			  }
			  if (operation == '/') {
			    return value1 / value2;
			  }
			
			basicMathOp('+', 4, 4);  // 8
			basicMathOp('-', 4, 4);  // 0
			basicMathOp('*', 4, 4);  // 16
			basicMathOp('/', 4, 4);  // 11
	
}
