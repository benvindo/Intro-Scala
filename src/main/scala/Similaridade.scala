trait Similaridade {
  def eSemelhante(x: Any): Boolean
  def naoESemelhante(x: Any): Boolean = !eSemelhante(x)
}