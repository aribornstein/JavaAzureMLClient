# Java Azure ML Client
An Azure ML Endpoint Client for Java and Android

##Sample Code 
Note you will need to use your own service.
```java

import AzureMLClient;

String mlEndPoint = "https://ussouthcentral.services.azureml.net/workspaces/someworkspaceId/services/someserviceId/execute?api-version=2.0&details=true";
String mlAPIKey= "Azure ML Endpoint Api Key";
String requestBody = "\"Inputs\":{\"input1\":{\"ColumnNames\":[\"X\",\"Y\",\"Z\"],\"Values\":[[1,2,3],[1,2,3]]}},\"GlobalParameters\":{}}";

AzureMLClient myMLClient = new AzureMLClient(mlEndPoint,mlAPIKey);
String respone = myMLClient.requestResponse(requestBody);
System.out.println(response);

```

##Acknowledgements 
Based on work done with the following contributors at HackHarvard 2015
 *  Allan Visochek: avisochek
 *  Goncalo Sampaio: sampaio96
 *  Serra Abak: immiho
 *  David Preiner:
