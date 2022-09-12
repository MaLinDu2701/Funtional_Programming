object q3 extends App{

  class account(id:String,num:Int,blc:Double){
    var ID=id
    var accountNo=num
    var balance=blc

    def transfer(amt:Double,a:account):Unit={
      if(amt<=balance) {
        balance=balance - amt
        a.balance=a.balance + amt
      }
      else{
        println("Insufficient funds cannot transfer")
      }

  }}
val a1=new account("2020cs037",20000375,10000)
  val a2=new account("2020cs155",20001551,10000)


  println(a1.ID+":"+a1.balance)
  println(a2.ID+":"+a2.balance)


  a1.transfer(20000,a2)

  println("After Transfer:")
  println(a1.ID + ":" + a1.balance)
  println(a2.ID + ":" + a2.balance)

}
