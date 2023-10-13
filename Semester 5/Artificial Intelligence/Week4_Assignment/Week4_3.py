## Problem: Tic-Tac-Toe game
# 'x' = 1 
# 'o' = -1
# empty = 0
# state: [[0,0,1],[0,-1,0],[0,0,0]]
# 'x' starts first
# The one who makes a row, a column, 
# or a diagonal of the same type wins

import copy

class TicTacToe():
    # initialize game with some state
    def __init__(self, state=[[0,0,0],[0,0,0],[0,0,0]]):
        self.state = state


def make_move(state, row, col, val):
    if state[row][col] !=0 and (val == 1 or val == -1):
        state[row][col] = val
    return state


def expand_state(state, val):
    children = []
    for i in range(3):
        for j in range(3):
            if state[i][j] == 0:
                child = copy.deepcopy(state)
                child[i][j] = val
                children.append(child)
    return children


# check if the terminal node
def terminal_node(state):
        # result of the game
        # win1 = +10, win2 = -10, tie=0
        result = 0
        isGameOver = False
    
        # check if there is an empty cell
        emptyCells = False
        for i in range(3):
            for j in range(3):
                if state[i][j] == 0:
                    emptyCells = True

        # check rows if there is a winner
        isWinner = False
        for i in range(3):
            sum = 0
            for j in range(3):
                sum += state[i][j]
            if sum == 3:
                isWinner = True
                result = 10
            if sum == -3:
                isWinner = True
                result = -10

        # check cols if there is a winner
        for j in range(3):
            sum_p1 = 0
            sum_p2 = 0
            for i in range(3):
                if state[i][j] == 1:
                    sum_p1 += 1
                if state[i][j] == -1:
                    sum_p2 += -1
            if (sum_p1 == 3) or (sum_p2 == -3):
                isWinner = True 
                if (sum_p1 == 3):
                    result = 10
                if (sum_p2 == -3):
                    result = -10

        # check diagonals if there is a winner
        sum_p1 = 0
        sum_p2 = 0
        for i in range(3):
            if state[i][i] == 1:
                sum_p1 += 1
            if state[i][i] == -1:
                sum_p2 += -1
        if (sum_p1 == 3) or (sum_p2 == -3):
            isWinner = True 
            if (sum_p1 == 3):
               result = 10
            if (sum_p2 == -3):
               result = -10
            
        sum_p1 = 0
        sum_p2 = 0
        for i in range(3):
            if state[i][2-i] == 1:
                sum_p1 += 1
            if state[i][2-i] == -1:
                sum_p2 += -1
        if (sum_p1 == 3) or (sum_p2 == -3):
            isWinner = True 
            if (sum_p1 == 3):
               result = 10
            if (sum_p2 == -3):
               result = -10

        isGameOver = isWinner or not emptyCells
        return {"gameover": isGameOver, "result": result}
                

# try a move: set val to the cell
# with coordinates [row, col]
def try_move(state, row, col, val):
        if (isinstance(row, int)) and (row>=0) and (row<=2):
            if (isinstance(col, int)) and (col>=0) and (col<=2):
                if state[row][col] == 0:
                    if (val == -1) or (val == 1):
                        state[row][col] = val
        return state

