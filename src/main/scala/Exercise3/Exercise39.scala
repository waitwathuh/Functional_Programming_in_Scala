package Exercise3

trait Exercise39
{
	def length[ A ]( as: List[ A ] ): Int =
	{
		foldRight(as, 0)(( _, a ) => a + 1)
	}

	def foldRight[ A, B ]( as: List[ A ], z: B )( f: (A, B) => B ): B =
		as match
		{
			case Nil => z
			case Cons(x, xs) => f(x, foldRight(xs, z)(f))
		}
}

object Exercise39 extends Exercise39