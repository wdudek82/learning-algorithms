# 'Grokking Alhorithms' by Aditya Bhargava

# directed graph of friends
graph = {}
graph["me"] = ["alice", "bob", "claire"]
graph["alice"] = ["peggy"]
graph["bob"] = ["peggy", "anuj"]
graph["claire"] = ["Thom", "Jonny"]
graph["anuj"] = []
graph["peggy"] = []
graph["thom"] = []
graph["jonny"] = []

print(graph)
