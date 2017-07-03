package Exercise3

trait Exercise32
{
	def tail[ A ]( l: List[ A ] ): List[ A ] = l match
	{
		case Nil => Nil
		case Cons(head, tail) => tail
	}
}

object Exercise32 extends Exercise32