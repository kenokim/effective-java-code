### Chapter 14. Classes and Interfaces
#### Item 15: Minimize the accessibility of classes and members
Information hiding (or encapsulation) - decouples the components
* Allows components to be developed, tested, optimized, used, understood, and modified <b>in isolation</b>.

Java - access control mechanisms [JLS, 6.6]
* Specifies the accessibility of classes, interfaces, members
* Determined by location of declaration, and access modifiers (private, public, protected)
* Make each as inaccessible as possible

Liskov substitution principle 
* instance of subclass must be able to replace that of superclass
* Superclass members' access modifiers - less private than subclass

Instance fields of public classes - should be rarely public
* Mutable fields = less thread safe
* Exception - public static final fields