
def max(l: List[Int]): Int = {

  def max(n: Int, m: Int):Int = if (n > m) n else m

  def maxR(n: Int, l :List[Int]):Int = l match {
    case List()  => n
    case List(_) => max(n, l.head)
    case _ => maxR(max(n, l.head), l.tail)
  }

  maxR(l.head, l.tail)
}

println(max(List (3, 5 ,3, 4)))

