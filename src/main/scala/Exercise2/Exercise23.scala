package Exercise2

trait Exercise23
{
	def curry[ A, B, C ]( f: ( A, B ) => C ): A => ( B => C ) =
	{
		a => b => f( a, b )
	}
}

object Exercise23 extends Exercise23