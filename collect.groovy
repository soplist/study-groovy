def collect=["a","b","c"]
collect.add(1);
println collect[1]
println collect[3]
collect<<"come on";
collect[collect.size()]=100.0
println collect[collect.size()-1]
println collect[-1]
collect=collect+5
println collect[collect.size()-1]
collect=collect-'a'
println collect[0]