# READ ME


## How to run app
```
./gradlew build
cd ./build/libs/
java -jar rstar-api-X.X.X.war --spring.profiles.active=[local|dev|stg|pro]
```

## Auto generate Dao/Dto by Mybatis
Edit src/main/resources/mybatis/* and execute following command
```
./gradlew mybatisGenerator
```

## Package design
|Name|Description|
|:------------:|:------------:|
|java/* |for auto generated classes(e.g. mybatis)|
|kotlin/**/aspect |AOP classes, cross-sectional design(e.g. logging, filter)|
|kotlin/**/domain/* |Business logic|
|kotlin/**/domain/repository |Design pattern of repository|
|kotlin/**/web/* |Summarized by UI, and created MVC classes in the package(Controller, Service, Models)|
|resources | environment files(.yaml, .yml)|


# Specification

## Routes
|url|Description|
|:------------|:------------|
|/user/login|Return login user and wallet information|
|/user/list|Return user list matched criteria|
|/timeline/page|Return list of feed events|
|/ranking/top_receiver|Return list of user in order rewarded count|
|/ranking/trend_behavior|Return list of behavior in order usage count|
|/reward/submit|Create feed event and trade coin|
|/product/redeem|Redeem product and trade coin|
|/product/list|Return list of product to redeem|

## I/O samples
### /user/login
#### Request
```
{"user_id":1}
```
#### Response
```
{  
  "user":{  
    "userId":1,
    "name":"Alice",
    "icon":"/assets/image/alice.png",
    "wallet":{  
      "starsToReward":4999,
      "starsToRedeem":5000
    }
  }
}
```

### /user/list
#### Request
```
{"name":"A"}
```
#### Response
```
{  
  "users":[  
    {  
      "user_id":1,
      "name":"Alice",
      "avatar":"/assets/image/alice.png",
      "stars":5000
    },
    {  
      "user_id":3,
      "name":"Aelin",
      "avatar":"/assets/image/aelin.png",
      "stars":5000
    }
  ]
}
```

### /timeline/page
#### Request
```
{"offset":0,"limit":1,}
```
#### Response
```
{
  "load_more": true,
  "offset": 1,
  "feeds": [
    {
      "id": 9,
      "behavior": "new Behavior",
      "comment":"Great!!",
      "star":1,
      "status":"Latest",
      "recommend_count":12
      "create_date":"20181225000000",
      "recipients":[
        {
          "id":2,
          "name":"Kim Sean_Suehyun",
          "icon":"/assets/image/kim.png"
        }
      ],
      "senders":[
        {
          "id":1,
          "name":"Alice",
          "icon":"/assets/image/alice.png"
        }
      ],
      "replies":[
        {
          "id":"2",
          "comment":"I am grateful as well 2.",
          "sender":{
            "id": 3,
            "name":"Aelin",
            "icon":"/assets/image/aelin.png"
          },
          "create_date":"20181225000000"
        }
      ]
    }
  ]
}
```

### /ranking/top_receiver
#### Request
```
NONE
```
#### Response
```
{
  "ranking":[
    {
      "user":{
        "id":2,
        "name":"Kim Sean_Suehyun",
        "icon":"/assets/image/kim.png"
      },
      "total":501
    },
    {
      "user": {
        "id":1,
        "name":"Alice",
        "icon":"/assets/image/alice.png"
      },
      "total":477
    }
  ]
}
```

### /ranking/trend_behavior
#### Request
```
NONE
```
#### Response
```
{
  "ranking":[
    {
      "behavior": "problem-solving",
      "total": 5
    },
    {
      "behavior": "new Behavior",
      "total": 3
    }
  ]
}
```
### reward/submit
#### Request
```
{
  "behavior":"Speed",
  "sender_id":1,
  "recipient_ids":[1,2],
  "amount":100,
  "comment":"thank you"
}
```
#### Response
```
{
  "status":"success"
}
```

### product/redeem
#### Request
```
{
  "user_id":1,
  "product_id":1,
}
```
#### Response
```
{
  "status":"success"
}
```

### product/list
#### Request
```
NONE
```
#### Response
```
{
  "products":[
    {
      "id":1,
      "item": "/assets/image/coffee.svg",
      "price":500
    },
    {
      "id":2,
      "item": "/assets/image/tea.svg",
      "price":80000
    }    
  ]
}
```