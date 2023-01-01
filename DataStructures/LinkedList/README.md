## Linked List

<img src="https://user-images.githubusercontent.com/59585859/210178056-525b3c72-a11f-43b2-8564-f48f53c15ee0.png"> 


Benefits:
- Add to the beginning/end of the list
- Remove at the beginning/end of the list



Disadvantages: 
- Accessing random items within the list


<br>

<h3>Differences between LinkedList and Array</h3>

<b>Linked List</b> - Modifying items is easier and sometimes faster, because you don't have to reposition all items in the list, as with arrays


<b>Array</b> - Finding items is easier, you can go to it directly. To do the same with LinkedLists you need to do the path, from the first one to the item you want. One by one, which slows down the process.


## Doubly Linked-Lists 

<img src="https://user-images.githubusercontent.com/59585859/210178593-0e2af687-6216-4361-ae1a-30418ff5cb7d.png">

It has an extra pointer, which references the previous item in the list
this makes it easy to delete items at the end of a list, "backwards"

for example:

```java
tail.prev.next = null
tail = tail.prev
```




<h2><i>Watch:</i></h2>

<a href="https://www.youtube.com/watch?v=odW9FU8jPRQ">Linked List Data Structure | Illustrated Data Structures</a>

<a href="https://www.youtube.com/watch?v=F8AbOfQwl1c">Linked Lists in 4 minutes</a>

<a href="https://www.coursera.org/lecture/data-structures/singly-linked-lists-kHhgK">Singly Linked Lists</a>

<a href="https://archive.org/details/ucberkeley_webcast_htzJdKoEmO0">CS 61B Lecture 7: Linked Lists</a> I

<a href="https://archive.org/details/ucberkeley_webcast_-c4I3gFYe3w">CS 61B Lecture 7: Linked Lists II</a>

<a href="https://www.coursera.org/lecture/data-structures-optimizing-performance/core-linked-lists-vs-arrays-rjBs9">Core: Linked Lists vs Arrays</a>

<a href="https://www.coursera.org/lecture/data-structures-optimizing-performance/in-the-real-world-lists-vs-arrays-QUaUd">In the Real World: Linked Lists vs Arrays</a>

<a href="https://www.youtube.com/watch?v=YQs6IC-vgmo">Why you should avoid Linked Lists?</a>

<a href="https://www.coursera.org/lecture/data-structures/doubly-linked-lists-jpGKD">Doubly Linked Lists</a>


<h2><i>Extra Read:</i></h2>
<a href="https://levelup.gitconnected.com/things-every-software-engineer-should-know-linked-lists-4841f75614ba">Things Every Software Engineer Should Know About Linked Lists</a>

<br>
<br>
<h3>Code From Berkeley University:</h3>

1. <a href="LinkedList/NodeList_example1.java">Adding Manually</a>
2. <a href="LinkedList/NodeList_example2.java">With Constructor Method</a>
3. <a href="LinkedList/insertAfter.java">Function For insertAfter</a>
