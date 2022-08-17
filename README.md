# Sudoku-Solver
This is a CLI-based program to solve sudoku of any size.
- This was my first personal project ever. Built after taking CSCI 1105 Introduction to Computer Programming at Dalhousie University.
- Designed and implemented this program to help my little cousin with his insanely hard sudoku homework 💪.

## How to run
First, clone the repository by `git clone https://github.com/JayZhouzzj/Sudoku-Solver.git` or `git clone git@github.com:JayZhouzzj/Sudoku-Solver.git`
### If you want to run it from your terminal
1. `cd Sudoku-Solver`
2. `javac Sudoku.java`
3. `java Sudoku`
### If you have an IDE like IntelliJ
1. Open this project in your IDE
2. Click run (e.g. Run 'Sudoku.main()' in IntelliJ)

Then just follow the prompts in your terminal!

### Example
>...  
>Type in the size of the given sudoku board (9 if it's an ordinary 9*9 matrix):<br/>

`9`

>Type in the sudoku matrix. Type in 0 to represent blank.The order is left to right, top to bottom. Please separate each number with space or enter. <br/>

```
0 2 0 0 0 0 0 0 0
0 0 0 6 0 0 0 0 3
0 7 4 0 8 0 0 0 0
0 0 0 0 0 3 0 0 2
0 8 0 0 4 0 0 1 0
6 0 0 5 0 0 0 0 0
0 0 0 0 1 0 7 8 0
5 0 0 0 0 9 0 0 0
0 0 0 0 0 0 0 4 0
```

> ```
> [0, 2, 0, 0, 0, 0, 0, 0, 0]
> [0, 0, 0, 6, 0, 0, 0, 0, 3]
> [0, 7, 4, 0, 8, 0, 0, 0, 0]
> [0, 0, 0, 0, 0, 3, 0, 0, 2]
> [0, 8, 0, 0, 4, 0, 0, 1, 0]
> [6, 0, 0, 5, 0, 0, 0, 0, 0]
> [0, 0, 0, 0, 1, 0, 7, 8, 0]
> [5, 0, 0, 0, 0, 9, 0, 0, 0]
> [0, 0, 0, 0, 0, 0, 0, 4, 0]
> DONE! Here is the answer:
> [1, 2, 6, 4, 3, 7, 9, 5, 8]
> [8, 9, 5, 6, 2, 1, 4, 7, 3]
> [3, 7, 4, 9, 8, 5, 1, 2, 6]
> [4, 5, 7, 1, 9, 3, 8, 6, 2]
> [9, 8, 3, 2, 4, 6, 5, 1, 7]
> [6, 1, 2, 5, 7, 8, 3, 9, 4]
> [2, 6, 9, 3, 1, 4, 7, 8, 5]
> [5, 4, 8, 7, 6, 9, 2, 3, 1]
> [7, 3, 1, 8, 5, 2, 6, 4, 9]
> ```

## What can be next
- Use better algorithms. Currently it is a brute-force approach by recursion.
- Add continue/end flow.
- Deploy and have a simple web interface.
