import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/**
 * Game of life lab. Creates a world. That has a starting pattern's, and goes through generations reproducing cells, cells dying, or cells living on. 
 * 
 * @author @Ryan Fang
 * @version 18 November 2015
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 5;
    private final int COLS = 5;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the 6 cells initially alive
        final int X1 = 2, Y1 = 0;
        final int X2 = 2, Y2 = 1;
        final int X3 = 2, Y3 = 2;
        final int X4 = 0, Y4= 2;
        final int X5 = 1, Y5= 2;
        final int X6 = 3, Y6= 2;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and adds actors to the three intial locations
        Actor act1 = new Actor();
        Location loc1 = new Location(Y1, X1);
        grid.put(loc1, act1);
        
        Actor act2 = new Actor();
        Location loc2 = new Location(Y2, X2);
        grid.put(loc2, act2);
        
        Actor act3 = new Actor();
        Location loc3 = new Location(Y3, X3);
        grid.put(loc3, act3);
        
        Actor act4 = new Actor();
        Location loc4 = new Location(Y4, X4);
        grid.put(loc4, act4);
        
        Actor act5 = new Actor();
        Location loc5 = new Location(Y5, X5);
        grid.put(loc5, act5);
        
        Actor act6 = new Actor();
        Location loc6 = new Location(Y6, X6);
        grid.put(loc6, act6);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        
        // insert magic here...
        Location [] alive= new Location[100];
        // keeps an array that holds all the locations for alive cells. 
        int x=0;
       for( int rows=0; rows<=4; rows++){           
           for( int col= 0; col<=4; col++){
               Location loc= new Location( rows, col);
               int neighbors = grid.getNeighbors(loc).size();
               //gets the amount of occupied neighbors for each cordinate.
               if (grid.get(loc)!= null){
                   if( neighbors ==2 ||  neighbors==3){
                    alive[x]= loc;   
                    x++;
                    //allow cells to live.
            }
            else{
                grid.remove(loc);
                //removes the cells that die from either overcrowding or underpopulation
            }
       }
       else{
           if( neighbors==3){
               alive[x]= loc;
               x++;
               // reproduces cells with 3 neighbors. 
        }
     }

    }
    }
    

    for (int i=0; i<x; i++){
     Actor act= new Actor();
     grid.put(alive[i], act);
     // for loops repopulates. the board.   
    }
    world.show();

    
}

    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
        //this for loop runs through the program to the 3rd generation.
        for (int i=1; i<=3; i++){
            Thread.sleep(1000);
            //The create next generation method updates every second
            game.createNextGeneration();
    }
    }

}
