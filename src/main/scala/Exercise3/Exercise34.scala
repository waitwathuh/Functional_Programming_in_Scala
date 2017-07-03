package Exercise3

trait Exercise34
{
	def drop[ A ]( l: List[ A ], n: Int ): List[ A ] = l match
	{
		case Nil => Nil
		case _ if n == 0 => l
		case Cons( _, tail ) => drop( tail, n - 1 )
	}
}

object Exercise34 extends Exercise34