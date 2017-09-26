#Basics of collection

##The List Interface

The **List** interface extends **Collection** and declares the behavior of a collection that stores
a sequence of elements. Elements can be inserted or accessed by their position in the list,
using a zero-based index. A list may contain duplicate elements. **List** is a generic interface
that has this declaration:

	interface List<E>

Here, **E** specifies the type of objects that the list will hold.
In addition to the methods defined by Collection, List defines some of its own, which
are summarized in Table below. Note again that several of these methods will throw an
**UnsupportedOperationException** if the list cannot be modified, and a **ClassCastException**
is generated when one object is incompatible with another, such as when an attempt is
made to add an incompatible object to a list. Also, several methods will throw an
**IndexOutOfBoundsException** if an invalid index is used. A **NullPointerException** is
thrown if an attempt is made to store a null object and null elements are not allowed
in the list. An **IllegalArgumentException** is thrown if an invalid argument is used.
To the versions of **add( )** and **addAll( )** defined by **Collection**, List adds the methods
**add(int, E)** and **addAll(int, Collection)**. These methods insert elements at the specified
index. Also, the semantics of **add(E)** and **addAll(Collection)** defined by **Collection** are
changed by List so that they add elements to the end of the list. You can modify each
element in the collection by using **replaceAll( )**.
To obtain the object stored at a specific location, call get( ) with the index of the object.
To assign a value to an element in the list, call **set( )**, specifying the index of the object to be
changed. To find the index of an object, use **indexOf( )** or **lastIndexOf( )**.
You can obtain a sublist of a list by calling **subList( )**, specifying the beginning and ending
indexes of the sublist. As you can imagine, **subList( )** makes list processing quite convenient.
One way to sort a list is with the **sort( )** method defined by List.


| Method        | Description   |
| ------------- |:-------------:| 
|void add(int index, E obj)|Inserts obj into the invoking list at the index passed
in index. Any preexisting elements at or beyond the
point of insertion are shifted up. Thus, no elements
are overwritten.|


