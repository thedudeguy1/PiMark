import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to JavaMark, \nthe benchmark utility that is given under the MIT License with an 'as is' warranty.\nBy continuing after this message, you certify that any damage done to your machine \nis not at the legal fault or liability of the developers of this software.");
		System.out.println("Select a benchmark to run by typing its corresponding number, then press enter.");
		System.out.print("
			[1] - Sieve Of Eratosthenes\n
			[2] - Innacurate pi calculation\n
			[3] - UNIMPLEMENTED\n
			Type any other number or string to quit");
		Switch(in.nextInt)
		{
			case 1: 
		}
	}
	public static void sieveOfEratosthenesWrapper()
	{
		int top = 0;
		System.out.print("Enter a number to find primes from 2 through that number: ");
		Scanner in = new Scanner(System.in);
		top = in.nextInt();
		in.nextLine();
		
		sieveOfEratosthenes(top);
	}
	public static void sieveOfEratosthenes(int n)
	{
		boolean[] prime = new boolean[n+1];
		for(int i=0;i<n;i++)
		{
			prime[i] = true;
		}
		for(int p = 2; p*p <=n; p++)
		{
			if(prime[p])
			{
				// Update all multiples of p
				for(int i = p*p; i <= n; i += p)
				{
					prime[i] = false;
				}
			}
		}
		for(int i = 2; i <= n; i++)
		{
			if(prime[i])
			{
				System.out.print(i + " ");
			}
		}
	}
}