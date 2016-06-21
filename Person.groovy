class Person {
   def name
   def age
   String toString(){
      "$name,$age"
   }
   public static void main(String[] args){
      def person1=new Person()
      person1.name='kk'
      person1.age=20
      println person1

      def person2=new Person(['name':'gg','age':22])
      println person2
   }
}

