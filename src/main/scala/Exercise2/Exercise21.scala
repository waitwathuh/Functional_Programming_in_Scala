package Exercise2

trait Exercise21
{
	def fibonacci( n: Int ): Int =
	{
		def fibonacciRecursion( n: Int, a: Int, b: Int ): Int = n match
		{
			case 2 =>
				b
			case _ =>
				fibonacciRecursion( n - 1, b, a + b )
		}

		return fibonacciRecursion( n, 0, 1 )
	}
}

object Exercise21 extends Exercise21