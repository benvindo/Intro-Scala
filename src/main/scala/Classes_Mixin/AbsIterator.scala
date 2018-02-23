package Classes_Mixin

abstract class AbsIterator {
  type T
  def hasNext: Boolean
  def next: T
}