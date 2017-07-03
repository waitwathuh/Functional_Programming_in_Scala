package Exercise2

trait Exercise25
{
	def compose[ A, B, C ]( f: B => C, g: A => B ): A => C =
	{
		a => f( g ( a ) )
	}
}

object Exercise25 extends Exercise25