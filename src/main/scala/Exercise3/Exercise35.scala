package Exercise3

trait Exercise35
{
	def dropWhile[ A ]( l: List[ A ], f: A => Boolean ): List[ A ] = l match
	{
		case Nil => Nil
		case Cons(head, tail) if f(head) => dropWhile(tail, f)
		case _ => l
	}
}

object Exercise35 extends Exercise35