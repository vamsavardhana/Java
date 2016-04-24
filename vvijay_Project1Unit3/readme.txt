The src folder has 5 packages-
model-This package contains the Automobile class and OptionSet class
util- This package contains the FileIO class
except- This package contains the AutoException class and helper class
driver- This package contains the driver2 class where the program runs from.
adapter- This package contains the BuildAuto class, the createAuto class, proxyAutomobile class

The class diagram was drawn and stored in the main directory as vvijay_Project1Unit3.jpg. 

The example of corrupted output file is shown in corruption.txt

The example of uncorrupted output file is shown in notcorrupt.txt

How it works:
The Hashmap interface contains a linked hashmap and a gethashmap function. It associates the BuildAuto class with the EditOptions class. When the class is not synchronized, the data gets corrupted as shown in the corrupted.txt file. When run with synchornized class automobile and synchronized methods, the data is not corrupted as shown in notcorrupt.txt file. In the driver function two threads are run on two different automobiles. The input is given by the user. Now, the options are chosen by the user in the edit options class run function as it implements runnable interface. The linkedhashmap automobile object is populated with the choices of color, braking, transmission, power moonroof and Side Impact Air Bags. These are entered by the user. If the methods and the class are not synchronized, then there is race condition where while we enter data for populating one object i.e. one thread, the second thread also starts. Thus data corruption occurs. Using synchronized methods and class object, the data corruption doesn't occur.


