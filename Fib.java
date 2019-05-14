/** 
  Calculate Fibonacci number n
  3 implementations
  @precondition: n >= 1
  
  Use type "long" instead of "int", because rabbits.
 */

public class Fib {
    /** 
      @return the nth Fibonacci number
              by implementing the recurrence relation
     */
    public static long fib_recurrence( int n) {
	// decision between base case and recursive cases
	if (n <= 1)
	    // solution to base case
	    return n;
	// solution to recursive cases
	else
	    return
		// recursive abstraction
		fib_recurrence( n-1)
		// combine
		+
		// recursive abstraction
		fib_recurrence( n-2);
	// no leftover
    }
     /* These are class methods because the calculation for the nth fib number is universally true
    */
    /* grows exponentially since each call of fib(n) calls fib(n-1) and fib(n-2), which squares the cost
     */

    // the highest indexin the sequence for which fib_recurrence is feasible:
    // It takes about 1 sec for n = 40, 1.5 sec for n = 42, 2.5 sec for n = 43, 5.4 sec for n = 45


    /** 
      @return the nth Fibonacci number
              calculated via the 8th-grade algorithm
     */
    public static long fib_grade8( int n) {
	int a = 0, b = 1, c;
	for (int i = 0; i < n; i++){
	    c = a + b;
	    a = b;
	    b = c;
	}
	return a;
    }
    /* Time complexity:
       Consider the size of the problem to be n
       
       As the proxy for the time required, count assignment of values
       
       Then cost of the the recurrence algorithm
       grows linearly (3n)
       as the size of the problem increases,
       because for every increase in n, the number of assignments increase by 3
     */


    /** 
      @return the nth Fibonacci number
              calculated via Binet's formula.
              Type is double so that this exercise can
              ignore rounding issues.
     */
    public static double fib_Binet( int n) {
	double phi = (1 + Math.sqrt(5)) / 2,
	    psi = (1 - Math.sqrt(5)) / 2;
	return 1 / Math.sqrt(5) * (Math.pow(phi, n) - Math.pow(psi, n));
    }
    /* Time complexity:
       Consider the size of the problem to be n
       
       As the proxy for the time required, count nothing
       
       Then cost of the the recurrence algorithm
       grows constantly
       as the size of the problem increases,
       because for every increase in n, there is no additional cost
     */
}
