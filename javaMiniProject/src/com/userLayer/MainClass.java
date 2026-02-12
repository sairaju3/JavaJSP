package com.userLayer;

import java.util.Scanner;

import com.BussinessLayer.Advance;
import com.BussinessLayer.Advance1;
import com.BussinessLayer.Digits;
import com.BussinessLayer.Exponential;
import com.BussinessLayer.Factorial;
import com.BussinessLayer.Factors;
import com.BussinessLayer.Prime;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean condn=true;
		while(condn) {
			System.out.println("Select the opeartion...");
			System.out.println("1.Factorial");
			System.out.println("2.Prime");
			System.out.println("3.Factors");
			System.out.println("4.Digits");
			System.out.println("5.Exponential");
			System.out.println("6.Advance");
			System.out.println("7.Exit");
			System.out.println("Enter the Option");
			int option = sc.nextInt();
			
			switch (option) {
			case 1: { 
				boolean choiceCondition=true;
				Factorial fact =new Factorial();
				
				while(choiceCondition)
				{
					System.out.println("select the Operation...");
					System.out.println("1.Find the Factorial");
					System.out.println("2.Sum of the Factorial of Each Digit");
					System.out.println("3.Sum of the Factorial of Even Digit");
					System.out.println("4.Sum of the Factorial of Prime Digit");
					System.out.println("5.Main Menu");
					System.out.println("Enter the Choice...");
					int choice=sc.nextInt();
					if(choice==1) 
					{
						System.out.println("Enter the Number....");
						int num=sc.nextInt();
					    int factorial =	fact.findFactorial(num);
						System.out.println("The Factorial of "+num+" = "+factorial);
					}
					else if(choice==2)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						int sumOfFactorail=fact.sumOfFactorial(num);
						System.out.println("The Sum Of Factorial of "+num+" = "+sumOfFactorail);
					}
					else if(choice==3)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						
						int sumOfFacorialOfEven=fact.sumofFactorailOfEven(num);
						if(sumOfFacorialOfEven==0)
							System.out.println("No Even Digits Present in "+num);
						else
							System.out.println("The Sum Of Factorial of "+num+" = "+sumOfFacorialOfEven);
					}
					else if(choice==4)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						int sumOfFactorialPrime=fact.factorialOfPrime(num);
						if(sumOfFactorialPrime==0)
							System.out.println("No Prime Digits Present in "+num);
						else
							System.out.println("The Sum Of Factorial of "+num+" = "+sumOfFactorialPrime);
					}
					else if(choice==5)
					{
						choiceCondition=false;
					}
					else
					{
						System.out.println("Invalid Choice..Enter the Valid Choice...");
					}
				}
				
			}break;
			case 2: 
			{ 
				Prime prime=new Prime();
				boolean choiceCondition=true;
				while(choiceCondition)
				{
					System.out.println("select the Operation...");
					System.out.println("1.Prime.");
					System.out.println("2.Twised Prime");
					System.out.println("3.Mega Prime");
					System.out.println("4.Main Menu");
					System.out.println("Enter the Choice...");
					int choice=sc.nextInt();
					if(choice==1) 
					{
						boolean choiceCondin=true;
					
						
						while(choiceCondin)
						{
							System.out.println("select the Operation...");
							System.out.println("1.Check Prime.");
							System.out.println("2.Nth Prime");
							System.out.println("3.Next Prime");
							System.out.println("4.Main Menu");
							System.out.println("Enter the Choice1...");
							int choice1=sc.nextInt();
							
							if(choice1==1)
							{
								System.out.println("Enter The Number");
								int num=sc.nextInt();
								boolean checkPrime=prime.checkPrime(num);
								if(checkPrime)
									System.out.println(num+" is Prime");
								else
									System.out.println(num+" is not Prime");
								
								
							}
							else if(choice1==2)
							{
								System.out.println("Enter The Number");
								int num=sc.nextInt();
							    int nthprime=prime.nthPrime(num);
							    System.out.println("The "+num+"th Prime Number is "+nthprime);
							   
							}
							else if(choice1==3)
							{
								System.out.println("Enter The Number");
								int num=sc.nextInt();
								int nextprime=	prime.nextPrime(num);
								System.out.println("The Next NextPrime number "+num+" is "+nextprime);
							}
							else if(choice1==4)
							{
								choiceCondin=false;
							}
							else
							{
								System.out.println("Invalid Choice..Enter the Valid Choice...");
							}
						}
					}
					else if(choice==2)
					{
						boolean choiceCondin=true;
						
						
						while(choiceCondin)
						{
							System.out.println("select the Operation...");
							System.out.println("1.Check Twisted Prime.");
							System.out.println("2.Nth TwistedPrime");
							System.out.println("3.Next TwistedPrime");
							System.out.println("4.Main Menu");
							System.out.println("Enter the Choice1...");
							int choice1=sc.nextInt();
							
							if(choice1==1)
							{
								System.out.println("Enter The Number");
								int num=sc.nextInt();
							    if(prime.checkTwistedPrime(num))
							    	System.out.println(num+" is twisted prime number..");
							    else
							    	System.out.println(num+" is not a Twisted prime number..");
		
							}
							else if(choice1==2)
							{
								System.out.println("Enter The Number");
								int num=sc.nextInt();
								int nthTwistedPrime=prime.nthTwistedPrime(num);
								System.out.println("The "+num+"th Twisted Prime Number is "+nthTwistedPrime);  
							   
							}
							else if(choice1==3)
							{
								System.out.println("Enter The Number");
								int num=sc.nextInt();
								int nextTwistedPrime=prime.nextTwistedPrime(num);
								System.out.println("The Next Twisted Prime number "+num+" is "+nextTwistedPrime);
								
							}
							else if(choice1==4)
							{
								choiceCondin=false;
							}
							else
							{
								System.out.println("Invalid Choice..Enter the Valid Choice...");
							}
						}	
					}
					else if(choice==3)
					{
						boolean choiceCondin=true;
						
						while(choiceCondin)
						{
							System.out.println("select the Operation...");
							System.out.println("1.Check Mega Prime.");
							System.out.println("2.Nth MegaPrime");
							System.out.println("3.Next MegaPrime");
							System.out.println("4.Main Menu");
							System.out.println("Enter the Choice1...");
							int choice1=sc.nextInt();
							
							if(choice1==1)
							{
								System.out.println("Enter The Number");
								int num=sc.nextInt();
							    if(prime.checkMegaPrime(num))
							    	System.out.println(num+" is a Mega Prime Number...");
							    else
							    	System.out.println(num+" is not a Mega Prime..");
								
							}
							else if(choice1==2)
							{
								System.out.println("Enter The Number");
								int num=sc.nextInt();
								int nthMegaPrime=prime.nthMeagPrime(num);
								System.out.println("The "+num+"th Mega Prime Number is "+nthMegaPrime);
							   
							}
							else if(choice1==3)
							{
								System.out.println("Enter The Number");
								int num=sc.nextInt();
								int nextMegaPrime=prime.nextMegaPrime(num);
								System.out.println("The Next Mega Prime number "+num+" is "+nextMegaPrime);
						
							}
							else if(choice1==4)
							{
								choiceCondin=false;
							}
							else
							{
								System.out.println("Invalid Choice..Enter the Valid Choice...");
							}
						}
						
			
						
					}
					else if(choice==4)
					{
						choiceCondition=false;
					}
					else
					{
						System.out.println("Enter The Valid Number..");
					}
				}
				
				
				
			}break;
			case 3: 
			{
				boolean choiceCondition=true;
				Factors fact = new Factors();
				while(choiceCondition)
				{
					System.out.println("select the Operation...");
					System.out.println("1.Print The Factors");
					System.out.println("2.Sum of the Factors");
					System.out.println("3.Product of the Factors");
					System.out.println("4.Factors of Each Digit");
					System.out.println("5.Main Menu");
					System.out.println("Enter the Choice...");
					int choice=sc.nextInt();
					if(choice==1)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						fact.findFactors(num);
						//System.out.println(fact.findFactors(num));
					}
					else if(choice==2)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						int sumofFactors=fact.sumOfFactors(num);
						System.out.println("The Sum of Factors is "+sumofFactors);
						
					}
					else if(choice==3)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						int productOfFactors=fact.productOfFactors(num);
						System.out.println("The Sum of Factors is "+productOfFactors);
					}
					else if(choice==4)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						fact.factorsofEachDigit(num);
						//System.out.println("Factors of Each Digit is "+factorsOfEachdigit);
					}
					else if(choice==5)
					{
						choiceCondition=false;
						
					}
					else
					{
						System.out.println("Invalid Choice..Enter the Valid Choice...");
					}
				}
				
				
			}break;
			case 4: { 
//				1.Sum of Digits
//				2.Product of Digits
//				3.Sum of Even Digits
//				4.Sum of Extreme And Sum of Mean Digits
//				5.Sum of first Half and Second Half Digits
				boolean choiceCondition=true;
				Digits digit = new Digits();
				
				while(choiceCondition)
				{
					System.out.println("select the Operation...");
					System.out.println("1.Sum of Digits");
					System.out.println("2.Product of Digits");
					System.out.println("3.Sum of Even Digits");
					System.out.println("4.Sum of Extreme And Sum of Mean Digits");
					System.out.println("5.Sum of first Half and Second Half Digits");
					System.out.println("6.Main Menu");
					System.out.println("Enter the Choice...");
					int choice=sc.nextInt();
					if(choice==1)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						int sumOfDigits=digit.sumOfDigits(num);
						System.out.println("The sum of the digit is "+sumOfDigits);
					}
					else if(choice==2)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						int productOfDigits=digit.productOfDigits(num);
						System.out.println("The sum of the digit is "+productOfDigits);
						
					}
					else if(choice==3)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						int sumOfEven=digit.sumOfEvenDigits(num);
						System.out.println("The Sum of Even Digit is "+sumOfEven);
					}
					else if(choice==4)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						digit.sumOfExtreme(num);
					}
					else if(choice==5)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						int sumOfFirstAndSecondHalf=digit.sumOfFirstAndSecondHalf(num);
						System.out.println("Sum of First half and Sum of second of each digit is "+sumOfFirstAndSecondHalf);
					}
					else if(choice==6)
					{
						choiceCondition=false;
					}
					else
					{
						System.out.println("Invalid Choice..Enter the Valid Choice...");
					}
				}
				
				
			}break;
			case 5: 
			{
				boolean choiceCondition=true;
			
				
				while(choiceCondition)
				{

					System.out.println("select the Operation...");
					System.out.println("1.Exponential of Each Digit to Count of Digits");
					System.out.println("2.Sum of Exponential of Each Digits to Count of Digits");
					System.out.println("3.Sum of Exponential of Even Digits to Count of Digits");
					System.out.println("4.Sum of Exponential of Odd Digits to Count of Even Digits");
					System.out.println("5.Main Menu");
					System.out.println("Enter the Choice...");
					
					int choice=sc.nextInt();
					Exponential expo = new Exponential();
					if(choice==1)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						expo.countofExponential(num);
						
					}
					else if(choice==2)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						int sumOfExponential=expo.sumOfExponential(num);
						System.out.println("Sum of Exponentail of Each digit to count of Digit is "+sumOfExponential);
						
						
					}
					else if(choice==3)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						int sumOfExponentialEvenDigit=expo.sumExponentialOfEvenDigit(num);
						System.out.println("Sum of Exponentail of Even Digit "+sumOfExponentialEvenDigit);
						
					}
					else if(choice==4)
					{
						System.out.println("Enter The Number");
						int num=sc.nextInt();
						int sumOfExponentailOfOddDigit=expo.sumExponentialOfoddDigit(num);
						System.out.println("Sum of Exponetail of Odd Digit "+sumOfExponentailOfOddDigit);
						
					}
				
					else if(choice==5)
					{
						choiceCondition=false;
					}
					else
					{
						System.out.println("Invalid Choice..Enter the Valid Choice...");
					}
				}
				
				
			}break;
			case 6: 
			{
				boolean choiceCondition=true;
				while(choiceCondition)
				{
					System.out.println("1.Palindrome");
					System.out.println("2.SPY");
					System.out.println("3.Armstrong");
					System.out.println("4.TECH Number");
					System.out.println("5.Happy Numbers	");
					System.out.println("6.Magic Numbers");
					System.out.println("7.HCF and LCM of Two Numbers");
					System.out.println("8.Decimal-Binary");
					System.out.println("9.Serial Term ");
					System.out.println("Enter The Options adv");
					int options = sc.nextInt();
					Advance adv = new Advance();
					Advance1 adv1 = new Advance1();
					switch(options)
					{
						case 1:
						{
							boolean cond=true;
							while(cond)
							{
								
								System.out.println("1.Check Palindrome");
								System.out.println("2.Check nth Palindrome.");
								int choice=sc.nextInt();
								if(choice==1)
								{
									System.out.println("Enter the Number.");
									int num=sc.nextInt();
									if(adv.checkPalindrome(num))
										System.out.println(num+" is a Palindrome.");
									else
										System.out.println(num+" is not a palindrome.");
									
								}
								else if(choice==2)
								{
									System.out.println("Enter the Number.");
									int num=sc.nextInt();
									int nthPalindrome =adv.nthPalindrome(num);
									System.out.println("The "+num+" th Palindrome Number = "+nthPalindrome);
								}
								else if(choice==3)
								{
									cond=false;
								}
								else
								{
									System.out.println("Enter The Valide Number");
								}
							}
						}break;
						
						case 2:
						{
							boolean cond=true;
							while(cond)
							{
								System.out.println("Check SPY");
							
								int choice=sc.nextInt();
								if(choice==1)
								{
									System.out.println("Enter the Number.");
									int num=sc.nextInt();
									if(adv.checkSpy(num))
										System.out.println(num+" is SPY number.");
									else
										System.out.println(num+" is not a SPY number.");
								}
								
								else if(choice==2)
								{
									cond=false;
								}
								else
								{
									System.out.println("Enter The Valide Number");
								}
							}
						}break;
						
						case 3:
						{
							boolean cond=true;
							while(cond)
							{
								System.out.println("Check Armstrong");
								System.out.println("Check Nth Armstrong");

								int choice=sc.nextInt();
								if(choice==1)
								{
									System.out.println("Enter the Number.");
									int num=sc.nextInt();
									if(adv.checkArmStrongNumber(num))
										System.out.println(num+" is a Armstrong Number.");
									else
										System.out.println(num+" is Not a Armstrong Number.");
								}
								else if(choice==2)
								{
									System.out.println("Enter the Number.");
									int num=sc.nextInt();
									int nthArmstrong=adv.nthamstrongNumber(num);
									System.out.println("The "+num+" th Palindrome Number = "+nthArmstrong);
								}
								else if(choice==3)
								{
									cond=false;
								}
								else
								{
									System.out.println("Enter The Valide Number");
								}
							}
						}break;
						
						case 4:
						{
							boolean cond=true;
							while(cond)
							{
								System.out.println(".Check Tech Number");
							
								int choice=sc.nextInt();
								if(choice==1)
								{
									System.out.println("Enter the Number.");
									int num=sc.nextInt();
									if(adv.CheckTech(num))
										System.out.println(num+" is a Tech Number");
									else
										System.out.println(num+" is Not a Tech Number.");
								}
								else if(choice==2)
								{
									cond=false;
								}
								else
								{
									System.out.println("Enter The Valide Number");
								}
							}
						}break;
						
						case 5:
						{
							boolean cond=true;
							while(cond)
							{
								System.out.println("1.Check Happy Number");
								System.out.println("2.Nth  Happy Number.");
								int choice=sc.nextInt();
								if(choice==1)
								{
									System.out.println("Enter the Number.");
									int num=sc.nextInt();
									if(adv.checkHappyNumber(num))
										System.out.println(num+" is Happy number");
									else
										System.out.println(num+" is not a Happy Number");
									
								}
								else if(choice==2)
								{
									System.out.println("Enter the Number.");
									int num=sc.nextInt();
									int nthHappyNumber=adv.nthHappyNumber(num);
									System.out.println("The "+num+"th Happy Number is "+nthHappyNumber);
											
								}
								else if(choice==3)
								{
									cond=false;
								}
								else
								{
									System.out.println("Enter The Valide Number");
								}
							}
						}break;
						case 6:
						{
							boolean cond=true;
							while(cond)
							{
								System.out.println("1.Check Magic Number");
								System.out.println("2.Nth Magic Number");
								int choice=sc.nextInt();
								if(choice==1)
								{
									System.out.println("Enter the Number.");
									int num=sc.nextInt();
									if(adv.checkMagicNumber(num))
										System.out.println(num+" is a Magic Number");
									else
										System.out.println(num+" is not a Magic Number");
								}
								else if(choice==2)
								{
									System.out.println("Enter the Number.");
									int num=sc.nextInt();
									int nthMagicNumber=adv.nthMagicNumber(num);
									System.out.println("The "+num+"th magic NUmber is "+nthMagicNumber);
								}
								else if(choice==3)
								{
									cond=false;
								}
								else
								{
									System.out.println("Enter The Valide Number");
								}
							}
						}break;
						case 7:
						{
							boolean cond=true;
							while(cond)
							{
								System.out.println("1.HCF");
								System.out.println("2.LCM");
								int choice=sc.nextInt();
								if(choice==1)
								{
									System.out.println("Enter the Number.");
									int num1=sc.nextInt();
									System.out.println("Enter the Number.");
									int num2=sc.nextInt();
									int hcf=adv1.checkHcf(num1, num2);
									System.out.println("HCF of "+hcf);
								}
								else if(choice==2)
								{
									System.out.println("Enter the Number.");
									int num1=sc.nextInt();
									System.out.println("Enter the Number.");
									int num2=sc.nextInt();
									int lcm=adv1.checkLCM(num1, num2);
									System.out.println("LCM of "+lcm);
								}
								else if(choice==3)
								{
									cond=false;
								}
								else
								{
									System.out.println("Enter The Valide Number");
								}
							}
						}break;
						case 8:
						{
							boolean cond=true;
							while(cond)
							{
								System.out.println("1.Decimal to Binary");
								System.out.println("2.Binary to Decimal");
								int choice=sc.nextInt();
								if(choice==1)
								{
									System.out.println("Enter the Number.");
									int num=sc.nextInt();
									int decimaltoBinary=adv1.convertDecimalToBinary(num);
									System.out.println(num+" is converted into "+decimaltoBinary);
								}
								else if(choice==2)
								{
									System.out.println("Enter the Number.");
									int num=sc.nextInt();
									int binaryToDecimal=adv1.convertBinaryToDecimal(num);
									System.out.println(num+" is convertde into "+binaryToDecimal);
								}
								else if(choice==3)
								{
									cond=false;
								}
								else
								{
									System.out.println("Enter The Valide Number");
								}
							}
						}break;
						case 9:
						{
							boolean cond=true;
							while(cond)
							{
								System.out.println("Enter the  number.");
								System.out.println("1.Fibonacci Serial");
								System.out.println("2.Perfect Numbers");
								int choice=sc.nextInt();
								if(choice==1)
								{
									System.out.println("Enter the  number.");
									System.out.println("1.First n Fibonacci ");
									System.out.println("2.Nth Fibonacci term");
									boolean cond1=true;
									while(cond1)
									{
										int choiceF=sc.nextInt();
										if(choiceF==1)
										{
											System.out.println("Enter the Number.");
											int num=sc.nextInt();
											adv1.nTermFibonacci(num);
											
										}
										else if(choiceF==2)
										{
											System.out.println("Enter the Number.");
											int num=sc.nextInt();
											int nthfibonacci=adv1.nthfibonacciTerm(num);
											System.out.println("The "+num+" is Nth Fibonnaci Term is "+nthfibonacci);
										}
										else if(choice==3)
										{
											cond1=false;
										}
										else 
										{
											System.out.println("Enter the valid number..");
										}
									}
									
								}
								else if(choice==2)
								{
									System.out.println("1.First n Perfect Square ");
									System.out.println("2.Nth Perfect Square");
									boolean cond1=true;
									while(cond1)
									{
										int choiceF=sc.nextInt();
										if(choiceF==1)
										{
											System.out.println("Enter the Number.");
											int num=sc.nextInt();
											adv1.nPerfectSquare(num);
											
										}
										else if(choiceF==2)
										{
											System.out.println("Enter the Number.");
											int num=sc.nextInt();
											int nthPerfectSquare=adv1.nthPerfectSquare(num);
											System.out.println("The "+num+" is Nth Perfect Square  is "+nthPerfectSquare);
											
											
										}
										else if(choice==3)
										{
											cond1=false;
										}
										else 
										{
											System.out.println("Enter the valid number..");
										}
									}
									
									
								}
								else if(choice==3)
								{
									cond=false;
								}
								else
								{
									System.out.println("Enter The Valide Number");
								}
							}
						}break;
						case 10:{
							choiceCondition=false;
						}break;
						default:
						{
						
						}
					}
				}
				
			}break;
			case 7: {
				condn=false;
				System.out.println("Thank U😎");
			}break;
			
			default:{
				System.out.println("Invalid Optiom❌❌...Try Again..");
				}
			}
		}
	}

	
}
