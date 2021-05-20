object ExamenBigData {
  def main(args: Array[String]): Unit = {
  //affichage
    val L= List("julien","paul","jean","rac","trec","joel","ed","ed","chris","maurice")
    println(MaFonction(L))

    liste_Double()
  }
  def MaFonction(L:List[String]) : List[String]={
    val List_Trie : List[String] = L.filter(s => (s.charAt(s.length-1) == 'n'))
    return List_Trie
  }
 def liste_Double() : Unit= {
   val MaList = Array(
     List("ecommercemag.fr",""),
     List("https://www.journalducm.com/contact/", "Payant"),
     List("https://www.zatsaz.com/", ""),
     List("https://www.lerevenu.com/", " "),
     List("https://www.cadre-dirigfdeant-magasine.com/", "Payant"),
     List("https://www.silicon.fr/services.com/", "Payant"),
     List("https://www.channelbiz.fr/nous-contacter/", ""),
     List("https://www.itespresso.fr/", ""),
     List("https://www.industrie-mag.com/article4.html", "invité"),
     List("https://www.jesuisundev.com/article-invite/", "invité"),
     List("https://www.numerama.com/", ""))

   MaList.foreach(l => {
     println(l(0) + " " + l(1))
   })

 }
  val DomaineList = Array(
    List("ecommercemag.fr",""),
    List("journalducm.com", "Payant"),
    List("zatsaz.com", ""),
    List("lerevenu.com", ""),
    List("cadre-dirigfdeant-magasine.com", "Payant"),
    List("silicon.fr", "Payant"),
    List("channelbiz.fr", ""),
    List("itespresso.fr", ""),
    List("industrie-mag.com", "invité"),
    List("jesuisundev.com", "invité"),
    List("numerama.com", ""))
 }

