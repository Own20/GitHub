import copy

class TicTacToe():
    # Initialize the game with some state
    def __init__(self, state=[[0,0,0],[0,0,0],[0,0,0]]):
        self.state = state

    def makemove(self, row, col):
        if self.state[row][col] == 0:
            self.state[row][col] = 1  # The human player's move
            return True
        else:
            return False

    def boardfull(self):
        for i in range(3):
            for j in range(3):
                if self.state[i][j] == 0:
                    return False
        return True

    def checkwinner(self, player):
        for i in range(3):
            # Check rows
            if all(self.state[i][j] == player for j in range(3)):
                return True
            # Check columns
            if all(self.state[j][i] == player for j in range(3)):
                return True
            # Check diagonals
            if all(self.state[i][i] == player for i in range(3)) or all(self.state[i][2-i] == player for i in range(3)):
                return True

        return False

    def is_game_over(self):
        return self.checkwinner(1) or self.checkwinner(-1) or self.boardfull()

    def print_board(self):
        for row in self.state:
            print(" ".join(['X' if cell == 1 else 'O' if cell == -1 else '-' for cell in row]))

def minimax(state, depth, is_maximizing):
    if state.is_game_over():
        result = state.checkwinner(1)
        if result:
            return 10 - depth
        result = state.checkwinner(-1)
        if result:
            return -10 + depth
        return 0

    if is_maximizing:
        max_eval = float("-inf")
        for i in range(3):
            for j in range(3):
                if state.state[i][j] == 0:
                    state.state[i][j] = 1
                    eval = minimax(state, depth + 1, False)
                    state.state[i][j] = 0
                    max_eval = max(eval, max_eval)
        return max_eval
    else:
        min_eval = float("inf")
        for i in range(3):
            for j in range(3):
                if state.state[i][j] == 0:
                    state.state[i][j] = -1
                    eval = minimax(state, depth + 1, True)
                    state.state[i][j] = 0
                    min_eval = min(eval, min_eval)
        return min_eval

def find_best_move(state):
    best_move = None
    best_eval = float("-inf")
    for i in range(3):
        for j in range(3):
            if state.state[i][j] == 0:
                state.state[i][j] = 1
                eval = minimax(state, 0, False)
                state.state[i][j] = 0
                if eval > best_eval:
                    best_eval = eval
                    best_move = (i, j)
    return best_move

def get_player_move(game):
    while True:
        try:
            row, col = map(int, input("Enter your move (row col): ").split())
            if 0 <= row <= 2 and 0 <= col <= 2 and game.state[row][col] == 0:
                return row, col
            else:
                print("Invalid move. Try again.")
        except ValueError:
            print("Invalid input. Please enter two integers (row and col).")



# Play game
game = TicTacToe()

while not game.is_game_over():
    game.print_board()
    row, col = get_player_move(game)
    game.makemove(row, col)
    if game.is_game_over():
        break
    best_move = find_best_move(game)
    game.state[best_move[0]][best_move[1]] = -1

game.print_board()
result = game.checkwinner(1)

if result:
    print("You win!")
else:
    result = game.checkwinner(-1)
    if result:
        print("Computer wins!")
    else:
        print("It's a tie!")
