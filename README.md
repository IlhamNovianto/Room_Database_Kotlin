# Room_Database_Kotlin
For education use Room database in Mobile. I use Android Studio and Kotlin.

# ROOM Components
Database : Contains the database holder. Serves as the primary access point to connect to the database from your application. A class that will be annotated with @Databaseharus meets the following conditions:
        Must be an abstract class given an instance of the RoomDatabase class.
        Include a list of entities related to the database in the annotation.
        Contains an abstract method that has 0 arguments and returns a class @Dao.
            Entity: Presents an existing table on your database.
    DAO : Contains the method used to access the database.

The application uses the Room database to obtain a data access object or DAO, which is associated with that database. 
The application then uses each DAO to get the entity from the database and save the changes back to the database. 
Finally, the application uses entities to get and assign values that correspond to the table columns in the database.
