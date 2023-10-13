import random

# Define the cities and their distances
distances = {
    'a': {'b': 12, 'c': 10, 'g': 12, 'd': float('inf'), 'e': float('inf'), 'f': float('inf')},
    'b': {'a': 12, 'c': 8, 'd': 12, 'g': float('inf'), 'e': float('inf'), 'f': float('inf')},
    'c': {'a': 10, 'b': 8, 'd': 11, 'e': 3, 'g': 9, 'f': float('inf')},
    'd': {'b': 12, 'c': 11, 'e': 11, 'f': 10, 'a': float('inf'), 'g': float('inf')},
    'e': {'c': 3, 'd': 11, 'f': 6, 'g': 7, 'a': float('inf'), 'b': float('inf')},
    'f': {'d': 10, 'e': 6, 'g': 9, 'a': float('inf'), 'b': float('inf'), 'c': float('inf')},
    'g': {'a': 12, 'c': 9, 'e': 7, 'f': 9, 'b': float('inf'), 'd': float('inf')}
}

def is_valid_route(route, cities):
    for i in range(len(route) - 1):
        from_city = route[i]
        to_city = route[i + 1]
        if to_city not in cities[from_city]:
            return False
    return True

# Create an initial population of routes that includes all cities
def create_initial_population(cities, population_size):
    num_cities = len(cities)
    initial_population = []
    
    city_names = list(cities.keys())
    city_names.remove('a')
    
    for _ in range(population_size):
        route = random.sample(city_names, len(city_names))
        initial_population.append(route)

        random.shuffle(city_names)

        
        route = ['a'] + city_names + ['a']
        
        # Ensure valid connections
        while not is_valid_route(route, cities):
            random.shuffle(city_names)
            route = ['a'] + city_names + ['a']
        
        initial_population.append(route)
    
    return initial_population

# Function to calculate the total distance of a route
def calculate_distance(route, distances):
    distance = 0
    for i in range(len(route) - 1):
        from_city = route[i]
        to_city = route[i + 1]
        if to_city in distances[from_city]:
            total_distance += distances[from_city][to_city]
        else:
            # determine route is invalid
            return float('inf')  
    return distance

# Genetic Algorithm parameters
population_size = 50
generations = 1000

# Main Genetic Algorithm loop
population = create_initial_population(distances, population_size)

for generation in range(generations):
    # Evaluate the fitness of each route
    fitness_scores = [calculate_distance(route, distances) for route in population]
    
    # Select the best routes for reproduction (Tournament Selection)
    selected_routes = []
    for _ in range(population_size):
        tournament_size = 5
        tournament_candidates = random.sample(range(population_size), tournament_size)
        winner_index = min(tournament_candidates, key=lambda i: fitness_scores[i])
        selected_routes.append(population[winner_index])
    
    # Crossover (Order Crossover)
    children = []
    for i in range(0, population_size, 2):
        parent1, parent2 = selected_routes[i], selected_routes[i + 1]
        crossover_point1, crossover_point2 = sorted(random.sample(range(len(parent1)), 2))
        child1, child2 = parent1[crossover_point1:crossover_point2], parent2[crossover_point1:crossover_point2]
        for city in parent2:
            if city not in child1:
                child1.append(city)
        for city in parent1:
            if city not in child2:
                child2.append(city)
        children.extend([child1, child2])
    
    # Mutation (Swap Mutation)
    mutation_rate = 0.1
    for i in range(population_size):
        if random.random() < mutation_rate:
            mutation_point1, mutation_point2 = sorted(random.sample(range(len(children[i])), 2))
            children[i][mutation_point1], children[i][mutation_point2] = children[i][mutation_point2], children[i][mutation_point1]
    
    # Replace the old population with the new one
    population = children

# Find the best route from the final population
best_route = min(population, key=lambda route: calculate_distance(route, distances))
best_distance = calculate_distance(best_route, distances)

print("Best Route:", best_route)
print("Shortest Distance:", best_distance)
