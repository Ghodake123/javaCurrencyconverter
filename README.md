# javaCurrencyconverter

Technologies Used:

Java Swing:

Purpose: Provides the graphical user interface (GUI) components.

Components:
JFrame: Main window to hold the GUI elements.
JTextField: For user input (amount to convert).
JComboBox: For selecting currencies.
JLabel: For displaying text and results.
JButton: For initiating the conversion action.
Event Handling:

Purpose: To manage user interactions like button clicks.
Implementation: Uses the ActionListener interface to handle actions and perform currency conversion.
Data Management:

Purpose: To store and manage exchange rates.
Implementation: Uses a HashMap to store currency codes and their exchange rates for easy lookup.
Functionality:

User Interface:

Layout: Uses a GridLayout to arrange GUI components in a structured manner.
Components: Includes input fields, dropdowns for currency selection, a button for conversion, and a label to display the result.
Conversion Process:

Selection: Users select the currencies from dropdowns and input the amount.
Calculation: Converts the amount based on the selected currencies using exchange rates.
Display: Shows the result in a label.
Error Handling:

Input Validation: Ensures that the input is a valid number and handles errors gracefully.
Example Usage:

Start the Application:

Launch the application, which opens a window with input fields and buttons.
Enter Amount:

Input the amount you wish to convert into the provided text field.
Select Currencies:

Choose the source and target currencies from the dropdown menus.
Perform Conversion:

Click the "Convert" button to perform the conversion.
View Result:

The converted amount is displayed in the result label
