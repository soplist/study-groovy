def map=['name':'john','age':14,'sex':'boy']
map=map+['weight':25]
map.put('length',1.27)
map.father='Keller'

println map['father']
println map.length

map.each({key,value->
println "$key:$value"})
map.each{println it}
map.each({ println it.getKey()+"-->"+it.getValue()})