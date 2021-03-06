package Exercise3

import Exercise3.DataType._

trait Exercise31
{
	val x = List(1, 2, 3, 4, 5) match
	{
		case Cons( x, Cons( 2, Cons( 4, _ ) ) ) => x
		case List[ Nil ] => 42
		case Cons( x, Cons( y, Cons( 3, Cons( 4, _ ) ) ) ) => x + y
		case Cons( h, t ) => h + sum( t )
		case _ => 101
	}

	def sum( ints: List[ Int ] ): Int = ints match
	{
		case Nil => 0
		case Cons( x, xs ) => x + sum( xs )
	}
}

object Exercise31 extends Exercise31