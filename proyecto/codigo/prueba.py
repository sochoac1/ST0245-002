import codecs

results = []

with codecs.open('datos0.csv', encoding = 'utf-8-sig') as f:

 	for row in f:

 		results.append(row)

results2=[]

for row in results:	
	row1 = row.strip()	
	results2.append(row1.split(";"))



