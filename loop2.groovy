def var="hello,wangkang";
def repeat(val,repeat=3){
   for(i in 0..<repeat){
      println "This is ${i}:${val}"
   }
}
repeat(var)