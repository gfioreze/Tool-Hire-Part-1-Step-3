import java.awt.*;
import java.util.*;
/**
 * The class has multiple fields regarding information about the Tools in the Tool hire store.
 *
 * @author (Gabriel Fioreze)
 * @version (v2)
 */
public class Tool
{
    // instance variables / fields
    // Refactor the code (it is closed coupled)
    private String toolName;
    private String itemCode;
    private int timesBorrowed;
    private boolean onLoan;
    private double cost;
    private double weight;

    /**
     * Constructor for objects of class Tool
     */
    public Tool(String toolName, String itemCode, int timesBorrowed, boolean onLoan, double cost, double weight)
    {
        // initialise instance variables
        this.toolName = toolName;
        this.itemCode = itemCode;
        this.timesBorrowed = timesBorrowed;
        this.onLoan = onLoan;
        this.cost = cost;
        this.weight = weight;
    }
    
    public Tool() 
    {
        
    }
    
    // getters
    public String getToolName()
    
    {
        return toolName;
    }
    
    public String getItemCode()
    
    {
        return itemCode;
    }
    
    public int getTimesBorrowed()
    
    {
        return timesBorrowed;
    }
    
    public boolean getOnLoan()
    
    {
        return onLoan;
    }
    
    public double getCost()
    
    {
        return cost;
    }
    
    public double getWeight()
    
    {
        return weight;
    }
    
    public void readData(Scanner scanner)
    {
        toolName = scanner.next();
        itemCode = scanner.next();
        timesBorrowed = scanner.nextInt();
        onLoan = scanner.nextBoolean();
        cost = scanner.nextDouble();
        weight = scanner.nextDouble();
    }
    
    // prints out details of each tool to terminal
    public void printDetails()

    {
        System.out.print("Tool name: " + toolName + "; " + "code: " + itemCode + "; "
        + "times borrowed: " +timesBorrowed + "; ");
        
        if (onLoan == false) 
        {
            System.out.print("onLoan: yes" );
        } else 
        {
            System.out.print("onLoan: no" );
        }
        
        System.out.println("; " + "cost: " + cost + "; " + "weight: " + weight);
        
    }
}