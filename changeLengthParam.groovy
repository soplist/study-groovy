int sum(int... var) {
   def total = 0
   for (i in var)
      total += i
   return total
}

println sum(1)
println sum(1,2)
println sum(1,2,3)