# spring-cloud-stream-2
#### Includes the necessary services to display some features of Spring Cloud stream with rabbitMQ with the second solution

### steps
- First, install springCloudStream as root
- Second, Run each service as a Spring Boot app (CustomerProducerApplication and then CustomerConsumerApplication)
- Then, call the service below as http client of CustomerProducerController to send the message in the queue :

>##### curl --location --request POST 'http://localhost:8085/customer/'
> --header 'Content-Type: application/json'
> 
> --data-raw '{ "id": "1", "name": "parvin" }'

or
>##### POST http://localhost:8085/customer/
> Content-Type: application/json
> 
> { "id": "1", "name": "parvin" }

- Then, check console of CustomerConsumerApplication

### notes
- You can visit rabbitMQ dashboard and follow your message in the queue:
  http://localhost:15672/#/queues