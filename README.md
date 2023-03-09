# London Houses Dataset REST API with Spring Boot and MySQL

This is a sample Spring Boot application that provides a RESTful API to access the London Houses dataset, which is stored in a MySQL database. The application is containerized with Docker and can be easily deployed to any environment.

## Prerequisites

Before you begin, make sure you have the following installed on your local machine:

* Java
* Docker
* Git

## Getting Started

To get started, clone this repository to your local machine:
```
https://github.com/fayilmazdir91/london-house-prices-api.git
```

## Running the Application

To run the application, navigate to the project directory and run the following command:
```
docker-compose up
```
This will start the application and the MySQL database in separate containers. The API will be accessible at http://localhost:8080/api/houses

## API Endpoints

The following endpoints are available in the API:

#### POST METHOD

```
POST api/houses
```
This endpoint allows you to store the dataset in the database. The data should be sent in the request body in JSON format.

#### GET METHOD

```
GET api/houses/search
```
This endpoint allows you to search for houses in the dataset using any of the fields in the data. You can specify the search criteria as query parameters in the URL.

Example: 
```
http://localhost:8080/api/houses/search?propertyName=Seward Street&houseType=Flat / Apartment&numBedrooms=2&numBathrooms=2&numReceptions=2
```

## Testing the Application

You can test the API using curl commands. Here are some examples:

To search houses:
```
curl --location --request GET 'http://localhost:8080/api/houses/search?propertyName=Seward Street&houseType=Flat / Apartment&numBedrooms=2&numBathrooms=2&numReceptions=2'
```
To save a house:
```
curl --location --request POST 'http://localhost:8080/api/houses' \
--header 'Content-Type: application/json' \
--data-raw '{
        "propertyName": "Queens Road",
        "price": 1675000,
        "houseType": "House",
        "areaInSqFt": 2716,
        "numBedrooms": 5,
        "numBathrooms": 5,
        "numReceptions": 5,
        "location": "Wimbledon",
        "cityCounty": "London",
        "postalCode": "SW19 8NY"
    }'
```
To get all houses: 
```
curl --location --request GET 'http://localhost:8080/api/houses'
```

## Swagger Integration
http://localhost:8080/api/swagger-ui/index.html

### Swagger Screenshot
![image](https://user-images.githubusercontent.com/57766894/224018736-7a6a395b-3b27-4bc4-aebe-c370625bb47e.png)
