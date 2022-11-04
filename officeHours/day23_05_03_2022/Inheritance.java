package day23_05_03_2022;

public class Inheritance {


}
/*
Inheritance is A Relationship.

SuperClass - Parent - Base: the class which features are inherited
Subclass - Child - Derived: tje c;ass that inherits features from other class

public Parent{
}
public Child extends Parent{

}

What is inherited:

+ All public and protected variables and methods
+ All default vatiables and methods (If parent and child need to be in the same package) (PACKAGE - PRIVATE)

What is NOT inherited:
+Private vatiables and methods CANNOT be inherited (Access them with GETTER/SETTER)
+Constructors CANNOT be inherited

Constructor:
+The parent class constructor always executes before child constructor
1. Child class contr MUST call parent constr
2. Parent class default constr is called by child class default constr implicitly - dolayli-tamamen
3. If the parent class constr is NOT DEFAULT, child one needs to call EXPLICITLY - acikca

super : refers to parent class objects
super(): refers to parent class constr

RULES:
There MUST be IS A Relationship, do it in subclass
Parameters, Return Type, methodName (same method signature)
Access Modifiers needs to be SAME or MORE visible

public -> public
protected -> public/protected
default -> public / protected / default
private CANNOT BE inherited

* private, final and static ones CANNOT be overriden

Method OVERLOADING

- Perform in SAME CLASS
- Parameters MUST be different
- Access Modifies can be changed
- private, final and static ones can be overloaded
- Return type does not effect overloading

Method OVERRIDING
- Occurs in two class that have is a RELATIONSHIP
- Parameters MUST BE SAME
- Access Modifiers need to be SAME or MORE VISIBLE
- private, final and static ones CANNOT be overriden
- Return type needs to be SAME





 */

