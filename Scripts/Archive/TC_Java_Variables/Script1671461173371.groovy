import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Final variable
final int myNum = 15;
myNum = 20;

//boolean variable

boolean flag = true;
System.out.println(flag);



int range;
System.out.println(range);
range =  -4250000
System.out.println(range);

long range1;
System.out.println(range1);
range =  -300000L
System.out.println(range1);


// String

String greeting = "   Hello World   ";

System.out.println(greeting);

System.out.println(greeting.trim());

System.out.println(greeting.length());

System.out.println(greeting.equals("Hello"));

System.out.println(greeting.replace("World", "Aperia"));

System.out.println(greeting.toLowerCase());

System.out.println(greeting.toUpperCase());

// Hash map
def emptyMap = [:]


	
//Define hashmap	
def map1 = [
	name: "Jerry"
	]

map1.put("City","New York")

System.out.println(map1);

def map2 =[
	"age":"30",
	"hobby":"Singing"
	]

map1.putAll(map2);
println(map2)
println(map1)
	

	
//Get item in Map
String name = map1.get("name");
String age = map2.get("age");
String hobby = map2.get("hobby");
println name;
println age;
println hobby;


def map = [
	name:"Jerry",
	age: "42",
	city: "New York"
	]

//update map value

map.replace("name", "Tom")
println(map)

map.each { entry->println "$entry.key:$entry.value" }
map.eachWithIndex { entry,i->println "$i $entry.key $entry.value" }

for(Map.Entry<String,String> entry : map.entrySet()) {
	println("key = "+entry.getKey()+", value = "+entry.getValue())
}
	



// List
def emptylist = []

def list = [1,2,3]

list.add(4)

println(list)

def list2 = [5,6,7]
println(list2)

list.addAll(list2);
println(list)


def listString = [
	"Hello",
	"World"
	]
	
"Get item by index"
String variable1 = listString[0]
println variable1

"Get item using get()"
String variable2 = listString.get(1)
println variable2

"Get item using getAt()"
String variable3 = listString.getAt(1)
println variable3





