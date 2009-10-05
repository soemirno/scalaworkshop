
  // Tail recursive.
def reverse[T](l: List[T]): List[T] = {
  def reverseR(result: List[T], curList: List[T]): List[T] = curList match {
    case Nil       => result
    case h :: tail => reverseR(h :: result, tail)
  }
  reverseR(Nil, l)
}

print(reverse(List(1, 1, 2, 3, 5, 8)))