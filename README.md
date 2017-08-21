# Fortinet-Coding-Challenge

## Coding Challenge 1
 > 1. Create Node class for creating a node in Linked List.
 > 2. Create Likedlist.java class for Linked List and develope reverseList(Node head) method for reversing Linked List.
 > 3. In reverseList(Node head) method I implement this method recursively in this method first i take one pointer for next element which will be the previous element of the current element than i make a recursive call for new head of that sub linked list.

## Coding Challenge 2
### Factory Pattern :-  
 > Factory Pattern is a Creational Design Pattern. It is used to hide the logic of an Object creation. It is used when we have multiple Subclass and we have to return one specific class as per client requirement.
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
 > Transaction management is required to make data consistant and durable in the database. Spring provides transaction manager to handle transaction. For JDBC spring provides Data Source Transaction Manager, for Hibernate spring provides Hibernste Transaction Manager, for JPA it provides JPA transaction Manager and for JTA ir provides JTA Transaction Manager. Basically Transaction means, (for example:- if A wants to transfer $100 to B's account. You think that that's a one transaction but its not what happens, first $100 deduct from A's account that is one transaction and other is to credit $100 in B's account. So  basically if both transaction comits successful than we can say successful transaction but if any one transaction fails than in database rollbacks the successful transaction.). Spring can manage transaction using Programmatic Transaction Management(in this management transaction will be managed by programming. It is difficult to maintain because if you are using this transaction you have to maintain transaction with the help of try catch block so in enterprice application you need to add more and more try catch so it makes your code complex.) and Declarative Transaction Management( In this transaction management is sapareted from the business code  and you can implement in XML based configuration or annotation based configuration. Spring support this transaction management technique. If you manage transaction using AOP that transaction management technique is called declarative transaction management.).  
  
    
