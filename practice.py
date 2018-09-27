
def fitness (password, test_word):
	
	if (len(test_word) != len(password)):
		print("taille incompatible")
		return
	else:
		score = 0
		i = 0
		while (i < len(password)):
			if (password[i] == test_word[i]):
				score+=1
			i+=1
		return score * 100 / len(password)

		import random

def generateAWord (length):
	i = 0
	result = ""
	while i < length:
		letter = chr(97 + int(26 * random.random()))
		result += letter
		i +=1
	return result

def generateFirstPopulation(sizePopulation, password):
	population = []
	i = 0
	while i < sizePopulation:
		population.append(generateAWord(len(password)))
		i+=1
	return population


import operator
import random

def computePerfPopulation(population, password):
	populationPerf = {}
	for individual in population:
		populationPerf[individual] = fitness(password, individual)
	return sorted(populationPerf.items(), key = operator.itemgetter(1), reverse=True)

def selectFromPopulation(populationSorted, best_sample, lucky_few):
	nextGeneration = []
	for i in range(best_sample):
		nextGeneration.append(populationSorted[i][0])
	for i in range(lucky_few):
		nextGeneration.append(random.choice(populationSorted)[0])
	random.shuffle(nextGeneration)
	return nextGeneration


	import random

def createChild(individual1, individual2):
	child = ""
	for i in range(len(individual1)):
		if (int(100 * random.random()) < 50):
			child += individual1[i]
		else:
			child += individual2[i]
	return child

def createChildren(breeders, number_of_child):
	nextPopulation = []
	for i in range(len(breeders)/2):
		for j in range(number_of_child):
			nextPopulation.append(createChild(breeders[i], breeders[len(breeders) -1 -i]))
	return nextPopulation


