package Exercise3

trait Exercise33
{
	def setHead[ A ]( l: List[ A ], h: A ): List[ A ] = l match
	{
		case Nil => Nil
		case Cons( _, tail ) => Cons( h, tail )
	}
}

object Exercise33 extends Exercise33