![SpringBoot + Apache Kafka](https://miro.medium.com/v2/resize:fit:828/format:webp/1*hKuhxnPYKkqCutPpvw2wGQ.jpeg)


# Kafka with SpringBoot Projects

## Project 1: kafka-springboot-project

## Project Overview

This SpringBoot application allows users to send messages to a Kafka topic via URL Query Parameters in an HTTP Request. The messages are then received and logged on the console.

## Architecture for "kafka-springboot-project"
![SpringBoot + Apache Kafka Architecture](https://miro.medium.com/v2/resize:fit:828/format:webp/1*yN3dEZP6i6NpbnK6zJoY8Q.jpeg)

### Learning Journey

Read about the "Journey into Kafka: Introduction.." Medium article [here](#related). 

### Code Repository
Check out the code in this [repository](https://github.com/karanbhogle/kafka-springboot-project/tree/main/kafka-springboot-project).

### How to Run
1. Build and run the `kafka-springboot-project` to start the SpringBoot application for sending messages to Kafka and receiving it on the terminal.

---
---

## Project 2: kafka-stream-spring-project

### Project Overview

A SpringBoot project with two modules:

## Architecture for "kafka-stream-spring-project"
![SpringBoot + Apache Kafka Architecture](https://miro.medium.com/v2/resize:fit:828/format:webp/1*63m2vZuulpNA3Kt2eSqRAw.jpeg)

#### Producer
Fetches real-time streaming data from the Wikimedia Recent Changes API and publishes it to a Kafka topic.

#### Consumer
Subscribed to the producer's Kafka topic, this module processes the real-time data and stores it into a MySQL database.

### Learning Journey

Read about the "Real-Time Data Processing with Apache Kafka and..." in my Medium article [here](#related). 

### Code Repository
Check out the code in this [repository](https://github.com/karanbhogle/kafka-springboot-project/tree/main/kafka-stream-spring-project).

### How to Run
1. Build and run the `kafka-stream-spring-project/kafka-producer-wikimedia` Producer module to fetch and publish real-time data to the Kafka topic.
2. Build and run the `kafka-stream-spring-project/kafka-consumer-database/` Consumer module to process and store the data into the MySQL database.

Feel free to explore and modify the code for your learning purposes. Happy coding!



## Complete explanation on Medium <a name="related"></a>

[Journey into Kafka: Introduction and Setup Your First SpringBoot Project on Medium](https://medium.com/@karanbhogle/journey-into-kafka-introduction-and-setup-your-first-springboot-project-a5903ff5ce43)

[Real-Time Data Processing with Apache Kafka and SpringBoot(…and MySQL): A Journey Continues…](https://medium.com/@karanbhogle/real-time-data-processing-with-apache-kafka-and-springboot-and-mysql-a-journey-continues-d82bb2cc6dac)

