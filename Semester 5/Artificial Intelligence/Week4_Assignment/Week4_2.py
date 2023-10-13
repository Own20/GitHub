import random

# Define the cities and their distances
distances = {
    'a': {'b': 12, 'c': 10, 'g': 12},
    'b': {'a': 12, 'c': 8, 'd': 12},
    'c': {'a': 10, 'b': 8, 'd': 11, 'e': 3, 'g': 9},
    'd': {'b': 12, 'c': 11, 'e': 11, 'f': 10},
    'e': {'c': 3, 'd': 11, 'f': 6, 'g': 7},
    'f': {'d': 10, 'e': 6, 'g': 9},
    'g': {'a': 12, 'c': 9, 'e': 7, 'f': 9}
}

# Initialize the population with random routes
def initializeroute(citynum, cities):
    num_cities = len(cities)
    population = []

    listcity = list(cities.keys())
    listcity.remove('a')

    for _ in range(citynum):
        random.shuffle(listcity)
        route = ['a'] + listcity + ['a']
        # Ensure valid connections
        while not validroute(route, cities):
            random.shuffle(listcity)
            route = ['a'] + listcity + ['a']
        population.append(route)

    return population

# Check if a route is valid
def validroute(route, cities):
    for i in range(len(route) - 1):
        fromcity = route[i]
        tocity = route[i + 1]
        if tocity not in cities[fromcity]:
            return False
    return True

# Calculate the total distance of a route
def calctotaldist(route, cities):
    totaldist = 0
    for i in range(len(route) - 1):
        fromcity = route[i]
        tocity = route[i + 1]
        if tocity in cities[fromcity]:
            totaldist += cities[fromcity][tocity]
        else:
            # Route is invalid
            return float('inf')
    return totaldist

# Calculate the fitness of a route (inverse of total distance)
def calcfitnessfunc(route, cities):
    totaldist = calctotaldist(route, cities)
    if totaldist == float('inf'):
        return 0.0  # Handle invalid route
    else:
        return 1.0 / totaldist

# Perform proportional selection to choose parents
def propselectionparents(population, fitnessvalue):
    totalfitness = sum(fitnessvalue)
    selection_probabilities = [fitness / totalfitness for fitness in fitnessvalue]
    parent1 = random.choices(population, selection_probabilities)[0]
    parent2 = random.choices(population, selection_probabilities)[0]
    return parent1, parent2

# Perform crossover to create offspring
def crossover(parent1, parent2):
    crosspoint = random.randint(1, len(parent1) - 2)
    offspring = [None] * len(parent1)
    offspring[0] = 'a'
    offspring[-1] = 'a'
    offspring[1:crosspoint] = parent1[1:crosspoint]
    remaincities = [city for city in parent2 if city not in offspring]

    for i in range(1, len(offspring) - 1):
        if offspring[i] is None:
            offspring[i] = remaincities.pop(0)

    return offspring

# Perform mutation on an offspring
def mutate(offspring):
    pos1, pos2 = random.sample(range(1, len(offspring) - 1), 2)
    offspring[pos1], offspring[pos2] = offspring[pos2], offspring[pos1]
    return offspring

# Replace the old population with a new one
def replace_population(oldpopulation, offspring, numcity):
    combinepopulation = oldpopulation + offspring
    combinepopulation.sort(key=lambda route: calcfitnessfunc(route, distances), reverse=True)
    newpopulation = combinepopulation[:numcity]
    return newpopulation

# Set the number of individuals and generations
numindividuals = 50
numgenerations = 100

# Initialize the population
population = initializeroute(numindividuals, distances)

# Main loop for genetic algorithm
for generation in range(numgenerations):
    fitness_values = [calcfitnessfunc(route, distances) for route in population]
    newpopulation = []
    for i in range(numindividuals // 2):
        parent1, parent2 = propselectionparents(population, fitness_values)
        offspring = crossover(parent1, parent2)
        offspring = mutate(offspring)
        newpopulation.append(offspring)

    population = replace_population(population, newpopulation, numindividuals)

# Find the best route and its fitness
best_route = min(population, key=lambda route: calcfitnessfunc(route, distances))
best_fitness = calcfitnessfunc(best_route, distances)

# Print the results
print("Best Route:", best_route)
print("Best Fitness:", best_fitness)
