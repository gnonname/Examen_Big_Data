object ExamenBigData {
  def main(args: Array[String]): Unit = {

  }
  def MaFonction(L:List[String]) : List[String]={
    val List_Trie : List[String] = L.filter(s => (s.charAt(s.length-1) == 'n'))
    return List_Trie
  }

}
