package Exercise3

trait Exercise36
{
	def init[ A ]( l: List[ A ] ): List[ A ] =
	{
		init(l, Nil)
	}

	private def init[ A ]( in: List[ A ], out: List[ A ] ): List[ A ] = in match
	{
		case Nil => Nil
		case Cons( last, Nil ) => out
		case Cons( head, tail ) => init( tail, append( out, List( head ) ) )
	}

	def append[ A ]( a1: List[ A ], a2: List[ A ] ): List[ A ] =
		a1 match
		{
			case Nil => a2
			case Cons(h, t) => Cons(h, append(t, a2))
		}
}

object Exercise36 extends Exercise36