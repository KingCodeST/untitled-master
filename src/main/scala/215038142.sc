
////1
def lessThan (a: Int, b: Int): Unit = {
  if(a<b){
    print("a is less than b")
  }
  if(b<a){
    print("a is not less than b")
  }
}


////2


//}

//def getSquare(i: Int): Int =i*i
//
//val a = getSquare(3)
//print(a)
//
//
//
//val b = getSquare(6)
//print(b)
//
//val c =getSquare(5)
//print(c)
//

//// 3

  def getSquare(l: Double): Double = l * l

  val sd1 = getSquare(1.44)
  print(sd1)
  //assert(1.44==sd1," ")
  val sd2 = getSquare(5.7)
  print(sd2)
  //assert(32.49==sd2,"")

///////4
//a match {
//  case 10 => println("ten")
//  case x if x > 10 => println("greater than ten")
//  case _ => println("less than ten")
//}




def isArg1GreaterThanArg2(a: Double, b: Double): Boolean = { a < b}
val t1 = isArg1GreaterThanArg2(4.1, 4.12)
assert(4.1 < 4.12)
val t2 = isArg1GreaterThanArg2(2.1, 1.2)
assert(2.1 > 1.2)


/////5
def getMe(str: String) :String = str.toLowerCase()
val g1 =getMe("abraCaDabra")
//assert("abracadabra"==g1,"")
print(g1)

val g2 = getMe("zyxwVUT")
//assert("zyxwvut"==g2,"")
print(g2)

//////6
def addString(str: String, str1: String): String = str + str1
val s1 = addString("abc","def")
//assert()
print("abc"+s1)

val s2 = addString("zyx","abc")
//assert()
print(s2)

//////7
def manyTimesString(str: String, i: Int): String = str *2 +i


val m1 =manyTimesString("abc",3)
//assert("abcabcabc"==m1,"")
print(m1)

val m2 = manyTimesString("123",2)
//assert("123123"==m2,"")
print(m2)
/////8



def bmiStatus (height: Double , kg: Double): Double = {(kg/(height*height))}
val normal = bmiStatus(160, 68)
assert("Normal weight" == normal, "Expected Normal weight, Got" +normal)



//def value(a:Int,b:Int) = (a>b)
//{
//
//  print("This is equal to a")
//
//}
//print("this is equal to b")


////// question 10 create a list
var s=""
val v = List(1,5,7,8)

 v.foreach(print(_))
//


///// question 11 repeat

val v11=List(1,5,7,8)
v11.foreach(print(_))

////////  15


val words =List("word","cat","animal")
words.foreach(println)

/////////14






/////////// 13
//var s=""
//val numbers =List(1,2,5,3,7)
//numbers.map(s=>s*2)



