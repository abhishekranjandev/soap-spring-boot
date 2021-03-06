
package com.yml.sample.soap.server.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import com.yml.sample.soap.server.service.ApplicationCredentials;
import com.yml.sample.soap.server.service.HelloWorld;
import com.yml.sample.soap.server.service.HelloWorldResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HelloWorldService", targetNamespace = "http://service.server.soap.sample.yml.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.yml.sample.soap.server.service.ObjectFactory.class,
    https.localhost._8080.sample.ObjectFactory.class
})
public interface HelloWorldService {


    /**
     * 
     * @param arg1
     * @param parameters
     * @return
     *     returns com.yml.sample.soap.server.service.HelloWorldResponse
     */
    @WebMethod(action = "http://localhost:8080/hello-world/helloWorld")
    @WebResult(name = "helloWorldResponse", targetNamespace = "http://service.server.soap.sample.yml.com/", partName = "result")
    @Action(input = "http://localhost:8080/hello-world/helloWorld", output = "http://service.server.soap.sample.yml.com/HelloWorldService/helloWorldResponse")
    public HelloWorldResponse helloWorld(
        @WebParam(name = "helloWorld", targetNamespace = "http://service.server.soap.sample.yml.com/", partName = "parameters")
        HelloWorld parameters,
        @WebParam(name = "arg1", targetNamespace = "http://service.server.soap.sample.yml.com/", header = true, partName = "arg1")
        ApplicationCredentials arg1);

}
