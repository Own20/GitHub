from queue import Queue

# Check path is valid
def valid(n, maze, x, y, visit):
    return x >= 0 and y >= 0 and x < n and y < n and maze[x][y] == 1 and not visit[x][y]

# BFS Algorithm to find a path
def BFSpathfind(maze, start, finish):
    n = len(maze)
    visit = [[False for _ in range(n)] for _ in range(n)]

    # Define move by coordinate index (up, down, left, right)
    moveX = [-1, 1, 0, 0]
    moveY = [0, 0, -1, 1]

    # Create queue for BFS
    queue = Queue()
    queue.put(start)

    # Store the path
    path = {}
    found = False

    while not queue.empty():
        current = queue.get()
        x, y = current

        if current == finish:
            found = True
            break

        for i in range(4):
            movingx = x + moveX[i]
            movingy = y + moveY[i]

            if valid(n, maze, movingx, movingy, visit):
                queue.put((movingx, movingy))
                visit[movingx][movingy] = True
                path[(movingx, movingy)] = current

    if found:
        x, y = finish
        while (x, y) != start:
            maze[x][y] = '-'
            x, y = path[(x, y)]

        maze[start[0]][start[1]] = 'S'
        maze[finish[0]][finish[1]] = 'G'

        for row in maze:
            for cell in row:
                print(cell, end=' ')
            print()
    else:
        return "Path does not exist"



maze = [
    [1, 0, 1, 1, 1, 1, 1, 0, 1],
    [1, 0, 1, 0, 0, 0, 1, 0, 1],
    [1, 0, 1, 0, 1, 1, 1, 0, 1],
    [1, 0, 1, 0, 0, 0, 1, 0, 1],
    [1, 0, 1, 0, 1, 1, 1, 1, 1],
    [1, 0, 1, 0, 0, 0, 0, 0, 1],
    [1, 1, 1, 1, 1, 0, 1, 1, 1],
    [1, 0, 1, 0, 0, 0, 0, 0, 1],
    [1, 0, 1, 1, 1, 1, 1, 1, 1]
]

start = (0, 0)
finish = (2, 4)

BFSpathfind(maze, start, finish)
