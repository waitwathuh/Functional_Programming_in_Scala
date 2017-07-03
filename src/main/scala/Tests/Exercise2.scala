package Tests

import Exercise2.{ Exercise21, Exercise22, Exercise23, Exercise24, Exercise25 }

trait ExerciseNumber2
{
	def Test1: Unit =
	{
		println( "Exercise 2.1:" )
		println( Exercise21.fibonacci( 8 ) )
	}

	def Test2: Unit =
	{
		println( "\nExercise 2.2:" )
		println(
			Exercise22.isSorted[ Int ](
				Array( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ),
				( a: Int, b: Int ) => a <= b
			)
		)
	}

	def Test3: Unit =
	{
		println( "\nExercise 2.3:" )

		val c = Exercise23.curry( ( a: Int, b: Int ) => a == b )
		println( "1 == 2? ", c( 1 )( 2 ) )
		println( "2 == 2? ", c( 2 )( 2 ) )

		val c_partial = c( 1 )
		println( "[partial] 1 == 2? ", c_partial( 2 ) )
		println( "[partial] 1 == 1? ", c_partial( 1 ) )
	}

	def Test4: Unit =
	{
		println( "\nExercise 2.4:" )

		val sum = ( a: Int ) => ( b: Int ) => a + b
		val uncurried = Exercise24.uncurry[ Int, Int, Int ]( sum )

		println( "sum(1)(2)", sum( 1 )( 2 ) )
		println( "uncurry(1,2)", uncurried( 1,2 ) )
	}

	def Test5: Unit =
	{
		println( "\nExercise 2.5:" )

		val double = ( a:Int ) => 2 * a
		val string = ( a:Int ) => "new value " + a
		val d = Exercise25.compose( string, double )

		println("original value 2", d( 2 ) )
	}
}

object ExerciseNumber2 extends ExerciseNumber2