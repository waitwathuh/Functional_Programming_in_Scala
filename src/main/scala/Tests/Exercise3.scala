package Tests

import Exercise3.{ Exercise31, Exercise32, Exercise33, Exercise34, Exercise35, Exercise36, Exercise37, Exercise38, Exercise39 }

trait ExerciseNumber3
{
	def Test1: Unit =
	{
		println( Exercise31.x )
	}

	def Test2: Unit =
	{
		println("Tail List(1,2,3,4): " + Exercise32.tail( List( 1, 2, 3, 4 ) ) )
		println("Tail List(1): " + List.tail(List(1)))
		println("Tail List(): " + List.tail(List()))
		println("Tail Nil: " + List.tail(Nil))
	}

	def Test3: Unit =
	{
		println("setHead List(1,2,3,4), 0: " + Exercise33.setHead( List(1, 2, 3, 4 ), 0) )
		println("setHead List(1), 0: " + List.setHead(List(1), 0))
		println("setHead List(), 0: " + List.setHead(List(), 0))
		println("setHead Nil, 0: " + List.setHead(Nil, 0))
	}

	def Test4: Unit =
	{
		println("drop List(1,2,3,4), 2: " + Exercise34.drop( List(1, 2, 3, 4 ), 2) )
		println("drop List(1), 0: " + List.drop(List(1), 0))
		println("drop List(1), 1: " + List.drop(List(1), 1))
		println("drop List(1), 10: " + List.drop(List(1), 10))
		println("drop List(), 10: " + List.drop(List(), 1))
		println("drop Nil, 1: " + List.drop(Nil, 1))
	}

	def Test5: Unit =
	{
		println("dropWhile (x<=3) in List(1,2,3,4,5) = " +
			Exercise35.dropWhile( List(1, 2, 3, 4, 5), ( x: Int ) => (x <= 3)))

		println("dropWhile (x<0) in List(1,2,3,4,5) = " +
			Exercise35.dropWhile( List(1, 2, 3, 4, 5), ( x: Int ) => (x < 0)))

		println("dropWhile (x<=3) in List() = " +
			Exercise35.dropWhile( List(), ( x: Int ) => (x <= 3)))
	}

	def Test6: Unit =
	{
		println("init for List(1,2,3,4): " + Exercise36.init( List( 1, 2, 3, 4) ) )
		println("init for List(1): " + Exercise36.init( List(1) ) )
		println("init for List(): " + Exercise36.init( List() ) )
	}

	def Test7: Unit =
	{

	}

	def Test8: Unit =
	{

	}

	def Test9: Unit =
	{
		println("length List(1,2,3): " + Exercise39.length( List( 1,2,3 ) ) )
		println("length List(1): " + Exercise39.length( List( 1 ) ) )
		println("length List(): " + Exercise39.length( List() ) )
		println("length Nil: " + Exercise39.length( Nil ) )
	}
}

object ExerciseNumber3 extends ExerciseNumber3