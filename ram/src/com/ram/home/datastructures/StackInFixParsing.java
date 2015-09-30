package com.ram.home.datastructures;

import java.util.Stack;
import java.util.StringTokenizer;

public class StackInFixParsing {
	
	/*
	 * 
	 * do arithmetic equation parsing
	 */
	
	private Stack stack = new Stack();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String equation = "((2*5)+(6/2))";
		
		Stack stack = new Stack();
		
		StringTokenizer strTokens = new StringTokenizer(equation, "{}()*/+-", true);
		
		while (strTokens.hasMoreTokens()) {
			String token = strTokens.nextToken();
			System.out.println(token);
			
			if (token.equals("{") || token.equals("(") || token.equals("*") 
					|| token.equals("/") 
					|| token.equals("+") 
					|| token.equals("-") 
					|| token.matches("[0-9]")) {
				stack.push(token);
			} else {
				if (token.equals("}") || token.equals(")")) {
					int result = 0;
					int operand2 = Integer.parseInt((String) stack.pop());
					String opeartor = (String) stack.pop();
					int operand1 = Integer.parseInt((String) stack.pop());
					
					if (!stack.isEmpty()) {
						stack.pop();
					}
					
					if (opeartor.equals("*")) {
						result = operand1 * operand2;
					} else if (opeartor.equals("/")) {
						result = operand1 / operand2;
					} else if (opeartor.equals("+")) {
						result = operand1 + operand2;
					} else if (opeartor.equals("-")) {
						result = operand1 - operand2;
					}
					
					
					
					stack.push(result+"");
				}
			}
			
			
		}	
		
		String finalResult = "";
		try {
			finalResult = (String) stack.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(finalResult);
		
		
		System.out.println(test());

	}
	
	public static String test () {
		String equation = "((2*5)+(6/2))";

		Stack stack = new Stack();

		StringTokenizer tokens = new StringTokenizer(equation, "{}()*/+-", true);
		while(tokens.hasMoreTokens()){
			String tkn = tokens.nextToken();
			/**read each token and take action**/
			if(tkn.equals("(")
					|| tkn.equals("{")
					|| tkn.matches("[0-9]+")
					|| tkn.equals("*")
					|| tkn.equals("/")
					|| tkn.equals("+")
					|| tkn.equals("-")){
				/**push token to the stack**/
				stack.push(tkn);
			} else if(tkn.equals("}") || tkn.equals(")")){
				try {
					int op2 = Integer.parseInt((String) stack.pop());
					String oprnd = (String) stack.pop();
					int op1 = Integer.parseInt((String) stack.pop());
					/**Below pop removes either } or ) from stack**/
					if(!stack.isEmpty()){
						stack.pop();
					}
					int result = 0;
					if(oprnd.equals("*")){
						result = op1*op2;
					} else if(oprnd.equals("/")){
						result = op1/op2;
					} else if(oprnd.equals("+")){
						result = op1+op2;
					} else if(oprnd.equals("-")){
						result = op1-op2;
					}
					/**push the result to the stack**/
					stack.push(result+"");
				} catch (Exception e) {
					e.printStackTrace();
					break;
				}
			}
		}
		String finalResult = "";
		try {
			finalResult = (String) stack.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return finalResult;
	}

}
