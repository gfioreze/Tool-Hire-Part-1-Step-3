import java.io.*;
import java.util.*;
import java.awt.*;
import java.lang.String;
/**
 * This class stores tool objects of type Tool, for that it uses a 
 * method to retrieve the tools from an external txt file.
 *
 * @author (Gabriel Fioreze)
 * @version (v2)
 */
public class Shop
{
    // array toolList of type Tool
    private ArrayList<Tool> toolList;

    /**
     * Constructor for objects of class Shop
     */
    public Shop()
    {
        //initialise instance variables
        toolList = new ArrayList<Tool>();
    }

    // adds a tool to toolList. This takes a tool object as a parameter
    public void storeTool(Tool tool)

    {
        toolList.add(tool);
    }

    // the method uses FileDialog object to open a txt.file 
    public void readToolData() 
    {
        //create a FileDialog object save to a variable
        Frame myFrame = null;
        FileDialog fileBox = new FileDialog(myFrame,
                "Open", FileDialog.LOAD);
        //fileBox.setDirectory("/Documents/Java/Projects/Tool Hire/Tool Hire Part 1 Step 2");

        fileBox.setDirectory(".");
        //make it visible
        fileBox.setVisible(true);
        //Create a new File Object
        File file = new File(fileBox.getDirectory() + fileBox.getFile());
        //create object from that file name and pass it to the scanner
        //scan the entire line

        Scanner scanner = null;
        try
        {
            scanner = new Scanner(file);

            //while there is more data in the file
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        while (scanner.hasNextLine()) {
            //read line into variable lineOfText
            String lineOfText = scanner.nextLine();
            // Condition (Cannot be a blank line or have 
            //double forward slashes
            if (!lineOfText.isEmpty() && !lineOfText.startsWith("//"))
            {
                lineOfText = lineOfText.trim();

                // Create a new scanner passing lineOfText
                Scanner scanner2 = new Scanner(lineOfText);

                // Read data for each of tool's fields
                scanner2.useDelimiter(",");
                Tool tool = new Tool();
                tool.readData(scanner2);

                //store object above in an array
                toolList.add(tool);
            }
        }
        scanner.close();
    }

    public void printAllTools()

    {

        for (Tool tool : toolList)
        {
            //
            //System.out.println(tool);

            tool.printDetails();
        }
    }
}