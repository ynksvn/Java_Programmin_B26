package day03_office;

public class BrowserTest {
    public static void main(String[] args) {




    }
}
 /*

					Task  : BrowserTask

					Create  a program that accepts browserName and operatingSystem as String and isBrowserOpened as boolean

				        If the Browser is closed, try to open the corresponding browsers in that operating system to run your code.


				        		=== These browsers can be opened in these operatingSystem ===

				                    chrome   		    --- > mac - windows
				                    chrome-headless 	--- > mac - windows
				                    firefox-headless    --- > mac - windows
				                    firefox             --- > mac - windows
				                    ie 					--- > windows
				                    edge 				--- > windows
				                    safari 			    --- > mac
				                    remote-chrome  		--- > mac - windows

				         - According to related browserName and operatingSystem it should give

				             OUTPUT -- > "Browser is opened successfully with $browserName in $operatingSystem"

				          - if operatingSystem does not support $browserName

				              OUTPUT -- > "Your $operatingSystem doesn't support $browserName"

				          - If the Browser is already opened it should give an error message

				        	OUTPUT -- > "Browser is already opened with $browserName in $operatingSystem"

				                    EXAMPLES

				                    INPUTS :                        EXPECTED OUTPUT : Browser is opened successfully with chrome in mac
				                            isBrowserOpen=false
				                            browserName=chrome
				                            operatingSystem=mac

				                    INPUTS :                        EXPECTED OUTPUT : Browser is opened successfully with chrome in windows
				                            isBrowserOpen=false
				                            browserName=chrome
				                            operatingSystem=windows

				                    INPUTS :                        EXPECTED OUTPUT : Your mac doesn't support ie
				                            isBrowserOpen=false
				                            browserName=ie
				                            operatingSystem=mac

				                    INPUTS :                        EXPECTED OUTPUT : Your mac doesn't support edge
				                            isBrowserOpen=false
				                            browserName=edge
				                            operatingSystem=mac

				                   INPUTS :                        EXPECTED OUTPUT : Your windows doesn't support safari
				                            isBrowserOpen=false
				                            browserName=safari
				                            operatingSystem=windows

				                   INPUTS :                         EXPECTED OUTPUT : Browser is already opened with safari in mac
				                            isBrowserOpen=true
				                            browserName=safari
				                            operatingSystem=mac

         */
