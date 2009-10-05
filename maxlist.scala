val list = List (3, 5 ,3, 4)

def max(n: Int, m: Int):Int = if (n > m) n else m

def max(n: Int, l :List[Int]):Int = l match {
    case List()  => n
    case List(_) => max(n, l.head)
    case _ => max(max(n, l.head), l.tail)
  }

def max(l: List[Int]): Int = max(l.head, l.tail)

println(max(list))

