# Fortinet-Coding-Challenge

## Coding Challenge 1
 > 1. Create Node class for creating a node in Linked List.
 > 2. Create Likedlist.java class for Linked List and develope reverseList(Node head) method for reversing Linked List.
 > 3. In reverseList(Node head) method I took three pointer for current, previous and next node and then use iterative method for reversing Linked List.

## Coding Challenge 2
### Factory Pattern :-  
 > Factory Pattern is a Creational Design Pattern. It is used to hide the logic of an Object creational. It is used when we have multiple Subclass and we have to return one specific class as per client requirement.
   I explain you with the example how to return one prticular subclass. (For Example: I take one pizza interface and in which there are methods like prpere(), bake(), cut(), box(). I create three pizza subclass like ChessPizza.java, 
   VegiePizza.java, PepperoniPizza.java. They all implements pizza interface. Now I developed a PizzaShop.java class which is a Factory Pattern class for whole pizza shop application. In this class I implement a logic to return one pizza as per customer choise like Chess or Vegie or Pepperoni.
   OrderPizza.java is main class. This class getting a choice from user and prepare pizza for customer.) 
 > Factory Pattern provides easy modification to add new feature. We don't need to change code from client side.
 
#### Benifits Of Factory Pattern :-
 > It gives code flexibility , make our code loosely coupled and reusable.
 
 ## Questions :- 
 #### 1. What is Session in Hibernate?
  > Session in Hibernate represents database connection. 
  > Once we have a Session we can perform all the crud operations(like create, read, update, delete and many more.).
  > We can request Session Factory to give a Session as many Session we need in an Application.
  > Session is not thread safe.
  > Session gets connections with database when it is requested. While performing database operation Session automatically internally create database physical connection. I describe here some basic methods to create session, to create teansacton in session and add, delete, and update object to database.
  >1. sessionFactory.openSession() :- This method is used to create session using session factory object. It returns Session.
  >2. session.beginTransaction() :- This method is used to start transaction to database.
  >3. session.save(object) :- This method is used to save an object to database.
  >4. session.get(object) :- This method is used to getting an object from the database.
  >5. session.delete(object) :- This method is used to delete an object from the database.
  >6. session.saveorUpdate(object) :- This method is used to update any object of the database.
  
  #### 2. How would you control transaction with Spring & Hibernate? Answer with different scenarios.
  
    
