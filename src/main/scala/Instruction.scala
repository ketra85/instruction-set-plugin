trait Instruction {
  def name: String
  def conditionals: Boolean
  def extraBits: Boolean

//  def operation(): Boolean
}
