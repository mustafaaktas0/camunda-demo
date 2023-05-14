# camunda-demo

## BPMN Diagram 

![BPMN Diagram ](https://github.com/mustafaaktas0/camunda-demo/blob/main/assets/bpmn-diagram.png)

## Used Technologies
-Java 11

-Spring Boot

-Camunda

-H2 In Memory Database

## Postman URL

- start-process (POST) http://localhost:8081/engine-rest/process-definition/key/leaveRequest/start

```
{
  "variables": {
    "var1": {
      "value": "value1",
      "type": "String"
    },
    "var2": {
      "value": 123,
      "type": "Integer"
    }
  }
}
 ```

- get-task-information (GET) http://localhost:8081/engine-rest/task?processInstanceId=e2e5e399-f277-11ed-921c-0e54157fcc31

- complete-task (POST) http://localhost:8081/engine-rest/task/e2ee2000-f277-11ed-921c-0e54157fcc31/complete

```
  {
    "variables":{
        "managerDecision":{
            "value":"approved"
        }
    }
}
 ```

- get-task-by-assignee (GET) http://localhost:8081/engine-rest/task?assignee=MUSTAFAAKTAS
