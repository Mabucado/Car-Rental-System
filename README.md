# Car-Rental-System
This is a simple Java console-based Car Rental Management System designed to simulate core functionalities of a real-world car rental service. It allows users to register as customers, add cars to the system, rent and return cars, and view customer and vehicle information
 Features
✅ Register Customer
Allows new customers to register with their name, surname, age, and email (with basic validation).

🚙 Add Car
Adds a new car to the system, including details such as brand, model, year, and price.

🔑 Rent a Car
Customers can rent an available car by providing their ID and selecting a car ID. The system ensures a customer can only rent one car at a time and that the selected car isn't already rented.

🔁 Return a Car
Allows a customer to return a previously rented car. The car becomes available again for rental.

📋 Display All Cars
Lists all cars along with their details and rental status.

👥 Display All Customers
Lists all registered customers and the car (if any) they've rented.

📦 Classes
CarRentalPractice: Main class containing the console-based menu and business logic.

Customer: Represents a customer with personal information and rented car ID.

Car: Represents a car with brand, model, year, price, and rental status.

📌 Requirements
Java JDK 8 or above

No external libraries required

Console-based input/output
