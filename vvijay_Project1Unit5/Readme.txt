There are two jsp pages-
1.index.jsp which loads the auto models and the options for the various optionsets for selection. These are populated by the server from the properties files as in Project1Unit4.
2.In the page2.jsp, the selected options from the previous page are shown. In addition, the cost of the vehicle with all the chosen options is calculated.
In servlet1.java, the auto models are populated on the jsp page by using the set attributes function.
In servlet2.java, the auto models options are populated into the jsp page, as attributes for selection in the jsp page. Also, the total price is calculated and sent as an attribute to the page2.jsp.

PROCEDURE:
1. Run as server from servlet1.java.
2. Run the clientside project as java application
3. use sendproperties command three times. Each time send a properties file. There are three custom properties files in the clientside src folder.
4. Select the options from the various dropdowns.
5. Hit submit button.
6. In the next page, the total cost for the chosen vehicle appears. 

OUTPUTS:
output1.txt file shows the console outputs for populating the linkedhashmap of automobiles
output2 shows the selected options by the user.
output3 shows the total cost of the car computed from the selected options.
