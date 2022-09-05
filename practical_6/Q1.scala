object Q1 extends App{
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val E = (c: Char, key: Int, a: String) =>
    a((a.indexOf(c.toUpper) + key) % a.size)

  val D = (c: Char, key: Int, a: String) =>
    a((a.indexOf(c.toUpper) - key) % a.size)


  val cipher = (algo: (Char, Int, String) =>
    Char, s: String, key: Int, a: String) =>
    s.map(algo(_, key, a))


  val ct=cipher(E,"a",1,alphabet)
  println(ct)

  println(cipher(D,ct,1,alphabet));


}
