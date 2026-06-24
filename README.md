# RECOMMENDATION-SYSTEM
COMPANY:CODTECH IT SOLUTIONS PRIVATE LIMITED

NAME: ANKIT SOREN

INTERN ID: CITS495

DOMAIN:JAVA PROGRAMMING

DURATION:6 WEEKS

MENTOR:NEELA SANTOSH

Recommendation System Project Title

Recommendation Engine Using Collaborative Filtering in Java

Objective

The objective of this project is to develop a simple Recommendation Engine that suggests items to users based on the preferences and ratings of similar users. The system uses the Collaborative Filtering technique, which is one of the most widely used recommendation methods in modern applications such as Netflix, Amazon, and YouTube.

Project Description

The Recommendation Engine is implemented in Java and utilizes user-item rating data stored in a CSV file. The system analyzes user preferences, calculates similarities between users, and recommends items that the target user has not yet rated.

The dataset (data.csv) contains three fields:

User ID Item ID Rating

Example:

1,101,5 1,102,4 2,101,5 2,103,3

This indicates that User 1 rated Item 101 with 5 stars and Item 102 with 4 stars.

Working Mechanism

Data Loading
The loadData() method reads the CSV file and stores the ratings in a nested HashMap structure:

Map<Integer, Map<Integer, Double>>

This structure allows efficient storage and retrieval of ratings for each user.

Similarity Calculation
The system uses Cosine Similarity to determine how similar two users are.

Formula:

Similarity(A,B)= ∣∣A∣∣×∣∣B∣∣ A⋅B​

A higher similarity value indicates that two users have similar preferences.

Recommendation Generation
The recommend() method:

Compares the target user with all other users. Calculates similarity scores. Finds items rated by similar users but not by the target user. Computes weighted recommendation scores. Displays the recommended items sorted by predicted preference. Output

For the provided dataset:

1,101,5 1,102,4 2,101,5 2,103,3 3,102,4 3,103,5 4,101,4 4,102,5 4,103,4

The output is:

Recommended items for User 1: Item 103 -> Score: 3.85

This means the system predicts that User 1 would likely rate Item 103 around 3.85 based on ratings from similar users.

Features

Reads data from external CSV files. Uses Collaborative Filtering techniques. Implements Cosine Similarity for user comparison. Generates personalized recommendations. Easy to modify and extend. Lightweight and efficient for small datasets.

Advantages

Improves user experience by suggesting relevant items. Reduces information overload. Can be applied to movies, books, products, music, and other domains. Demonstrates practical implementation of machine learning concepts.

Limitations

Performance decreases with very large datasets. Suffers from the cold-start problem when new users or items have no ratings. Recommendations depend heavily on available user ratings.

Conclusion

The Recommendation Engine successfully demonstrates the implementation of a Collaborative Filtering algorithm using Java. By analyzing user behavior and calculating similarities between users, the system provides personalized item recommendations. The project serves as a foundation for understanding recommendation systems and can be further enhanced by incorporating advanced techniques such as item-based filtering, matrix factorization, and machine learning algorithms for improved accuracy and scalability.

OUTPUT
<img width="1600" height="900" alt="WhatsApp Image 2026-06-24 at 17 51 18" src="https://github.com/user-attachments/assets/949cb922-e091-44d2-a805-1115b68bbd66" />
