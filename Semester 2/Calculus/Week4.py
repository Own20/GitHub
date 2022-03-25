import numpy as np

# trapezoidal rule
def trap(f, a, b, n):
    x = np.linspace(a, b, n+1)
    w = [1, 2, 2, ..., 1]
    h = x[1] - x[0]
    area = np.sum(w * f(x)) * h/2