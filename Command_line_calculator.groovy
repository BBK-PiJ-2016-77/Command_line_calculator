print "Give me a mathimatical operation "
String str = System.console().readLine()
//int num1 = str.substring(0)

for(int counter=0; counter<str.length(); counter++)
{
  // println str.substring(counter,counter+1)
  if(str.substring(counter,counter+1).equals("+") || str.substring(counter,counter+1).equals("-")){
    //println  str.substring(counter,counter+1)
    println counter
    println  str.substring(0,counter)
    println str.substring(counter+1,str.length())

    int n1 = Integer.parseInt(str.substring(0,counter))
    int n2 = Integer.parseInt(str.substring(counter+1,str.length()))

    if(str.substring(counter,counter+1).equals("+"))
      println "The result is : " + (n1+n2)
    else
      println "The result is : " + (n1-n2)
  }

}
