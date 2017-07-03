package Exercise2

trait Exercise22
{
	def isSorted[ A ]( array: Array[ A ], ordered: (A, A) => Boolean ): Boolean =
	{
		def isSortedRecursion( number: Int ): Boolean =
			if ( number == array.length - 1 )
				ordered( array( number - 1 ), array( number ) )
			else if ( !ordered( array( number - 1 ), array( number ) ) )
				false
			else
				isSortedRecursion( number + 1 )

		if ( array.size == 0 || array.size == 1 )
			true
		else
			isSortedRecursion( 1 )
	}
}

object Exercise22 extends Exercise22